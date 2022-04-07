package com.jolliti.gosomi.feature_auth.data.repository

import com.jolliti.gosomi.core.util.BaseResource
import com.jolliti.gosomi.core.util.Resource
import com.jolliti.gosomi.feature_auth.data.remote.AuthApi
import com.jolliti.gosomi.feature_auth.data.remote.request.SignUpRequest
import com.jolliti.gosomi.feature_auth.domain.repository.AuthRepository

class AuthRepositoryImpl (private val api: AuthApi) : AuthRepository{
    override suspend fun signup(email: String, password: String, username: String): BaseResource {
        val request = SignUpRequest(email, password, username)

        return try {
            val response = api.signup(request)

            if(response.isSuccessful) {
                Resource.Success(Unit)
            } else {
                Resource.Error(response.code, response.message)
            }
        }
    }

    override suspend fun login(email: String, password: String): BaseResource {
        TODO("Not yet implemented")
    }
}