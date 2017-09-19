import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.isidrojacinto.xcube.CustomListAdapter;
import com.isidrojacinto.xcube.R;

public class MainActivity extends Activity{

    ListView list;
    String[] itemname ={
            "Inasal of Bacolod",
            "Laing of Bicol",
            "Pinakbet of Ilocos",
            "Pinaupong Manok of Bulacan",
            "Pochero of Zamboanga",

    };

    Integer[] imgid={
            R.drawable.bacolod_inasal,
            R.drawable.laing_bicol,
            R.drawable.pinakbet_ilocos,
            R.drawable.pinaupong_manok_bulacan,
            R.drawable.pochero_zamboanga,

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat);

        CustomListAdapter adapter=new CustomListAdapter(this, itemname, imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem= itemname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });
    }}