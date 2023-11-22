package fatih.tunahan.okur.islamibilgiler;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Namaz extends AppCompatActivity {

    private Button vakitBtn;
    private Button nafileBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namaz);
        vakitBtn=findViewById(R.id.vakitBtn);
        nafileBtn=findViewById(R.id.nafileBtn);

        vakitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Namaz.this,VakitNamaz.class));
            }
        });
        nafileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Namaz.this,NafileNamaz.class));
            }
        });
    }
}