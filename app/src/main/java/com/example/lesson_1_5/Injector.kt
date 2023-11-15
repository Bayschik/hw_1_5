package com.example.lesson_1_5

class Injector {
    companion object {
        var view:CounterView = MainActivity()
        fun getModel(): CountModel {
            return CountModel()
        }

        fun getPresenter(view: CounterView):CountPresenter{
            return CountPresenter(view)
        }
    }
}