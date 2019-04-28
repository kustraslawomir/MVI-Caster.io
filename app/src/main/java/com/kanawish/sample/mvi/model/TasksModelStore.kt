package com.kanawish.sample.mvi.model

import com.kanawish.sample.mvi.model.state.SyncState
import com.kanawish.sample.mvi.model.state.TasksState
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TasksModelStore @Inject constructor() : ModelStore<TasksState>(
        TasksState(
                emptyList(),
                SyncState.IDLE
        )
)