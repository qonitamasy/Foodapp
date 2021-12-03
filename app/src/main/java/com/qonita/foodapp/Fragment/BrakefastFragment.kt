package com.qonita.foodapp.Fragment

import Adapter.RecipesAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.qonita.foodapp.databinding.FragmentBrakefastBinding
import com.qonita.foodapp.model.DataRecipes
import com.qonita.foodapp.model.Recipes


class BrakefastFragment : Fragment() {
private lateinit var breakfastBinding: FragmentBrakefastBinding
private var list :ArrayList<Recipes> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        breakfastBinding = FragmentBrakefastBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return breakfastBinding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       list.addAll(DataRecipes.dataBreakfast)
        breakfastBinding.rvBreakfast.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(context,2)
            val recipesAdapter = RecipesAdapter (list)
            adapter = recipesAdapter
        }
    }

}