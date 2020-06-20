package com.gmail.kaminskyisem.testGit;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

import com.gmail.kaminskyisem.testGit.CardDetails.CardDetailsAdapter;
import com.gmail.kaminskyisem.testGit.model.CardDetails;
import com.gmail.kaminskysem.yourhelper.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static String LOG_TAG = MainActivity.class.getSimpleName();
    private RecyclerView rvBankCards;
    private CardDetailsAdapter adapter;
    private List<CardDetails> cardList;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);

        adapter = new CardDetailsAdapter();
        rvBankCards = findViewById(R.id.rv_bankCardList);
        rvBankCards.setAdapter(adapter);
        rvBankCards.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        cardList = new UserCardProvider().getCardDetails ();
        adapter.setCards(cardList);

        findViewById(R.id.btn_reverse).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setCards(cardList);
            }
        });
    }
}