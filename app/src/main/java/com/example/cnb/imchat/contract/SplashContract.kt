package com.example.cnb.imchat.contract

/**
 * Created by cnb on 2018/1/22.
 */
interface SplashContract {
    interface Presenter : BasePresenter {
        fun chekLoginStatus()//检查登陆状态
    }

    interface View {
        fun onNoLoggedIN()  //没有登陆的状态
        fun onLoggedIN()//登陆状态
    }

}