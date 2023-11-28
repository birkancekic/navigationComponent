package com.birkancekic.navigationcomponentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.birkancekic.navigationcomponentkullanimi.databinding.FragmentDetayBinding


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

        return binding.root
    }


}