package com.example.user.resepmakanan;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ResepListAdapter extends RecyclerView.Adapter<ResepListAdapter.ViewHolder>{

    private static final String TAG = "ResepListAdapter";

    private ArrayList<Integer> image;
    private ArrayList<String> Resepname;
    private ArrayList<String> Reseprecipe;
    private ArrayList<String> Resepdesc;
    private Context iContext;

    public ResepListAdapter(Context context, ArrayList<String> Resepnames, ArrayList<Integer> data, ArrayList<String> Reseprecipes, ArrayList<String> Desc){
        this.Reseprecipe = Reseprecipes;
        this.Resepname = Resepnames;
        this.Resepdesc = Desc;
        this.iContext = context;
        this.image = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.reseplist, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        holder.Names.setText(Resepname.get(position));
        holder.images.setImageResource(image.get(position));
        holder.ResepDesc.setText(Resepdesc.get(position));

        holder.parentlayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.d(TAG, "onClick: Clicked on: " + Resepname.get(position));
                Toast.makeText(iContext, Resepname.get(position),Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(iContext, GaleriResepi.class);
                intent.putExtra("position", holder.getAdapterPosition());
                intent.putExtra("resepnama", Resepname.get(position));
                intent.putExtra("reseprecipe",Reseprecipe.get(position));

                iContext.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return Reseprecipe.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView Names, Reseprecipes, ResepDesc;
        ImageView images, images2;
        RelativeLayout parentlayout;

        public ViewHolder(View itemView){
            super(itemView);
            images2 = itemView.findViewById(R.id.gambaq);
            Reseprecipes = itemView.findViewById(R.id.Reseprecipe);
            Names = itemView.findViewById(R.id.resep);
            images = itemView.findViewById(R.id.imageresep);
            ResepDesc = itemView.findViewById(R.id.resepdesc);
            parentlayout = itemView.findViewById(R.id.parentLayout);
        }
    }
}
