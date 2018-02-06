package com.example.junhee.javawithkt

import android.view.View

/**
 * Created by JunHee on 2018. 2. 6..
 */
interface Main2View: BaseView<Main2Presenter> {

    fun showHi()

    interface Presenter: BasePresenter {

        fun attchView(v: View)
        fun detachView(v: View)
    }
}