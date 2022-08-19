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
            rb = R.drawable.img_cat_sev_ques,
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
            rb = R.drawable.img_cat_sev_ques,
            optionOne = "Time to cheer up",
            optionTwo = "Have a Nice Day",
            optionThree = "Share a smile today",
            optionFour = "A great yellow smile"
        )

        val questionThree = Question(
            id = 3,
            questionTxt = "In 1974, “People Magazine” covered the May-December relationship between the star of “Cannonball Run” and an older daytime talk show host. Who were they?",
            img = R.drawable.cat_one_three,
            bg = R.drawable.bg_android_sev,
            rb = R.drawable.img_cat_sev_ques,
            optionOne = "Bianca Jagger",
            optionTwo = "Burt Reynolds and Dinah Shore",
            optionThree = "Farrah Fawcett and Dean Martin",
            optionFour = "Adrienne Barbeau and Terry Bradshaw"
        )

        val questionFour = Question(
            id = 4,
            questionTxt = "Why did Procter & Gamble replace the “mom” on the cover of the Ivory soapbox in 1972?",
            img = R.drawable.cat_one_four,
            bg = R.drawable.bg_android_sev,
            rb = R.drawable.img_cat_sev_ques,
            optionOne = "The model was Marilyn Chambers, a porn star",
            optionTwo = "Legal issues regarding the rights to the photo",
            optionThree = "She was not pretty enough",
            optionFour = "She did not match the company slogan"
        )

        val questionFive = Question(
            id = 5,
            questionTxt = "In the 1970s, Woodsy Owl used what motto in his public service announcements about pollution?",
            img = R.drawable.cat_one_five,
            bg = R.drawable.bg_android_sev,
            rb = R.drawable.img_cat_sev_ques,
            optionOne = "Woooo lighted that fire?",
            optionTwo = "Save the Earth, save yourselves",
            optionThree = "Give a hoot, don’t pollute",
            optionFour = "Love to breathe, save the trees"
        )

        all70sQuestions.add(questionOne)
        all70sQuestions.add(questionTwo)
        all70sQuestions.add(questionThree)
        all70sQuestions.add(questionFour)
        all70sQuestions.add(questionFive)

        return all70sQuestions;
    }

    fun getAll80sQuestions() : ArrayList<Question> {
        var all80sQuestions = ArrayList<Question>()

        //Data
        val questionOne = Question(
            id = 1,
            questionTxt = "AAAAAAAAAAAA?",
            img = R.drawable.cat_one_one,
            bg = R.drawable.bg_android_eight,
            rb = R.drawable.img_cat_eight_ques,
            optionOne = "Farrah Fawcett and Lee Majors",
            optionTwo = "Harrison Ford and Raquel Welch",
            optionThree = "Raquel Welch and Joe Namath",
            optionFour = "Walter Matthau and Tatum O’Neal"
        )

        val questionTwo = Question(
            id = 2,
            questionTxt = "Starting in 1970, a cheerful bright yellow symbol started showing up on buttons, mugs, and t-shirts. What was the four-word expression often depicted with this smiling image?",
            img = R.drawable.cat_one_two,
            bg = R.drawable.bg_android_eight,
            rb = R.drawable.img_cat_eight_ques,
            optionOne = "Time to cheer up",
            optionTwo = "Have a Nice Day",
            optionThree = "Share a smile today",
            optionFour = "A great yellow smile"
        )

        val questionThree = Question(
            id = 3,
            questionTxt = "In 1974, “People Magazine” covered the May-December relationship between the star of “Cannonball Run” and an older daytime talk show host. Name them both.",
            img = R.drawable.cat_one_three,
            bg = R.drawable.bg_android_eight,
            rb = R.drawable.img_cat_eight_ques,
            optionOne = "Time to cheer up",
            optionTwo = "Have a Nice Day",
            optionThree = "Share a smile today",
            optionFour = "A great yellow smile"
        )

        val questionFour = Question(
            id = 4,
            questionTxt = "Why did Procter & Gamble replace the “mom” on the cover of the Ivory soapbox in 1972?",
            img = R.drawable.cat_one_four,
            bg = R.drawable.bg_android_eight,
            rb = R.drawable.img_cat_eight_ques,
            optionOne = "Legal issues regarding the rights to the photo",
            optionTwo = "The model was Marilyn Chambers, a porn star",
            optionThree = "She was not pretty enough",
            optionFour = "She did not match the company slogan"
        )

        val questionFive = Question(
            id = 5,
            questionTxt = "Why did Procter & Gamble replace the “mom” on the cover of the Ivory soapbox in 1972?",
            img = R.drawable.cat_one_four,
            bg = R.drawable.bg_android_eight,
            rb = R.drawable.img_cat_eight_ques,
            optionOne = "Legal issues regarding the rights to the photo",
            optionTwo = "The model was Marilyn Chambers, a porn star",
            optionThree = "She was not pretty enough",
            optionFour = "She did not match the company slogan"
        )

        all80sQuestions.add(questionOne)
        all80sQuestions.add(questionTwo)
        all80sQuestions.add(questionThree)
        all80sQuestions.add(questionFour)
        all80sQuestions.add(questionFive)

        return all80sQuestions;
    }
    fun getAll90sQuestions() : ArrayList<Question> {
        var all90sQuestions = ArrayList<Question>()

        //Data
        val questionOne = Question(
            id = 1,
            questionTxt = "Who were the top two stars of the 1976 hit film “The Bad News Bears?",
            img = R.drawable.cat_one_one,
            bg = R.drawable.bg_android_sev,
            rb = R.drawable.img_cat_eight_ques,
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
            rb = R.drawable.img_cat_eight_ques,
            optionOne = "Time to cheer up",
            optionTwo = "Have a Nice Day",
            optionThree = "Share a smile today",
            optionFour = "A great yellow smile"
        )

        val questionThree = Question(
            id = 3,
            questionTxt = "In 1974, “People Magazine” covered the May-December relationship between the star of “Cannonball Run” and an older daytime talk show host. Name them both.",
            img = R.drawable.cat_one_three,
            bg = R.drawable.bg_android_sev,
            rb = R.drawable.img_cat_eight_ques,
            optionOne = "Time to cheer up",
            optionTwo = "Have a Nice Day",
            optionThree = "Share a smile today",
            optionFour = "A great yellow smile"
        )

        val questionFour = Question(
            id = 4,
            questionTxt = "Why did Procter & Gamble replace the “mom” on the cover of the Ivory soapbox in 1972?",
            img = R.drawable.cat_one_four,
            bg = R.drawable.bg_android_sev,
            rb = R.drawable.img_cat_eight_ques,
            optionOne = "Legal issues regarding the rights to the photo",
            optionTwo = "The model was Marilyn Chambers, a porn star",
            optionThree = "She was not pretty enough",
            optionFour = "She did not match the company slogan"
        )

        val questionFive = Question(
            id = 5,
            questionTxt = "Why did Procter & Gamble replace the “mom” on the cover of the Ivory soapbox in 1972?",
            img = R.drawable.cat_one_four,
            bg = R.drawable.bg_android_sev,
            rb = R.drawable.img_cat_eight_ques,
            optionOne = "Legal issues regarding the rights to the photo",
            optionTwo = "The model was Marilyn Chambers, a porn star",
            optionThree = "She was not pretty enough",
            optionFour = "She did not match the company slogan"
        )

        all90sQuestions.add(questionOne)
        all90sQuestions.add(questionTwo)
        all90sQuestions.add(questionThree)

        return all90sQuestions;
    }

}