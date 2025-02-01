package com.example.remly.di

import com.example.remly.presentation.viewmodels.ReminderViewModel
import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single { Firebase.auth  }
    viewModel { ReminderViewModel() }
}