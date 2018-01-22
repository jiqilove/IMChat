package com.example.cnb.imchat

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by cnb on 2018/1/22.
 */
abstract class BaseActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResId())
        init()
    }

   open  fun init() {
        //初始化一些公共的功能
    }

    abstract fun getLayoutResId(): Int

}