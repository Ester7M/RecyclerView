package com.recyclerview.demomvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.recyclerview.demomvvm.model.UserDAta
import com.recyclerview.demomvvm.view.adapter.MyAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var userAdapter:MyAdapter
    private lateinit var myRecycler:RecyclerView
    private lateinit var userList:ArrayList<UserDAta>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**set Id*/
        myRecycler = findViewById(R.id.myRecycler)
        userList = ArrayList<UserDAta>()
        userAdapter = MyAdapter(userList)
        myRecycler.layoutManager = LinearLayoutManager(this)
        myRecycler.adapter = userAdapter
        listUser()

    }
    fun listUser(){
        userList.add(UserDAta(R.drawable.watermelon,"1. Watermelon:","100 grams melon: 27 calories and 5.8 grams sugar"))
        userList.add(UserDAta(R.drawable.cantaloupe,"2. Cantaloupe:","100 grams melon : 38 calories and 7.4 grams sugar"))
        userList.add(UserDAta(R.drawable.apple,"3. Apples:","100 grams apple : 47 calories and 9.8 grams sugar"))
        userList.add(UserDAta(R.drawable.bananas,"4. Bananas:","100 grams banana: 96 calories and 21 grams sugar"))
        userList.add(UserDAta(R.drawable.kiwi,"5. Kiwi:","100 grams kiwi : 47 calories and 8.1 grams sugar"))
        userList.add(UserDAta(R.drawable.mango,"6. Mango:","100 grams mango : 60 calories and 13.4 grams sugar"))
        userList.add(UserDAta(R.drawable.orange,"7. Oranges:","100 grams orange: 43 calories and 8.1 grams sugar"))
        userList.add(UserDAta(R.drawable.pineapple,"8. Pineapple:","100 grams pineapple : 52 calories and 11.8 grams sugar"))
        userList.add(UserDAta(R.drawable.strawberry,"9. Strawberries:","100 grams berries : 41 calories and 7.5 grams sugar"))
        userList.add(UserDAta(R.drawable.tomato,"10. Tomatoes:","100 grams tomato: 10 calories and 4 grams sugar"))




    }
}