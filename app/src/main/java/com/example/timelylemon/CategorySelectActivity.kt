package com.example.timelylemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.widget.TextView
import com.example.timelylemon.databinding.ActivityCategorySelectBinding

class CategorySelectActivity : AppCompatActivity() {

    lateinit var data_receive : TextView

    private lateinit var binding: ActivityCategorySelectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategorySelectBinding.inflate(layoutInflater)
        setContentView(binding.root)

        data_receive = findViewById(R.id.high_one)

        val name = intent.getStringExtra("username")

        data_receive.text = "${name}'s High Score: 200"

        binding.btnBack.setOnClickListener {
            val backbutton = Intent(this, LandingActivity::class.java)
            startActivity(backbutton)
            finish()
        }

    }

}