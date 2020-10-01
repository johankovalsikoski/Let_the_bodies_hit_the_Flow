package johan.kovalsikoski.letthebodieshittheflow.service

import johan.kovalsikoski.letthebodieshittheflow.data.model.PeopleResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PeopleService {

    @GET("people/")
    fun getPeople(@Query("page") page: Int = 0): Response<PeopleResponse>

}
