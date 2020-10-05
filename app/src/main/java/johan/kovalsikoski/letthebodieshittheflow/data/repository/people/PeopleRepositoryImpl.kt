package johan.kovalsikoski.letthebodieshittheflow.data.repository.people

import johan.kovalsikoski.letthebodieshittheflow.data.model.Person
import johan.kovalsikoski.letthebodieshittheflow.service.PeopleService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class PeopleRepositoryImpl(private val peopleService: PeopleService) : PeopleRepository {

    override fun getPeople(page: Int): Flow<Person> = flow {
        peopleService.getPeople(page).body()?.results?.forEach { person ->
            emit(person)
        }
    }

}
