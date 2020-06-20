package com.gmail.kaminskyisem.testGit;

import com.gmail.kaminskyisem.testGit.model.CardDetails;

import java.util.ArrayList;
import java.util.List;

public class UserCardProvider {
    public List<CardDetails>getCardDetails(){
        List<CardDetails>cardList = new ArrayList<>();
        cardList.add(new CardDetails("Sem Kaminskyi","4149 4149 4149 4151", 2000f, "03 20"," 1111"));
        cardList.add(new CardDetails("Sem Kaminskyi1","4149 4149 4149 4152", 2000f, "03 20"," 1112"));
        cardList.add(new CardDetails("Sem Kaminskyi2","4149 4149 4149 4153", 2000f, "03 20"," 1113"));
        cardList.add(new CardDetails("Sem Kaminskyi3","4149 4149 4149 4154", 2000f, "03 20"," 1114"));
        cardList.add(new CardDetails("Sem Kaminskyi4","4149 4149 4149 4155", 2000f, "03 20"," 11115"));
        cardList.add(new CardDetails("Sem Kaminskyi5","4149 4149 4149 4156", 2000f, "03 20"," 11116"));
        cardList.add(new CardDetails("Sem Kaminskyi6","4149 4149 4149 4157", 2000f, "03 20"," 11117"));
        cardList.add(new CardDetails("Sem Kaminskyi7","4149 4149 4149 4158", 2000f, "03 20"," 11118"));
        cardList.add(new CardDetails("Sem Kaminskyi8","4149 4149 4149 4159", 2000f, "03 20"," 11119"));
        cardList.add(new CardDetails("Sem Kaminskyi9","4149 4149 4149 4160", 2000f, "03 20"," 11120"));
        cardList.add(new CardDetails("Sem Kaminskyi10","4149 4149 4149 4161", 2000f, "03 20"," 11121"));
        return cardList;
    }
}
