package com.birkancekic.navigationcomponentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.navArgs
import com.birkancekic.navigationcomponentkullanimi.databinding.FragmentDetayBinding
import com.google.android.material.snackbar.Snackbar


class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?, ): View? {
        binding=  FragmentDetayBinding.inflate(inflater, container, false)

        val bundle:DetayFragmentArgs by navArgs()
        val gelenAd= bundle.ad
        val gelenYas=bundle.yas
        val urunId=bundle.urun1.id
        val urunAd=bundle.urun1.ad


        binding.textViewBilgi.text= "$gelenAd - $gelenYas- $urunAd- $urunId"

        val backpress= object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
            Snackbar.make(binding.textViewBilgi,"geri dönmek istiyor musun",Snackbar.LENGTH_SHORT)
                .setAction("evet"){
                    isEnabled=false//geri dönüş aktif
                    requireActivity().onBackPressedDispatcher.onBackPressed()
                }.show()

            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,backpress)

        return binding.root
    }


}