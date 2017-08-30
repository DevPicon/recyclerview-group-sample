package pe.devpicon.android.myrecyclerviewgroupapplication.recyclerviewgrouped

import pe.devpicon.android.myrecyclerviewgroupapplication.recyclerviewgrouped.model.ListItem

/**
 * Created by armando on 8/29/17.
 */

interface MovementView {
    fun showMovementItems(listItems: List<ListItem>)
}
