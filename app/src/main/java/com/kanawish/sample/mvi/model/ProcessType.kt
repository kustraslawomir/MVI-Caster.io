package com.kanawish.sample.mvi.model

sealed class ProcessType {

    object REFRESH : ProcessType()

    object CREATE : ProcessType()

    object UPDATE : ProcessType()
}