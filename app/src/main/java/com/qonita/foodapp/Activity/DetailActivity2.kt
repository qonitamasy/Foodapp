package com.qonita.foodapp.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.qonita.foodapp.R
import com.qonita.foodapp.databinding.ActivityDetailBinding
import com.qonita.foodapp.model.Recipes

class DetailActivity2 : AppCompatActivity() {
    companion object{
        const val RECIPE_DATA ="recipe_adapter"
    }
    private lateinit var detailBinding : ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(detailBinding.root)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }
        setSupportActionBar(detailBinding.tbDetail)
        val dataRecipes = intent.getParcelableExtra<Recipes>(RECIPE_DATA) as Recipes
        Glide.with(this). load(dataRecipes.pictures).into(detailBinding.ivDetail)
        detailBinding.tvNameDetail.text = dataRecipes.name
        detailBinding.tvCalories. text = dataRecipes.calories
        detailBinding.tvCarbo. text = dataRecipes.carbo
        detailBinding.tvProtein.text = dataRecipes.protein
        detailBinding.tvDetailDescription.text=dataRecipes.description
        detailBinding.tvIngredients.text=dataRecipes.ingredients
        detailBinding.tvInstruction.text =dataRecipes.instructions


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}