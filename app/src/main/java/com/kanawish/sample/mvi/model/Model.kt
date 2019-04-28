package com.kanawish.sample.mvi.model

import com.kanawish.sample.mvi.intent.Intent
import io.reactivex.Observable

interface Model<S> {

    fun process(intent : Intent<S>)
    fun modelState() : Observable<S>
}