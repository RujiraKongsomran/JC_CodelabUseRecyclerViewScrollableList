package com.rujirakongsomran.jc_codelabuserecyclerviewscrollablelist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rujirakongsomran.jc_codelabuserecyclerviewscrollablelist.adapter.ItemAdapter
import com.rujirakongsomran.jc_codelabuserecyclerviewscrollablelist.data.Datasource
import com.rujirakongsomran.jc_codelabuserecyclerviewscrollablelist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val myDataset = Datasource().loadAffirmations()
        binding.recyclerView.adapter = ItemAdapter(this, myDataset)
        binding.recyclerView.setHasFixedSize(true)


    }
}