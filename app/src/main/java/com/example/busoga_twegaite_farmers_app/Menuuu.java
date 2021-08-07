package com.example.busoga_twegaite_farmers_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;

public class Menuuu extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuuu);
        listView=findViewById(R.id.idlistView);
        String[]BUSOGA_FARMING={"crops","Farmers","Produce","chat"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,BUSOGA_FARMING);
        listView.setAdapter(adapter);
        registerForContextMenu(listView);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v,menuInfo);
        menu.setHeaderTitle("Select");
        menu.add(0,v.getId(),0,"Delete");
        menu.add(0,v.getId(),0,"Delete");
        menu.add(0,v.getId(),0,"Delete");
    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        if(item.getTitle()=="Delete"){
            Toast.makeText(this, "Delete was pressed", Toast.LENGTH_SHORT).show();
        }
        else if(item.getTitle()=="Uppercase"){
            Toast.makeText(this, "Uppercase was pressed", Toast.LENGTH_SHORT).show();
        }
        else if(item.getTitle()=="Lowercase"){
            Toast.makeText(this, "LowerCAse was pressed", Toast.LENGTH_SHORT).show();
        }
        return true;
    }}

