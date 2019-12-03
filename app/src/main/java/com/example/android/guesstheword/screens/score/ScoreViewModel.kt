/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.guesstheword.screens.score

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int) : ViewModel(){

    private val _score = MutableLiveData<Int>()
    private val _playAgainEvent = MutableLiveData<Boolean>()

    val score: LiveData<Int>
        get() = _score

    val playAgainEvent : LiveData<Boolean>
        get() = _playAgainEvent

    init {
        _score.value = finalScore
        _playAgainEvent.value =false
    }

    fun onPlayAgain(){
        _playAgainEvent.value = true
    }

    fun onPlayAgainComplete(){
        _playAgainEvent.value = false
    }
}
