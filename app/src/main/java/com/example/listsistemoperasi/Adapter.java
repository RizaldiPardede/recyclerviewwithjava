package com.example.listsistemoperasi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.osviewholder> {
    private ArrayList<sistemoperasimodel>listOS;


    public Adapter(ArrayList<sistemoperasimodel> listOS) {

        this.listOS = listOS;
    }

    @NonNull
    @Override
    public Adapter.osviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item,parent,false);

        return new osviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.osviewholder holder, int position) {
        holder.tvnama.setText(listOS.get(position).getNama());
        holder.tvdeskripsi.setText(listOS.get(position).getDeskripsi());
        holder.imgfoto.setImageResource(listOS.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return (listOS!=null) ? listOS.size() : 0;
    }


    public class osviewholder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView tvnama,tvdeskripsi;
        private ImageView imgfoto;

        public osviewholder(View view){
            super(view);
            tvnama = view.findViewById(R.id.nama);
            tvdeskripsi = view.findViewById(R.id.element);
            imgfoto = view.findViewById(R.id.foto);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position =getAdapterPosition();
            Toast.makeText(view.getContext(), listOS.get(position).getNama(),Toast.LENGTH_SHORT).show();
            listOS.remove(position);
            notifyItemRemoved(position);


        }
    }
}
