package com.nibir.fooddelivery;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.nibir.fooddelivery.model.Restaurant;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);


        SentDataToFireStore();
    }

    private void SentDataToFireStore() {

        FirebaseFirestore db= FirebaseFirestore.getInstance();

        CollectionReference reference = db.collection("Restaurents");
        Restaurant myRestaurent = new Restaurant();
        myRestaurent.setRestaurentName("Nibir Restaurents");
        myRestaurent.setRestaurentDescription("Best restaurent in Dhaka");
        myRestaurent.setRestaurentLocation("Bashundhara,Dhaka");
        myRestaurent.setRestaurentImgUrl("https://img.jakpost.net/c/2016/09/29/2016_09_29_12990_1475116504._large.jpg");

        reference.add(myRestaurent).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
            @Override
            public void onComplete(@NonNull Task<DocumentReference> task) {
                if(task.isSuccessful()){
                    Toast.makeText(MainActivity.this, "Restaurent Uploaded", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Sorry nit success ", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

}