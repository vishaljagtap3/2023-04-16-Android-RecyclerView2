package com.bitcodetech.recyclerview2

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class PostsAdapter(
    private val posts: ArrayList<Post>
) : RecyclerView.Adapter<PostsAdapter.PostViewHolder>() {


    interface OnPostClickListener {
        fun onAccountClick(accountName: String, position: Int)
        fun onImageClick(imageId: Int, position: Int)
        fun onLikeClicked(id: Int, position: Int)
    }

    var onPostClickListener: OnPostClickListener? = null


    inner class PostViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val txtAccountName: TextView
        val txtPostedOn: TextView
        val imgPost: ImageView
        val btnLike: Button
        val txtLikes: TextView
        val txtText: TextView

        init {
            txtAccountName = view.findViewById(R.id.txtAccountName)
            txtPostedOn = view.findViewById(R.id.txtPostedOn)
            imgPost = view.findViewById(R.id.imgPost)
            btnLike = view.findViewById(R.id.btnLike)
            txtLikes = view.findViewById(R.id.txtLikes)
            txtText = view.findViewById(R.id.txtText)

            btnLike.setOnClickListener {
                /*posts[adapterPosition].likes += 1
                txtLikes.text = "${posts[adapterPosition].likes}"*/

                onPostClickListener?.onLikeClicked(
                    posts[adapterPosition].id,
                    adapterPosition
                )

            }

            imgPost.setOnClickListener {
                //mt(it.context, "Image clicked: $adapterPosition")
                //mt(it.context, "image ${adapterPosition} liked")
                onPostClickListener?.onImageClick(
                    posts[adapterPosition].imageId!!,
                    adapterPosition
                )
            }

            txtAccountName.setOnClickListener {
                //mt(it.context, "${posts[adapterPosition].accountName} clicked")
                onPostClickListener?.onAccountClick(
                    posts[adapterPosition].accountName,
                    adapterPosition
                )
            }


        }
    }

    override fun getItemCount() = posts.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        //create view
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.post_view, null)

        return PostViewHolder(view)

    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = posts[position]

        holder.txtAccountName.text = post.accountName
        holder.txtPostedOn.text = post.postedOn
        if (post.imageId != null) {
            holder.imgPost.setImageResource(post.imageId)
        }
        holder.txtLikes.text = "${post.likes}"
        if (post.text != null) {
            holder.txtText.text = post.text
            holder.txtText.visibility = View.VISIBLE
        } else {
            holder.txtText.visibility = View.GONE
        }
    }

    private fun mt(context: Context, text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }

}