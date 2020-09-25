package johan.kovalsikoski.letthebodieshittheflow.service

import johan.kovalsikoski.letthebodieshittheflow.data.model.PeopleResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import retrofit2.http.Query

interface PeopleService {

    @GET("/people/")
    suspend fun getPeople(@Query("page") page: Int = 0) : Flow<PeopleResponse>

}
