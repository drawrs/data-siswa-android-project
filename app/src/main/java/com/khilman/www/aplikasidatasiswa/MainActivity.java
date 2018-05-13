package com.khilman.www.aplikasidatasiswa;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.khilman.www.aplikasidatasiswa.adapter.AdapterMain;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rvDaftarSiswa)
    RecyclerView rvDaftarSiswa;
    @BindView(R.id.fabAdd)
    FloatingActionButton fabAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        // Recycler view
        rvDaftarSiswa.setLayoutManager(new LinearLayoutManager(this));
        // Adapter
        AdapterMain adapterMain = new AdapterMain(this);
        // set adapter
        rvDaftarSiswa.setAdapter(adapterMain);

    }

    @OnClick(R.id.fabAdd)
    public void onViewClicked() {
        startActivity(new Intent(this, TambahActivity.class));
    }
}
