package fatih.tunahan.okur.islamibilgiler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sureler extends AppCompatActivity {

    private Button fatiha;
    private Button kevser;
    private Button ihlas;
    private Button asr;
    private Button fil;
    private Button kureyş;
    private Button kafirun;
    private Button salli;
    private Button barik;
    private Button sübhaneke;
    private Button tahıyyat;
    private Button atina;
    private Button firli;
    private Button kunut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sureler);

        fatiha = findViewById(R.id.fatiha);
        kevser = findViewById(R.id.kevser);
        ihlas = findViewById(R.id.ihlastxt);
        asr = findViewById(R.id.asr);
        fil = findViewById(R.id.fil);
        kureyş = findViewById(R.id.kureyş);
        kafirun = findViewById(R.id.kafirun);
        salli = findViewById(R.id.salli);
        barik = findViewById(R.id.barik);
        sübhaneke = findViewById(R.id.sübhaneke);
        tahıyyat = findViewById(R.id.tahıyyat);
        atina = findViewById(R.id.atina);
        firli = findViewById(R.id.firli);
        kunut = findViewById(R.id.kunut);

        fatiha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Sureler.this,FatihaSuresi.class));
            }
        });
        kevser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Sureler.this,KevserSuresi.class));
            }
        });
        ihlas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Sureler.this,IhlasSuresi.class));
            }
        });
        asr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Sureler.this,AsrSuresi.class));
            }
        });
        fil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Sureler.this,FilSuresi.class));
            }
        });
        kureyş.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Sureler.this,KureysSuresi.class));
            }
        });
        kafirun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Sureler.this,KafirunSuresi.class));
            }
        });
        salli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Sureler.this,SalliDuasi.class));
            }
        });
        barik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Sureler.this,BarikDuasi.class));
            }
        });
        sübhaneke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Sureler.this,SubhanekeDuasi.class));
            }
        });
        tahıyyat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Sureler.this,TahiyyatDuasi.class));
            }
        });
        atina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Sureler.this,AtinaDuasi.class));
            }
        });
        firli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Sureler.this,FirliDuasi.class));
            }
        });
        kunut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Sureler.this,KunutDuasi.class));
            }
        });



    }
}