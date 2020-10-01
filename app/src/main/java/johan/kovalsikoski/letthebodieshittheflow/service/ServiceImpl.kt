package johan.kovalsikoski.letthebodieshittheflow.service

import retrofit2.Retrofit

class ServiceImpl {

    companion object {
        fun providePeopleService(retrofit: Retrofit): PeopleService =
            retrofit.create(PeopleService::class.java)
    }

}
