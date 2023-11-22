package fatih.tunahan.okur.islamibilgiler;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AnaEkran extends AppCompatActivity {

    private Button kuraniKerim;
    private Button HadisiSerif;
    private Button Abdest;
    private Button Namaz;
    private Button islam;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anaekran);

        kuraniKerim =findViewById(R.id.kuraniKerim);
        HadisiSerif = findViewById(R.id.HadisiSerif);
        Abdest =findViewById(R.id.Abdest);
        Namaz =findViewById(R.id.Namaz);
        islam=findViewById(R.id.islam);

        kuraniKerim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            startActivity(new Intent(AnaEkran.this,Sureler.class));
            }
        });
        HadisiSerif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AnaEkran.this,HadisiSerif.class));
            }
        });
        Abdest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AnaEkran.this,Abdest.class));
            }
        });
        Namaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AnaEkran.this,Namaz.class));
            }
        });
        islam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AnaEkran.this,IslamDini.class));
            }
        });
    }

}