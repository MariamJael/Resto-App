package com.example.myrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Main activity Class
 */
public class MainActivity extends AppCompatActivity {

    //Initializing variables
    Intent intent= null;
    int key=-1;


    /**
     *On Create Method, it will include the creation of intent
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(this,FoodListActivity.class) ;
    }


    /**
     *On-click Method that will send location of Hamburger list in array to FoodListactivity
     * @param view
     */
    public void goToHamburgerList(View view){
        intent.putExtra("key", 0);
        startActivity(intent);
    }

    /**
     *On-click Method that will send location of Steak list in array to FoodListactivity
     * @param view
     */
    public void goToSteakList(View view){
        intent.putExtra("key", 1);
        startActivity(intent);
    }

    /**
     *On-click Method that will send location of Salad list in array to FoodListactivity
     * @param view
     */
    public void goToSaladList(View view){
        intent.putExtra("key", 2);
        startActivity(intent);
    }

    /**
     *On-click Method that will send location of Dessert list in array to FoodListactivity
     * @param view
     */
    public void goToDessertList(View view){
        intent.putExtra("key", 3);
        startActivity(intent);
    }



}//end of main Activity Class