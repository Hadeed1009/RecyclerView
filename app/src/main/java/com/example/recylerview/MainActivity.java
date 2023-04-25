package com.example.recylerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.recylerview.Adapters.WearAdapter;
import com.example.recylerview.Classes.RecyclerItemClickListener;
import com.example.recylerview.Modelss.WearsModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycleView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycleView = findViewById(R.id.recycleView);

        ArrayList<WearsModel> list = new ArrayList<>();
        list.add(new WearsModel(R.drawable.image1, "PK Shirt"));
        list.add(new WearsModel(R.drawable.image2, "Blue Shirt"));
        list.add(new WearsModel(R.drawable.image3, "Red Shirt"));
        list.add(new WearsModel(R.drawable.image4, "Grey Shirt"));
        list.add(new WearsModel(R.drawable.image5, "White Shirt"));
        list.add(new WearsModel(R.drawable.image6, "Black Coat"));
        list.add(new WearsModel(R.drawable.image1, "PK Shirt"));
        list.add(new WearsModel(R.drawable.image2, "Blue Shirt"));
        list.add(new WearsModel(R.drawable.image3, "Red Shirt"));
        list.add(new WearsModel(R.drawable.image4, "Grey Shirt"));
        list.add(new WearsModel(R.drawable.image5, "White Shirt"));


        WearAdapter adapter = new WearAdapter(list, this);
        recycleView.setAdapter(adapter);

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        recycleView.setLayoutManager(layoutManager);

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//        recycleView.setLayoutManager(layoutManager);

        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recycleView.setLayoutManager(layoutManager);

        recycleView.addOnItemTouchListener(new RecyclerItemClickListener
                (this, recycleView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        WearsModel model = list.get(position);

                        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                        intent.putExtra("image",model.getImg());
                        intent.putExtra("text",model.getText());
                        startActivity(intent);
                        Toast.makeText(MainActivity.this, "Clicked "+position+" "+model.getText(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }

        }));

//        GridLayoutManager layoutManager = new GridLayoutManager(this, 2, GridLayoutManager.HORIZONTAL, false);
//        recycleView.setLayoutManager(layoutManager);

//        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
//        recycleView.setLayoutManager(layoutManager);

//        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL);
//        recycleView.setLayoutManager(layoutManager);
    }
}