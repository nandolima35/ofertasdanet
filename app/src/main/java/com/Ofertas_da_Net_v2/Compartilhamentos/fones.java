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

public class fones extends AppCompatActivity {
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

        setContentView(R.layout.fones);

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
                gotourl("https://www.amazon.com.br/Ouvido-Philips-Wireless-Tauh202Bk-Preto/dp/B07YNG2L67/ref=sr_1_44?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&dchild=1&keywords=fone&qid=1629560680&sr=8-44&ufe=app_do%3Aamzn1.fos.6a09f7ec-d911-4889-ad70-de8dd83c8a74&th=1");
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
                gotourl("https://www.amazon.com.br/Ouvido-Microfone-Philips-Tauh201Wt-00/dp/B07YQFLDBK/ref=sr_1_6?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&dchild=1&keywords=fone+de+ouvido&qid=1629560926&s=electronics&sr=1-6&ufe=app_do%3Aamzn1.fos.6d798eae-cadf-45de-946a-f477d47705b9");
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
                gotourl("https://www.mercadolivre.com.br/fone-de-ouvido-in-ear-sem-fio-qcy-t1c-preto/p/MLB15285466#searchVariation=MLB15285466&position=6&search_layout=stack&type=product&tracking_id=bacb8d87-ffb3-404f-b877-205e28c1466c");
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
                gotourl("https://produto.mercadolivre.com.br/MLB-1810834660-fone-de-ouvido-bluetooth-jbl-tune-500bt-preto-original-_JM?searchVariation=77473425351#searchVariation=77473425351&position=2&search_layout=stack&type=item&tracking_id=a798c49a-14df-4a78-9dd3-be938e4965e2https://produto.mercadolivre.com.br/MLB-1810834660-fone-de-ouvido-bluetooth-jbl-tune-500bt-preto-original-_JM?searchVariation=77473425351#searchVariation=77473425351&position=2&search_layout=stack&type=item&tracking_id=a798c49a-14df-4a78-9dd3-be938e4965e2https://produto.mercadolivre.com.br/MLB-1810834660-fone-de-ouvido-bluetooth-jbl-tune-500bt-preto-original-_JM?searchVariation=77473425351#searchVariation=77473425351&position=2&search_layout=stack&type=item&tracking_id=a798c49a-14df-4a78-9dd3-be938e4965e2");
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
                gotourl("https://produto.mercadolivre.com.br/MLB-1647264137-fone-de-ouvido-sony-original-extra-bass-_JM?searchVariation=63285209222#searchVariation=63285209222&position=26&search_layout=stack&type=item&tracking_id=6b5564a8-8bf8-45a6-8271-1c525dfbbce8");
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
                gotourl("https://produto.mercadolivre.com.br/MLB-1592106068-fones-de-ouvido-akg-414-_JM?searchVariation=59869522868#searchVariation=59869522868&position=13&search_layout=stack&type=item&tracking_id=3a9ef2fe-fc6d-4b2a-945c-e4106dd37b1b");
            }private void gotourl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
    }
}