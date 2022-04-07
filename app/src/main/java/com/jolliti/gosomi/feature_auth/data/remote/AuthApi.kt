package com.jolliti.gosomi.feature_auth.data.remote

import com.jolliti.gosomi.core.data.remote.BaseResponse
import com.jolliti.gosomi.feature_auth.data.remote.request.LoginRequest
import com.jolliti.gosomi.feature_auth.data.remote.request.SignUpRequest
import com.jolliti.gosomi.feature_auth.data.remote.response.AuthResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface AuthApi {
    @POST("/api/users")
    suspend fun signup(
        @Body request: SignUpRequest
    ): BaseResponse<Unit>

    @GET("/api/users")
    suspend fun login(
        @Body request: LoginRequest
    ): BaseResponse<AuthResponse>
}