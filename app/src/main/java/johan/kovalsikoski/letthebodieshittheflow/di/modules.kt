package johan.kovalsikoski.letthebodieshittheflow.di

import johan.kovalsikoski.letthebodieshittheflow.service.RetrofitImpl
import johan.kovalsikoski.letthebodieshittheflow.viewModel.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val homeModule = module {
    viewModel { HomeViewModel() }
}

val retrofitModule = module {
    factory { RetrofitImpl.provideOkHttpClient()}
    single { RetrofitImpl.provideRetrofit(get()) }
}

val peopleServiceModule = module {
    factory { RetrofitImpl.providePeopleService(get()) }
}

