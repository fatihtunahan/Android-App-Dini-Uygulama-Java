package fatih.tunahan.okur.islamibilgiler;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class VakitNamaz extends AppCompatActivity {

    private ImageButton sabahBtn;
    private ImageButton ogleBtn;
    private ImageButton ikindiBtn;
    private ImageButton aksamBtn;
    private ImageButton yatsiBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vakit_namaz);

        final MediaPlayer sabahezanses = MediaPlayer.create(VakitNamaz.this,R.raw.sabahezanses);
        final MediaPlayer ogleezanses = MediaPlayer.create(VakitNamaz.this,R.raw.ogleezanses);
        final MediaPlayer ikindiezanses = MediaPlayer.create(VakitNamaz.this,R.raw.ikindiezanses);
        final MediaPlayer aksamezanises = MediaPlayer.create(VakitNamaz.this,R.raw.aksamezanises);
        final MediaPlayer yatsiezanises = MediaPlayer.create(VakitNamaz.this,R.raw.yatsiezanises);

        sabahBtn=findViewById(R.id.sabahBtn);
        ogleBtn=findViewById(R.id.ogleBtn);
        ikindiBtn=findViewById(R.id.ikindiBtn);
        aksamBtn=findViewById(R.id.aksamBtn);
        yatsiBtn=findViewById(R.id.yatsiBtn);

        sabahBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sabahezanses.isPlaying())
                {
                    sabahezanses.pause();
                } else
                {
                    sabahezanses.start();
                }

            }

        });
        ogleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ogleezanses.isPlaying())
                {
                    ogleezanses.pause();
                } else
                {
                    ogleezanses.start();
                }

            }

        });
        ikindiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ikindiezanses.isPlaying())
                {
                    ikindiezanses.pause();
                } else
                {
                    ikindiezanses.start();
                }

            }

        });
        aksamBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(aksamezanises.isPlaying())
                {
                    aksamezanises.pause();
                } else
                {
                    aksamezanises.start();
                }

            }

        });
        yatsiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(yatsiezanises.isPlaying())
                {
                    yatsiezanises.pause();
                } else
                {
                    yatsiezanises.start();
                }

            }

        });
    }
}