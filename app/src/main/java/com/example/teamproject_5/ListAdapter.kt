package com.example.teamproject_5

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListAdapter
import android.widget.TextView
import java.security.AccessControlContext
import com.example.teamproject_5.databinding.ActivityMainBinding
import kotlinx.coroutines.flow.combine

class ListAdapter : ListAdapter {



    class ListAdapter(val context: Context, val RecipeList: ArrayList<Recipe>) : BaseAdapter() {


        override fun getCount(): Int {
            return RecipeList.size
        }

        override fun getItem(position: Int): Any {
            return RecipeList[position]
        }

        override fun getItemId(position: Int): Long {
            return 0
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val view : View = LayoutInflater.from(context).inflate(R.layout.item_food, null)
            val image = view.findViewById<ImageView>(R.id.iv_foodImage)
            val name = view.findViewById<TextView>(R.id.name_tv)
            //profile, name, email, content 각 변수를 만들어 item_user.xml의 각 정보를 담을 곳의 위치를 가지게 한다.

            val food = RecipeList[position]
            //user 변수에 배열(또는 서버에서 받아온 데이터)에 담긴 profile, name, email, content 정보를 담아준다.

            image.setImageResource(Recipe.image)
            name.text = Recipe.name

            //위에서 가져온 profile, name, email, content 각각의 변수를 만들어둔 카드뷰에 연결시켜준다.

            return view
            //연결이 완료된 뷰를 돌려준다.
        }

    }
}