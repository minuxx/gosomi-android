package com.jolliti.gosomi.feature_auth.data.remote.request

data class SignUpRequest(
    val email: String,
    val password: String,
    val username: String
)
