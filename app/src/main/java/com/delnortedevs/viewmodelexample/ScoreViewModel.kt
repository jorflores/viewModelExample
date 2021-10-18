package com.delnortedevs.viewmodelexample

import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel() {

    private var _scoreTeamA = 0
    private var _scoreTeamB = 0

    val scoreTeamA get() = _scoreTeamA
    val scoreTeamB get() = _scoreTeamB

    fun addScoreA(points : Int) {
        _scoreTeamA+= points
    }

    fun addScoreB(points : Int) {
        _scoreTeamB+= points
    }


    fun resetScores(){
        _scoreTeamA = 0
        _scoreTeamB = 0
    }


}