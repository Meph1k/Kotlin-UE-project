package com.example.alinguistjourney

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_high_scores.view.*
import kotlinx.android.synthetic.main.high_score_row.view.*


class MyAdapter : RecyclerView.Adapter<MyViewHolder>(){

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater=LayoutInflater.from(viewGroup.context)
        val highScoresRow=layoutInflater.inflate(R.layout.high_score_row,viewGroup,false)
        return MyViewHolder(highScoresRow)
    }

    override fun getItemCount(): Int {
        return HighScoresDB.HighScoresList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val score_textView=holder.view.position_score
        val difficulty_textView=holder.view.position_difficulty
        val time_textView=holder.view.position_time

        score_textView.setText(HighScoresDB.HighScoresList[position].position_score.toString())
        difficulty_textView.setText(HighScoresDB.HighScoresList[position].position_difficulty)
        time_textView.setText(HighScoresDB.HighScoresList[position].position_time)
    }


}


class MyViewHolder(val view: View):RecyclerView.ViewHolder(view)