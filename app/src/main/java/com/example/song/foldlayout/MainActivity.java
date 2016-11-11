package com.example.song.foldlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private FoldLayout foldlayout,foldLayout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {

        foldlayout = (FoldLayout) findViewById(R.id.foldlayout);
        foldLayout1 = (FoldLayout) findViewById(R.id.foldlayout1);
        List<View> views1 = new ArrayList<>();
        List<View> views2 = new ArrayList<>();

        /**
         * 初始化第一个Menu的Item
         */
        for (int i = 0;i<2;i++) {
            views1.add(getLayoutInflater().inflate(R.layout.layout_item,null));
        }
        foldlayout.addItemView(views1);
        /**
         * 初始化第二个Menu的Item
         */
        for (int i = 0;i<5;i++) {
            views2.add(getLayoutInflater().inflate(R.layout.layout_item,null));
        }
        foldLayout1.addItemView(views2);

        /**
         * 设置Item的单击事件
         */
        foldlayout.setOnItemClickListener(new FoldLayout.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this, "点击了第"+position+"个", Toast.LENGTH_SHORT).show();
            }
        });


    }

}
