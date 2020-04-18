package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Dominoz Pizza","Albaik","KFC","Steak House","Alsaddah")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //This is when you want to decide
        button_decide.setOnClickListener {
            val random = java.util.Random()
            val ramdomFood = random.nextInt(foodList.count())
            dinnerText.text = foodList[ramdomFood]
            println(foodList)
        }

        //and this is when you want to add more options
        addFood.setOnClickListener {
            var newFood = writeFood.text.toString()
            foodList.add(newFood)
            writeFood.text.clear()
            println(foodList)
        }
    }
}
