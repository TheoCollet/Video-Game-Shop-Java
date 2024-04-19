package com.example.jsonausite.Categorie;

import android.view.View;
import android.widget.TextView;

public class CategoriesViewHolder {

    TextView AfficheId_Categories;
    TextView AfficheNom_Genre;
    public CategoriesViewHolder(View pv){
        super(pv);
        AfficheId_Categories= pv.findViewById(R.id.AfficheId_Categories);
        AfficheNom_Genre=pv.findViewById(R.id.AfficheNom_Genre);
    }
    public void bindData(final Categories pl) {
        AfficheId_Categories.setIntent(pl.getId_Categorie());
        AfficheNom_Genre.setText(pl.getNom_Genre());
    }
}
