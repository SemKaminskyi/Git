package com.gmail.kaminskyisem.testGit.CardDetails;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gmail.kaminskyisem.testGit.CardDetailsViewHolder;
import com.gmail.kaminskyisem.testGit.R;
import com.gmail.kaminskyisem.testGit.model.CardDetails;

import java.util.ArrayList;
import java.util.List;

public class CardDetailsAdapter extends RecyclerView.Adapter<CardDetailsViewHolder>{
    private final List<CardDetails> cards = new ArrayList<>();

    public void setCards (List<CardDetails> cards){
        this.cards=
    }

    @NonNull
    @Override
    public CardDetailsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_carddetails, parent);
        return new CardDetailsViewHolder(v);


    }

    @Override
    public void onBindViewHolder(@NonNull CardDetailsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 1000;
    }
}
