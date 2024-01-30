package com.example.semest2_5

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.popupmenu,menu)
        return super.onCreateOptionsMenu(menu)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.imgmen)
        val textView: TextView = findViewById(R.id.textmen)
        val button: Button = findViewById(R.id.btnmen)

        val popupMenu = androidx.appcompat.widget.PopupMenu(this,imageView)
        popupMenu.inflate(R.menu.popupmenu)
        popupMenu.setOnMenuItemClickListener{
            when (it.itemId){
                R.id.menu1 -> {
                    textView.text = "Нажат пункт PopupMenu 1 "
                    true
                }
                R.id.menu2 -> {
                    textView.text = "Нажат пункт PopupMenu 2 "
                    true
                }
                R.id.menu3 -> {
                    textView.text = "Нажат пункт PopupMenu 3 "
                    true
                }
                R.id.submenu -> {
                    textView.text = "Нажат пункт submenu "
                    true
                }
                R.id.menu4 -> {
                    textView.text = "Нажат пункт PopupMenu 4 "
                    true
                }
                R.id.menu5 -> {
                    textView.text = "Нажат пункт PopupMenu 5 "
                    true
                }
                R.id.menu6 -> {
                    textView.text = "Нажат пункт PopupMenu 6 "
                    true
                }

                else -> false
            }
        }
      imageView.setOnClickListener{
          popupMenu.show()

      }

        val popupMenu2 = PopupMenu(this,button)
        popupMenu2.inflate(R.menu.popupmenu2)
        popupMenu2.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.red -> {
                    textView.background = ColorDrawable(Color.RED)
                    textView.text = "Вы выбрали красный цвет "
                }

                R.id.yellow -> {
                    textView.background = ColorDrawable(Color.YELLOW)
                    textView.text = "Вы выбрали желтый цвет "
                }

                R.id.green -> {
                    textView.background = ColorDrawable(Color.GREEN)
                    textView.text = "Вы выбрали зеленый цвет "
                }
                }
                false
            }

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    popupMenu2.setForceShowIcon(true)
                }
                    button.setOnClickListener {
                    popupMenu2.show()
                }
        val popupMenu3 = PopupMenu(this,textView)
        popupMenu3.inflate(R.menu.popupmenu3)
        popupMenu3.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.s1 -> {

                    textView.textSize =  15f
                }

                R.id.s2 -> {
                    textView.textSize =  30f
                }

                R.id.s3 -> {
                    textView.textSize =  60f
                }
            }
            false
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            popupMenu2.setForceShowIcon(true)
        }
        textView.setOnClickListener {
            popupMenu3.show()
        }

    }
}



