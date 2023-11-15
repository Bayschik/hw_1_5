package com.example.lesson_1_5

class CountPresenter(private val counterView: CounterView) {

    private var model = Injector.getModel()

    fun increment(){
        model.increment()
        counterView.showChangeCount(model.count)

        if (model.count == 10){
            counterView.showToast()
        }else if (model.count == 15){
            counterView.greenTextColor()
        }else if (model.count > 15){
            counterView.blackTextColor()
        }

        // if(model.count == 10){
        //  counterView.showToast()
        // }
    }
    fun decrement(){
        model.decrement()
        counterView.showChangeCount(model.count)
        if (model.count == 10){
            counterView.showToast()
        }else if (model.count == 15){
            counterView.greenTextColor()
        }else if (model.count < 15){
            counterView.blackTextColor()
        }

        // if(model.count == 10){
        //          counterView.showToast()
        // }
    }

}