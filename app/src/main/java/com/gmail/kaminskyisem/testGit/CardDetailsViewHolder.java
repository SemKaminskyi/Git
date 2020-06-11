package com.gmail.kaminskyisem.testGit;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CardDetailsViewHolder extends RecyclerView.ViewHolder  {

    private  final TextView tvExpiry;
    private  final TextView tvName;
    private  final TextView tvAmount;
    private  final TextView tvCardNumber;

    public CardDetailsViewHolder(@NonNull View itemView, TextView tvName, TextView tvAmount, TextView tvCardNumber, TextView tvCradHolderName) {
        super(itemView);
        tvName = itemView.findViewById();
        tvAmount = itemView.findViewById();
        tvCardNumber = itemView.findViewById();
        tvCradHolderName = itemView.findViewById();
    }

    private  final TextView tvCradHolderName;
    public CardDetailsViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}
