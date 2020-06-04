package com.example.alinguistjourney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_score.*

class Score : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)
        score_label.text = "Your score is " + (getIntent().getIntExtra("score", 0))
        timer_label_question.text = "Your time is " + (getIntent().getStringExtra("time"))

        btn_restart.setOnClickListener{startActivity(Intent(this,DifficultMenu::class.java))}

        btn_returnToMainMenu.setOnClickListener{startActivity(Intent(this,MainActivity::class.java))}


    }
}

