package com.khilman.www.aplikasidatasiswa.adapter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.khilman.www.aplikasidatasiswa.R;
import com.khilman.www.aplikasidatasiswa.UbahActivity;

public class AdapterMain extends RecyclerView.Adapter<AdapterMain.ViewHolder> {
    private Context ctx;
    public AdapterMain(Context ctx) {
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(ctx).inflate(R.layout.item_list_siswa, parent, false);
        ViewHolder holderView = new ViewHolder(itemView);
        return holderView;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        // Event ketika longklik di item
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                // Alert dialog
                AlertDialog.Builder confirmDialog = new AlertDialog.Builder(ctx);
                confirmDialog.setTitle("Konfirmasi");
                confirmDialog.setTitle("Hapus atau Edit data ?");
                confirmDialog.setNeutralButton("Edit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //
                        Intent intentEdit = new Intent(ctx, UbahActivity.class);

                        ctx.startActivity(intentEdit);
                    }
                });
                confirmDialog.setPositiveButton("Hapus", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //
                    }
                });
                confirmDialog.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                // tampilkan confirm dialog
                confirmDialog.show();
                return false;
            }
        });

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
