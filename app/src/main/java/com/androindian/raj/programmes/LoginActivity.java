package com.androindian.raj.programmes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
// import com.androindian.raj.programmes.databinding.ActivityLoginBinding;


public class LoginActivity extends AppCompatActivity {


    EditText mobile,password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mobile=findViewById(R.id.editText);
        password=findViewById(R.id.editText2);
        login=findViewById(R.id.button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(LoginActivity.this,
                        MenuActivity.class);
                intent.putExtra("Mobile",mobile.getText().toString());
                intent.putExtra("Password",password.getText().toString());
                startActivity(intent);
            }
        });
    }
}
