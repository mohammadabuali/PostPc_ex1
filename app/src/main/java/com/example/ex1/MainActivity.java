package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView)findViewById(R.id.textView);
        Button btn = (Button)findViewById(R.id.btn);
        EditText edt = (EditText) findViewById(R.id.editText);
        btn.setOnClickListener(new SimpleListner(textView, edt));


    }
}

class SimpleListner implements View.OnClickListener{
    private TextView txt;
    private EditText edt;

    public SimpleListner(TextView txt, EditText edt){
        this.txt = txt;
        this.edt = edt;
    }
    public void onClick(View view){
        txt.setText(edt.getText(), TextView.BufferType.EDITABLE);
        edt.setText("");
    }
}