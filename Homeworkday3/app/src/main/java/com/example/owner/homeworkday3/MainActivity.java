package com.example.owner.homeworkday3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import com.github.clans.fab.FloatingActionButton;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public ListView listView;
    public FloatingActionButton floatingActionButton;
    public LinearLayout linearLayout;
    public ScrollView scrollView;
    public String TAG;
    public int currentImage = 0;
    private int[] imageList = {
            R.drawable.food_1,
            R.drawable.food_2,
            R.drawable.food_3,
            R.drawable.food_4,
            R.drawable.food_5,
    };
    private void setupUI() {

        linearLayout = findViewById(R.id.linear);
        scrollView = findViewById(R.id.scroll);
        floatingActionButton = findViewById(R.id.fb_menu);

        floatingActionButton.setOnClickListener(this);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = findViewById(R.id.linear);
        floatingActionButton = findViewById(R.id.fb_menu);
        scrollView = findViewById(R.id.scroll);
    }

    @Override
    public void onClick(View view) {
        int random = new Random().nextInt(4);
        if(random==0){
            listView.setBackgroundResource(R.drawable.food_1);
        } else if (random==1) {
            listView.setBackgroundResource(R.drawable.food_2);
        } else if(random==2) {
            listView.setBackgroundResource(R.drawable.food_3);
        } else if(random==3) {
            listView.setBackgroundResource(R.drawable.food_4);
        } else if(random==4) {
            listView.setBackgroundResource(R.drawable.food_5);
        }
    }
}
