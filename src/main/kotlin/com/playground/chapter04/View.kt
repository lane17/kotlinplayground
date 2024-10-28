package com.playground.chapter04

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}