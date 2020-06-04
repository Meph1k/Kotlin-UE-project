package com.example.alinguistjourney

data class HighScorePosition(
    val position_score:Int,
    val position_difficulty: String,
    val position_time: String

)

object HighScoresDB{

    var HighScoresList = arrayListOf<HighScorePosition>(
        HighScorePosition(5,"easy","10"),
        HighScorePosition(6,"hard","20"),
        HighScorePosition(7,"easy","34"),
        HighScorePosition(8,"medium","50"),
        HighScorePosition(5,"easy","10"),
        HighScorePosition(6,"hard","20"),
        HighScorePosition(7,"easy","34"),
        HighScorePosition(8,"medium","50"),
        HighScorePosition(5,"easy","10"),
        HighScorePosition(6,"hard","20"),
        HighScorePosition(7,"easy","34"),
        HighScorePosition(8,"medium","50"),
        HighScorePosition(5,"easy","10"),
        HighScorePosition(6,"hard","20"),
        HighScorePosition(7,"easy","34"),
        HighScorePosition(8,"medium","50"),
        HighScorePosition(5,"easy","10"),
        HighScorePosition(6,"hard","20"),
        HighScorePosition(7,"easy","34"),
        HighScorePosition(8,"medium","50"),
        HighScorePosition(7,"easy","34"),
        HighScorePosition(8,"medium","50"),
        HighScorePosition(5,"easy","10"),
        HighScorePosition(6,"hard","20"),
        HighScorePosition(7,"easy","34")
    )
}