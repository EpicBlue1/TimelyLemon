package com.example.timelylemon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.timelylemon.databinding.ActivityResultsBinding
import com.example.timelylemon.models.Question

class ResultsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        val finalScore = intent.getIntExtra("Score", 0);
        val username = intent.getStringExtra("username");
        val currentCat = intent.getIntExtra("QuestionNum", 1);

        //update ui based on cat
        if(currentCat == 1){
            binding.resBack.setBackgroundResource(R.drawable.bg_android_sev)

            binding.finalScore.text = "Score: $finalScore"

            if(finalScore == 250){
                binding.bornResult.text = "$username You are definitely a 70's kid"
            } else if(finalScore in 101..200) {
                binding.bornResult.text = "$username You might be a 80's kid"
            } else if (finalScore in 0..100){
                binding.bornResult.text = "$username You might be a 90's kid"
            }

        } else if(currentCat == 2) {
            binding.resBack.setBackgroundResource(R.drawable.bg_android_eight)

            binding.finalScore.text = "Score: $finalScore"

            if(finalScore == 250){
                binding.bornResult.text = "$username You are definitely an 80's kid"
            } else if(finalScore in 101..200) {
                binding.bornResult.text = "$username You might be a 70's kid"
            } else if (finalScore in 0..100){
                binding.bornResult.text = "$username You might be a 90's kid"
            }

        } else if(currentCat == 3){
            binding.resBack.setBackgroundResource(R.drawable.bg_android_nine)

            binding.finalScore.text = "Score: $finalScore"

            if(finalScore == 250){
                binding.bornResult.text = "$username You are definitely a 90's kid"
            } else if(finalScore in 101..200) {
                binding.bornResult.text = "$username You might be a 80's kid"
            } else if (finalScore in 0..100){
                binding.bornResult.text = "$username You might be a 70's kid"
            }

        }


    }
}