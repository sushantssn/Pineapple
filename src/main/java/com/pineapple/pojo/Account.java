package com.pineapple.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Account {
    @Id
    @GeneratedValue
    private int id;
    private int userId;
    private String userName;

    private String schemeDes;
    private Date investmentDate;
    private Date maturityDate;
    private int investedAmount;
    private int maturityAmount;

    public Account() {
        super();
    }

    public Account(int id, int userId, String userName, String schemeDes, Date investmentDate, Date maturityDate, int investedAmount, int maturityAmount) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.schemeDes = schemeDes;
        this.investmentDate = investmentDate;
        this.maturityDate = maturityDate;
        this.investedAmount = investedAmount;
        this.maturityAmount = maturityAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSchemeDes() {
        return schemeDes;
    }

    public void setSchemeDes(String schemeDes) {
        this.schemeDes = schemeDes;
    }

    public Date getInvestmentDate() {
        return investmentDate;
    }

    public void setInvestmentDate(Date investmentDate) {
        this.investmentDate = investmentDate;
    }

    public Date getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(Date maturityDate) {
        this.maturityDate = maturityDate;
    }

    public int getInvestedAmount() {
        return investedAmount;
    }

    public void setInvestedAmount(int investedAmount) {
        this.investedAmount = investedAmount;
    }

    public int getMaturityAmount() {
        return maturityAmount;
    }

    public void setMaturityAmount(int maturityAmount) {
        this.maturityAmount = maturityAmount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userID='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", schemeDes='" + schemeDes + '\'' +
                ", investmentDate=" + investmentDate +
                ", maturityDate=" + maturityDate +
                ", investedAmount=" + investedAmount +
                ", maturityAmount=" + maturityAmount +
                '}';
    }
}
