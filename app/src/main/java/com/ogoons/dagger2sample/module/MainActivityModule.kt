package com.ogoons.dagger2sample.module

import com.ogoons.dagger2sample.view.MainActivity
import dagger.Module

@Module
class MainActivityModule constructor(private val mainActivity: MainActivity)