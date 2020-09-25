package johan.kovalsikoski.letthebodieshittheflow.data.model

data class PeopleResponse(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<Person>
)
