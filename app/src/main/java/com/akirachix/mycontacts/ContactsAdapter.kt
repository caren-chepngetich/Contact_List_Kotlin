package com.akirachix.mycontacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ListMenuItemView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter(val contactsList:List<Contact
        >):
    RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
    var itemView= LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
      return  ContactsViewHolder(itemView)

    }

    override fun getItemCount(): Int {
        return contactsList.size
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val contact = contactsList[position]
        holder.tvName.text = contact.name
        holder.tvPhoneNumber.text = contact.phoneNumber
        holder.tvEmail.text = contact.email
    }

}

class ContactsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
var tvName =itemView.findViewById<TextView>(R.id.tvName)
    var tvEmail =itemView.findViewById<TextView>(R.id.tvEmail)
    var tvPhoneNumber =itemView.findViewById<TextView>(R.id.tvPhoneNumber)



}