package com.example.studentclass_question

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    //버튼 정의


    //텍스트뷰 정의


    //Edit텍스트 정의


    //계산을 하기위한 edittext의 값을 저장시킬 변수


    //Calculator클래스를 정의할 변수


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //xml의 버튼과 액티비티 연결


        //xml의 텍스트뷰와 액티비티 연결


        //xml의 Edit텍스트와 액티비티 연결


        //Calculator 객체 생성


        //addBtn 클릭이벤트{
        // Edit텍스트값을 getText를 통하여 값을 가져옴
        // calculator.add 함수를 호출하여 리턴받은값을 텍스트뷰에 저장
        //}


        //minusBtn 클릭이벤트{
        // Edit텍스트값을 getText를 통하여 값을 가져옴
        // calculator.minus 함수를 호출하여 리턴받은값을 텍스트뷰에 저장
        //}


        //multiplicationBtn 클릭이벤트{
        // Edit텍스트값을 getText를 통하여 값을 가져옴
        // calculator.multiplication 함수를 호출하여 리턴받은값을 텍스트뷰에 저장
        //}


        //divisionBtn 클릭이벤트{
        // Edit텍스트값을 getText를 통하여 값을 가져옴
        // calculator.division 함수를 호출하여 리턴받은값을 텍스트뷰에 저장
        //}
    }
}