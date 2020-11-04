package com.example.contactapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        final List<ContactModel> Family = new ArrayList<>();
        Family.add(new ContactModel("Father","9964946562","Email.gmail.com",R.drawable.images));
        Family.add(new ContactModel("Mother","9965326812","Email.gmail.com",R.drawable.images));
        Family.add(new ContactModel("YoungerSister","9965236482","Email.gmail.com",R.drawable.images));
        Family.add(new ContactModel("YoungerBrother","9964946562","Email.gmail.com",R.drawable.images));
        Family.add(new ContactModel("OlderBrother","9964946562","Email.gmail.com",R.drawable.images));
        Family.add(new ContactModel("OlderSister","9964946562","Email.gmail.com",R.drawable.images));
        Family.add(new ContactModel("Auntie","9964946562","Email.gmail.com",R.drawable.images));
        Family.add(new ContactModel("Uncle","9964946562","Email.gmail.com",R.drawable.images));
        Family.add(new ContactModel("GrandFather","9964946562","Email.gmail.com",R.drawable.images));
        Family.add(new ContactModel("GrandMother","9964946562","Email.gmail.com",R.drawable.images));

        RecyclerView Family_recyclerView = findViewById(R.id.Recycler1);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        Family_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter=new ContactAdapter(this,Family, R.color.category_Family);
        Family_recyclerView.setAdapter(contactAdapter);
    }
}