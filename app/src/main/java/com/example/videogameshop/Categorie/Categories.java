package com.example.jsonausite.Categorie;

import android.content.Intent;

import com.example.jsonausite.R;

public class Categories {
    Intent Id_Categorie;
    String Nom_Genre;

    public Categories(Intent Id_Categorie, String Nom_Genre) {
        this.setId_Categorie(Id_Categorie);
        this.setNom_Genre(Nom_Genre);
    }

    public Intent getId_Categorie() {
        return Id_Categorie;
    }

    public void setId_Categorie(Intent Id_Categorie) {
        this.Id_Categorie = Id_Categorie;
    }

    public String getNom_Genre() {
        return Nom_Genre;
    }

    public void setNom_Genre(String Nom_Genre) {
        this.Nom_Genre = Nom_Genre;
    }
}