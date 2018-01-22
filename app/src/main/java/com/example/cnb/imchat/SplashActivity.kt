package com.example.cnb.imchat

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.cnb.imchat.contract.SplashContract
import org.jetbrains.anko.startActivity

class SplashActivity : BaseActivity(), SplashContract.View {


    val handler by lazy {
        Handler()
    }

    override fun getLayoutResId(): Int {
        return R.layout.activity_splash
    }


    override fun onNoLoggedIN() {
        //延迟2秒调到登陆界面
        handler.postDelayed({
            startActivity<LoginActivity>()
            finish()
        }, 2000)
    }

    override fun onLoggedIN() {
        startActivity<MainActivity>()
        finish()
    }

}