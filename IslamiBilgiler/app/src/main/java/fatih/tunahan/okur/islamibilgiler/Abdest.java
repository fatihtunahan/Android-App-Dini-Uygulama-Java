package fatih.tunahan.okur.islamibilgiler;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Abdest extends AppCompatActivity {

    private Button namazAbdesti;
    private Button gusulAbdesti;
    private Button teyemmumAbdesti;
    private Button bilgi;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abdest);
        final MediaPlayer ses=MediaPlayer.create(Abdest.this,R.raw.ses);

        namazAbdesti=findViewById(R.id.namazAbdesti);
        gusulAbdesti=findViewById(R.id.gusulAbdesti);
        teyemmumAbdesti=findViewById(R.id.teyemmumAbdesti);
        bilgi=findViewById(R.id.bilgi);


        namazAbdesti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Abdest.this,NamazAbdesti.class));
            }
        });
        gusulAbdesti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Abdest.this,GusulAbdesti.class));
            }
        });
        teyemmumAbdesti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Abdest.this,TeyemmumAbdesti.class));
            }
        });
        bilgi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             if(ses.isPlaying()){
                 ses.pause();

             }else{
                 ses.start();
             }
            }

        });

    }
}