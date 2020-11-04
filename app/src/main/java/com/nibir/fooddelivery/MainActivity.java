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
import com.nibir.fooddelivery.model.MenuItem;
import com.nibir.fooddelivery.model.Restaurant;
import com.nibir.fooddelivery.model.RestaurantInterface;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RestaurantInterface {
    private static final String TAG = "MainActivity";
    RestaurantInterface restaurantInterface;
    DataController controller;
    NavController navController;

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
         navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);


//      SentDataToFireStore();
//      SentDataToFireStoreA();
//      SentDataToFireStoreB();
//      SentDataToFireStoreC();
//      SentDataToFireStoreD();


    }




    private void SentDataToFireStore() {

        FirebaseFirestore db= FirebaseFirestore.getInstance();

        CollectionReference reference = db.collection("Restaurants");
        Restaurant myRestaurant = new Restaurant();
        myRestaurant.setRestaurantName("Sultan Dines");
        myRestaurant.setRestaurantDescription("Mirpur-10, Dhaka");
        myRestaurant.setRestaurantLocation("Bangladesh");
        myRestaurant.setRestaurantImgUrl("https://binfo.com.bd/uploads/images/54729351_2226449311004948_4440402280281276416_n.jpg");

        List<MenuItem> myMenus = new ArrayList<>();
        for (int i=0;i <10;i++){
            myMenus.add(new MenuItem("Mutton Kacchi","Khub e Testy",350));

        }
        myRestaurant.setRestaurantMenuList(myMenus);


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

    //added

    private void SentDataToFireStoreA() {

        FirebaseFirestore db= FirebaseFirestore.getInstance();

        CollectionReference reference = db.collection("Restaurants");
        Restaurant myRestaurant = new Restaurant();
        myRestaurant.setRestaurantName("Hungry Eyes");
        myRestaurant.setRestaurantDescription("Mirpur-11, Dhaka");
        myRestaurant.setRestaurantLocation("Bangladesh");
        myRestaurant.setRestaurantImgUrl("https://img.jakpost.net/c/2016/09/29/2016_09_29_12990_1475116504._large.jpg");

        List<MenuItem> myMenus = new ArrayList<>();
        for (int i=0;i <10;i++){
            myMenus.add(new MenuItem("Mutton Kacchi","Khub e Testy",350));

        }
        myRestaurant.setRestaurantMenuList(myMenus);


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


    private void SentDataToFireStoreB() {

        FirebaseFirestore db= FirebaseFirestore.getInstance();

        CollectionReference reference = db.collection("Restaurants");
        Restaurant myRestaurant = new Restaurant();
        myRestaurant.setRestaurantName("Rabbani Hotel & Restaurant");
        myRestaurant.setRestaurantDescription("Best restaurant in Dhaka");
        myRestaurant.setRestaurantLocation("Mirpur-10, Dhaka");
        myRestaurant.setRestaurantImgUrl("https://media-cdn.tripadvisor.com/media/photo-s/17/b6/d1/d4/dhakaregencyhotel.jpg");

        List<MenuItem> myMenus = new ArrayList<>();
        for (int i=0;i <10;i++){
            myMenus.add(new MenuItem("Mutton Kacchi","Khub e Testy",350));

        }
        myRestaurant.setRestaurantMenuList(myMenus);


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


    private void SentDataToFireStoreC() {

        FirebaseFirestore db= FirebaseFirestore.getInstance();

        CollectionReference reference = db.collection("Restaurants");
        Restaurant myRestaurant = new Restaurant();
        myRestaurant.setRestaurantName("Hazi Biriani");
        myRestaurant.setRestaurantDescription("Old Dhaka");
        myRestaurant.setRestaurantLocation("Bangladesh");
        myRestaurant.setRestaurantImgUrl("https://2.bp.blogspot.com/-IjmGdjYRsyc/WUp3gXjWxjI/AAAAAAAAAAg/dceUL-NX1kAGNy37DcazKPadVqewJtcNwCPcBGAYYCw/s1600/y.jpg");

        List<MenuItem> myMenus = new ArrayList<>();
        for (int i=0;i <10;i++){
            myMenus.add(new MenuItem("Mutton Kacchi","Khub e Testy",350));

        }
        myRestaurant.setRestaurantMenuList(myMenus);


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

    private void SentDataToFireStoreD() {

        FirebaseFirestore db= FirebaseFirestore.getInstance();

        CollectionReference reference = db.collection("Restaurants");
        Restaurant myRestaurant = new Restaurant();
        myRestaurant.setRestaurantName("Astha Cafe");
        myRestaurant.setRestaurantDescription("Sector-12, Uttora");
        myRestaurant.setRestaurantLocation("Bangladesh");
        myRestaurant.setRestaurantImgUrl("https://i2-prod.lincolnshirelive.co.uk/incoming/article3579859.ece/ALTERNATES/s615/3_DHR_HMB_cookhousexams_261119.jpg");

        List<MenuItem> myMenus = new ArrayList<>();
        for (int i=0;i <10;i++){
            myMenus.add(new MenuItem("Mutton Kacchi","Khub e Testy",350));

        }
        myRestaurant.setRestaurantMenuList(myMenus);


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

        controller.setCurrentMenuItemList(restaurant.getRestaurantMenuList());
        navController.navigate(R.id.action_navigation_home_to_navigation_menu);



    }
}