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

public class relogios extends AppCompatActivity {
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
        setContentView(R.layout.relogios);

        // ads banner


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        // nao deixa a tela girar

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);



        // abrir url 1

        novos1 = findViewById(R.id.novos1);
        novos1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://www.mercadolivre.com.br/xiaomi-mi-smart-band-5-11-caixa-de-plastico-pc-pulseira-black-de-elastmero-termoplastico-e-liga-de-aluminio-xmsh10hm/p/MLB15963018?pdp_filters=category:MLB135384#searchVariation=MLB15963018&position=1&search_layout=stack&type=product&tracking_id=13713b00-b1cf-43a9-8763-8314c412d5ce");
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
                gotourl("https://www.mercadolivre.com.br/xiaomi-mi-smart-band-6-156-caixa-de-plastico-pc-pulseira-black-de-tpu-e-liga-de-aluminio-xmsh15hm/p/MLB17796174?hide_psmb=true#reco_item_pos=1&reco_backend=best-seller&reco_backend_type=low_level&reco_client=highlights-rankings&reco_id=687d4d28-0e34-4b53-a0ac-eb9e80837693&tendency_print_id=de4dff57-a582-47f1-8f25-d6a4f5df4620");
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
                gotourl("https://www.mercadolivre.com.br/smartwatch-amazfit-bands-band-5-11-caixa-de-policarbonato-pulseira-midnight-black-de-tpu-a2005/p/MLB17232987?pdp_filters=category:MLB135384#searchVariation=MLB17232987&position=13&search_layout=stack&type=product&tracking_id=283233cc-5bf8-41f3-be84-1c4baafc6313");
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
                gotourl("https://produto.mercadolivre.com.br/MLB-1930138882-mi-band-5-em-perfeito-estado-com-pulseira-extra-_JM?searchVariation=89229853454#searchVariation=89229853454&position=21&search_layout=stack&type=item&tracking_id=267bbcc7-5ea6-42a9-a5d1-e2e6b15c1eb7");
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
                gotourl("https://produto.mercadolivre.com.br/MLB-1956273975-xiaomi-amazfit-bip-a1608-bateria-durando-01-dia-_JM?searchVariation=91897804235#searchVariation=91897804235&position=48&search_layout=stack&type=item&tracking_id=7067178a-7a11-433a-a9e3-3a6dd0f4aab1");
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
                gotourl("https://produto.mercadolivre.com.br/MLB-1841314453-mi-band-relogio-xiaomi-4-smartwatch-2-pulseira-extras-_JM?searchVariation=80378927136#searchVariation=80378927136&position=6&search_layout=stack&type=item&tracking_id=5e8efa07-a919-46d2-a958-da119f259509");
            }private void gotourl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

    }
}