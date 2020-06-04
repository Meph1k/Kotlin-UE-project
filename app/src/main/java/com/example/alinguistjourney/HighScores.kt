package com.example.alinguistjourney

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import android.widget.TableLayout
import android.widget.TableRow
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_high_scores.*
import kotlinx.android.synthetic.main.activity_high_scores.view.*

class HighScores : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_high_scores)

        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = MyAdapter()

        val originalList = ArrayList(HighScoresDB.HighScoresList)
        var i = 0;
        var j = 0;
        var k = 0;

        high_scores_score_label.setOnClickListener {
            if (i % 2 == 0) {
                HighScoresDB.HighScoresList = ArrayList<HighScorePosition>(HighScoresDB.HighScoresList.sortedBy { it.position_score })
            } else {
                HighScoresDB.HighScoresList = originalList;
            }
            i++

            recyclerView.adapter = MyAdapter()
        }

        high_scores_difficulty_label.setOnClickListener {
            if (j % 2 == 0) {
                HighScoresDB.HighScoresList = ArrayList<HighScorePosition>(HighScoresDB.HighScoresList.sortedBy { it.position_difficulty })
            } else {
                HighScoresDB.HighScoresList = originalList;
            }
            j++

            recyclerView.adapter = MyAdapter()
        }

        high_scores_time_label.setOnClickListener {
            if (k % 2 == 0) {
                HighScoresDB.HighScoresList = ArrayList<HighScorePosition>(HighScoresDB.HighScoresList.sortedBy { it.position_time })
            } else {
                HighScoresDB.HighScoresList = originalList;
            }
            k++

            recyclerView.adapter = MyAdapter()
        }
    }
}
