package com.example.newslv.domain

data class TaskModel(
    val title: String,
    val description: String,
    val pictureUri: String? = null,
    val datetime: String? = null,
) : java.io.Serializable
