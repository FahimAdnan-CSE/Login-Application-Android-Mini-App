package com.example.a77_how_to_design_and_create_a_login_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button login;
    private EditText Username,password;

     int counter=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      // textView.setText("Number of incorrect attempts 3");

        textView=(TextView) findViewById(R.id.textview);
         login=(Button) findViewById(R.id.buttonid);
         Username=(EditText) findViewById(R.id.username);
         password=(EditText) findViewById(R.id.password);

         login.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 String username1= Username.getText().toString();
                 String password1= password.getText().toString();
                 if (username1.equals("admin")&&password1.equals("1234"))
                 {
                     Intent intent=new Intent(getApplicationContext(),LoginSuccessfull.class);

                     startActivity(intent);

                 }
                 else
                 {
                     counter--;
                     textView.setText("Number of incorrect attempts "+counter);
                     if (counter==0)
                     {
                         login.setEnabled(false);
                     }

                 }


             }
         });


    }
}
