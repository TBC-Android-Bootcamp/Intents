package com.example.intentshomework

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_user_profile.*

class RegisterActivity : AppCompatActivity() {

    private val requestCode = 20

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        init()
    }

    // init function
    private fun init(){

        addressButton.setOnClickListener{
            openSecondActivity()
        }

        btnSignUp.setOnClickListener{
            openUserProfile()
        }
    }


    private fun openSecondActivity(){
        val intent = Intent(this, ChooseAddressActivity::class.java)
        intent.putExtra("address", tvAddress.text.toString())
        startActivityForResult(intent, requestCode)
    }


    // ჯერ-ჯერობით parcelable ვერ გავიგე და ამ დღეებში უკეთ გადავხედავ. ამიტომაც უფრო გაშლილად კლასის გარეშე გავაკეთე
    private fun openUserProfile(){
        var intent = Intent(this, UserProfileActivity::class.java)
        intent.putExtra("userName", etUserName.text.toString())
        intent.putExtra("firstName", etFirstName.text.toString())
        intent.putExtra("lastName", etLastName.text.toString())
        intent.putExtra("age", etAge.text.toString())
        intent.putExtra("email", etEmail.text.toString())
        intent.putExtra("address", tvAddress.text.toString())
        startActivity(intent)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        val address = data!!.extras!!.getString("address", "")
        tvAddress.text = address
    }
}
