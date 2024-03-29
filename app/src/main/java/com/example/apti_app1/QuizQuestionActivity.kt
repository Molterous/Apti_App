package com.example.apti_app1

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_question.*

class QuizQuestionActivity : AppCompatActivity() , View.OnClickListener{

    private var answercount=10
    private var correctanscount=0

    private var mCurrentPosition:Int=1
    private var mQuestionList:List<Questions>?=null
    private var mSelectedOptionPosition:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        val data=intent.getIntExtra("ExtraData",0)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        if(data==1) {
            mQuestionList = NumberSystem
        }
        else if(data==2)
        {
            mQuestionList= Trains
        }

        else if(data==3)
        {
            mQuestionList= TimeWork
        }
        else if(data==4)
        {
            mQuestionList= profitLoss
        }
        else if(data==5)
        {
            mQuestionList= Percentage
        }
        else if(data==6)
        {
            mQuestionList= Calendar
        }
        else if(data==7)
        {
            mQuestionList= Clock
        }
        else if(data==8)
        {
            mQuestionList= RatioProportion
        }

        else if(data==9)
        {
            mQuestionList= Area
        }

        else if(data==10)
        {
            mQuestionList= Probability
        }
        setQuestion()

        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)

        btn_submit.setOnClickListener(this)





    }
    @SuppressLint("SetTextI18n")

    //46 min
    private fun setQuestion() {



        val questions=mQuestionList!!.get(mCurrentPosition-1)
        defautOptionView()
        if(mCurrentPosition == mQuestionList!!.size)
        {
            btn_submit.text="Finish"
        }
        else{
            btn_submit.text="Submit"
        }
        progressBar.progress = mCurrentPosition
        tv_progress.text="$mCurrentPosition" + "/" + progressBar.max
        tv_question.text = questions.question
        tv_option_one.text = questions.optionOne
        tv_option_two.text = questions.optionTwo
        tv_option_three.text = questions.optionThree
        tv_option_four.text = questions.optionFour
        hint.text=questions.hint

        explain.visibility=View.GONE
        hint.visibility=View.GONE



    }
    override fun onClick(v : View?) {
        //test 2.


        tv_option_four?.isEnabled=true
        tv_option_three?.isEnabled=true
        tv_option_one?.isEnabled=true
        tv_option_two?.isEnabled=true



        //hint.visibility=View.VISIBLE

        if (v!= null) {

            when (v.id) {
                R.id.tv_option_one -> {
                    selectedOptionView(tv_option_one, 1)
                }

                R.id.tv_option_two -> {
                    selectedOptionView(tv_option_two, 2)
                }
                R.id.tv_option_three -> {
                    selectedOptionView(tv_option_three, 3)
                }
                R.id.tv_option_four -> {
                    selectedOptionView(tv_option_four, 4)
                }


                R.id.btn_submit -> {

                    if (mSelectedOptionPosition == 0) {
                        mCurrentPosition++
                        when {
                            mCurrentPosition <= mQuestionList!!.size -> {


                                setQuestion()
                            }
                            else -> {
//                                Toast.makeText(
//                                    this,
//                                    "You have successfully completed Quiz with a score of $correctanscount",
//                                    Toast.LENGTH_SHORT
//                                ).show()


                                val intent = Intent(this, scoreActivity::class.java)
                                intent.putExtra("ExtraData",correctanscount)
                                startActivity(intent)
                                finish()
                            }
                        }
                    } else {
                        val question = mQuestionList?.get(mCurrentPosition - 1)
                        if (question!!.correctOption != mSelectedOptionPosition) {

                            answercount--
                            answerView(mSelectedOptionPosition,
                                R.drawable.wrong_option_border_bg

                            )
                        }
                        if(question!!.correctOption==mSelectedOptionPosition)
                        {
                            correctanscount++
                        }
                        answerView(question.correctOption,
                            R.drawable.correct_option_border_bg
                        )
                        if (mCurrentPosition == mQuestionList!!.size) {
                            explain.visibility=View.VISIBLE

                            hint.visibility=View.VISIBLE



                            tv_option_four?.isEnabled=false
                            tv_option_three?.isEnabled=false
                            tv_option_one?.isEnabled=false
                            tv_option_two?.isEnabled=false

                            btn_submit.text = "Finish"

                            //hint.visibility=View.GONE

                        } else {

                            explain.visibility=View.VISIBLE

                            hint.visibility=View.VISIBLE

                            tv_option_four?.isEnabled=false
                            tv_option_three?.isEnabled=false
                            tv_option_one?.isEnabled=false
                            tv_option_two?.isEnabled=false

                            btn_submit.text = "Next Question"

                          //  hint.visibility=View.GONE

                        }
                        mSelectedOptionPosition = 0


                    }

                    //test 1.


                   // hint.visibility=View.VISIBLE

                }
            }
        }
    }
    private fun defautOptionView() {
//        tv_option_four?.isEnabled= true
//        tv_option_three?.isEnabled= true
//        tv_option_one?.isEnabled= true
//        tv_option_two?.isEnabled= true

        val options=ArrayList<TextView>()
        options.add(0,tv_option_one)
        options.add(1,tv_option_two)
        options.add(2,tv_option_three)
        options.add(3,tv_option_four)

        for(option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background =  ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum:Int)
    {
        defautOptionView()
        mSelectedOptionPosition = selectedOptionNum
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background= ContextCompat.getDrawable(this,
            R.drawable.selected_option_border_bg
        )

    }


    private fun answerView(answer:Int,drawableView:Int){
        when(answer){
            1->{

                tv_option_one.background= ContextCompat.getDrawable(this,drawableView)

            }
            2->{
                tv_option_two.background= ContextCompat.getDrawable(this,drawableView)

            }
            3->{
                tv_option_three.background= ContextCompat.getDrawable(this,drawableView)

            }
            4->{
                tv_option_four.background= ContextCompat.getDrawable(this,drawableView)

            }

        }

    }
}