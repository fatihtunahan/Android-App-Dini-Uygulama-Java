package fatih.tunahan.okur.islamibilgiler;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class GusulAbdesti extends AppCompatActivity {

    private ImageView gusulSes;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gusul_abdesti);
        final MediaPlayer gusulses = MediaPlayer.create(GusulAbdesti.this,R.raw.gusulses);
        gusulSes=findViewById(R.id.gusulSes);
        gusulSes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(gusulses.isPlaying()){
                    gusulses.pause();
                }else{
                    gusulses.start();
                }
            }
        });
    }
}