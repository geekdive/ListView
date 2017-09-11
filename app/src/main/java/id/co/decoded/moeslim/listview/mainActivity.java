package id.co.decoded.moeslim.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class mainActivity extends AppCompatActivity {

    private ListView ListMenu;
    private String[] menu = {
            "Makan",
            "Minum",
            "Mandi",
            "Game",
            "Olah Raga",
            "Jumping",
            "Swimming",
            "Running",
            "Skipping",
            "Push Up",
            "Shit Up",
            "Drop Down",
            "Merge Up",
            "Simple Running",
            "Back Up",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListMenu = (ListView)findViewById(R.id.listMenu);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menu);
        ListMenu.setAdapter(adapter);

        ListMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posisi, long l) {
                Toast.makeText(mainActivity.this, "Anda Memilih " + menu[posisi], Toast.LENGTH_SHORT).show();
            }
        });
    }

}
