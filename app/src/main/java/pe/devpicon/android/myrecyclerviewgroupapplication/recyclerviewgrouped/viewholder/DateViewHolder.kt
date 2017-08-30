package pe.devpicon.android.myrecyclerviewgroupapplication.recyclerviewgrouped.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import pe.devpicon.android.myrecyclerviewgroupapplication.R
import pe.devpicon.android.myrecyclerviewgroupapplication.recyclerviewgrouped.model.DateItem

/**
 * Created by armando on 8/29/17.
 */

class DateViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val txtDate: TextView = itemView.findViewById(R.id.textDate)

    fun bind(item: DateItem) {
        this.txtDate.text = item.date
    }
}
