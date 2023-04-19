package com.bitcodetech.recyclerview2

data class Post(
    val id : Int,
    val accountName : String,
    val postedOn : String?,
    val imageId : Int?,
    val text : String?,
    var likes : Int = 0
)
