package com.kalcn.checkboxapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOK(View view){
        CheckBox chk;
        TextView txv;
        String msg = " ";

        int[] id = {R.id.chk1,R.id.chk2,R.id.chk3,R.id.chk4};

        for (int i:id){
            chk = (CheckBox)findViewById(i);

            if(chk.isChecked())
                msg += " "+chk.getText();
        }
        txv = (TextView)findViewById(R.id.textView2);
        txv.setText(msg);
    }
}
