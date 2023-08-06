Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.

import java.io.*;
import java.util.*;
import java.lang.*;

class Account {
    String name;
    String accountno;
    double balance;
    Account(String name,String accountno,double balance)
    {
        this.name = name;
        this.accountno = accountno;
        this.balance = balance;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public String getaccountno()
    {
        return accountno;
    }
    public void setaccountno(String accountno)
    {
        this.accountno = accountno;
    }
    public double getbalance()
    {
        return balance;
    }
    public void setbalance(double balance)
    {
        this.balance = balance;
    }
    public void deposit(double amount)
    {
        balance+=amount;
    }
    public void withdraw(double amount)
    {
        balance-=amount;
    }
    public String accountinfo()
    {
         return "Name : " +name+ " ->  Account number: " +accountno+ " -> Balance Amount: " +balance;
    }
}

class Bank {
    ArrayList<Account> accounts = new ArrayList<Account>();
    public void addaccount(Account account)
    {
        accounts.add(account);
    }
    public void removeaccount(Account account)
    {
        accounts.remove(account);
    }
    public void depositmoney(Account account,double money)
    {
        account.deposit(money);
    }
    public void withdrawmoney(Account account,double money)
    {
        account.withdraw(money);
    }
    public ArrayList<Account> getaccounts()
    {
        return accounts;
    }
}

public class Main {
    public static void main(String[] args)
    {
        Bank b = new Bank();
        Account account1 = new Account("Chandana" , "e321" , 1000);
        Account account2 = new Account("Asha" , "e322" , 1500);
        Account account3 = new Account("Ravichandra" , "e323" , 3000);
        
        b.addaccount(account1);
        b.addaccount(account2);
        b.addaccount(account3);
        
        ArrayList<Account> accounts = b.getaccounts();
        
        for(Account account : accounts)
        {
            System.out.println(account.accountinfo());
        }
        
        System.out.println();
        
        System.out.println("After depositing 1000 in account1");
        b.depositmoney(account1,1000);
        System.out.println(account1.accountinfo());
        
        System.out.println();
        
        System.out.println("After withdrawing 1000 in account3");
        b.withdrawmoney(account3,1000);
        System.out.println(account3.accountinfo());
        
        System.out.println();
        
        for(Account account : accounts)
        {
            System.out.println(account.accountinfo());
        }
        
        System.out.println();
        
        account1.setname("Chandana HR");
        String name1 = account1.getname();
        System.out.println(name1);
        double balance1 = account2.getbalance();
        System.out.println(balance1);
        account3.setname("Ravi");
        
        System.out.println();
        
        for(Account account : accounts)
        {
            System.out.println(account.accountinfo());
        }
    }
}
