package com.example.popupmenu_coddinginflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast

class MainActivity : AppCompatActivity(),PopupMenu.OnMenuItemClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick_showPopup(view: View) {
      val popup=PopupMenu(this,view)
        popup.setOnMenuItemClickListener(this)
        popup.inflate(R.menu.popup_menu)
        popup.show()
    }

    override fun onMenuItemClick(item: MenuItem?): Boolean {

        when (item?.getItemId()) {
            R.id.item1 -> {
                Toast.makeText(this, "Item 1 clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.item2 -> {
                Toast.makeText(this, "Item 2 clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.item3 -> {
                Toast.makeText(this, "Item 3 clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.item4 -> {
                Toast.makeText(this, "Item 4 clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            else -> return false
        }

    }

}
