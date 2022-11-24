package com.example.mytelegram

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mytelegram.databinding.FragmentMessageBinding


class FragmentMessage : Fragment() {
    private lateinit var binding: FragmentMessageBinding
    private  var list = arrayListOf<MessageModel>()
    private lateinit var adapter: MessageAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = FragmentMessageBinding.inflate(layoutInflater)
        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
       saveMessage()

    }
    private fun saveMessage() {
     binding.btnSave.setOnClickListener {
         list.add(MessageModel(binding.etMsg.text.toString()))

            binding.etMsg.text.clear()
       }
    }

    private fun initAdapter() {
        adapter = MessageAdapter(list)
        binding.rvMessage.adapter = adapter

    }













}