package com.haydar.practicenavdrawer.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideShowViewModel : ViewModel(){

    private val _text = MutableLiveData<String>().apply {
        value = "This is slideshow Fragment"
    }
    val text: LiveData<String> = _text
}