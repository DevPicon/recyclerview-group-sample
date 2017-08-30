package pe.devpicon.android.myrecyclerviewgroupapplication

import pe.devpicon.android.myrecyclerviewgroupapplication.recyclerviewgrouped.MovementView
import pe.devpicon.android.myrecyclerviewgroupapplication.recyclerviewgrouped.model.DateItem
import pe.devpicon.android.myrecyclerviewgroupapplication.recyclerviewgrouped.model.GeneralItem
import pe.devpicon.android.myrecyclerviewgroupapplication.recyclerviewgrouped.model.ListItem
import java.util.*

/**
 * Created by armando on 8/29/17.
 */

internal class MovementController(private val view: MovementView) {

    fun loadData() {

        val listItems = ArrayList<ListItem>()

        var dateItem = DateItem()
        dateItem.date = "21-11-2020"
        listItems.add(dateItem)

        var generalItem = GeneralItem()
        generalItem.amount = "35.28"
        generalItem.store = "INTERNET"
        generalItem.department = "HAUS"
        generalItem.promotion = "PRESUPUESTO"
        listItems.add(generalItem)

        generalItem = GeneralItem()
        generalItem.amount = "555"
        generalItem.store = "LIV CENTRO"
        generalItem.department = "PAGO CUENTA"
        generalItem.promotion = "SIN PLAN"
        generalItem.paymentMessage = "Gracias por su pago"
        listItems.add(generalItem)

        dateItem = DateItem()
        dateItem.date = "22-11-2020"
        listItems.add(dateItem)

        generalItem = GeneralItem()
        generalItem.amount = "3380.50"
        generalItem.store = "Liverpool Santa Fe"
        generalItem.department = "Deportes"
        generalItem.promotion = "3 MESES SIN INTERESES"
        listItems.add(generalItem)

        view.showMovementItems(listItems)

    }
}
