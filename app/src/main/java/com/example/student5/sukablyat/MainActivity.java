package com.example.student5.sukablyat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = this.findViewById(R.id.button);
        b.setOnClickListener(new ListenerF((TextView) this.findViewById(R.id.result), (EditText) this.findViewById(R.id.inputA), (EditText) this.findViewById(R.id.inputB), (EditText) this.findViewById(R.id.inputC)));
    }
}
