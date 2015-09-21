package kdpos.nemesis.com.kdpos;

        import android.app.Activity;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;
    public String description;

    public CustomListAdapter(Activity context, String[] itemname, Integer[] imgid) {
        super(context, R.layout.mylist, itemname);

        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView extratxt = (TextView) rowView.findViewById(R.id.extraText);

        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);

        //Set description in list
        switch(position)
        {
            case 0:  description = "Add/Edit Company details";
                break;
            case 1: description = "Add/Edit Customer details";
                break;
            case 2: description = "Create/Modify Invoice";
                break;
            case 3:  description = "View Ledger details";
                break;
            case 4: description = "Generate/View reports";
                break;
        }
        extratxt.setText(description );
        return rowView;

    };
}