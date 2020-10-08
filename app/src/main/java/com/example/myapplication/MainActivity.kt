package com.example.myapplication

import android.location.LocationManager
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.Recycler.RecyclerAdapter
import com.example.myapplication.Recycler.RecyclerModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

const val BASE_URL = "https://api.skypicker.com/"
val list = ArrayList<RecyclerModel>()
var date: String = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(Date())
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val api = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL).build().create(JsonPlaceholderApi::class.java)

        GlobalScope.launch(IO) {
            val response = api.getUsers(5,date);
            if (response.isSuccessful) {
                for (x in response.body()!!.data) {
                    val item = RecyclerModel("https://images.kiwi.com/photos/600x330/${x.mapIdto}.jpg", x.cityTo, x.cityFrom,x.flyDuration)
                    list += item;
                    Log.d("hello", item.toString())
                }
                launch(Dispatchers.Main) {
                    displayRecyclerView();
                }
            } else {
                Log.d("hello", response.toString())
            }
        }
    }
    private fun displayRecyclerView() {
        Log.d("hello", date)
        recycler_view.adapter = RecyclerAdapter(list)
        recycler_view.layoutManager = LinearLayoutManager(applicationContext)
        recycler_view.setHasFixedSize(true);
    }
}

