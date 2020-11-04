package com.example.contactapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class WorkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coworker);

        final List<ContactModel> Work = new ArrayList<>();
        Work.add(new ContactModel("Tony","9611451253","tony@gmail.com",R.drawable.images));
        Work.add(new ContactModel("Lisa","9611451253","lisa@gmail.com",R.drawable.images));
        Work.add(new ContactModel("Cassie","9611451253","cassie@gmail.com",R.drawable.images));
        Work.add(new ContactModel("Peter","9611451253","peter@gmail.com",R.drawable.images));
        Work.add(new ContactModel("Pepper","9611451253","pepper@gmail.com",R.drawable.images));
        Work.add(new ContactModel("Parker","9611451253","parker@gmail.com",R.drawable.images));
        Work.add(new ContactModel("Steve","9611451253","steve@gmail.com",R.drawable.images));
        Work.add(new ContactModel("Steven","9611451253","steven@gmail.com",R.drawable.images));
        Work.add(new ContactModel("Bruce","9611451253","bruce@gmail.com",R.drawable.images));
        Work.add(new ContactModel("Happy","9611451253","happy@gmail.com",R.drawable.images));

        RecyclerView Work_recyclerView = findViewById(R.id.Recycler3);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        Work_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter=new ContactAdapter(this,Work, R.color.category_Work);
        Work_recyclerView.setAdapter(contactAdapter);
    }
}