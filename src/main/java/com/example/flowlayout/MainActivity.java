package com.example.flowlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.nex3z.flowlayout.FlowLayout;

import java.util.ArrayList;

import static com.example.flowlayout.R.drawable.singer_fl_backlayout;

public class MainActivity extends AppCompatActivity {

    private FlowLayout flow;
    private ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        list= new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            if (i % 2 ==0){
                list.add("itemmmmm -- >" + i);
                Log.e("dd",list.get(i)+"");
                Log.e("ss",list.get(i)+"");
            }else{
                list.add("aaa");
                Log.e("ddd",list.get(i)+"");
            }
        }

        for (int i = 0; i < list.size(); i++) {
            TextView textView = new TextView(this);
            textView.setText(list.get(i));
            textView.setBackgroundResource(R.drawable.singer_fl_backlayout);
            flow.addView(textView);
        }
    }

    private void initView() {
        flow = (FlowLayout) findViewById(R.id.flow);
    }
}
