package com.riskpace.demo.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.riskpace.demo.base.BaseViewModel
import com.riskpace.demo.base.Result
import com.riskpace.demo.data.remote.DemoResponse
import kotlinx.coroutines.launch

class DataViewModel : BaseViewModel() {
    var mData = MutableLiveData<Result<DemoResponse>>()

    fun getData() {
        viewModelScope.launch {
            try {
                val response = getRemote().getData()
                mData.value = Result.Success(response)
            } catch (e: Exception) {
                mData.value = Result.Error(e)
            }
        }
    }
}