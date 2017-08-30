package pe.devpicon.android.myrecyclerviewgroupapplication.recyclerviewgrouped.model

/**
 * Created by armando on 8/29/17.
 */

class GeneralItem : ListItem() {
    override val type: Int
        get() = TYPE_GENERAL

    var amount: String? = null
    var store: String? = null
    var department: String? = null
    var promotion: String? = null
    var transactionType: String? = null
    var internalPurchase: String? = null
    var paymentMessage: String? = null

}
