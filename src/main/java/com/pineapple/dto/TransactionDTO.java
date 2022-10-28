package com.pineapple.dto;


import java.util.Date;

public class TransactionDTO {

    private int transactionId;

    private String transactionType;

    private Double Amount;

    private Date transactionDate;

    private int debitAccount;

    private int creditAccount;

    private String modeOfTransaction;

    public TransactionDTO() {
        super();
    }

    public TransactionDTO(int transactionId, String transactionType, Double amount, Date transactionDate, int debitAccount, int creditAccount, String modeOfTransaction) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        Amount = amount;
        this.transactionDate = transactionDate;
        this.debitAccount = debitAccount;
        this.creditAccount = creditAccount;
        this.modeOfTransaction = modeOfTransaction;
    }


    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public int getDebitAccount() {
        return debitAccount;
    }

    public void setDebitAccount(int debitAccount) {
        this.debitAccount = debitAccount;
    }

    public int getCreditAccount() {
        return creditAccount;
    }

    public void setCreditAccount(int creditAccount) {
        this.creditAccount = creditAccount;
    }

    public String getModeOfTransaction() {
        return modeOfTransaction;
    }

    public void setModeOfTransaction(String modeOfTransaction) {
        this.modeOfTransaction = modeOfTransaction;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", transactionType='" + transactionType + '\'' +
                ", Amount=" + Amount +
                ", transactionDate=" + transactionDate +
                ", debitAccount=" + debitAccount +
                ", creditAccount=" + creditAccount +
                ", modeOfTransaction='" + modeOfTransaction + '\'' +
                '}';
    }
}
