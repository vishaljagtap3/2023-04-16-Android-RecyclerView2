package com.bitcodetech.recyclerview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SavedPostsActivity : AppCompatActivity() {

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

        postsAdapter.onPostClickListener = SavePostsClickListener()
    }

    inner class SavePostsClickListener : PostsAdapter.OnPostClickListener {
        override fun onAccountClick(accountName: String, position: Int) {
            mt("SPA: account at $position name: $accountName clicked")
        }

        override fun onImageClick(imageId: Int, position: Int) {
            mt("SPA: image at $position clicked")
        }

        override fun onLikeClicked(id: Int, position: Int) {
            mt("SPA: post at $position liked")
            posts[position].likes += 1
        }

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

    private fun mt(text : String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}




