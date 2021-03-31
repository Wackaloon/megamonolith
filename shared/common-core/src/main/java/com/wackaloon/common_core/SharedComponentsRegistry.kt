package com.wackaloon.common_core

object SharedComponentsRegistry {
    lateinit var securePreferences: SecurePreferences
    lateinit var errorNavigatorFactory: ErrorNavigatorFactory
    lateinit var loginUseCase: LoginUseCase
}
