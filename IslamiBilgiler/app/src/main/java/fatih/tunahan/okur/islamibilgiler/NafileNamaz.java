package fatih.tunahan.okur.islamibilgiler;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class NafileNamaz extends AppCompatActivity {

    private Button teravihbtn;
    private Button teheccudBtn;
    private Button hacetBtn;
    private Button duhaBtn;
    private Button tevbeBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nafile_namaz);

        teravihbtn=findViewById(R.id.teravihBtn);
        teheccudBtn=findViewById(R.id.teheccudBtn);
        hacetBtn=findViewById(R.id.hacetBtn);
        duhaBtn=findViewById(R.id.duhaBtn);
        tevbeBtn=findViewById(R.id.tevbeBtn);

        teravihbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NafileNamaz.this,Teravih.class));
            }
        });
        teheccudBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NafileNamaz.this,Teheccud.class));
            }
        });
        hacetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NafileNamaz.this,Hacet.class));
            }
        });
        duhaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NafileNamaz.this,Duha.class));
            }
        });
        tevbeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NafileNamaz.this,Tevbe.class));
            }
        });
    }
}