package com.pineapple.entity;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
public class UserWallet {

    @Id
    @GeneratedValue
    private int walletId;
    private int userAccountNumber;
    private double balance;
    @UpdateTimestamp
    private Date lastUpdatedDate;
    @CreatedDate
    private Date createdDate;

    @OneToOne(fetch= FetchType.LAZY,mappedBy = "userWallet")
    private UserEntity userEntity;

    public UserWallet() {
        super();
    }

    public UserWallet(int walletId, int userAccountNumber, double balance, Date lastUpdatedDate, Date createdDate) {
        this.walletId = walletId;
        this.userAccountNumber = userAccountNumber;
        this.balance = balance;
        this.lastUpdatedDate = lastUpdatedDate;
        this.createdDate = createdDate;
    }

    public int getWalletId() {
        return walletId;
    }

    public void setWalletId(int walletId) {
        this.walletId = walletId;
    }

    public int getUserAccountNumber() {
        return userAccountNumber;
    }

    public void setUserAccountNumber(int userAccountNumber) {
        this.userAccountNumber = userAccountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "UserWallet{" +
                "walletId=" + walletId +
                ", userAccountNumber=" + userAccountNumber +
                ", balance=" + balance +
                ", lastUpdatedDate=" + lastUpdatedDate +
                ", createdDate=" + createdDate +
                '}';
    }
}
