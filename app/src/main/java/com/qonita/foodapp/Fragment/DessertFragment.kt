package com.qonita.foodapp.Fragment

import Adapter.RecipesAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.qonita.foodapp.databinding.FragmentDessertBinding
import com.qonita.foodapp.model.DataRecipes
import com.qonita.foodapp.model.Recipes

class dessertFragment : Fragment() {
    private lateinit var dessertBinding: FragmentDessertBinding
    private val list : ArrayList<Recipes> = arrayListOf()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       dessertBinding = FragmentDessertBinding.inflate(inflater,container,false)
        return dessertBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        list.addAll(DataRecipes.dataDessert)
        dessertBinding.rvDessert.apply {
            setHasFixedSize(true)
            layoutManager =GridLayoutManager(context,2)
            val recipesAdapter = RecipesAdapter (list)
            adapter = recipesAdapter
        }
    }


}