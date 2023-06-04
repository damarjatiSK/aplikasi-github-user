package com.example.githubuser.data.model

data class UserResponse(
    val items : ArrayList<User>
)

data class User(
    val login : String,
    val id : Int,
    val avatar_url : String
)