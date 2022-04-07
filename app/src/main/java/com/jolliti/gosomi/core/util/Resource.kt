package com.jolliti.gosomi.core.util

typealias BaseResource = Resource<Unit>

sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T?): Resource<T>(data)
    class Error<T>(code: Int, message: String, data: T? = null): Resource<T>(data, message)
}