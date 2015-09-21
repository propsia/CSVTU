package kdpos.nemesis.com.kdpos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Nadeem Ahmed on 08/22/15.
 */
public class InvoiceMenu extends AppCompatActivity{


    //Local variables declaration
    ListView invoice;

    String []invOptions={
            "Create Invoice",
            "Edit Invoice",
            "View Invoice",
    };

    Integer[] imgid={
            R.drawable.ic_addinvoice,
            R.drawable.ic_editinvoice,
            R.drawable.ic_viewinvoice
    };

    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice_screen);


        InvoiceListAdapter adapter = new InvoiceListAdapter(this,invOptions,imgid);
        invoice= (ListView) findViewById(R.id.invoiceList);
        invoice.setAdapter(adapter);

        invoice.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String selectedItem = invOptions[+position];


                //Handling click events
                switch(position){
                    case 0:
                        Intent intent = new Intent(getBaseContext(),InvoiceCreate.class);
                        startActivity(intent.putExtra("child screen","Invoice_screen"));

                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                }


            }
        });
    }


}
