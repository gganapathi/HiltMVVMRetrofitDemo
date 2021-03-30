package com.mypractice.hiltmvvmretrofit.data.models

data class EmployeeResponse(
    val data: List<Employee>?=null,
    val status: String?=""
)