package com.wing.listitemscaledemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView listView;
    private List<Info> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        listView = (RecyclerView) findViewById(R.id.listView);
        listView.setAdapter(new ListAdapter());
    }

    private void initData() {
        data = new ArrayList<>();
        for (int i=0;i<20;i++){
            Info info = new Info();
            info.setName("微头条");
            info.setImageRes(R.drawable.icon);
            info.setInstalled_count(i);
            info.setSize(6.7f);
            info.setIntroduce("趣味内容分享平台");
            data.add(info);
        }
    }

    class ListAdapter extends RecyclerView.Adapter{

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return data.size();
        }
    }

    class ListItemHolder extends RecyclerView.ViewHolder{

        public ListItemHolder(View itemView) {
            super(itemView);
        }



    }
}
