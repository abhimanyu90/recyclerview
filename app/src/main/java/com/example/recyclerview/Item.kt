package com.example.recyclerview

class Item {
    data class Item(val imageResId: Int, var isChecked: Boolean)


        val itemList = listOf(
            Item(R.drawable.image1, false),
            Item(R.drawable.image2, true),
            Item(R.drawable.image3, false)
            // Add more items as needed
        )




}