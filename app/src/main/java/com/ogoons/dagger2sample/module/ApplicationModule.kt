package com.ogoons.dagger2sample.module

import android.app.Application
import android.content.Context
import com.ogoons.dagger2sample.scope.ApplicationContext
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule constructor(private val application: Application) {

    @Provides
    internal fun provideApplication(): Application = application

    @Provides
    @ApplicationContext
    internal fun provideApplicationContext(): Context = application

}