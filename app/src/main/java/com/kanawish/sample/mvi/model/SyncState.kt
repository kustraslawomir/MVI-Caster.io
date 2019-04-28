package com.kanawish.sample.mvi.model

sealed class SyncState {

    object IDLE : SyncState() {
        override fun toString(): String {
            return "IDLE"
        }
    }

    data class PROCESS(val processType : ProcessType) : SyncState()

    data class ERROR(val error : Throwable) : SyncState()
}