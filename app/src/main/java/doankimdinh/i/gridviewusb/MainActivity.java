package doankimdinh.i.gridviewusb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView grvThing;
    ArrayList<ElectricThing> arrayList;
    CustomAdapter ctd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grvThing = findViewById(R.id.grvThing);

        arrayList = new ArrayList<>();

        arrayList.add(new ElectricThing("Cap chuyen doi 1",3,1000,12,R.drawable.daucam,20));

        arrayList.add(new ElectricThing("Cap chuyen doi 2",3,23333,43,R.drawable.carbusbtops,12));

        arrayList.add(new ElectricThing("Cap chuyen doi 3",3,33333,22,R.drawable.dauchuyendoipsps,33));

        arrayList.add(new ElectricThing("Cap chuyen doi 4",3,10044,34,R.drawable.giacchuyen,23));

        ctd = new CustomAdapter(this,R.layout.item_gidview,arrayList);

        grvThing.setAdapter(ctd);
    }
}
