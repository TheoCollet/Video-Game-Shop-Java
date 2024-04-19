package com.example.jsonausite.Categorie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesViewHolder> {
    private List<Categories> mesCategories;
    public CategoriesAdapter(List<Categories> lp){
        mesCategories=lp;
    }
    @NonNull
    @Override
    public CategoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        // Inflate the custom layout
        View LivreView = inflater.inflate(R.layout.linearlayoutcategories, parent,false);
        // Return a new holder instance
        CategoriesViewHolder viewHolder = new CategoriesViewHolder(CategoriesView);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder (@NonNull CategoriesViewHolder holder, int position) {
        // Get the data model based on position
        Categories livre=mesCategories.get(position);
        holder.bindData(Categories);
    }
    @Override
    public int getItemCount() {return mesLivres.size();}
}