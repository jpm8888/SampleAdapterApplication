package in.jpm.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Launcher extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    private List<ModelRingtone> modelRingtones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        populateItems();


        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view_ringtone);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new AdapterRingtone(this, modelRingtones);
        mRecyclerView.setAdapter(mAdapter);

    }

    private void populateItems() {
        modelRingtones = new ArrayList<ModelRingtone>();
        for (int i = 0; i < 100; i++) {
            modelRingtones.add(new ModelRingtone("Ringtone " + i));
        }
    }
}
