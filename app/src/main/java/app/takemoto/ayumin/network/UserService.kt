package app.takemoto.ayumin.network

import retrofit2.http.GET
import retrofit2.http.Path

interface UserService {

    @GET("users/{usersId}")
    suspend fun getUser(@Path("userId")userId: String):User
}