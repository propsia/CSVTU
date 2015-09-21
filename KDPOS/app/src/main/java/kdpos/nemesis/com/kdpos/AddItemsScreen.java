package kdpos.nemesis.com.kdpos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;


public class AddItemsScreen extends AppCompatActivity{

     private static int rowCount =0;
     @Override
     public void onCreate(Bundle savedInstanceState){
         super.onCreate(savedInstanceState);

         setContentView(R.layout.activity_add_items);
         TextView tv = new TextView(this);
         TableRow tr = new TableRow(this);
         TableLayout mainTable = (TableLayout) findViewById(R.id.tblDetails);

         tv.setHint("Amount");
         tr.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
         tr.addView(tv);


     }

    private void addRowFields(){


    }

}
