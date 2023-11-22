package fatih.tunahan.okur.islamibilgiler;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NamazAbdesti extends AppCompatActivity {

    private ImageView abdestSesbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namaz_abdesti);
        final MediaPlayer abdstses = MediaPlayer.create(NamazAbdesti.this,R.raw.abdstses);
        abdestSesbtn=findViewById(R.id.abdestSesbtn);

        abdestSesbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(abdstses.isPlaying()){
                    abdstses.pause();
                }else{
                    abdstses.start();
                }
            }
        });

    }
}