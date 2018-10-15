package com.example.user.resepmakanan;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.annotation.Target;
import java.util.ArrayList;

public class GaleriResepi extends AppCompatActivity {

    private static final String TAG = "GaleriResepi";
    public ArrayList<Integer> imageid = new ArrayList<>();
    private Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.galeri_makanan);
        Log.d(TAG, "onCreate: started.");

        FloatingActionButton backButton = (FloatingActionButton) findViewById(R.id.backbutton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GaleriResepi.this, ResepMakanan.class);
                startActivity(intent);
            }
        });

        IncomingIntent();

    }


    private void IncomingIntent(){
        Log.d(TAG, "IncomingIntent: checking for incoming intent");

        imageid.add(R.drawable.ayamgeprek);
        imageid.add(R.drawable.ayambakar);
        imageid.add(R.drawable.ayamkremes);
        imageid.add(R.drawable.nasirames);
        imageid.add(R.drawable.nasipadang);
        imageid.add(R.drawable.nasiuduk);
        imageid.add(R.drawable.meebakso);
        imageid.add(R.drawable.nasigudeg);
        imageid.add(R.drawable.miedokdok);
        imageid.add(R.drawable.esteh);
        imageid.add(R.drawable.esjeruk);
        imageid.add(R.drawable.jusalpukat);
        imageid.add(R.drawable.essusu);
        imageid.add(R.drawable.esnescafe);
        imageid.add(R.drawable.juslimau);

        if(getIntent().hasExtra("resepnama")){
            Log.d(TAG,"IncomingIntent: found intent extras.");

            int position = (int) getIntent().getExtras().get("position");
            String Names = getIntent().getStringExtra("resepnama");
            String Desc = getIntent().getStringExtra("reseprecipe");

            displayRecipe(Names, Desc, position);
        }
    }

    private void displayRecipe(String Names, String Desc, int position){

        TextView Name = findViewById(R.id.resep);
        Name.setText(Names);

        TextView Descs = findViewById(R.id.Reseprecipe);
        Descs.setText(Desc);

        ImageView images = findViewById(R.id.gambaq);
        images.setImageResource(imageid.get(position));

    }
}