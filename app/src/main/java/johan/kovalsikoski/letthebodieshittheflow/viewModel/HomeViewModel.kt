package johan.kovalsikoski.letthebodieshittheflow.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import johan.kovalsikoski.letthebodieshittheflow.data.model.Person
import johan.kovalsikoski.letthebodieshittheflow.data.repository.people.PeopleRepository
import kotlinx.coroutines.Dispatchers

class HomeViewModel(private val peopleRepository: PeopleRepository) : ViewModel() {

    val peopleData: LiveData<Person>
        get() = peopleRepository.getPeople(1).asLiveData(Dispatchers.IO)

}
