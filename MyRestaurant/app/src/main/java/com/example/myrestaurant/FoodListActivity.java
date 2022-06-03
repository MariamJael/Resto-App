package com.example.myrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Class that will show lists of each food category/
 */
public class FoodListActivity extends AppCompatActivity {

    //Initializing variables
    Intent intent2= null;
    ListView myList;

    //An 2D array that will have a list of list of each menu category
    String [][] foodList={
            {"Chicken Burger", "Beef Burger", "Pork Burger", "Fish Burger", "No Meat Burger"},
            {"Beef Steak", "Pork Steak", "Fish Steak", "Lamb Steak"},
            {"Summer Somen Salad", "Hearty Grain Salad", "Pittsburgh Steak Salad", "Florida Caribbean Salad Ceviche", "Chilled Stir Fry Noodle Salad"},
            {"Tiramisu Layer Cake", "Lemon Souffles", "Baklava", "Lemon Cake Doberge", "Chocolate Fondue"}
    };

    /**
     * On create method, it will include intent and ArrayAdapter to show food list
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
        myList=findViewById(R.id.list_options);

        //Getting intent
        Intent intent = getIntent();

        //Getting the key value, which corresponds to the location of the food category list
        int key = intent.getIntExtra("key",-1);

        //Showing the respective list category
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,foodList[key]);
        myList.setAdapter(adapter);

        //Making list view clickable
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                intent2 = new Intent(getApplicationContext(),DetailActivity.class) ;
                if(key==0){

                }
            }
        });


    }//end of on create method


    public void hamburgerDescription(){

    }

    public void steakDescription(){

    }

    public void saladDescription(){

    }

    public void dessertDescription(){

    }





}//end of class FoodListActivity