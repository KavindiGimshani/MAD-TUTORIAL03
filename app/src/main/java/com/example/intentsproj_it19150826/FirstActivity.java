package com.example.intentsproj_it19150826;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.time.Instant;

public class FirstActivity extends AppCompatActivity {

    public static final String Extra_msg = "com.example.IntentsProj_IT19150826.MESSAGE";

    EditText numb1, numb2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        numb1 = (EditText) findViewById(R.id.num1);
        numb2 = (EditText) findViewById(R.id.num2);
        Button button = (Button) findViewById(R.id.OKbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FirstActivity.this,SecondActivity.class);

                String message1 = numb1.getText().toString();
                i.putExtra("numb1", message1);
                String message2 = numb1.getText().toString();
                i.putExtra("numb2", message2);

                Toast toast = Toast.makeText(getApplicationContext(), "Sending Message", Toast.LENGTH_SHORT);
                toast.show();

                startActivity(i);



            }
        });






    }
}