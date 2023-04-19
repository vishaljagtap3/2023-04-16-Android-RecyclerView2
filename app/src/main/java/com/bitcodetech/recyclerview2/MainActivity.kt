package com.bitcodetech.recyclerview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerPosts : RecyclerView
    private val posts = ArrayList<Post>();
    private lateinit var postsAdapter : PostsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()
        initData()
        initData()

        initViews()
    }

    private fun initViews() {
        recyclerPosts = findViewById(R.id.recyclerPosts)
        recyclerPosts.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

        postsAdapter = PostsAdapter(posts)
        recyclerPosts.adapter = postsAdapter
    }

    private fun initData() {
        posts.add(
            Post(1, "@bitcodetech", "12-04-2023", R.drawable.image01, "Are you looking to build Career in IT ?\n" + "Join BitCode! We are the Best IT Training Company in Pune.", 10)
        )
        posts.add(
            Post(1, "@vishaljagtap", "12-04-2023", R.drawable.image02, null)
        )
        posts.add(
            Post(1, "@bitcodetech", "12-04-2023", R.drawable.image03, "Android the most popular operating system", 20)
        )
        posts.add(
            Post(1, "@aavidsoft", "12-04-2023", R.drawable.image01, "Are you looking to build Career in IT ?\n" + "Join BitCode! We are the Best IT Training Company in Pune.", 10)
        )
        posts.add(
            Post(1, "@bitcodetech-android", "12-04-2023", R.drawable.image01, "Are you looking to build Career in IT ?\n" + "Join BitCode! We are the Best IT Training Company in Pune.", 10)
        )
        posts.add(
            Post(1, "@bitcodetech", "12-04-2023", R.drawable.image01, "Are you looking to build Career in IT ?\n" + "Join BitCode! We are the Best IT Training Company in Pune.", 10)
        )
        posts.add(
            Post(1, "@vishaljagtap", "12-04-2023", R.drawable.image02, null)
        )
        posts.add(
            Post(1, "@bitcodetech", "12-04-2023", R.drawable.image03, "Android the most popular operating system", 20)
        )
        posts.add(
            Post(1, "@aavidsoft", "12-04-2023", R.drawable.image01, "Are you looking to build Career in IT ?\n" + "Join BitCode! We are the Best IT Training Company in Pune.", 10)
        )
        posts.add(
            Post(1, "@bitcodetech-android", "12-04-2023", R.drawable.image01, "Are you looking to build Career in IT ?\n" + "Join BitCode! We are the Best IT Training Company in Pune.", 10)
        )
        posts.add(
            Post(1, "@bitcodetech", "12-04-2023", R.drawable.image01, "Are you looking to build Career in IT ?\n" + "Join BitCode! We are the Best IT Training Company in Pune.", 10)
        )
        posts.add(
            Post(1, "@vishaljagtap", "12-04-2023", R.drawable.image02, null)
        )
        posts.add(
            Post(1, "@bitcodetech", "12-04-2023", R.drawable.image03, "Android the most popular operating system", 20)
        )
        posts.add(
            Post(1, "@aavidsoft", "12-04-2023", R.drawable.image01, "Are you looking to build Career in IT ?\n" + "Join BitCode! We are the Best IT Training Company in Pune.", 10)
        )
        posts.add(
            Post(1, "@bitcodetech-android", "12-04-2023", R.drawable.image01, "Are you looking to build Career in IT ?\n" + "Join BitCode! We are the Best IT Training Company in Pune.", 10)
        )
    }
}




