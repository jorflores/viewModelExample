package com.delnortedevs.viewmodelexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel  : ViewModel()   {

    private var _scoreTeamA = MutableLiveData(0)
    private var _scoreTeamB = MutableLiveData(0)

    val scoreTeamA get() = _scoreTeamA
    val scoreTeamB get() = _scoreTeamB

    fun addScoreA(points : Int) {
        _scoreTeamA.value = _scoreTeamA.value?.plus(points)
    }

    fun addScoreB(points : Int) {
        _scoreTeamB.value = scoreTeamA.value?.plus(points)
    }


    fun resetScores(){
        _scoreTeamA.value = 0
        _scoreTeamB.value = 0
    }




}