package com.kanawish.sample.mvi.model.state

sealed class ProcessType {

    object REFRESH : ProcessType()

    object CREATE : ProcessType()

    object UPDATE : ProcessType()
}