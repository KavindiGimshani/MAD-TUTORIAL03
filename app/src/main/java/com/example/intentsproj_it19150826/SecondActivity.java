package com.example.intentsproj_it19150826;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv1, tv2, tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv1 = (TextView) findViewById(R.id.num1);
        tv2 = (TextView) findViewById(R.id.num2);
        tv3 = (TextView) findViewById(R.id.answer);

        Intent i = getIntent();

        tv1.setText(getIntent().getStringExtra("numb1"));
        tv2.setText(getIntent().getStringExtra("numb2"));

    }

    public void onButtonAddition(View view){

        EditText editText1 = (EditText) findViewById(R.id.num1);
        EditText editText2 = (EditText) findViewById(R.id.num2);

        TextView textView = (TextView) findViewById(R.id.answer);

        float num1 = Float.parseFloat(editText1.getText().toString());
        float num2 = Float.parseFloat(editText2.getText().toString());

        float ans = num1 + num2;

        textView.setText( editText1.getText()+"+"+editText2.getText() + " = " + Float.toString(ans));

    }

    public void onButtonSubstraction(View view){

        EditText editText1 = (EditText) findViewById(R.id.num1);
        EditText editText2 = (EditText) findViewById(R.id.num2);

        TextView textView = (TextView) findViewById(R.id.answer);

        float num1 = Float.parseFloat(editText1.getText().toString());
        float num2 = Float.parseFloat(editText2.getText().toString());

        float ans = num1 - num2;

        textView.setText(editText1.getText()+"-"+editText2.getText() + " = " +  Float.toString(ans));

    }

    public void onButtonDivision(View view){

        EditText editText1 = (EditText) findViewById(R.id.num1);
        EditText editText2 = (EditText) findViewById(R.id.num2);

        TextView textView = (TextView) findViewById(R.id.answer);

        float num1 = Float.parseFloat(editText1.getText().toString());
        float num2 = Float.parseFloat(editText2.getText().toString());

        float ans = num1 / num2;

        textView.setText( editText1.getText()+"+"+editText2.getText() + " / " + Float.toString(ans));

    }

    public void onButtonMultipication(View view){

        EditText editText1 = (EditText) findViewById(R.id.num1);
        EditText editText2 = (EditText) findViewById(R.id.num2);

        TextView textView = (TextView) findViewById(R.id.answer);

        float num1 = Float.parseFloat(editText1.getText().toString());
        float num2 = Float.parseFloat(editText2.getText().toString());

        float ans = num1 * num2;

        textView.setText( editText1.getText()+"*"+editText2.getText() + " = " +  Float.toString(ans));

    }
}