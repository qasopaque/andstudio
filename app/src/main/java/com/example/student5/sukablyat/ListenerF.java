package com.example.student5.sukablyat;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import javax.microedition.khronos.egl.EGLDisplay;

public class ListenerF implements View.OnClickListener {
    private TextView answer;
    private EditText inA;
    private EditText inB;
    private EditText inC;

    ListenerF (TextView answer, EditText inA, EditText inB, EditText inC){
        this.answer = answer;
        this.inA = inA;
        this.inB = inB;
        this.inC = inC;
    }

    @Override
    public  void onClick(View v2){
        if (!(inA.getText().toString().isEmpty() && inB.getText().toString().isEmpty() && inC.getText().toString().isEmpty())) {
            double a  = Double.parseDouble(inA.getText().toString());
            double b  = Double.parseDouble(inB.getText().toString());
            double c  = Double.parseDouble(inC.getText().toString());
            if (a != 0) {
                double d = b * b - 4 * a * c;
                if (d < 0) {
                    answer.setText("Нет корней");
                } else if (d == 0) {
                    String ans = " " + ((-1 * b) / 2 * a) + " ";
                    answer.setText(ans);
                } else {
                    String ans = "(" + ((-1 * b + Math.sqrt(d)) / 2 * a) + "; " + ((-1 * b - Math.sqrt(d)) / 2 * a) + ")";
                    answer.setText(ans);
                }
            } else {
                answer.setText("Коэффицент a квадратного уравнения не может быть равен нулю");
            }
        } else {
            answer.setText("Все поля должны быть заполнены");
        }
    }
}