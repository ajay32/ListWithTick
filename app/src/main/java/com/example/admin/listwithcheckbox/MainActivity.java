package com.example.admin.listwithcheckbox;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.admin.listwithcheckbox.model.Model;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    ListView listView;
    ArrayAdapter<Model> adapter;
    List<Model> list = new ArrayList<Model>();
    int selected_position = -1;


    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.my_list);
        adapter = new MyAdapter(this, getModel());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
        TextView label = (TextView) v.getTag(R.id.label);
        CheckBox checkbox = (CheckBox) v.getTag(R.id.check);
        if (checkbox.isChecked()) {
            checkbox.setChecked(false);

        } else {
            checkbox.setChecked(true);

        }
    }


    private String isCheckedOrNot(CheckBox checkbox) {
        if (checkbox.isChecked())
            return "is checked";
        else
            return "is not checked";
    }

    private List<Model> getModel() {
        list.add(new Model("Linux"));
        list.add(new Model("Windows7"));
        list.add(new Model("Windows7"));
        list.add(new Model("Windows7"));
        list.add(new Model("Windows7"));
        list.add(new Model("Windows7"));
        list.add(new Model("Windows7"));
        list.add(new Model("Windows7"));
        list.add(new Model("Windows7"));
        list.add(new Model("Windows7"));
        list.add(new Model("Windows7"));
        list.add(new Model("Windows7"));
        list.add(new Model("Windows7"));
        list.add(new Model("Windows7"));
        list.add(new Model("Windows7"));
        list.add(new Model("Windows7"));
        list.add(new Model("Windows7"));
        list.add(new Model("Windows7"));
        list.add(new Model("Windows7"));
        list.add(new Model("Windows7"));
        list.add(new Model("Windows7"));
        list.add(new Model("Windows7"));
        list.add(new Model("Windows7"));
        list.add(new Model("Windows7"));
        list.add(new Model("Windows7"));
        list.add(new Model("Windows7"));
        list.add(new Model("Windows7"));
        list.add(new Model("Windows7"));
        list.add(new Model("Suse"));
        list.add(new Model("Eclipse"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Solaris"));
        list.add(new Model("Android"));
        list.add(new Model("iPhone"));
        list.add(new Model("Java"));
        list.add(new Model(".Net"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("Linux"));
        list.add(new Model("Windows7"));
        list.add(new Model("Suse"));
        list.add(new Model("Suse"));
        list.add(new Model("Suse"));
        list.add(new Model("Suse"));
        list.add(new Model("Suse"));
        list.add(new Model("Suse"));
        list.add(new Model("Suse"));
        list.add(new Model("Suse"));
        list.add(new Model("Suse"));
        list.add(new Model("Suse"));
        list.add(new Model("Suse"));
        list.add(new Model("Suse"));
        list.add(new Model("Suse"));
        list.add(new Model("Suse"));
        list.add(new Model("Suse"));
        list.add(new Model("Suse"));
        list.add(new Model("Suse"));
        list.add(new Model("Suse"));
        list.add(new Model("Suse"));
        list.add(new Model("Suse"));
        list.add(new Model("Suse"));
        list.add(new Model("Suse"));
        list.add(new Model("Suse"));
        list.add(new Model("Suse"));
        list.add(new Model("Suse"));
        list.add(new Model("Suse"));
        list.add(new Model("Suse"));
        list.add(new Model("Eclipse"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Solaris"));
        list.add(new Model("Android"));
        list.add(new Model("iPhone"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model("Java"));
        list.add(new Model(".Net"));
        list.add(new Model("PHP"));
        list.add(new Model("Linux"));
        list.add(new Model("Windows7"));
        list.add(new Model("Suse"));
        list.add(new Model("Eclipse"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Solaris"));
        list.add(new Model("Android"));
        list.add(new Model("iPhone"));
        list.add(new Model("Java"));
        list.add(new Model(".Net"));
        list.add(new Model("PHP"));
        list.add(new Model("Linux"));
        list.add(new Model("Windows7"));
        list.add(new Model("Suse"));
        list.add(new Model("Eclipse"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Ubuntu"));
        list.add(new Model("Solaris"));
        list.add(new Model("Android"));
        list.add(new Model("iPhone"));
        list.add(new Model("Java"));
        list.add(new Model(".Net"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("jjhghjgjjjg"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("gjgjjjjg"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PgfjhgjHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("gjgjgjg"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        list.add(new Model("PHP"));
        return list;
    }
}