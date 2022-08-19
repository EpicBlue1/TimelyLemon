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

        val finalScore = intent.getIntExtra("score", 0);
        val username = intent.getStringExtra("username");
        val currentCat = intent.getIntExtra("QuestionNum", 1);

        //update ui based on cat
        if(currentCat == 1){
            binding.resBack.setBackgroundResource(R.drawable.bg_android_sev)
        } else if(currentCat == 2) {
            binding.resBack.setBackgroundResource(R.drawable.bg_android_eight)
        } else if(currentCat == 3){

        }
    }
}