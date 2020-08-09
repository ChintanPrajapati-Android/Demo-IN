package com.riskpace.demo.base

import android.os.Bundle
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity(@LayoutRes val contentLayoutId: Int) :
    AppCompatActivity(contentLayoutId) {

    private lateinit var mBaseContext: AppCompatActivity
    private var mToast: Toast? = null
   // private var mProgressDialog: KProgressHUD? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBaseContext = this

//        mProgressDialog = KProgressHUD.create(this)
//            .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
//            .setCancellable(false)
//            .setAnimationSpeed(2)
//            .setDimAmount(0.0f)
    }

    fun makeToast(message: String?) {
        message?.let {
            if (mToast != null)
                mToast?.cancel()

            mToast = Toast.makeText(mBaseContext, it, Toast.LENGTH_SHORT)
            mToast?.show()
        }
    }

//    fun showLoading() {
//        mProgressDialog?.let {
//            if (it.isShowing.not())
//                it.show()
//        }
//    }
//
//    fun hideLoading() {
//        mProgressDialog?.let {
//            if (it.isShowing)
//                it.dismiss()
//        }
//    }
}