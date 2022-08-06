package com.example.timelylemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.WindowManager
import android.widget.Toast
import com.example.timelylemon.databinding.ActivityLandingBinding
import com.google.android.material.snackbar.Snackbar

class LandingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLandingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);

        binding.btnStart.setOnClickListener {
            val username = binding.uName.text.toString()

            //check if empty
            if(username.toString() == ""){
                //Snackbar
                var snackbarMes = Snackbar.make(it, "Please enter your name", Snackbar.LENGTH_LONG)
                snackbarMes.setAction("ok",{})
                snackbarMes.show()

                binding.uName.error = "Please add username"
            } else {
                val intent = Intent(this, CategorySelectActivity::class.java)

                //parse data
                intent.putExtra("username", username.toString())
                startActivity(intent)
                finish()
            }

        }
    }

}