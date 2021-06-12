 package com.khadija.recyclerview_191181;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Adapter.PersonInformationAdapter;
import Model.PersonInformation;

 public class MainActivity extends AppCompatActivity {
     List<PersonInformation> personinformationlist=new ArrayList<>();
     PersonInformationAdapter personInformationAdapter;
     RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        personinformationlist.add(new PersonInformation("Khadija", "20","Female","03387899990"));
        personinformationlist.add(new PersonInformation("Fahad", "22","Male","04556677898"));
        personinformationlist.add(new PersonInformation("Zainab", "25","Female","0997928292"));
        personinformationlist.add(new PersonInformation("Wasif", "30","Male","98983928390"));
        personinformationlist.add(new PersonInformation("Shakeela", "12","Female","87898928902"));
        personinformationlist.add(new PersonInformation("Humna", "22","Female","8928928902"));
        recyclerView=findViewById(R.id.recyclerview);
        personInformationAdapter=new PersonInformationAdapter(personinformationlist,MainActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(personInformationAdapter);

    }
}