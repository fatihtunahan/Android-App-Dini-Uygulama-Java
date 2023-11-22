package fatih.tunahan.okur.islamibilgiler;

import static fatih.tunahan.okur.islamibilgiler.R.layout.activity_hakkimizda;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class Hakkimizda extends AppCompatActivity {


    private TextView hakkimdatxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_hakkimizda);
        hakkimdatxt = findViewById(R.id.hakkimdatxt);
        hakkimdatxt.setText("İslami Bilgiler Uygulamasi;" + "\nİslami Bilgiler Uygulaması Müslümanların, dinleri hakkında Temel bilgileri öğrenmesini sağlayan android cihazlardan erişim sağlanan bir uygulamadır." +
                "\n\n\n\n\nUygulama Geliştiricisi Fatih Tunahan Okur" +
                "\n\nGeliştirilen Platform Android Studio" +
                "" +
                "" +
                "" +
                "\n\n© 2022 İslamiBilgilerApp");
    }
}