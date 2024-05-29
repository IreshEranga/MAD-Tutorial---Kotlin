package com.example.tutorial07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val postsList = mutableListOf<Post>()

    init {
        postsList.add(Post("Hannah Ice", "Anyone else here from New York?", 62))
        postsList.add(Post("Jane Smith", "Sunsets are so beautiful.", 37))
        postsList.add(Post("George Hill", "Anyone else here from New York?", 32))
        postsList.add(Post("Hannah Ice", "At the beach with friends.", 32))
        postsList.add(Post("Charlie Davis", "Sunsets are so beautiful.", 57))
        postsList.add(Post("Eddie Foster", "At the beach with friends.", 64))
        postsList.add(Post("Bob Brown", "This is my first post on Android Social Media app", 19))
        postsList.add(Post("John Doe", "Loving the new app update!", 90))
        postsList.add(Post("Fay Green", "Look at my new dog!", 63))
        postsList.add(Post("Diana Evans", "Anyone else here from New York?", 38))
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val rvList:RecyclerView = findViewById(R.id.rv)
        rvList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)

        val adapter = MyDataAdapter(postsList)

        rvList.adapter = adapter
    }
}