package com.gmail.kaminskyisem.testGit.CardDetails;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gmail.kaminskyisem.testGit.model.CardDetails;
import com.gmail.kaminskysem.yourhelper.R;

public class CardDetailsViewHolder extends RecyclerView.ViewHolder  {

    private  final TextView tvExpiry;
    private  final TextView tvAmount;
    private  final TextView tvCardNumber;
    private  final TextView tvCradHolderName;

    public CardDetailsViewHolder(@NonNull View itemView) {
        super(itemView);
        tvExpiry = itemView.findViewById(R.id.tv_expiry);
        tvAmount = itemView.findViewById(R.id.tv_Amount);
        tvCardNumber = itemView.findViewById(R.id.tv_number_card);
        tvCradHolderName = itemView.findViewById(R.id.tv_name);
    }

//    public CardDetailsViewHolder(@NonNull View itemView) {
//        super(itemView);
//    }
    void bind (CardDetails card){
        tvAmount.setText(card.getBalance() + "$");
        tvCradHolderName.setText(card.getOwnerName());
        tvCardNumber.setText(card.getCardNumber());
        tvExpiry.setText(card.getExpiryDate());
    }
}
