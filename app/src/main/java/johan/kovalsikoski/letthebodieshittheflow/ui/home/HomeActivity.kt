package johan.kovalsikoski.letthebodieshittheflow.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import johan.kovalsikoski.letthebodieshittheflow.R
import johan.kovalsikoski.letthebodieshittheflow.data.model.Person
import johan.kovalsikoski.letthebodieshittheflow.ui.home.adapter.PersonItem
import johan.kovalsikoski.letthebodieshittheflow.viewModel.HomeViewModel
import kotlinx.android.synthetic.main.activity_home.*
import org.koin.androidx.viewmodel.ext.android.viewModel


class HomeActivity : AppCompatActivity() {

    private val homeViewModel: HomeViewModel by viewModel()

    private val adapter by lazy { GroupAdapter<GroupieViewHolder>() }

    private val personObserver = Observer<Person> { person ->
        adapter.add(PersonItem(person))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        recyclerview.adapter = adapter

        homeViewModel.peopleData.observe(this, personObserver)
    }


}
