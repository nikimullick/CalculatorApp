package com.example.android.calculator;
import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Stack;


public class MainActivity extends Activity {

    public Stack<Double> value = new Stack<Double>();
    public Stack<String> oprtr = new Stack<String>();
    public double result = 0;
    public double val=0;
    public int flag=1;
    public int decimal=1;
    public EditText txt;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (EditText) findViewById(R.id.editText);
        Button one = (Button) findViewById(R.id.button1);
        one.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(txt.getText().equals("0"))
                { txt.setText("1");
                }
                else
                    txt.setText(txt.getText() + "1");
                decimal=decimal*flag;
                val = (val * 10/flag + (double)1/decimal);
                //value.push(new Double(val));


            }
        });
        Button two = (Button) findViewById(R.id.button2);
        two.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(txt.getText().equals("0"))
                    txt.setText("2");
                else
                    txt.setText(txt.getText() + "2");
                decimal=decimal*flag;
                val = val * 10/flag + (double)2/decimal;
               // value.push(new Double(val));
            }
        });
        Button three = (Button) findViewById(R.id.button3);
        three.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(txt.getText().equals("0"))
                    txt.setText("3");
                else
                    txt.setText(txt.getText() + "3");
                decimal=decimal*flag;
                val = val * 10/flag + (double)3/decimal;
               // value.push(new Double(val));
            }
        });
        Button four = (Button) findViewById(R.id.button4);
        four.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(txt.getText().equals("0"))
                    txt.setText("4");
                else
                    txt.setText(txt.getText() + "4");
                decimal=decimal*flag;
                val = val * 10/flag + (double)4/decimal;
               // value.push(new Double(val));
            }
        });
        Button five = (Button) findViewById(R.id.button5);
        five.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(txt.getText().equals("0"))
                    txt.setText("5");
                else
                    txt.setText(txt.getText() + "5");
                decimal=decimal*flag;
                val = val * 10/flag + (double)5/decimal;
               // value.push(new Double(val));
            }
        });
        Button six = (Button) findViewById(R.id.button6);
        six.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(txt.getText().equals("0"))
                    txt.setText("6");
                else
                    txt.setText(txt.getText() + "6");
                decimal=decimal*flag;
                val = val * 10/flag + (double)6/decimal;
               // value.push(new Double(val));
            }
        });
        Button seven = (Button) findViewById(R.id.button7);
        seven.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(txt.getText().equals("0"))
                    txt.setText("7");
                else
                    txt.setText(txt.getText() + "7");
                decimal=decimal*flag;
                val = val * 10/flag + (double)7/decimal;
               // value.push(new Double(val));
            }
        });
        Button eight = (Button) findViewById(R.id.button8);
        eight.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(txt.getText().equals("0"))
                    txt.setText("8");
                else
                    txt.setText(txt.getText() + "8");
                decimal=decimal*flag;
                val = val * 10/flag + (double)8/decimal;
                //value.push(new Double(val));
            }
        });
        Button nine = (Button) findViewById(R.id.button9);
        nine.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(txt.getText().equals("0"))
                    txt.setText("9");
                else
                    txt.setText(txt.getText() + "9");
                decimal=decimal*flag;
                val = val * 10/flag + (double)9/decimal;
               // value.push(new Double(val));
            }
        });
        Button zero = (Button) findViewById(R.id.button0);
        zero.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(txt.getText().equals("0"))
                    txt.setText("0");
                else
                    txt.setText(txt.getText() + "0");
                decimal=decimal*flag;
                val = val * 10/flag + 0/decimal;
               // value.push(new Double(val));
            }
        });
        Button add = (Button) findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                txt.setText(txt.getText() + "+");
                flag=decimal=1;
                oprtr.push("+");
                value.push(new Double(val));
                val = 0;
            }
        });
        Button sub = (Button) findViewById(R.id.minus);
        sub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                txt.setText(txt.getText() + "-");
                flag=decimal=1;
                oprtr.push("-");
                value.push(new Double(val));
                val = 0;
            }
        });
        Button mul = (Button) findViewById(R.id.multiply);
        mul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                txt.setText(txt.getText() + "*");
                flag=decimal=1;
                oprtr.push("*");
                value.push(new Double(val));
                val = 0;
                //System.out.println()
            }
        });
        Button div = (Button) findViewById(R.id.divide);
        div.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                txt.setText(txt.getText() + "/");
                flag=decimal=1;
                oprtr.push("/");
                value.push(new Double(val));
                val = 0;
            }
        });

        Button equal = (Button) findViewById(R.id.equal);
        equal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                txt.setText("in perform");
                // TODO Auto-generated method stub
                value.push(new Double(val));
                result = perform();
                txt.setText("" + result);
                val = 0;
                flag=decimal=1;
            }
        });
        Button clr = (Button) findViewById(R.id.clear);
        clr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                txt.setText("");
                val = 0;
                result=0;
                while(!value.empty())
                    value.pop();
                while(!oprtr.empty())
                    oprtr.pop();
                flag=decimal=1;
            }
        });
        Button pt = (Button) findViewById(R.id.point);
        pt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+".");
                // TODO Auto-generated method stub
                flag=10;

            }
        });
        //BACKSPACE to be RE-coded ERROR!!//
       Button backspace=(Button)findViewById(R.id.bcksp);
        backspace.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String str=txt.getText().toString();
                if (str.length() >1 ) {

                    char ch = str.charAt(str.length()-1);
                    if (ch == '*' || ch == '/' || ch == '+' || ch == '-') {
                       // if( val = val * 10/flag + (double)7/decimal;)
                        value.pop();
                        oprtr.pop();
                        str = str.substring(0, str.length() - 1);
                        txt.setText(str);





                    } else if(ch>=0&& ch<=9){
                       // value.pop();
                        oprtr.pop();
                        str = str.substring(0, str.length() - 1);
                        txt.setText(str);

                       // oprtr.pop();
                       // val=0;
                    }
                }

                else if (str.length() <=1 ) {
                    txt.setText("");
                    val = 0;
                    result=0;
                    while(!value.empty())
                        value.pop();
                    while(!oprtr.empty())
                        oprtr.pop();
                    flag=decimal=1;

                }



            }
        });
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public double perform() {
        //Enumeration valenum = value.elements();
        //Enumeration oprtenum = oprtr.elements();
        double first = 0, second = 0;
        char opt;
        while (!value.empty()) {
            if (value.size() != 1) {

                second = ((Double) value.pop()).doubleValue();
                first = ((Double) value.pop()).doubleValue();
                System.out.println("second="+second);
                opt = ((String) oprtr.pop()).charAt(0);
                switch (opt) {
                    case '+':

                        while(!oprtr.empty()&&(oprtr.peek().equals("*")||oprtr.peek().equals("/"))){

                            if(oprtr.peek().equals("*")){
                                Double fval,sval;
                                oprtr.pop();
                                if(!oprtr.empty()&&oprtr.peek().equals("/")){
                                    while(!oprtr.empty()&&oprtr.peek().equals("/")){
                                        sval=value.pop();
                                        fval=value.pop();
                                        result=fval/sval;
                                        oprtr.pop();
                                    }
                                    result=first*result;
                                    first=result;
                                }
                                else
                                    result=first*value.pop();
                                first=result;

                            }
                            else{
                                result=value.pop()/first;
                                first=result;
                                oprtr.pop();
                            }
                        }
                        result = second + first;
                        value.push(new Double(result));
                        break;
                    case '-':
                        while(!oprtr.empty()&&(oprtr.peek().equals("*")||oprtr.peek().equals("/"))){

                            if(oprtr.peek().equals("*")){
                                Double fval,sval;
                                oprtr.pop();
                                if(!oprtr.empty()&&oprtr.peek().equals("/"))
                                {	while(!oprtr.empty()&&oprtr.peek().equals("/")){
                                    sval=value.pop();
                                    fval=value.pop();
                                    result=fval/sval;
                                    oprtr.pop();
                                }
                                    result=first*result;
                                    first=result;
                                }
                                else
                                    result=first*value.pop();
                                first=result;
                            }
                            else{
                                result=value.pop()/first;
                                first=result;
                                oprtr.pop();
                            }
                        }
                        result = first - second;
                        value.push(new Double(result));
                        break;
                    case '/':
                        result = first / second;
                        value.push(new Double(result));
                        break;
                    case '*':
                        while(!oprtr.empty()&&oprtr.peek().equals("/")){
                            result=value.pop()/first;
                            first=result;
                            oprtr.pop();
                        }
                        result = first * second;
                        value.push(new Double(result));
                        break;
                }
            } else second = value.pop();
        }
        return second;

    }
}