package johan.kovalsikoski.letthebodieshittheflow.data.repository.people

import johan.kovalsikoski.letthebodieshittheflow.data.model.Person
import kotlinx.coroutines.flow.Flow

interface PeopleRepository {
    fun getPeople(page: Int = 0): Flow<Person>
}
