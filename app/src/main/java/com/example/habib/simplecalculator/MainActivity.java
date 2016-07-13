package com.example.habib.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    ArrayList<String> arrayList=new ArrayList<String>();
    String string="";
    String string1="";
public void onClick1(View v){
    TextView textView2=(TextView)findViewById(R.id.textView);
    Button button=(Button) v;
    string= (String)button.getText().toString();
    if(!string.contains("+")&&!string.contains("-")&&!string.contains("*")&&!string.contains("/")){
        string1=string1+string;
        if(arrayList.size()>0){

            arrayList.remove(arrayList.size()-1);
        }
        arrayList.add(string1);
    }
    else {
        arrayList.add(string);
        arrayList.add(string);
        string1="";
    }

    textView2.setText(textView2.getText().toString()+string);
    //textView2.setText(arrayList.toString());
}
public void onClick(View v){
    TextView textView1=(TextView)findViewById(R.id.textView2);
    double calc=0;
    int c=arrayList.size();
    while(c!=1){
        if(c>3){
            if(arrayList.get(3).contains("*") || arrayList.get(3).contains("/")){
                if(arrayList.get(3).contains("*")){
                    calc=Double.parseDouble(arrayList.get(2))*Double.parseDouble(arrayList.get(4));
                }
                if(arrayList.get(3).contains("/")){
                    calc=Double.parseDouble(arrayList.get(2))/Double.parseDouble(arrayList.get(4));
                }
                arrayList.remove(2);
                arrayList.remove(2);
                arrayList.remove(2);
                arrayList.add(2,Double.toString(calc));
                c=arrayList.size();
            }
            else {
                if(arrayList.get(1).contains("*")){
                    calc=Double.parseDouble(arrayList.get(0))*Double.parseDouble(arrayList.get(2));
                }
                if(arrayList.get(1).contains("/")){
                    calc=Double.parseDouble(arrayList.get(0))/Double.parseDouble(arrayList.get(2));
                }
                if(arrayList.get(1).contains("-")){
                    calc=Double.parseDouble(arrayList.get(0))-Double.parseDouble(arrayList.get(2));
                }
                if(arrayList.get(1).contains("+")){
                    calc=Double.parseDouble(arrayList.get(0))+Double.parseDouble(arrayList.get(2));
                }
                arrayList.remove(0);
                arrayList.remove(0);
                arrayList.remove(0);
                arrayList.add(0,Double.toString(calc));
                c=arrayList.size();

            }
        }
        else {
            if(arrayList.get(1).contains("*")){
                calc=Double.parseDouble(arrayList.get(0))*Double.parseDouble(arrayList.get(2));
            }
            if(arrayList.get(1).contains("/")){
                calc=Double.parseDouble(arrayList.get(0))/Double.parseDouble(arrayList.get(2));
            }
            if(arrayList.get(1).contains("-")){
                calc=Double.parseDouble(arrayList.get(0))-Double.parseDouble(arrayList.get(2));
            }
            if(arrayList.get(1).contains("+")){
                calc=Double.parseDouble(arrayList.get(0))+Double.parseDouble(arrayList.get(2));
            }
            arrayList.remove(0);
            arrayList.remove(0);
            arrayList.remove(0);
            arrayList.add(0,Double.toString(calc));
            c=arrayList.size();




        }


    }
textView1.setText(Double.toString(calc));

}
public void clear(View v){
    arrayList.clear();
    string="";
    string1="";
TextView t=(TextView)findViewById(R.id.textView);
    t.setText("");
TextView t1=(TextView)findViewById(R.id.textView2);
    t1.setText("0");
}



    
}
