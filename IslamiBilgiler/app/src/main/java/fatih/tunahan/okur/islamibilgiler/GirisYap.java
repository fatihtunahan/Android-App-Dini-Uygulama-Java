package fatih.tunahan.okur.islamibilgiler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class GirisYap extends AppCompatActivity {


    private EditText mailGiris;
    private EditText sifreGiris;
    private Button girisbtn;
    private Button kayitbtn;
    private TextView misafir;
    private CheckBox sifreCheck;

    private String mailGiriss, sifreGiriss;
    private final FirebaseAuth firebaseAuth=FirebaseAuth.getInstance();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris_yap);


        mailGiris = findViewById(R.id.mailGiris);
        sifreGiris = findViewById(R.id.sifreGiris);
        girisbtn = findViewById(R.id.girisbtn);
        kayitbtn = findViewById(R.id.kayitbtn);
        misafir = findViewById(R.id.misafir);
        sifreCheck = findViewById(R.id.sifreCheck);


        sifreCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (!isChecked) {
                    sifreGiris.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    sifreGiris.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });


        girisbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                mailGiriss = mailGiris.getText().toString();
                sifreGiriss = sifreGiris.getText().toString();
                firebaseAuth.signInWithEmailAndPassword(mailGiriss, sifreGiriss)
                        .addOnCompleteListener(GirisYap.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(getApplicationContext(), "Giriş Başarılı.", Toast.LENGTH_LONG).show();
                                    startActivity(new Intent(GirisYap.this, AnaEkran.class));
                                } else {
                                    Log.e("Giriş Hatası", task.getException().getMessage());
                                }
                            }
                        });

            }
        });


        kayitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GirisYap.this, KayitOl.class));
            }
        });

        misafir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GirisYap.this, AnaEkran.class));
                Toast.makeText(GirisYap.this, "İslami Bilgiler Uygulamasına Hoşgeldiniz", Toast.LENGTH_SHORT);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case R.id.menu_item_home:
                startActivity(new Intent(GirisYap.this,AnaEkran.class));
                break;
            case R.id.menu_item_hakkimizda:
            startActivity(new Intent(GirisYap.this,Hakkimizda.class));
                break;
            case R.id.menu_item_cikis:
               System.exit(0);
                break;



        }
        return super.onOptionsItemSelected(item);
    }
}