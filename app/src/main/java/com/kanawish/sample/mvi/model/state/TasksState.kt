package com.kanawish.sample.mvi.model.state

class TasksState (
        private val taks : List<Task>,
        private val syncState: SyncState
)