package fatih.tunahan.okur.islamibilgiler;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TeyemmumAbdesti extends AppCompatActivity {

    private ImageView teyemmumSes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teyemmum_abdesti);
        final MediaPlayer teyemmumses = MediaPlayer.create(TeyemmumAbdesti.this,R.raw.teyemmumses);
        teyemmumSes=findViewById(R.id.teyemmumSes);
        teyemmumSes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(teyemmumses.isPlaying() || isActivityTransitionRunning()){
                    teyemmumses.pause();
                }else{
                    teyemmumses.start();
                }
            }
        });
    }
}
