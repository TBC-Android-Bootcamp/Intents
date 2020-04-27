package com.example.intentshomework

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_choose_address.*

class ChooseAddressActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_address)
        init()
    }

    private fun init(){
        btnAddAddress.setOnClickListener{
            backToRegistration()
        }
    }

    private fun backToRegistration(){
        val intent = intent
        val address = etYourAddress.text.toString()
        intent.putExtra("address", address)
        setResult(Activity.RESULT_OK, intent)
        finish()
    }

}
