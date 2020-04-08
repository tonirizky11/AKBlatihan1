package com.example.latihan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_biodata.*

class biodata : AppCompatActivity() {

    lateinit var Nama : EditText
    lateinit var Btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        Nama = findViewById(R.id.nama)
        Btn = findViewById(R.id.button4)

        Btn.setOnClickListener {
            var name = Nama.text.toString()
            var umur1 :String = umur.text.toString()

            if(name.isEmpty())
            {
                Toast.makeText(this,"Nama Tidak Boleh Dikosongkan", Toast.LENGTH_SHORT ).show()
                return@setOnClickListener
            }

            if(umur1.isEmpty())
            {
                Toast.makeText(this,"Umur Tidak Boleh Dikosongkan",Toast.LENGTH_SHORT ).show()
                return@setOnClickListener
            }

            val intent = Intent(this, sayhai::class.java)
            intent.putExtra("Nama", name)
            startActivity(intent)
        }

    }
}
