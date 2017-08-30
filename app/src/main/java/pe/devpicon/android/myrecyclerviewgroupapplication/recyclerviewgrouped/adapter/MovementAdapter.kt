package pe.devpicon.android.myrecyclerviewgroupapplication.recyclerviewgrouped.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import pe.devpicon.android.myrecyclerviewgroupapplication.R
import pe.devpicon.android.myrecyclerviewgroupapplication.recyclerviewgrouped.model.DateItem
import pe.devpicon.android.myrecyclerviewgroupapplication.recyclerviewgrouped.model.GeneralItem
import pe.devpicon.android.myrecyclerviewgroupapplication.recyclerviewgrouped.model.ListItem
import pe.devpicon.android.myrecyclerviewgroupapplication.recyclerviewgrouped.viewholder.DateViewHolder
import pe.devpicon.android.myrecyclerviewgroupapplication.recyclerviewgrouped.viewholder.GeneralViewHolder
import java.util.*

/**
 * Created by armando on 8/29/17.
 */

class MovementAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var listItems: List<ListItem>? = null

    init {
        this.listItems = ArrayList()
    }

    fun setListItems(listItems: List<ListItem>) {
        this.listItems = listItems
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder? {
        var viewHolder: RecyclerView.ViewHolder? = null
        val layoutInflater = LayoutInflater.from(parent.context)

        when (viewType) {
            ListItem.TYPE_GENERAL -> {
                val viewGeneral = layoutInflater.inflate(R.layout.item_credit_mov, parent, false)
                viewHolder = GeneralViewHolder(viewGeneral)
            }
            ListItem.TYPE_DATE -> {
                val viewDate = layoutInflater.inflate(R.layout.item_credit_mov_date, parent, false)
                viewHolder = DateViewHolder(viewDate)
            }
        }

        return viewHolder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder.itemViewType) {
            ListItem.TYPE_GENERAL -> {
                val generalItem = listItems!![position] as GeneralItem
                val generalViewHolder = holder as GeneralViewHolder
                generalViewHolder.bind(generalItem)
            }
            ListItem.TYPE_DATE -> {
                val dateItem = listItems!![position] as DateItem
                val dateViewHolder = holder as DateViewHolder
                dateViewHolder.bind(dateItem)
            }
        }
    }

    override fun getItemCount(): Int {
        return if (listItems != null) listItems!!.size else 0
    }

    override fun getItemViewType(position: Int): Int {
        return listItems!![position].type
    }
}
