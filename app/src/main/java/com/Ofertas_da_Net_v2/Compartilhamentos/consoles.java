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

public class consoles extends AppCompatActivity {
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

        setContentView(R.layout.consoles);
        // ads banner


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        // nao deixa a tela girar

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        setContentView(R.layout.consoles);

        // abrir url1

        novos1 = findViewById(R.id.novos1);
        novos1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://www.mercadolivre.com.br/microsoft-xbox-360-super-slim-4gb-standard-cor-preto/p/MLB6252187?pdp_filters=category:MLB11172#searchVariation=MLB6252187&position=3&search_layout=grid&type=product&tracking_id=c258ed82-9e8a-4871-9013-4eef9dac2427");
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
                gotourl("https://produto.mercadolivre.com.br/MLB-1231443044-ps4-slim-playstation-4-500gb-1-controle-1-jogo-brinde-_JM?searchVariation=81473881808#searchVariation=81473881808&position=24&search_layout=grid&type=item&tracking_id=0b72f9b0-6f4d-464b-a5c9-7ff1e769e7d0");
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
                gotourl("https://www.mercadolivre.com.br/microsoft-xbox-one-kinect-500gb-standard-cor-preto/p/MLB15197764?pdp_filters=category:MLB11172%7Cprice:2200-2400#searchVariation=MLB15197764&position=2&search_layout=grid&type=product&tracking_id=86cf86f6-589e-4426-bec4-eeac09a4bbfc");
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
                gotourl("https://produto.mercadolivre.com.br/MLB-2002448534-playstation-3-slim-desbloqueado-completo-na-caixa-ps3-_JM?searchVariation=173552070207#searchVariation=173552070207&position=2&search_layout=grid&type=item&tracking_id=ba4462e0-19ef-433a-8f5a-3dbd14366cfb");
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
                gotourl("https://produto.mercadolivre.com.br/MLB-1965985270-play-2-com-opl-hd-40-gb-_JM?searchVariation=92762020210#searchVariation=92762020210&position=21&search_layout=grid&type=item&tracking_id=89b829e0-b30e-4440-8c93-2620d7e9fa35");
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
                gotourl("https://produto.mercadolivre.com.br/MLB-1965792231-xbox-360-super-slim-4gb-_JM?searchVariation=92747878825#searchVariation=92747878825&position=5&search_layout=grid&type=item&tracking_id=d55c1fb2-cb62-4dd8-8bc3-65f1fa037b75");
            }private void gotourl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
    }
}