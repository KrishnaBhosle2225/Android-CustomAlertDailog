package com.krishna.alertdailogexample;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.nio.FloatBuffer;

public class MainActivity extends AppCompatActivity {

    Button btnFill;
    Button submit;
    TextView txtName,txtEmail,txtPhone,txtWeb;
    EditText name,email,phone,web;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        builder = new AlertDialog.Builder(this);
        btnFill = findViewById(R.id.btnFillData);
        txtName = findViewById(R.id.textName);
        txtEmail = findViewById(R.id.textEmail);
        txtPhone = findViewById(R.id.textPhone);
        txtWeb = findViewById(R.id.textWeb);
        btnFill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final View customView = getLayoutInflater().inflate(R.layout.custom_alert,null);
                builder.setTitle("Add Details")
                        .setIcon(getResources().getDrawable(R.drawable.ic_baseline_person_add_alt_1_24))
                        .setView(customView);

                name = customView.findViewById(R.id.edtName);
                email = customView.findViewById(R.id.edtEmail);
                phone = customView.findViewById(R.id.edtPhone);
                web = customView.findViewById(R.id.edtWeb);
                submit = customView.findViewById(R.id.btnSubmit);
                submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txtName.setText("Name : "+name.getText().toString());
                        txtEmail.setText("Email : "+email.getText().toString());
                        txtPhone.setText("Phone : "+phone.getText().toString());
                        txtWeb.setText("Website : "+web.getText().toString());
                        Toast.makeText(MainActivity.this,"Data Added",Toast.LENGTH_LONG).show();

                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });





    }
}






