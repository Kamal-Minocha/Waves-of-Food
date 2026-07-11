package com.example.wavesoffood

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wavesoffood.adapter.NotificationAdapter
import com.example.wavesoffood.databinding.FragmentNotifiicationBottomBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class NotifiicationBottomFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentNotifiicationBottomBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentNotifiicationBottomBinding.inflate(layoutInflater, container, false)
        val notification = listOf("Your order has been Canceled Successfully", "Order has been taken by the driver", "Congrats Your Order Placed")
        val notificationImages = listOf(R.drawable.sademoji, R.drawable.icon__4_, R.drawable.illustration__1_)
        val adapter = NotificationAdapter(
            ArrayList(notification),
            ArrayList(notificationImages)
        )
        binding.notificationRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.notificationRecyclerView.adapter = adapter
        return binding.root
    }

    companion object {

    }
}