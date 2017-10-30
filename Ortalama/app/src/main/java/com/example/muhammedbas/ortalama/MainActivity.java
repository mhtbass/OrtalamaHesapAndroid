package com.example.muhammedbas.ortalama;

import android.content.Intent;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;

import android.widget.ListView;

import android.support.v7.app.ActionBarActivity;
import android.widget.RelativeLayout;

import com.example.muhammedbas.ortalama.adapter.SlidingMenuAdapter;
import com.example.muhammedbas.ortalama.model.ItemSlideMenu;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {


    private List<ItemSlideMenu> listSliding;
    private SlidingMenuAdapter adapter;
    private ListView listViewSliding;
    private DrawerLayout drawerLayout;
    private RelativeLayout maincontent;
    private ActionBarDrawerToggle actionBarDrawerToggle;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewSliding = (ListView) findViewById(R.id.lv_sliding_menu);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        maincontent = (RelativeLayout) findViewById(R.id.main_content);
        listSliding = new ArrayList<>();


        listSliding.add(new ItemSlideMenu(R.drawable.arkaplan, "Setting"));
        listSliding.add(new ItemSlideMenu(R.drawable.c1, "About"));
        listSliding.add(new ItemSlideMenu(R.drawable.c2, "android"));
        adapter = new SlidingMenuAdapter(this, listSliding);
        listViewSliding.setAdapter(adapter);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setTitle(listSliding.get(0).getTitle());

        listViewSliding.setItemChecked(0, true);

        drawerLayout.closeDrawer(listViewSliding);


        listViewSliding.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                setTitle(listSliding.get(position).getTitle());

                listViewSliding.setItemChecked(position, true);

                drawerLayout.closeDrawer(listViewSliding);


            }
        });


        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.drawer_opened, R.string.drawer_closed);



    }
}
