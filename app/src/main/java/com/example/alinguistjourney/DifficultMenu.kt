package com.example.alinguistjourney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_difficult_menu.*
import kotlinx.android.synthetic.main.activity_question.*

class DifficultMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_difficult_menu)

        btn_easy.setOnClickListener {
            val intent = Intent(this, Question::class.java)
            intent.putExtra("difficulty_mode", "easy");

            startActivity(intent)
        }

        btn_medium.setOnClickListener {
            val intent = Intent(this, Question::class.java)
            intent.putExtra("difficulty_mode", "medium");

            startActivity(intent)
        }

        btn_hard.setOnClickListener {
            val intent = Intent(this, Question::class.java)
            intent.putExtra("difficulty_mode", "hard");

            startActivity(intent)
        }
    }

}
