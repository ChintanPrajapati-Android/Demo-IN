package com.riskpace.demo.ui.dashboard

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.riskpace.demo.R
import com.riskpace.demo.base.BaseActivity
import com.riskpace.demo.base.Result
import com.riskpace.demo.viewmodel.DataViewModel
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : BaseActivity(R.layout.activity_dashboard) {
    private lateinit var mDataViewModel: DataViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mDataViewModel = ViewModelProvider(this).get(DataViewModel::class.java)
        mDataViewModel.getData().apply {
            pbDashboard.visibility = View.VISIBLE
        }

        mDataViewModel.mData.observe(this, Observer {
            pbDashboard.visibility = View.GONE
            when(it){
                is Result.Success ->{
                    makeToast("Success")
                }
                is Result.Error ->{
                    makeToast("Something went wrong !!")
                }
            }
        })
    }
}