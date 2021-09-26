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

public class celulares extends AppCompatActivity {
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

        setContentView(R.layout.celulares);

        // nao deixa a tela girar

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        setContentView(R.layout.celulares);

        // ads banner


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        // abrir url 1

        novos1 = findViewById(R.id.novos1);
        novos1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://www.mercadolivre.com.br/xiaomi-redmi-9a-dual-sim-32-gb-cinza-2-gb-ram/p/MLB15927746?hide_psmb=true#reco_item_pos=19&reco_backend=best-seller&reco_backend_type=low_level&reco_client=highlights-rankings&reco_id=949862d9-4d1f-408e-ac36-b39e78e528bf&tendency_print_id=73de4752-cb0a-4e7b-a483-51774539f142");
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
                gotourl("https://www.amazon.com.br/Celular-Xiaomi-Vers%C3%A3o-Global-Space/dp/B07Y9ZHLXW/ref=zg_bs_electronics_49?_encoding=UTF8&psc=1&refRID=BNY1F1TX7XM8A8NX6C5T");
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
                gotourl("https://www.mercadolivre.com.br/xiaomi-poco-m3-dual-sim-64-gb-power-black-4-gb-ram/p/MLB17324468?pdp_filters=category:MLB1055#searchVariation=MLB17324468&position=1&search_layout=stack&type=product&tracking_id=eb44451c-bee7-4408-8e36-63abee038423");
            }private void gotourl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
        // abrir url4

        usados1 = findViewById(R.id.usados1);
        usados1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://produto.mercadolivre.com.br/MLB-1990269650-xiaomi-note-7-48-mpx-dual-sim-64-gb-space-black-4-gb-ram-_JM?searchVariation=95388086197#searchVariation=95388086197&position=29&search_layout=stack&type=item&tracking_id=9c030fca-b1f2-4fac-ba99-f1143dcbb83d");
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
                gotourl("https://produto.mercadolivre.com.br/MLB-1982950877-celular-mi-a1-usado-64gb-4gb-memoria-promoco-para-sair-hoje-_JM?searchVariation=94598477291#searchVariation=94598477291&position=19&search_layout=stack&type=item&tracking_id=e6a845c5-38f4-4ae3-85e5-f63cb754ce24");
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
                gotourl("https://produto.mercadolivre.com.br/MLB-1983230576-redmi-note-6-pro-_JM?searchVariation=94619298199#searchVariation=94619298199&position=8&search_layout=stack&type=item&tracking_id=c33f233f-29c6-4d58-9ecb-3e6cf2628299");
            }private void gotourl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });




    }


}