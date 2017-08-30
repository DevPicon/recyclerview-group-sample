package pe.devpicon.android.myrecyclerviewgroupapplication.recyclerviewgrouped.model

/**
 * Created by armando on 8/29/17.
 */

abstract class ListItem {


    abstract val type: Int

    companion object {
        const val TYPE_DATE = 0
        const val TYPE_GENERAL = 1
    }
}
