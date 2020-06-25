package com.beyond.shams.di

import com.beyond.shams.util.Constants
import dagger.Module
import retrofit2.Retrofit

@Module
class AppModule {

    fun provideRetrofitInstance(): Retrofit? {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .build()
    }
}