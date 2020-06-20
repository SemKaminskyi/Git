package com.gmail.kaminskyisem.testGit.model;

public final class CardDetails {
    private final String ownerName;
    private final String cardNumber;
    private float balance;
    private final String expiryDate;
    private String pinCode;


    public CardDetails(String ownerName, String cardNumber, float balance, String expiryDate, String pinCode) {
        this.ownerName = ownerName;
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.expiryDate = expiryDate;
        this.pinCode = pinCode;
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


    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
}
