package fatih.tunahan.okur.islamibilgiler;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HadisiSerif extends AppCompatActivity {

    private Button sonpeygambertxt;
    private Button hadistxt;
    private Button hadislertxt;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadisi_serif);
        sonpeygambertxt=findViewById(R.id.sonpeygambertxt);
        hadistxt=findViewById(R.id.hadistxt);
        hadislertxt=findViewById(R.id.hadislertxt);

        sonpeygambertxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HadisiSerif.this,HzMuhammedsav.class));
            }
        });
        hadistxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HadisiSerif.this,hadis.class));
            }
        });
        hadislertxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HadisiSerif.this,hadisler.class));
            }
        });



    }
}