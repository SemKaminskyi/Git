package com.gmail.kaminskyisem.testGit.model;

public final class CardDetails {
    private final String ownerName;
    private final String cardNumber;
    private float balance;
    private final String expiryDate;
    private String pincode;


    public CardDetails(String ownerName, String cardNumber, float balance, String expiryDate, String pincode) {
        this.ownerName = ownerName;
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.expiryDate = expiryDate;
        this.pincode = pincode;
    }

    public String getOwnerName() {
        return ownerName;
    }


    public String getCardNumber() {
        return cardNumber;
    }


    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getExpiryDate() {
        return expiryDate;
    }


    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
