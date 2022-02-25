package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtName, edtPass, edtReType;
    Button btntieptuc;
    TextView tvWarning;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edtName);
        edtPass = findViewById(R.id.edtPass);
        edtName = findViewById(R.id.edtReType);
        btntieptuc = findViewById(R.id.btntieptuc);
        tvWarning = findViewById(R.id.tvWarning);

//        btntieptuc.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String name = edtName.getText().toString(), pass = edtPass.getText().toString(), repass = edtReType.getText().toString();
//                if (name.length() > 0 && pass.length() > 0 && repass.length() > 0) {
//                    if (!pass.equals(repass)) {
//                        tvWarning.setVisibility(View.VISIBLE);
//                    } else {
//                        Toast.makeText(MainActivity.this, "Tiếp tục", Toast.LENGTH_LONG).show();
//
//                    }
//                }
//            }
//        });

        btntieptuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkPass();
            }
        });

    }

    private void checkPass() {
        {
            String pass = edtPass.getText().toString().trim();
            String repass = edtReType.getText().toString().trim();

            if (!pass.equals(repass)) {
                tvWarning.setText("Mật khẩu không trùng khớp");

            } else {
                Toast.makeText(MainActivity.this, "Tiếp tục", Toast.LENGTH_LONG).show();
            }
        }
    }


}
