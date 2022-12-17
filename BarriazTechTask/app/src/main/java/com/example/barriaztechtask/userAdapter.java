package com.example.barriaztechtask;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class userAdapter extends RecyclerView.Adapter<userAdapter.UserHolder> {
    MainActivity mainActivity;
    List<Result>resultList;
    public userAdapter(MainActivity mainActivity, List<Result> resultList) {
        this.mainActivity=mainActivity;
        this.resultList=resultList;
    }

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserHolder(LayoutInflater.from(mainActivity).inflate(R.layout.item_user,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserHolder holder, int position) {
        holder.itemText.setText(resultList.get(position).getName());
        holder.itemText2.setText(resultList.get(position).getCountry());
        holder.itemText3.setText(resultList.get(position).getAlpha_two_code());

    }

    @Override
    public int getItemCount() {
        return resultList.size();
    }

    class UserHolder extends RecyclerView.ViewHolder {
        TextView itemText,itemText2,itemText3;
        public UserHolder(@NonNull View itemView) {
            super(itemView);
            itemText=itemView.findViewById(R.id.itemText);
            itemText2=itemView.findViewById(R.id.itemText2);
            itemText3=itemView.findViewById(R.id.itemText3);
        }
    }
}
