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

public class outros extends AppCompatActivity {
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
        setContentView(R.layout.outros);

        // nao deixa a tela girar

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);



        // ads banner


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        // abrir url 1

        novos1 = findViewById(R.id.novos1);
        novos1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://www.amazon.com.br/Fritadeira-El%C3%A9trica-Fryer-Silver-1270W/dp/B07NDFBGNR/ref=sr_1_8?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=23B3XQBWUSXGM&dchild=1&keywords=aierfryer&qid=1629675492&sprefix=aierfr%2Caps%2C260&sr=8-8&ufe=app_do%3Aamzn1.fos.4bddec23-2dcf-4403-8597-e1a02442043d");
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
                gotourl("https://produto.mercadolivre.com.br/MLB-1609772440-lampada-inteligente-rgb-wifi-smart-google-alexa-colorida-_JM?variation=60851137222&hide_psmb=true#reco_item_pos=0&reco_backend=best-seller&reco_backend_type=low_level&reco_client=highlights-rankings&reco_id=07007b2c-a7a0-4fc2-8d82-1c903768ab48&tendency_print_id=de0866a7-7d45-4c57-938f-35828413ad9b");
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
                gotourl("https://www.mercadolivre.com.br/amazon-echo-dot-3rd-gen-com-asistente-virtual-alexa-charcoal-110v240v/p/MLB15534261?pdp_filters=category:MLB278167#searchVariation=MLB15534261&position=3&search_layout=grid&type=product&tracking_id=716a2869-8328-4d09-9b71-f70a07c301db");
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
                gotourl("https://produto.mercadolivre.com.br/MLB-1965207416-controle-remoto-original-completo-alphasatlancam-2021-_JM#reco_item_pos=4&reco_backend=machinalis-v2p-pdp-boost-v2&reco_backend_type=low_level&reco_client=vip-v2p&reco_id=643c2dd1-a815-4d71-bcc6-66122752901b");
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
                gotourl("https://produto.mercadolivre.com.br/MLB-1884556036-roku-express-streaming-player-full-hd-hdmi-usb-_JM");
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
                gotourl("https://produto.mercadolivre.com.br/MLB-1660526251-mountain-bike-caloi-velox-aro-29-freios-v-brake-_JM?variation=64290493802&hide_psmb=true#reco_item_pos=0&reco_backend=best-seller&reco_backend_type=low_level&reco_client=highlights-rankings&reco_id=62217ba6-6d12-4d60-ac67-aae799a29826&tendency_print_id=568c0434-be97-4ed6-86fe-8366e7799583");
            }private void gotourl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

    }
}