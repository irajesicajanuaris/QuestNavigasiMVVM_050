package com.example.simpleviewmodel.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.simpleviewmodel.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel : ViewModel() {
    //only access internal class
    private val _dataModel = MutableStateFlow(Mahasiswa())
    //access for public
    val dataModel: StateFlow<Mahasiswa> = _dataModel.asStateFlow()

    fun saveDataMhs(
        listData : MutableList<String>
    ){
        _dataModel.update { mhs ->
            mhs.copy(
                nama = listData[0],
                gender = listData[1],
                nim = listData[2],
                email = listData[3],
                noTelpon = listData[4],
                alamat = listData[5],
            )
        }
    }

}