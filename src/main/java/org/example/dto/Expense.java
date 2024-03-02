package org.example.dto;

public class Expense {
    public String getUser_id() {
        return User_id;
    }

    public void setUser_id(String user_id) {
        User_id = user_id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public Expense(String User_id,double amount){
        this.User_id=User_id;
        this.amount=amount;
    }
    String User_id;
    double amount;
}
