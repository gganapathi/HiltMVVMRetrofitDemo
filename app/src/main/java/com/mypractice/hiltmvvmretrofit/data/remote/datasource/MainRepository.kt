package com.mypractice.hiltmvvmretrofit.data.remote.datasource

import com.mypractice.hiltmvvmretrofit.data.remote.api.ApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val apiHelper: ApiHelper
){

    suspend fun getEmployee() = apiHelper.getEmployees()

}