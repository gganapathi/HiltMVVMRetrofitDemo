package com.mypractice.hiltmvvmretrofit.data.remote.api

import com.mypractice.hiltmvvmretrofit.data.models.EmployeeResponse
import retrofit2.Response

interface ApiHelper {

    suspend fun getEmployees():Response<EmployeeResponse>

}