package com.stasoft.clasegit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import com.stasoft.checklistcem.R
import com.stasoft.checklistcem.UserFragment
import com.stasoft.checklistcem.databinding.ActivityMenuBinding


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding: ActivityMenuBinding
    private lateinit var actionBarDrawerToggle:ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Desplegar el Menu lateral
        actionBarDrawerToggle = ActionBarDrawerToggle(this,binding.drawerLayout,
            R.string.nav_open, R.string.nav_close)
        binding.drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
        binding.navView.setNavigationItemSelectedListener(this)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.itemsalir->{
                finishAffinity()
            }
            R.id.itemusuario->{
                val transaccion = supportFragmentManager.beginTransaction()
                val fragmento = UserFragment()
                
                transaccion.replace(R.id.fragmentContainerView,fragmento)
                transaccion.addToBackStack(null)
                transaccion.commit()

            }
            R.id.itemayuda->{
                val transaccion = supportFragmentManager.beginTransaction()
                val fragmento = UserFragment()
                transaccion.replace(R.id.fragmentContainerView,fragmento)
                transaccion.addToBackStack(null)
                transaccion.commit()
            }

            else ->{
                Toast.makeText(this,item.title,Toast.LENGTH_SHORT).show()
            }
        }
        binding.drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            true
        } else super.onOptionsItemSelected(item)
    }
}
