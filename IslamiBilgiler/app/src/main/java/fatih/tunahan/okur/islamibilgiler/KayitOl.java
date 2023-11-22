package fatih.tunahan.okur.islamibilgiler;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class KayitOl extends AppCompatActivity {

    private EditText mailKayit;
    private EditText sifreKayit;
    private String mailKayitt, sifreKayitt;
    private Button kayitbtn2;
    private final FirebaseAuth firebaseAuth=FirebaseAuth.getInstance();
    private TextView giriseDon;
    private CheckBox sifrecheck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayit_ol);

        mailKayit = findViewById(R.id.mailKayit);
        sifreKayit = findViewById(R.id.sifreKayit);
        kayitbtn2 = findViewById(R.id.kayitbtn2);
        giriseDon=findViewById(R.id.giriseDon);
        sifrecheck=findViewById(R.id.sifrecheck);
        kayitbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mailKayitt = mailKayit.getText().toString();
                sifreKayitt = sifreKayit.getText().toString();
                firebaseAuth.createUserWithEmailAndPassword(mailKayitt, sifreKayitt)
                        .addOnSuccessListener(KayitOl.this, new OnSuccessListener<AuthResult>() {

                            @Override
                            public void onSuccess(AuthResult authResult) {
                                Toast.makeText(getApplicationContext(), "Kullanıcı Başarıyla Oluşturuldu.", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(getApplicationContext(), "Kullanıcı Oluşturma Hatası!", Toast.LENGTH_SHORT).show();
                            }
                        });

            }
        });

        sifrecheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isCheck) {
                if(!isCheck){
                    sifreKayit.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }else{
                    sifreKayit.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });




        giriseDon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KayitOl.this,GirisYap.class));
            }
        });


    }
}

