package com.tpm.sharedpreference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val preference = MyPreference(this)
        btnSave.setOnClickListener {
            preference.saveData(edName.text.toString(),edPhoneNumber.text.toString())
        }
        btnClearForm.setOnClickListener {
            edName.setText("")
            edPhoneNumber.setText("")
        }
        btnRetrieve.setOnClickListener {
            edName.setText(preference.getUserName().toString())
            edPhoneNumber.setText(preference.getPhoneNumber().toString())
        }
    }
}
