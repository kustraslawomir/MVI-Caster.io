package com.kanawish.sample.mvi.model

class TasksState (
        private val taks : List<Task>,
        private val syncState: SyncState
)