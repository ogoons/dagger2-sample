package com.ogoons.dagger2sample.module

import android.app.Activity
import dagger.Module
import dagger.Provides

/**
 * @Module: 모듈들은 의존성을 제공하는 메서드들을 가진 클래스입니다.
 * 의존성을 제공하는 클래스를 정의하고 @Module 어노테이션을 답니다.
 * 그러면 Dagger 는 클래스 인스턴스를 만들 때 의존성을 만족시키기 위한 정보를 찾을 수 있습니다.
 */
@Module
class ActivityModule constructor(private val activity: Activity) {

    @Provides
    fun provideActivity(): Activity = activity

}