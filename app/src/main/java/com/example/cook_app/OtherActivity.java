package com.example.cook_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recepts);

        Button buttonGoToRecipes = findViewById(R.id.buttonAddRecipe);
        buttonGoToRecipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherActivity.this, RecipesActivity.class);
                startActivity(intent);
            }
        });
    }
}
