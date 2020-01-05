package com.example.kaofa.hellofromkimberly;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.textView3)).setTextColor(getResources().getColor(R.color.white));            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.pink));
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String newText = ((EditText)findViewById(R.id.editText)).getText().toString();
                if(TextUtils.isEmpty(newText)){
                    ((TextView)findViewById(R.id.textView3)).setText("Hello From Kimberly!");
                }
                else{
                    ((TextView)findViewById(R.id.textView3)).setText(newText);
                }
            }
        });
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.theOPBlueeee));
                ((TextView)findViewById(R.id.textView3)).setText("Hello From Kimberly!");
                ((TextView)findViewById(R.id.textView3)).setTextColor(getResources().getColor(R.color.blue));
            }
        });
    }
}
