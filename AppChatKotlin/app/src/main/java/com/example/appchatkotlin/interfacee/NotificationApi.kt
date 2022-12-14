package com.example.appchatkotlin.interfacee

import com.example.appchatkotlin.Constants.Constants
import com.example.appchatkotlin.model.PushNotification
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface NotificationApi {

    @Headers("Authorization: key=${Constants.SERVER_KEY}", "Content-type:${Constants.CONTENT_TYPE}")
    @POST("send")
    suspend fun postNotification(
        @Body notification: PushNotification
    ): Response<ResponseBody>

}