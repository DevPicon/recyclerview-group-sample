package pe.devpicon.android.myrecyclerviewgroupapplication.recyclerviewgrouped.model

/**
 * Created by armando on 8/29/17.
 */

class DateItem : ListItem() {
    override val type: Int
        get() = TYPE_DATE

    var date: String? = null

}
