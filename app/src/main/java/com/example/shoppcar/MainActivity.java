package com.example.shoppcar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.provider.ContactsContract;

import java.util.ArrayList;
import java.util.Date;

import javax.xml.validation.Schema;


public class MainActivity extends AppCompatActivity {

private RecyclerView rcv;
private MyAdapter adapter;
private ArrayList<String>mData=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i =1;i<=10;i++){
            mData.add("項目"+i);
        }
        rcv=(RecyclerView)findViewById(R.id.rcv);
        rcv.setLayoutManager((new LinearLayoutManager(this)));
        rcv.addItemDecoration((new DividerItemDecoration(this,DividerItemDecoration.VERTICAL)));
        adapter=new MyAdapter(mData);
        rcv.setAdapter(adapter);
    }


}