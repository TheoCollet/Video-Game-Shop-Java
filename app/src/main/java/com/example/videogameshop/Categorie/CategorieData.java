package com.example.jsonausite.Categorie;

import ...
public class CategorieData {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Categories);

        RecyclerView rvLivres = (RecyclerView) findViewById(R.id.RecyclerView);


        ArrayList<Livre> livres= new ArrayList<Livre>();

        for(int i=0; i<10; i++){
            livres.add(new Livre("Théo","collet","54556456","je suis collé"));
        }

        LivreAdapter adapter = new LivreAdapter(livres);
        rvLivres.setAdapter(adapter);
        rvLivres.setLayoutManager(new LinearLayoutManager(this));

    }
}
