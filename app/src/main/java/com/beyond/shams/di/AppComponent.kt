package com.beyond.shams.di

import android.app.Application
import com.beyond.shams.BaseApplication
import com.beyond.shams.ui.BaseActivity
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Component(modules = [AndroidSupportInjectionModule::class, AppModule::class])
interface AppComponent : AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder {

        //pass a parameter to component while init
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

}