package com.example.latihan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class login() : AppCompatActivity(), Parcelable {

    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        button2.setOnClickListener {
            val kode :String = input1.text.toString()

            if(kode.isEmpty())
            {
                Toast.makeText(this,"Kode Tidak Boleh Dikosongkan",Toast.LENGTH_SHORT ).show()
                return@setOnClickListener
            }

            val intent = Intent(this, biodata::class.java)
            startActivity(intent)
        }
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<login> {
        override fun createFromParcel(parcel: Parcel): login {
            return login(parcel)
        }

        override fun newArray(size: Int): Array<login?> {
            return arrayOfNulls(size)
        }
    }
}
