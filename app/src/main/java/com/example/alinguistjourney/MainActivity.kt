package com.example.alinguistjourney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_newGame.setOnClickListener {
            startActivity(Intent(this, DifficultMenu::class.java))
        }

        btn_high_scores.setOnClickListener{
            startActivity(Intent(this,HighScores::class.java))
        }

        btn_exitGame.setOnClickListener{
            moveTaskToBack(true)
            android.os.Process.killProcess(android.os.Process.myPid())
            System.exit(1)
        }
    }
}
