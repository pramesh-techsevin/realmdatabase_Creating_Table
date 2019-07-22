package com.example.realmdatabase.RealmDBForTest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.example.realmdatabase.R;

import io.realm.Realm;
import io.realm.RealmSchema;


public class RealmDBActivity extends AppCompatActivity {


    private Context context = this;
    Realm realm;
    Person person;
    long id = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realm_db);








        Button addbtn = findViewById(R.id.btnadd);
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addingData();
            }
        });

    }

    private void addingData() {
        try {

            RealmSchema realmSchema = realm.getSchema();
            realmSchema.get("Person").renameField("name","NAME");

            person= new Person();
            person.setId(id);
            person.setName("Test"+id);
            id++;

            realm = Realm.getDefaultInstance();

            realm.executeTransaction(new Realm.Transaction() {
                @Override
                public void execute(Realm realm) {






                    realm.copyToRealm(person);

                }
            });

            Toast.makeText(context, "Execute Method", Toast.LENGTH_SHORT).show();

        }
        catch (Exception e){
            e.printStackTrace();
            Log.d("error", e.getMessage() );
        }
//        realm.commitTransaction(); //close the database

    }
}
