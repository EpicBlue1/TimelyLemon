package com.example.timelylemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.view.WindowManager
import android.widget.TextView
import com.example.timelylemon.databinding.ActivityCategorySelectBinding

class CategorySelectActivity : AppCompatActivity() {

    lateinit var data_receive : TextView

    private lateinit var binding: ActivityCategorySelectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategorySelectBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);

        data_receive = findViewById(R.id.high_one)

        val name = intent.getStringExtra("username")

        binding.highOne.text = "${name}'s High Score: 200"

        binding.btnBack.setOnClickListener {
            val backButton = Intent(this, LandingActivity::class.java)
            startActivity(backButton)
            finish()
        }

        binding.qzSeven.setOnClickListener {
            val startTrivia = Intent(this, QuestionsActivity::class.java)
            startActivity(startTrivia)
            finish()
        }

    }

}