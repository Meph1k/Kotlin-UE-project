package com.example.alinguistjourney

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_question.*

class Question : AppCompatActivity() {

    var x=1;
    var score = 0;
    var questions = emptyList<QuestionData>()
    var timeElapsed = "0"

    abstract class CountUpTimer protected constructor(private val duration: Long) :
        CountDownTimer(duration, INTERVAL_MS) {
        abstract fun onTick(second: Int)
        override fun onTick(msUntilFinished: Long) {
            val second = ((duration - msUntilFinished) / 1000).toInt()
            onTick(second)
        }

        override fun onFinish() {
            onTick(duration / 1000)
        }

        companion object {
            private const val INTERVAL_MS: Long = 1000
        }
    }

    private fun generateQuestions() {
        val difficultyLevel = getIntent().getStringExtra("difficulty_mode");

        if (difficultyLevel == "easy") {
            questions = listOfAllQuestions.easy.shuffled()
        }
        if (difficultyLevel == "medium") {
            questions = listOfAllQuestions.medium.shuffled()
        }
        if (difficultyLevel == "hard") {
            questions = listOfAllQuestions.hard.shuffled()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        difficulty_label.text = "Difficulty level: " + (getIntent().getStringExtra("difficulty_mode"))
        generateQuestions()

        val timer: CountUpTimer = object : CountUpTimer(3000000) {
            override fun onTick(second: Int) {
                timer_label_question.text = "Your time: "+second.toString()
                timeElapsed = second.toString()
            }
        }

        timer.start()

        txt_question.text = questions[0].text
        btn_answer1.text = questions[0].answers[0].text
        btn_answer2.text = questions[0].answers[1].text
        btn_answer3.text = questions[0].answers[2].text
        btn_answer4.text = questions[0].answers[3].text

        listOf(btn_answer1, btn_answer2, btn_answer3, btn_answer4).forEachIndexed {index, it ->
            it.setOnClickListener{
                if (questions[x].answers[index].isCorrect) {
                    score++
                }

                x++
                txt_question_number.text = "Question number " + (x)
                if (x == 10)
                {
                    timer.cancel()

                    val intent = Intent(this, Score::class.java)
                    intent.putExtra("score", score)
                    intent.putExtra("time", timeElapsed)

                    HighScoresDB.HighScoresList.add(HighScorePosition(score,(getIntent().getStringExtra("difficulty_mode")),timeElapsed.toString()))

                    startActivity(intent)
                } else {
                    txt_question.text = questions[x].text
                    btn_answer1.text = questions[x].answers[0].text
                    btn_answer2.text = questions[x].answers[1].text
                    btn_answer3.text = questions[x].answers[2].text
                    btn_answer4.text = questions[x].answers[3].text
                }
            }
        }

    }
}



