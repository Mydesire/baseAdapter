package com.xhq.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.xhq.adapter.abslistview.CommonAdapter;
import com.xhq.sample.adapter.lv.ChatAdapter;
import com.xhq.sample.bean.ChatMessage;

public class MultiItemListViewActivity extends AppCompatActivity{

    private ListView mListView;
    private CommonAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = findViewById(R.id.id_listview_list);
        mListView.setDivider(null);
        mListView.setAdapter(new ChatAdapter(this, ChatMessage.MOCK_DATAS));

    }

}
