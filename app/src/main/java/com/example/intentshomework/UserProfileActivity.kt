package com.example.intentshomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_user_profile.*

class UserProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)
        init()
    }

    private fun init(){
        val intent = intent
        val userName = intent.extras?.getString("userName", "")
        val firstName = intent.extras?.getString("firstName", "")
        val lastName = intent.extras?.getString("lastName", "")
        val age = intent.extras?.getString("age", "")
        val email = intent.extras?.getString("lastName", "")
        val address = intent.extras?.getString("address", "")
        tvUserName.text = userName
        tvFirstName.text = firstName
        tvLastName.text = lastName
        tvAge.text = age
        tvEmail.text = email
        tvAddresP.text = address
    }

}
