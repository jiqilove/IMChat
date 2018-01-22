package com.example.cnb.imchat

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by cnb on 2018/1/22.
 */
abstract class BaseFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? = inflater?.inflate(getLayoutResId(), null)
    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        init()
    }

    open fun init() {
//初始化公共的功能，子类也可以覆盖读写方法  完成子的初始化
    }

    abstract fun getLayoutResId(): Int
}