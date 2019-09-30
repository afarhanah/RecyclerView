package org.hanna.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    private RecyclerView rvSkincare;
    private ArrayList<Skincare> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSkincare =findViewById(R.id.rv_skincare);
        rvSkincare.setHasFixedSize(true);

        list.addAll(SkincareData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvSkincare.setLayoutManager(new LinearLayoutManager(this));
        SkincareAdapter skincareAdapter = new SkincareAdapter(MainActivity.this, list);
        rvSkincare.setAdapter(skincareAdapter);

        skincareAdapter.setOnItemClickCallback(new SkincareAdapter.SkincareViewHolder.OnItemClickCallback() {
            @Override
            public void onItemClicked(Skincare data) {
                showSelectedSkincare(data);
            }
        });
    }

    private void showSelectedSkincare(Skincare skincare){
        Toast.makeText(this, "You Choose " + skincare.getNama(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra(DetailsActivity.EXTRA_PHOTOS, skincare.getFoto());
        intent.putExtra(DetailsActivity.EXTRA_SKINCARE, skincare.getNama());
        intent.putExtra(DetailsActivity.EXTRA_DETAILS, skincare.getDetail());
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_about:
            Intent intent = new Intent(MainActivity.this, TentangActivity.class);
            startActivity(intent);
                break;
        }
    }

}
