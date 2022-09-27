package com.stasoft.checklistcem

import android.content.res.TypedArray
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.stasoft.checklistcem.databinding.ActivityActivityregistroBinding
import com.stasoft.checklistcem.databinding.ActivityRegistroBinding

class RegistroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistroBinding
    var numAvatar: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Carga de imagen botón izquierdo
        binding.buttonLeft.setOnClickListener(){
            numAvatar--
            cargaImagen(binding.imageView, numAvatar)
        }

        //Carga de imagen botón derecho
        binding.buttonRight.setOnClickListener(){
            numAvatar++
            cargaImagen(binding.imageView, numAvatar)
        }


    }

    fun cargaImagen(imageView: ImageView, numero:Int):Boolean{
        var imageArray: TypedArray
        var ret:Boolean=false
        imageArray = getResources().obtainTypedArray(R.array.avatars)
        if (numero >= 0 && numero < imageArray.length()){
            imageView.setImageResource(imageArray.getResourceId(numero,R.drawable.a1_h))
            ret = true
        }
        imageArray.recycle()
        return ret
    }
}