package kdpos.nemesis.com.kdpos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class HomeScreen extends AppCompatActivity {

    ListView list;
    String[] _itemName ={
            "Company",
            "Customer",
            "Invoice",
            "Ledger",
            "Reports"
    };

    Integer[] _imageID ={
            R.drawable.ic_company,
            R.drawable.ic_customers,
            R.drawable.ic_invoice,
            R.drawable.ic_book,
            R.drawable.ic_report
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        CustomListAdapter adapter=new CustomListAdapter(this, _itemName, _imageID);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String selectedItem = _itemName[+position];


                //Handling click events
                switch(position){
                    case 0:Toast.makeText(getApplicationContext(), "this is " + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 1: Toast.makeText(getApplicationContext(), "this is " + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 2: Toast.makeText(getApplicationContext(), "this is " + position, Toast.LENGTH_SHORT).show();
                        //launching Invoice screen
                        Intent  intent = new Intent(getBaseContext(), InvoiceMenu.class);
                        startActivity(intent.putExtra("Main","Home_screen_activity"));
                        break;
                    case 3: Toast.makeText(getApplicationContext(), "this is " + position, Toast.LENGTH_SHORT).show();
                        break;
                }


            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        if(id == R.id.action_search){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
