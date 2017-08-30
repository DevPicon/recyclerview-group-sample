package pe.devpicon.android.myrecyclerviewgroupapplication

/**
 * Created by armando on 8/29/17.
 */
class CardMovements(val monthlyDebit: String,
                    val monthlyCredit: String,
                    val dueDate: String,
                    val movements: Array<Movement>)

class Movement(val date: String, val detail: Array<Detail>)

class Detail(val amount: String,
             val store: String,
             val department: String,
             val promotion: String,
             val transactionType: String,
             val internalPurchase: Boolean)
