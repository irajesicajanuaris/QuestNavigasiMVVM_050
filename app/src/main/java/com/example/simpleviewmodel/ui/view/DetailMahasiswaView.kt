package com.example.simpleviewmodel.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.simpleviewmodel.model.Mahasiswa

@Composable
fun DetailMahasiswaView (
    dataMhs: Mahasiswa,
    modifier: Modifier = Modifier,
    onBackButton: () -> Unit
){
    val listDataMhs = listOf(
        Pair("Nama", dataMhs.nama),
        Pair("Gender", dataMhs.gender),
        Pair("NIM", dataMhs.nim),
        Pair("E-Mail", dataMhs.email),
        Pair("No Telp", dataMhs.noTelpon),
        Pair("Alamat", dataMhs.alamat),
    )

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        ElevatedButton(
            onClick = {onBackButton()}
        ) {
        Text("Kembali")
    }

        listDataMhs.forEach {data->
            DetailMhs(judul = data.first,
                isi = data.second)
        }
    }
}

@Composable
fun DetailMhs(
    judul:String,isi:String
){
    Row (
        modifier = Modifier.fillMaxWidth().padding(top = 10.dp)
    ){
        Text(text = judul,
            modifier = Modifier.weight(0.8f))
        Text(text = ":",
            modifier = Modifier.weight(0.2f))
        Text(text = isi,
            modifier = Modifier.weight(2f))
    }
}