package com.example.timelylemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.timelylemon.databinding.ActivityQuestionsBinding
import com.example.timelylemon.models.Constants.getAll70sQuestions
import com.example.timelylemon.models.Question
import com.google.android.material.radiobutton.MaterialRadioButton

class QuestionsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuestionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val questionsType = intent.getStringExtra("Trivia")
        val username = intent.getStringExtra("usernamme")
        var questionNumber = intent.getIntExtra("questionNumber", 0)
        var currentScore = intent.getIntExtra("currentScore", 0)

//      if(questionsType == "70"){
        var questions = getAll70sQuestions()

        val currentQuestion = questions[questionNumber]

        updateUi(currentQuestion)

        binding.btnNext.setOnClickListener {
            var selectedAnswer = binding.rgAnswers.checkedRadioButtonId

            if(selectedAnswer == -1){
                val toast = Toast.makeText(this, "please select an answer", Toast.LENGTH_SHORT)
                toast.show()
            } else {
                var userAnswer = findViewById<MaterialRadioButton>(selectedAnswer) //find checkbox that has been selected
                Log.i("Selected Answer: ", userAnswer.text.toString())

                //checked correct
                if(userAnswer.text.toString() == currentQuestion.optionOne){
                    currentScore += 1
                    Log.i("Correct?: ", "Yes!")
                }

                //Update ui to show result if correct
                if(questionNumber + 1 == questions.count()){
                    //if true
                    //Navigate to results
                    val intent = Intent(this, ResultsActivity::class.java)
                    intent.putExtra("currentScore", currentScore)
                    intent.putExtra("username", username)
                    startActivity(intent)
                    finish()
                } else {
                    val intent = Intent(this, QuestionsActivity::class.java)
                    //pass username and next question
                    intent.putExtra("username", username)
                    intent.putExtra("questionNumber", questionNumber + 1)
                    //pass score
                    intent.putExtra("currentScore", currentScore)

                    startActivity(intent)
                    //dont go back
                    finish()
                }
            }
        }
//        }

    }

    private fun updateUi(CurrentQuestion: Question){
        binding.qpQuestion.text = CurrentQuestion.questionTxt
        binding.rbAnswerOne.text = CurrentQuestion.optionOne
        binding.rbAnswerTwo.text = CurrentQuestion.optionTwo
        binding.rbAnswerThree.text = CurrentQuestion.optionThree
        binding.rbAnswerFour.text = CurrentQuestion.optionFour
        binding.qImage.setImageResource(CurrentQuestion.img)
    }
}