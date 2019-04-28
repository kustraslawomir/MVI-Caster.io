package com.kanawish.sample.mvi.model.state

import java.util.*

data class Task(
        val id  : String = UUID.randomUUID().toString(),
        val lastUpdate : Long,
        val title : String,
        val description : String,
        val completed : Boolean
)