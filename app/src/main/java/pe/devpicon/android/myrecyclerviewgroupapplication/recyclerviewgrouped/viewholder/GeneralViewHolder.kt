package pe.devpicon.android.myrecyclerviewgroupapplication.recyclerviewgrouped.viewholder

import android.support.v7.widget.RecyclerView
import android.text.TextUtils
import android.view.View
import android.widget.TextView
import pe.devpicon.android.myrecyclerviewgroupapplication.R
import pe.devpicon.android.myrecyclerviewgroupapplication.recyclerviewgrouped.model.GeneralItem

/**
 * Created by armando on 8/29/17.
 */

class GeneralViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val txtStore: TextView = itemView.findViewById(R.id.txtStore)
    private val txtAmount: TextView = itemView.findViewById(R.id.txtCargo)
    private val txtDepartment: TextView = itemView.findViewById(R.id.txtDes)
    private val txtPromotion: TextView = itemView.findViewById(R.id.txtPlan)
    private val txtPaymentMessage: TextView = itemView.findViewById(R.id.txtMessage)

    fun bind(item: GeneralItem) {

        if (TextUtils.isEmpty(item.paymentMessage)) {
            txtPaymentMessage.visibility = View.GONE
            txtStore.visibility = View.VISIBLE
            txtAmount.visibility = View.VISIBLE
            txtDepartment.visibility = View.VISIBLE
            txtPromotion.visibility = View.VISIBLE

            txtStore.text = item.store
            txtAmount.text = item.amount
            txtDepartment.text = item.department
            txtPromotion.text = item.promotion
        } else {
            txtStore.visibility = View.GONE
            txtDepartment.visibility = View.GONE
            txtPromotion.visibility = View.GONE
            txtAmount.visibility = View.VISIBLE
            txtPaymentMessage.visibility = View.VISIBLE

            txtPaymentMessage.text = item.paymentMessage
            txtAmount.text = item.amount
        }
    }
}
