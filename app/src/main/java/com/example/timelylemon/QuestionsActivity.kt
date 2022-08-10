package com.example.timelylemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.timelylemon.databinding.ActivityQuestionsBinding
import com.example.timelylemon.models.Constants.getAllQuestions
import com.example.timelylemon.models.Question

class QuestionsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuestionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //get the question handler from previous activity
        var qNumber = intent.getIntExtra("questionNumber", 0)

        //Call all questions
        var questions = getAllQuestions();

        //select current Question
        val currentQ= questions[qNumber]

        Log.i( "Question Count: ", "${questions[0].questionTxt}")

        updatefrontEnd(currentQ)

        binding.btnNext.setOnClickListener {

            if(qNumber + 1 == questions.count()){
                //if true
                //Navigate to results
                val intent = Intent(this, ResultsActivity::class.java)
                startActivity(intent)
                finish()
            } else {

                val intent = Intent(this, QuestionsActivity::class.java)
                //pass username and next question
                intent.putExtra("questionNumber", qNumber + 1)

                startActivity(intent)
                //dont go back
                finish()

            }
        }
    }

    fun updatefrontEnd(currentQ: Question) {
        //Log to logcat
        binding.answerOne.text = currentQ.optionOne
        binding.answerTwo.text = currentQ.optionTwo
        binding.answerThree.text = currentQ.optionThree
        binding.answerFour.text = currentQ.optionFour
    }
}