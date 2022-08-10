package com.example.timelylemon.models

import com.example.timelylemon.R

//https://boomagain.com/70s-trivia/

object Constants {

    fun getAllQuestions() : ArrayList<Question> {
        var allQuestions = ArrayList<Question>()

        //Data
        val questionOne = Question(
            id = 1,
            questionTxt = "Who were the top two stars of the 1976 hit film “The Bad News Bears?",
            R.drawable.img_icon,
            optionOne = "Farrah Fawcett and Lee Majors",
            optionTwo = "Harrison Ford",
            optionThree = "Raquel Welch and Joe Namath",
            optionFour = "Walter Matthau and Tatum O’Neal"
        )

        val questionTwo = Question(
            id = 2,
            questionTxt = "Starting in 1970, a cheerful bright yellow symbol started showing up on buttons, mugs, and t-shirts. What was the four-word expression often depicted with this smiling image?",
            R.drawable.img_icon,
            optionOne = "Time to cheer up",
            optionTwo = "Have a Nice Day.",
            optionThree = "Share a smile today",
            optionFour = "A great yellow smile"
        )

        val questionThree = Question(
            id = 3,
            questionTxt = "In 1974, “People Magazine” covered the May-December relationship between the star of “Cannonball Run” and an older daytime talk show host. Name them both.",
            R.drawable.img_icon,
            optionOne = "Time to cheer up",
            optionTwo = "Have a Nice Day.",
            optionThree = "Share a smile today",
            optionFour = "A great yellow smile"
        )


        return allQuestions;

    }

}