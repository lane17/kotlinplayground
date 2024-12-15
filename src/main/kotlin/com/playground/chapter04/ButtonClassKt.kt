package com.playground.chapter04

class ButtonClassKt : View {
    override fun getCurrentState() = ButtonState()

    override fun restoreState(state: State) {
        super.restoreState(state)
    }

    class ButtonState : State
}
