package com.example.reversenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //original number
        int number = 1234;
        int reversedNumber = 0;
        int temp = 0;

        while(number > 0){

            //use modulus operator to strip off the last digit
            temp = number%10;

            //create the reversed number
            reversedNumber = reversedNumber * 10 + temp;
            number = number/10;

        }

        //output the reversed number
        System.out.println("Reversed Number is: " + reversedNumber);
    }
}
