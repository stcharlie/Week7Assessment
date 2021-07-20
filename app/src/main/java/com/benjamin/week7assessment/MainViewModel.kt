package com.benjamin.week7assessment

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel:ViewModel() {
    val x: MutableLiveData<List<Students>> = MutableLiveData()
    val y: MutableLiveData<List<Items>> = MutableLiveData()


    fun addStudentList(addStudents: Students){
        try{
            CoroutineScope(Dispatchers.IO).launch {
                val studentX : List<Students> =
                    RetrofitProvider.a.addStudentList(Students("B","Akarekor Charles",28))
                x.postValue(studentX)
            }
        }
        catch (e: Exception){
            Log.e("ViewModel",e.message.toString())
        }
    }


    fun getAllItems(){
        CoroutineScope(Dispatchers.IO).launch {
            val itemX : List<Items> = RetrofitProvider.a.getAllItems()
            y.postValue(itemX)
        }
    }
    }


