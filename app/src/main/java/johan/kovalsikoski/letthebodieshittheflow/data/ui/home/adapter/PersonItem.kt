package johan.kovalsikoski.letthebodieshittheflow.data.ui.home.adapter

import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import johan.kovalsikoski.letthebodieshittheflow.R
import johan.kovalsikoski.letthebodieshittheflow.data.model.Person
import kotlinx.android.synthetic.main.cell_person.view.*

class PersonItem(private val person: Person) : Item() {

        override fun bind(viewHolder: GroupieViewHolder, position: Int) {
            viewHolder.itemView.tv_charName.text = person.name
        }

        override fun getLayout(): Int = R.layout.cell_person
    }
