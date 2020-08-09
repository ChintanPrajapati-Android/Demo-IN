package com.riskpace.demo.data.datamanager

import com.riskpace.demo.data.preferences.IPreference
import com.riskpace.demo.data.roomdatabase.AppDatabase

interface IDataManager {
    fun getPreference(): IPreference
    fun getDatabase(): AppDatabase
}