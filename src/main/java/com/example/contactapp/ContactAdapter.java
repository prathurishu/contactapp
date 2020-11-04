package com.example.contactapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {

    private Context context;
    private List<ContactModel> ContactModelList;
    private int colorResId;

    public ContactAdapter(Context context, List<ContactModel> list, int colorResId) {

        this.context = context;
        this.ContactModelList = list;
        this.colorResId = colorResId;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        ContactViewHolder ContactViewHolder= new ContactViewHolder(view);
        return ContactViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        holder.ContactName.setText(ContactModelList.get(position).getContactName());
        holder.ContactNumber.setText(ContactModelList.get(position).getContactNumber());
        holder.ContactEmail.setText(ContactModelList.get(position).getContactEmail());
        if(ContactModelList.get(position).hasImage()){
            holder.image.setImageResource(ContactModelList.get(position).getImageResId());
            holder.image.setVisibility(View.VISIBLE);
        }else{
            holder.image.setVisibility(View.GONE);
        }
        int color= ContextCompat.getColor(context, colorResId);
        holder.textContainer.setBackgroundColor(color);
    }

    @Override
    public int getItemCount() { return ContactModelList.size(); }

    class ContactViewHolder extends RecyclerView.ViewHolder{

        TextView ContactName, ContactNumber,ContactEmail;
        ImageView image;
        View textContainer;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            ContactName = itemView.findViewById(R.id.tv1);
            ContactNumber=itemView.findViewById(R.id.tv2);
            ContactEmail =itemView.findViewById(R.id.tv3);
            image=itemView.findViewById(R.id.image);
            textContainer=itemView.findViewById(R.id.text_container);
        }
    }
}