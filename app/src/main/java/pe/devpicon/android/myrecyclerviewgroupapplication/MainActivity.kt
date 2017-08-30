package pe.devpicon.android.myrecyclerviewgroupapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

import pe.devpicon.android.myrecyclerviewgroupapplication.recyclerviewgrouped.MovementView
import pe.devpicon.android.myrecyclerviewgroupapplication.recyclerviewgrouped.adapter.MovementAdapter
import pe.devpicon.android.myrecyclerviewgroupapplication.recyclerviewgrouped.model.ListItem

class MainActivity : AppCompatActivity(), MovementView {

    internal var adapter: MovementAdapter? = null
    private var controller: MovementController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = MovementAdapter()
        controller = MovementController(this)
        val rvMovements = findViewById(R.id.rv_movements) as RecyclerView
        rvMovements.layoutManager = LinearLayoutManager(this)
        rvMovements.adapter = adapter

        controller!!.loadData()

    }

    override fun showMovementItems(listItems: List<ListItem>) {
        if (adapter == null) {
            adapter = MovementAdapter()
        }
        adapter!!.setListItems(listItems)
    }
}
