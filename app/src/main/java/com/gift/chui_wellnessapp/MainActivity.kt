package com.gift.chui_wellnessapp

import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        Healthy Recipes Intent
//        Finding the views from the layout using their IDs

//        create a variable to store the buttons

        val recipe=findViewById<Button>(R.id.recipes)

//        set onClick listener

        recipe.setOnClickListener {
//            write your intents

            val recipeIntent= Intent(applicationContext, HealthyRecipes::class.java)
            startActivity(recipeIntent)
        }


//         nutrition intent

        val nutrition=findViewById<Button>(R.id.nutrition)

//        set onClick listener

        nutrition.setOnClickListener {
//            write your intents

            val nutritionIntent= Intent(applicationContext, NutritionAdvice::class.java)
            startActivity(nutritionIntent)
        }

//        meditation intent

        val meditation=findViewById<Button>(R.id.meditation)

//        set onClick listener

        meditation.setOnClickListener {
//            write your intents

            val meditationIntent= Intent(applicationContext, Meditation::class.java)
            startActivity(meditationIntent)
        }

//        hydration alert intent

        val hydration=findViewById<Button>(R.id.hydration)
        hydration.setOnClickListener {
            val hydrationIntent=Intent(applicationContext, HydrationAlert::class.java)
            startActivity(hydrationIntent)
        }

//        start exercise intent

        val exercise=findViewById<Button>(R.id.exercise)
        exercise.setOnClickListener {
            val exerciseIntent=Intent(applicationContext, StartExercise::class.java)
            startActivity(exerciseIntent)

        }

//        daily motivation intent
        val motivation=findViewById<Button>(R.id.motivation)
        motivation.setOnClickListener {
            val motivationIntent=Intent(applicationContext, DailyMotivation::class.java)
            startActivity(motivationIntent)
        }

//        weekly goals intent

        val weekly=findViewById<Button>(R.id.goals)
        weekly.setOnClickListener {
            val weeklyIntent=Intent(applicationContext, WeeklyGoals::class.java)
            startActivity(weeklyIntent)
        }

//        check progress Intent
        val progress=findViewById<Button>(R.id.progress)
        progress.setOnClickListener {
            val progressIntent=Intent(applicationContext, CheckProgress::class.java)
            startActivity(progressIntent)
        }

//        val myWebView: WebView = findViewById(R.id.webview)
//        myWebView.settings.javaScriptEnabled = true // Enable JavaScript if needed
//        myWebView.webViewClient = WebViewClient() // Ensure links open inside the app
//        myWebView.loadUrl("https://www.allrecipes.com/recipes/84/healthy-recipes/")



    }
}