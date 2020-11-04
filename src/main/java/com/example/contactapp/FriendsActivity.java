package com.example.contactapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FriendsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        final List<ContactModel> Friends = new ArrayList<>();
        Friends.add(new ContactModel("Jonny","9632154893","jon@gmail.com",R.drawable.images));
        Friends.add(new ContactModel("Tony","9632154893","tony@gmail.com",R.drawable.images));
        Friends.add(new ContactModel("Lisa","9632154893","lisa@gmail.com",R.drawable.images));
        Friends.add(new ContactModel("Cassie","9632154893","cassie@gmail.com",R.drawable.images));
        Friends.add(new ContactModel("Pepper","9632154893","pepper@gmail.com",R.drawable.images));
        Friends.add(new ContactModel("Peter","9632154893","peter@gmail.com",R.drawable.images));
        Friends.add(new ContactModel("Happy","9632154893","happy@gmail.com",R.drawable.images));
        Friends.add(new ContactModel("Steve","9632154893","steve@gmail.com",R.drawable.images));
        Friends.add(new ContactModel("Bruce","9632154893","bruce@gmail.com",R.drawable.images));
        Friends.add(new ContactModel("Steven","9632154893","steven@gmail.com",R.drawable.images));

        RecyclerView Friends_recyclerView = findViewById(R.id.Recycler2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        Friends_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter=new ContactAdapter(this,Friends, R.color.category_Friends);
        Friends_recyclerView.setAdapter(contactAdapter);
    }
}