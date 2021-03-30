package com.mypractice.hiltmvvmretrofit.data.remote.api

import com.mypractice.hiltmvvmretrofit.data.models.EmployeeResponse
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(
    private val apiService: ApiService
):ApiHelper{

    override suspend fun getEmployees(): Response<EmployeeResponse>  = apiService.getEmployees()

}