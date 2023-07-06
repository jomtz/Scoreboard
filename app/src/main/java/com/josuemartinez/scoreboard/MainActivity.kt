package com.josuemartinez.scoreboard

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: ScoreViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this)[ScoreViewModel::class.java]
        displayForTeamA(viewModel.scoreTeamA)
        displayForTeamB(viewModel.scoreTeamB)
    }

    /**
     * Increase the score for Team A
     */
    fun addThreeForTeamA(view: View) {
        viewModel.scoreTeamA += 3
        displayForTeamA(viewModel.scoreTeamA)
    }
    fun addTwoForTeamA(view: View) {
        viewModel.scoreTeamA += 2
        displayForTeamA(viewModel.scoreTeamA)
    }
    fun addOneForTeamA(view: View) {
        viewModel.scoreTeamA += 1
        displayForTeamA(viewModel.scoreTeamA)
    }
    /**
     * Increase the score for Team B
     */
    fun addThreeForTeamB(view: View) {
        viewModel.scoreTeamB += 3
        displayForTeamB(viewModel.scoreTeamB)
    }
    fun addTwoForTeamB(view: View) {
        viewModel.scoreTeamB += 2
        displayForTeamB(viewModel.scoreTeamB)
    }
    fun addOneForTeamB(view: View) {
        viewModel.scoreTeamB += 1
        displayForTeamB(viewModel.scoreTeamB)
    }

    /**
     * Reset the score
     */
    fun resetScore(view: View) {
        viewModel.scoreTeamA = 0;
        viewModel.scoreTeamB = 0;
        displayForTeamA(viewModel.scoreTeamA)
        displayForTeamB(viewModel.scoreTeamB)

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