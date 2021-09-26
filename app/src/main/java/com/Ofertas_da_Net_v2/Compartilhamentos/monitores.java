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

public class monitores extends AppCompatActivity {
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
        setContentView(R.layout.monitores);

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
                gotourl("https://www.kabum.com.br/produto/102933/monitor-gamer-acer-lcd-23-sa230-full-hd-hdmi-1ms-um-vs0aa-b03");
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
                gotourl("https://www.amazon.com.br/Monitor-Conc%C3%B3rdia-Gamer-Curvo-C240/dp/B092DZGFGC/ref=sr_1_22_sspa?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&dchild=1&keywords=monitor&qid=1629585931&sr=8-22-spons&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUExWVIxVUgxNUlWTEhPJmVuY3J5cHRlZElkPUEwNTk2MDkwRTBIS0VCNkFSUjRBJmVuY3J5cHRlZEFkSWQ9QTA3MjM5NjdOMjBTTVhZUks5V0Ymd2lkZ2V0TmFtZT1zcF9tdGYmYWN0aW9uPWNsaWNrUmVkaXJlY3QmZG9Ob3RMb2dDbGljaz10cnVl");
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
                gotourl("https://produto.mercadolivre.com.br/MLB-1873588533-monitor-samsung-led-24-widescreen-curvo-hdmi-vga-full-hd-_JM?searchVariation=83582841912#searchVariation=83582841912&position=31&search_layout=grid&type=item&tracking_id=9fb36f17-86e1-4d0a-a56e-cf4db366b76f");
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
                gotourl("https://produto.mercadolivre.com.br/MLB-1863353158-monitor-samsung-s27b970-_JM?searchVariation=82593024378#searchVariation=82593024378&position=28&search_layout=grid&type=item&tracking_id=f79acb7f-ee62-467b-a7b4-6cec770088c9");
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
                gotourl("https://produto.mercadolivre.com.br/MLB-1939614370-monitor-philips-224esq-_JM?searchVariation=90147957098#searchVariation=90147957098&position=14&search_layout=grid&type=item&tracking_id=7b073b4d-7472-4b89-a333-c856fb1d34a9");
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
                gotourl("https://produto.mercadolivre.com.br/MLB-1915376685-monitor-gamer-samsung-s22f350fh-led-22preto-100v240v-zero-_JM?searchVariation=87821660755#searchVariation=87821660755&position=38&search_layout=grid&type=item&tracking_id=425ad2ae-2788-4a5c-b60b-ed7a647f2ce1");
            }private void gotourl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

    }
}