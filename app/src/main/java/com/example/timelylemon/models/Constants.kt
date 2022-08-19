package com.example.timelylemon.models

import com.example.timelylemon.R

//https://boomagain.com/70s-trivia/

object Constants {

    fun getAll70sQuestions() : ArrayList<Question> {
        var all70sQuestions = ArrayList<Question>()

        //Data
        val questionOne = Question(
            id = 1,
            questionTxt = "Who were the top two stars of the 1976 hit film “The Bad News Bears?",
            img = R.drawable.cat_one_one,
            bg = R.drawable.bg_android_sev,
            optionOne = "Farrah Fawcett and Lee Majors",
            optionTwo = "Harrison Ford and Raquel Welch",
            optionThree = "Raquel Welch and Joe Namath",
            optionFour = "Walter Matthau and Tatum O’Neal"
        )

        val questionTwo = Question(
            id = 2,
            questionTxt = "Starting in 1970, a cheerful bright yellow symbol started showing up on buttons, mugs, and t-shirts. What was the four-word expression often depicted with this smiling image?",
            img = R.drawable.cat_one_two,
            bg = R.drawable.bg_android_sev,
            optionOne = "Time to cheer up",
            optionTwo = "Have a Nice Day",
            optionThree = "Share a smile today",
            optionFour = "A great yellow smile"
        )

        val questionThree = Question(
            id = 3,
            questionTxt = "In 1974, “People Magazine” covered the May-December relationship between the star of “Cannonball Run” and an older daytime talk show host. Name them both.",
            img = R.drawable.img_people,
            bg = R.drawable.bg_android_sev,
            optionOne = "Time to cheer up",
            optionTwo = "Have a Nice Day",
            optionThree = "Share a smile today",
            optionFour = "A great yellow smile"
        )

        all70sQuestions.add(questionOne)
        all70sQuestions.add(questionTwo)
        all70sQuestions.add(questionThree)

        return all70sQuestions;
    }
}