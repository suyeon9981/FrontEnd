package com.example.teamproject_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var RecipeList = arrayListOf<Recipe>(
        Recipe(R.drawable.rice,"밥"),
        Recipe(R.drawable.rice,"이"),
        Recipe(R.drawable.rice,"구"),
        Recipe(R.drawable.rice,"버")

    )
    //배열을 만들어 사용자의 정보를 담아준다.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Adapter = ListAdapter(context , RecipeList)
        lv.adapter = Adapter
        //만들어둔 ListAdapter를 이용해 카드뷰 - 사용자 정보 - 리스트뷰를 연결시켜준다.
    }
}