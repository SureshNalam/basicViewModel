package sample.architecturalcomponents

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log

class DataViewModel: ViewModel() {


    private var count = "EMPTY STRING"

    fun getData()= count

    fun setData(str: String){

        count = str
    }

}