package com.Ofertas_da_Net_v2.Compartilhamentos;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {
    private ImageView celular,consoles,fones,gabinetes,hds,monitores,outros,placas,notebooks,
            relogio,tvs,ssd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // tela full

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.home);

        // nao deixa a tela girar

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);



        // nova tela

        celular = (ImageView) findViewById(R.id.celular);
        celular.setOnClickListener(view -> {
                    Intent intentLoadNewActivity = new Intent(home.this, celulares.class);
                    startActivity(intentLoadNewActivity);
                }
                );

        consoles = (ImageView) findViewById(R.id.consoles);
        consoles.setOnClickListener(view -> {
                    Intent intentLoadNewActivity = new Intent(home.this, consoles.class);
                    startActivity(intentLoadNewActivity);
                }
        );
        fones = (ImageView) findViewById(R.id.fones);
        fones.setOnClickListener(view -> {
                    Intent intentLoadNewActivity = new Intent(home.this, fones.class);
                    startActivity(intentLoadNewActivity);
                }
        );

        gabinetes = (ImageView) findViewById(R.id.gabinetes);
        gabinetes.setOnClickListener(view -> {
                    Intent intentLoadNewActivity = new Intent(home.this, gabinetes.class);
                    startActivity(intentLoadNewActivity);
                }
        );
        hds = (ImageView) findViewById(R.id.hds);
        hds.setOnClickListener(view -> {
                    Intent intentLoadNewActivity = new Intent(home.this, hds.class);
                    startActivity(intentLoadNewActivity);
                }
        );
        monitores = (ImageView) findViewById(R.id.monitores);
        monitores.setOnClickListener(view -> {
                    Intent intentLoadNewActivity = new Intent(home.this, monitores.class);
                    startActivity(intentLoadNewActivity);
                }
        );
        outros = (ImageView) findViewById(R.id.outros);
        outros.setOnClickListener(view -> {
                    Intent intentLoadNewActivity = new Intent(home.this, outros.class);
                    startActivity(intentLoadNewActivity);
                }
        );
        placas = (ImageView) findViewById(R.id.placas);
        placas.setOnClickListener(view -> {
                    Intent intentLoadNewActivity = new Intent(home.this, placas.class);
                    startActivity(intentLoadNewActivity);
                }
        );
        notebooks = (ImageView) findViewById(R.id.notebooks);
        notebooks.setOnClickListener(view -> {
                    Intent intentLoadNewActivity = new Intent(home.this, notebooks.class);
                    startActivity(intentLoadNewActivity);
                }
        );
        relogio = (ImageView) findViewById(R.id.relogio);
        relogio.setOnClickListener(view -> {
                    Intent intentLoadNewActivity = new Intent(home.this, relogios.class);
                    startActivity(intentLoadNewActivity);
                }
        );
        tvs = (ImageView) findViewById(R.id.tvs);
        tvs.setOnClickListener(view -> {
                    Intent intentLoadNewActivity = new Intent(home.this, com.Ofertas_da_Net_v2.Compartilhamentos.ssd.class);
                    startActivity(intentLoadNewActivity);
                }
        );
        ssd = (ImageView) findViewById(R.id.ssd);
        ssd.setOnClickListener(view -> {
                    Intent intentLoadNewActivity = new Intent(home.this, com.Ofertas_da_Net_v2.Compartilhamentos.tvs.class);
                    startActivity(intentLoadNewActivity);
                }
        );

        // animacoes

        TextView tv = (TextView) findViewById(R.id.text);
        Animation anim = new AlphaAnimation(0.0f,1.0f);
        anim.setDuration(1500);
        anim.setStartOffset(20);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        tv.startAnimation(anim);

        TextView tv1 = (TextView) findViewById(R.id.textview1);
        tv1.setSelected(true);


    }


}