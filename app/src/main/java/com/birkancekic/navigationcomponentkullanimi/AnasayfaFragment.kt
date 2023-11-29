    package com.birkancekic.navigationcomponentkullanimi

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.birkancekic.navigationcomponentkullanimi.AnasayfaFragmentDirections.DetayGecis
import com.birkancekic.navigationcomponentkullanimi.databinding.FragmentAnasayfaBinding
import com.google.android.material.snackbar.Snackbar


    class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?, ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

         binding.buttonDetay.setOnClickListener{

             //Snackbar.make(it,"Merhaba",Snackbar.LENGTH_SHORT).show()
             //binding.textView.text="Nasılsın"

             val urun= Urunler(100,"TV")
             val gecis= AnasayfaFragmentDirections.detayGecis(urun)

             Navigation.findNavController(it).navigate(gecis)
         }

         binding.buttonGoster.setOnClickListener {
             Navigation.findNavController(it).navigate(R.id.bottomSheetGecis)
         }


        return binding.root
    }

        override fun onConfigurationChanged(newConfig: Configuration) {
            super.onConfigurationChanged(newConfig)
            Log.e("Yaşam Döngüsü","onCreate")
        }

        override fun onPause() {
            super.onPause()
            Log.e("Yaşam Döngüsü", "onPause")
        }

        override fun onResume() {
            super.onResume()
            Log.e("Yaşam Döngüsü","onResume")
        }


    }