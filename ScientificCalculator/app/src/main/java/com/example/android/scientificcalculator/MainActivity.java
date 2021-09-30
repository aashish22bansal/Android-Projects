package com.example.android.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     * Declaring all buttons.
     */
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    Button bDot, bEquals, bAddition, bSubtraction, bMultiplication, bDivision;
    Button bPi, bInverse, bSQRT, bSQR, bFactorial, bLn, bLog, bSin, bCos, bTan, bAllClear, bClear, bBracketOpen, bBracketClose;

    // Declaring some variables
    String Pi = "3.14159265359";

    /**
     * Declaring all TextViews.
     */
    TextView tvmain, tvsec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creating Instances for all the Buttons.
        b1 = findViewById(R.id.button_1_value);
        b2 = findViewById(R.id.button_2_value);
        b3 = findViewById(R.id.button_3_value);
        b4 = findViewById(R.id.button_4_value);
        b5 = findViewById(R.id.button_5_value);
        b6 = findViewById(R.id.button_6_value);
        b7 = findViewById(R.id.button_7_value);
        b8 = findViewById(R.id.button_8_value);
        b9 = findViewById(R.id.button_9_value);
        b0 = findViewById(R.id.button_0_value);
        bDot = findViewById(R.id.button_dot_value);
        bEquals = findViewById(R.id.button_equals_result);
        bAddition = findViewById(R.id.button_addition_operation);
        bSubtraction = findViewById(R.id.button_subtraction_operation);
        bMultiplication = findViewById(R.id.button_multiplication_operation);
        bDivision = findViewById(R.id.button_division_operation);
        bPi = findViewById(R.id.button_pie_value);
        bInverse = findViewById(R.id.button_inverse_function);
        bSQRT = findViewById(R.id.button_sqrt_function);
        bSQR = findViewById(R.id.button_square_function);
        bFactorial = findViewById(R.id.button_factorial_function);
        bLn = findViewById(R.id.button_ln_function);
        bLog = findViewById(R.id.button_log_function);
        bSin = findViewById(R.id.button_sin_function);
        bCos = findViewById(R.id.button_cos_function);
        bTan = findViewById(R.id.button_tan_function);
        bAllClear = findViewById(R.id.button_all_clear);
        bClear = findViewById(R.id.button_clear);
        bBracketOpen = findViewById(R.id.button_bracket_open);
        bBracketClose = findViewById(R.id.button_bracket_close);

        // Creating instances for TextViews
        tvmain = findViewById(R.id.tvmain);
        tvsec = findViewById(R.id.tvsec);

        // Creating onClickListeners for all the Buttons
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b1.getText().toString());
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b2.getText().toString());
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b3.getText().toString());
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b4.getText().toString());
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b5.getText().toString());
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b6.getText().toString());
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b7.getText().toString());
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b8.getText().toString());
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b9.getText().toString());
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b0.getText().toString());
            }
        });
        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+".");
            }
        });
        bAllClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText("");
            }
        });
        bClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                if(val == ""){
                    tvmain.setText(" ");
                }
                else{
                    val = val.substring(0, val.length() - 1);
                    tvmain.setText(val);
                }
            }
        });
        bAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"+");
            }
        });
        bSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"-");
            }
        });
        bMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"×");
            }
        });
        bDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"÷");
            }
        });
        bSQRT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val));
                tvmain.setText(String.valueOf(r));
            }
        });
        bBracketOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"(");
            }
        });
        bBracketClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+")");
            }
        });
        bPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsec.setText(bPi.getText());
                tvmain.setText(tvmain.getText()+Pi);
            }
        });
        bSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText("sin("+tvmain.getText()+")");
            }
        });
        bCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText("cos("+tvmain.getText()+")");
            }
        });
        bTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText("tan("+tvmain.getText()+")");
            }
        });
        bInverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(("1/("+tvmain.getText()+")"));
            }
        });
        bFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(tvmain.getText().toString());
                int fact = factorial(val);
                tvmain.setText(String.valueOf(fact));
                tvsec.setText(val+"!");
            }
        });
        bSQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Double.parseDouble(tvmain.getText().toString());
                double square = d * d;
                tvmain.setText(String.valueOf(square));
                tvsec.setText("(" + d + ")²");
            }
        });
        bEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                String replacedString = val.replace('÷','/').replace('×','*');
                double result = eval(replacedString);
                tvmain.setText(String.valueOf(result));
                tvsec.setText(val);
            }
        });
        bLn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText("ln("+tvmain.getText()+")");
            }
        });
        bLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText("log("+tvmain.getText()+")");
            }
        });
    }

    // Evaluation Function
    public static double eval(final String str)
    {
        return new Object()
        {
            int pos = -1, ch;

            void nextChar()
            {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat)
            {
                while (ch == ' '){  nextChar(); }
                if (ch == charToEat){
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }

    // Function for Factorial
    int factorial(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
}