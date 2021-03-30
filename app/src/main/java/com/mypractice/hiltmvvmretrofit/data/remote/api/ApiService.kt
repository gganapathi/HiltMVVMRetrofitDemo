package com.mypractice.hiltmvvmretrofit.data.remote.api

import com.mypractice.hiltmvvmretrofit.data.models.EmployeeResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService{

    @GET("employees")
    suspend fun getEmployees():Response<EmployeeResponse>


}