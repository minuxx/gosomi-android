package com.jolliti.gosomi.core.data.remote

data class BaseResponse<T>(
    val code: Int,
    val isSuccessful: Boolean,
    val message: String,
    val data: T? = null
)
