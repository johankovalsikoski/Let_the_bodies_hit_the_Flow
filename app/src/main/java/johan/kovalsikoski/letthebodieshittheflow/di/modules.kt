package johan.kovalsikoski.letthebodieshittheflow.di

import johan.kovalsikoski.letthebodieshittheflow.data.repository.people.PeopleRepository
import johan.kovalsikoski.letthebodieshittheflow.data.repository.people.PeopleRepositoryImpl
import johan.kovalsikoski.letthebodieshittheflow.service.RetrofitImpl
import johan.kovalsikoski.letthebodieshittheflow.service.ServiceImpl
import johan.kovalsikoski.letthebodieshittheflow.viewModel.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val homeModule = module {
    viewModel { HomeViewModel(get()) }
}

val retrofitModule = module {
    factory { RetrofitImpl.provideOkHttpClient()}
    single { RetrofitImpl.provideRetrofit(get()) }
}

val peopleServiceModule = module {
    factory { ServiceImpl.providePeopleService(get()) }
}

val peopleRepositoryModule = module {
    factory<PeopleRepository> { PeopleRepositoryImpl(get()) }
}

