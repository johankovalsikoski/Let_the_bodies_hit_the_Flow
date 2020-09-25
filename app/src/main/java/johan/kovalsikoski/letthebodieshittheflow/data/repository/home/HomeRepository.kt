package johan.kovalsikoski.letthebodieshittheflow.data.repository.home

import johan.kovalsikoski.letthebodieshittheflow.data.model.PeopleResponse
import kotlinx.coroutines.flow.Flow

interface HomeRepository {
    fun getPeople(page: Int = 0) : Flow<PeopleResponse>
}
