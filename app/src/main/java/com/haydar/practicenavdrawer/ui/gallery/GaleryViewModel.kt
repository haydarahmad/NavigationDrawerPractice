package com.haydar.practicenavdrawer.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GaleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "this is galery Fragment"
    }
    val text: LiveData<String> = _text
}