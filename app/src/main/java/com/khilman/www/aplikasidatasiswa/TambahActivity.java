package com.khilman.www.aplikasidatasiswa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TambahActivity extends AppCompatActivity {

    @BindView(R.id.etNamaSiswa)
    EditText etNamaSiswa;
    @BindView(R.id.etNis)
    EditText etNis;
    @BindView(R.id.spKelasSiswa)
    Spinner spKelasSiswa;
    @BindView(R.id.t)
    Button t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.t)
    public void onViewClicked() {
    }
}
