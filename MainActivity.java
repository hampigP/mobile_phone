package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.IslamicCalendar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {

    private TextView answer;
    private Button btn1,btn2,btn3,btn4;
    private Button btn5,btn6,btn7,btn8;
    private Button btn9,btn0,btnEqual,btnClear;
    private Button btnPlus,btnMinus,btnTimes,btnDivide;

    String NU1 = "0" , NU2 = "0";
    int Cal_index = 0; //判斷是否
    int index_Value = 0; //判斷是否按下按鍵

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer = findViewById(R.id.textView);
        btn0 = findViewById(R.id.button14);
        btn1 = findViewById(R.id.button9);
        btn2 = findViewById(R.id.button10);
        btn3 = findViewById(R.id.button11);
        btn4 = findViewById(R.id.button5);
        btn5 = findViewById(R.id.button6);
        btn6 = findViewById(R.id.button7);
        btn7 = findViewById(R.id.button);
        btn8 = findViewById(R.id.button2);
        btn9 = findViewById(R.id.button3);
        btnEqual = findViewById(R.id.button15);
        btnClear = findViewById(R.id.button13);
        btnPlus = findViewById(R.id.button4);
        btnMinus = findViewById(R.id.button8);
        btnTimes = findViewById(R.id.button12);
        btnDivide = findViewById(R.id.button16);

        btn0.setOnClickListener(Click);
        btn1.setOnClickListener(Click);
        btn2.setOnClickListener(Click);
        btn3.setOnClickListener(Click);
        btn4.setOnClickListener(Click);
        btn5.setOnClickListener(Click);
        btn6.setOnClickListener(Click);
        btn7.setOnClickListener(Click);
        btn8.setOnClickListener(Click);
        btn9.setOnClickListener(Click);
        btnEqual.setOnClickListener(Click);
        btnClear.setOnClickListener(Click);
        btnPlus.setOnClickListener(Click);
        btnMinus.setOnClickListener(Click);
        btnTimes.setOnClickListener(Click);
        btnDivide.setOnClickListener(Click);

    }

    private View.OnClickListener Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
                String Str_Value;
                Str_Value = answer.getText().toString();
                switch (view.getId()){
                    case R.id.button14:
                        display("0");
                        break;
                    case R.id.button9:
                        display("1");
                        break;
                    case R.id.button10:
                        display("2");
                        break;
                    case R.id.button11:
                        display("3");
                        break;
                    case R.id.button5:
                        display("4");
                        break;
                    case R.id.button6:
                        display("5");
                        break;
                    case R.id.button7:
                        display("6");
                        break;
                    case R.id.button:
                        display("7");
                        break;
                    case R.id.button2:
                        display("8");
                        break;
                    case R.id.button3:
                        display("9");
                        break;
                    case R.id.button4:
                        display("+");
                        Calculate(0,Str_Value);
                        break;
                    case R.id.button8:
                        display("-");
                        Calculate(1,Str_Value);
                        break;
                    case R.id.button12:
                        display("*");
                        Calculate(2,Str_Value);
                        break;
                    case R.id.button16:
                        display("/");
                        Calculate(3,Str_Value);
                        break;
                    case R.id.button13:
                        Toast toast = Toast.makeText(MainActivity.this, "清除輸入", Toast.LENGTH_LONG);
                        answer.setText("");
                        toast.show();
                        break;
                    case R.id.button15:
                        Calculate(99,Str_Value);
                        break;
                }
        }
    };

    private void display(String s){
        String str = answer.getText().toString();
        answer.setText(str+s);
    }

    private void Calculate(int Cal_value, String Cal_Nu){
        double x;
        String Ans;
        switch (Cal_value){
            case 0:
                NU1 = Cal_Nu;
                Cal_index = 0;
                answer.setText("");
                break;
            case 1:
                NU1 = Cal_Nu;
                Cal_index = 1;
                answer.setText("");
                break;
            case 2:
                NU1 = Cal_Nu;
                Cal_index = 2;
                answer.setText("");
                break;
            case 3:
                NU1 = Cal_Nu;
                Cal_index = 3;
                answer.setText("");
                break;
            case 99:
                NU2 = answer.getText().toString();
                double i = Double.valueOf(NU1);
                double j = Double.valueOf(NU2);
                switch (Cal_index){
                    case 0:
                        x = i + j;
                        Ans = Double.toString(x);
                        answer.setText(Ans);
                        break;
                    case 1:
                        x = i - j;
                        Ans = Double.toString(x);
                        answer.setText(Ans);
                        break;
                    case 2:
                        x = i * j;
                        Ans = Double.toString(x);
                        answer.setText(Ans);
                        break;
                    case 3:
                        x = i / j;
                        Ans = Double.toString(x);
                        answer.setText(Ans);
                        break;
                }
                break;
        }
    }
}