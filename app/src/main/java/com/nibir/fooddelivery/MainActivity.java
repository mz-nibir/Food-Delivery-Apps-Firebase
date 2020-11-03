package com.nibir.fooddelivery;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.gson.internal.$Gson$Preconditions;
import com.nibir.fooddelivery.model.DataController;
import com.nibir.fooddelivery.model.Restaurant;
import com.nibir.fooddelivery.model.RestaurantInterface;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity implements RestaurantInterface {
    private static final String TAG = "MainActivity";
    RestaurantInterface restaurantInterface;
    DataController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        restaurantInterface=this;

        controller=DataController.getInstance();
        controller.setRestaurantInterface(restaurantInterface);


        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);


     //   SentDataToFireStore();


    }




    private void SentDataToFireStore() {

        FirebaseFirestore db= FirebaseFirestore.getInstance();

        CollectionReference reference = db.collection("Restaurants");
        Restaurant myRestaurant = new Restaurant();
        myRestaurant.setRestaurantName("Nibir Restaurants");
        myRestaurant.setRestaurantDescription("Best restaurant in Dhaka");
        myRestaurant.setRestaurantLocation("Bashundhara,Dhaka");
        myRestaurant.setRestaurantImgUrl("https://img.jakpost.net/c/2016/09/29/2016_09_29_12990_1475116504._large.jpg");

        reference.add(myRestaurant).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
            @Override
            public void onComplete(@NonNull Task<DocumentReference> task) {
                if(task.isSuccessful()){
                    Toast.makeText(MainActivity.this, "Restaurant Uploaded", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Sorry not success", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    @Override
    public void onRestaurentClick(Restaurant restaurant) {


    }
}