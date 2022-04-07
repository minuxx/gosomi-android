package com.jolliti.gosomi.feature_auth.domain.repository

import com.jolliti.gosomi.core.util.BaseResource

interface AuthRepository {
    suspend fun signup(
        email: String,
        password: String,
        username: String
    ): BaseResource

    suspend fun login(
        email: String,
        password: String
    ): BaseResource
}