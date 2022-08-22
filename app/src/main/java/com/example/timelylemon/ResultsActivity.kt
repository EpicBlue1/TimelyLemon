package com.example.timelylemon

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.timelylemon.databinding.ActivityResultsBinding
import com.example.timelylemon.models.Constants
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

        binding.btnBack.setOnClickListener {
            saveResults(username.toString(), finalScore)

            val backButton = Intent(this, LandingActivity::class.java)
            startActivity(backButton)
            finish()
        }

        binding.btnCat.setOnClickListener {
            saveResults(username.toString(), finalScore)

            val catButton = Intent(this, CategorySelectActivity::class.java)
            startActivity(catButton)
            finish()
        }


        //update ui based on cat
        if(currentCat == 1){
            binding.resBack.setBackgroundResource(R.drawable.bg_android_sev)

            binding.finalScore.text = "Score: $finalScore"

            if(finalScore == 250){
                binding.bornResult.text = "$username, you are definitely a 70's kid"
            } else if(finalScore in 101..200) {
                binding.bornResult.text = "$username, you might be a 80's kid"
            } else if (finalScore in 0..100){
                binding.bornResult.text = "$username, you might be a 90's kid"
            }

        } else if(currentCat == 2) {
            binding.resBack.setBackgroundResource(R.drawable.bg_android_eight)

            binding.finalScore.text = "Score: $finalScore"

            if(finalScore == 250){
                binding.bornResult.text = "$username, you are definitely an 80's kid"
            } else if(finalScore in 101..200) {
                binding.bornResult.text = "$username, you might be a 70's kid"
            } else if (finalScore in 0..100){
                binding.bornResult.text = "$username, you might be a 90's kid"
            }

        } else if(currentCat == 3){
            binding.resBack.setBackgroundResource(R.drawable.bg_android_nine)

            binding.finalScore.text = "Score: $finalScore"

            if(finalScore == 250){
                binding.bornResult.text = "$username, you are definitely a 90's kid"
            } else if(finalScore in 101..200) {
                binding.bornResult.text = "$username, you might be a 80's kid"
            } else if (finalScore in 0..100){
                binding.bornResult.text = "$username, you might be a 70's kid"
            }

        }
    }

    private fun saveResults(username: String, finalScore: Int){
        val pref = getSharedPreferences("Pref", Context.MODE_PRIVATE)
        val editor = pref.edit()

        editor.apply{
            putString(Constants.LAST_USER, username)
            putInt(Constants.LAST_SCORE, finalScore)
            apply() //end
        }
    }
}