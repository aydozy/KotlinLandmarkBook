package com.aydanilozyurek.kotlinlandmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.aydanilozyurek.kotlinlandmarkbook.databinding.ActivityDetailsBinding
import com.aydanilozyurek.kotlinlandmarkbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //Empty List
        landmarkList = ArrayList<Landmark>()

        // Data
        val pisa = Landmark("Learning Tower of Pisa", "Italy", R.drawable.pisa)
        val tajMahal = Landmark("Taj Mahal", "Agra District in Uttar Pradesh.", R.drawable.tajmahal)
        val burjKhalifa = Landmark("Burj Khalifa", "Dubai", R.drawable.burjkhalifanew)
        val eiffel = Landmark("Eiffel Tower", "Paris,France", R.drawable.eiffeltower)

        // Add the Landmark in the list
        landmarkList.add(pisa)
        landmarkList.add(tajMahal)
        landmarkList.add(burjKhalifa)
        landmarkList.add(eiffel)


        //Recycler View
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter

    }
}