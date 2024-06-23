package com.example.recyclerview
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.Item
import com.example.recyclerview.R

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var itemAdapter: ItemAdapter
    private lateinit var itemList: MutableList<Item.Item>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        itemList = mutableListOf()
        // Add multiple sample items
        itemList.add(Item.Item(R.drawable.image1, false))
        itemList.add(Item.Item(R.drawable.image2, false))
        itemList.add(Item.Item(R.drawable.image3, false))

        itemAdapter = ItemAdapter(itemList)
        recyclerView.adapter = itemAdapter
    }
}
