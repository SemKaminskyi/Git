package com.gmail.kaminskyisem.testGit;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import com.gmail.kaminskyisem.testGit.CardDetails.CardDetailsAdapter;
import com.gmail.kaminskyisem.testGit.model.CardDetails;
import com.gmail.kaminskyisem.testGit.model.UserCardProvider;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static String LOG_TAG = MainActivity.class.getSimpleName();
    private RecyclerView rvBankCards;
    private CardDetailsAdapter adapter;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);
        cardList = new UserCardProvider().getCardDetails ();
        adapter = new CardDetailsAdapter();

        rvBankCards = findViewById(R.id.rvBankCardList);
        rvBankCards.setAdapter(adapter);
        rvBankCards.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));

        List<CardDetails> cardList = new UserCardProvider();
        adapter.setCards(cardList);
    }
}