package com.akirachix.mycontacts

import android.os.Binder
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvContact.layoutManager= GridLayoutManager(this,2)
        displayContacts()

    }
    fun displayContacts(){
        val contact1= Contact("Abraham","0756656678","abraham@gmail.com","")
        val contact2= Contact("Abram","0756656789","abram@gmail.com","")
        val contact3= Contact("Abel","07566567890","abel@gmail.com","")
        val contact4= Contact("Abed","07566567778","abed@gmail.com","")
        val contact5= Contact("Anaya","0756656788","anaya@gmail.com","")
        val contact6= Contact("Angel","07566568997","angel@gmail.com","")
        val contact7= Contact("Angie","07566567788","angie@gmail.com","")
        val contact8= Contact("Angie","07566567788","angie@gmail.com","")
        val contact9= Contact("Angie","07566567788","angie@gmail.com","")
        val contact10= Contact("Angie","07566567788","angie@gmail.com","")

        val contactList = listOf(contact3,contact4,contact5,contact6,contact7,contact1,contact2,contact10,contact8,contact9)
        val contactsAdapter = ContactsAdapter(contactList)
        binding.rvContact.adapter =contactsAdapter

    }

}