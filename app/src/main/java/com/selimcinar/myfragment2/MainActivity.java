package com.selimcinar.myfragment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  goToFirst(View view){
   //Fragmanı main activiteye bağlama

        FragmentManager fragmentManager = getSupportFragmentManager();  //fragman menajer eklendi
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FirstFragment firstFragment = new FirstFragment();
     //   fragmentTransaction.add(R.id.frame_Layout,firstFragment).commit(); // main activiyde frame layouta fragman eklendi
        //add üzerine ekler silmez
        fragmentTransaction.replace(R.id.frame_Layout,firstFragment).commit(); //replace siler yeniden ekler

    }

    public void goToSecond(View view){
        //Fragmanı main activiteye bağlama
        FragmentManager fragmentManager = getSupportFragmentManager();  //fragman menajer eklendi
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        SecondFragment secondFragment = new SecondFragment();
       // fragmentTransaction.add(R.id.frame_Layout,secondFragment).commit(); // main activiyde frame layouta fragman eklendi
        //add üzerine ekler silmez
        fragmentTransaction.replace(R.id.frame_Layout,secondFragment).commit(); //replace siler yeniden ekler
    }
}