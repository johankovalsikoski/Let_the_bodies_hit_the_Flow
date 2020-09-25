package johan.kovalsikoski.letthebodieshittheflow.data.repository.home

import johan.kovalsikoski.letthebodieshittheflow.data.model.PeopleResponse
import kotlinx.coroutines.flow.Flow

class HomeRepositoryImpl: HomeRepository {

    override fun getPeople(page: Int): Flow<PeopleResponse> {
        TODO("Not yet implemented")
    }

}
