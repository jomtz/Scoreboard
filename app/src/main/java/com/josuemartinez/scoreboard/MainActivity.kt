package com.josuemartinez.scoreboard

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.Int


class MainActivity : AppCompatActivity() {

    // Initialize the score for Team A
    var scoreTeamA = 0

    // Initialize the score for Team B
    var scoreTeamB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Increase the score for Team A
     */
    fun addThreeForTeamA(view: View) {
        scoreTeamA += 3
        displayForTeamA(scoreTeamA)
    }
    fun addTwoForTeamA(view: View) {
        scoreTeamA += 2
        displayForTeamA(scoreTeamA)
    }
    fun addOneForTeamA(view: View) {
        scoreTeamA += 1
        displayForTeamA(scoreTeamA)
    }
    /**
     * Increase the score for Team A
     */
    fun addThreeForTeamB(view: View) {
        scoreTeamB += 3
        displayForTeamB(scoreTeamB)
    }
    fun addTwoForTeamB(view: View) {
        scoreTeamB += 2
        displayForTeamB(scoreTeamB)
    }
    fun addOneForTeamB(view: View) {
        scoreTeamB += 1
        displayForTeamB(scoreTeamB)
    }
    fun resetScore(view: View) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    private fun displayForTeamA(scoreTeamA: Int) {
        val scoreView = findViewById<View>(R.id.team_a_score) as TextView
        scoreView.text = scoreTeamA.toString()
    }

    private fun displayForTeamB(scoreTeamB: Int) {
        val scoreView = findViewById<View>(R.id.team_b_score) as TextView
        scoreView.text = scoreTeamB.toString()
    }



}