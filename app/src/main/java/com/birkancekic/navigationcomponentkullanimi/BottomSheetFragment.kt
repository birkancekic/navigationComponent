package com.birkancekic.navigationcomponentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.birkancekic.navigationcomponentkullanimi.databinding.FragmentBottomSheetBinding
import com.google.android.material.snackbar.Snackbar


class BottomSheetFragment : Fragment() {

    private lateinit var binding: FragmentBottomSheetBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding= FragmentBottomSheetBinding.inflate(inflater, container, false)

        binding.imageViewPaylas.setOnClickListener {
            Snackbar.make(it, "Paylaşıldı", Snackbar.LENGTH_SHORT).show()
        }
        binding.imageViewCopy.setOnClickListener {
            Snackbar.make(it, "Kopyalandı", Snackbar.LENGTH_SHORT).show()
        }

        return binding.root
    }


}