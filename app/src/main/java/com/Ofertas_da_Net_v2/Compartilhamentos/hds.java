package com.Ofertas_da_Net_v2.Compartilhamentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class hds extends AppCompatActivity {
    private AdView mAdView;
    TextView novos1,novos2,novos3,usados1,usados2,usados3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // tela full

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.hds);

        // nao deixa a tela girar

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        // ads banner


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        // abrir url1

        novos1 = findViewById(R.id.novos1);
        novos1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://www.kabum.com.br/produto/84108/hd-seagate-barracuda-1tb-3-5-sata-st1000dm010");
            }private void gotourl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
        // abrir url 2

        novos2 = findViewById(R.id.novos2);
        novos2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://produto.mercadolivre.com.br/MLB-1886856152-hd-externo-seagate-320gb-usb-3020-novolacrado-promoco-_JM?searchVariation=84948311553#searchVariation=84948311553&position=4&search_layout=grid&type=item&tracking_id=4ad0fe20-fd4f-4d12-8690-9510715faf8b");
            }private void gotourl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
        // abrir url 3

        novos3 = findViewById(R.id.novos3);
        novos3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://www.mercadolivre.com.br/disco-rigido-interno-western-digital-wd5000lpcx-500gb-azul/p/MLB6326224?pdp_filters=category:MLB1672#searchVariation=MLB6326224&position=22&search_layout=grid&type=product&tracking_id=9bbb6587-ccf2-4208-b43f-ecf6c346963a");
            }private void gotourl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
        // abrir url 4

        usados1 = findViewById(R.id.usados1);
        usados1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://produto.mercadolivre.com.br/MLB-1864142182-hdd-samsung-sata-2-1tb-usado-1-ano-_JM?searchVariation=82687105559#searchVariation=82687105559&position=6&search_layout=grid&type=item&tracking_id=c45e0171-9bc7-4a81-afdb-664c92b0dbec");
            }private void gotourl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
        // abrir url 5

        usados2 = findViewById(R.id.usados2);
        usados2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://produto.mercadolivre.com.br/MLB-1973599446-disco-rigido-interno-1-tb-samsung-5400-rpm-otimo-estado-_JM?searchVariation=93555805515#searchVariation=93555805515&position=24&search_layout=grid&type=item&tracking_id=fa4e41b0-1f12-4f38-89d8-d53b1982f1c4");
            }private void gotourl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
        // abrir url 6

        usados3 = findViewById(R.id.usados3);
        usados3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://produto.mercadolivre.com.br/MLB-1900515833-hd-externo-western-digital-my-passport-essential-160gbusb-2-_JM?searchVariation=86331420348#searchVariation=86331420348&position=10&search_layout=stack&type=item&tracking_id=5af6c99b-41d3-4857-913f-206a34c747d4");
            }private void gotourl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

    }
}