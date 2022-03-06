package com.example.countriescapitals.di

import com.example.countriescapitals.model.CountriesService
import com.example.countriescapitals.viewModel.ListViewModel
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: CountriesService)

    fun inject(viewModel: ListViewModel)
}