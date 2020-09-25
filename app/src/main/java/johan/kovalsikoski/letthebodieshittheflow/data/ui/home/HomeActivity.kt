package johan.kovalsikoski.letthebodieshittheflow.data.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import johan.kovalsikoski.letthebodieshittheflow.R
import johan.kovalsikoski.letthebodieshittheflow.data.model.Person
import johan.kovalsikoski.letthebodieshittheflow.data.ui.home.adapter.PersonItem
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val adapter = GroupAdapter<GroupieViewHolder>()
        adapter.add(
            PersonItem(
                Person(
                    birth_year = "",
                    created = "",
                    edited = "",
                    eye_color = "",
                    films = listOf(),
                    gender = "",
                    hair_color = "",
                    height = "",
                    homeworld = "",
                    mass = "",
                    name = "Johan",
                    skin_color = "",
                    species = listOf(),
                    starships = listOf(),
                    url = "",
                    vehicles = listOf()
                )
            )
        )

        recyclerview.adapter = adapter
    }


}
