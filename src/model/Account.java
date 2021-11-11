package model;

public class Account {
    static int totalAccounts;
    public int accountId;
    private int customerId;
    public int securityCode;
    public String accountType;
    public String accountCurrency;
    private double accountBalance;

    public Account(int customerId, String accountType, String accountCurrency, double accountBalance) {
        this.accountId = ++totalAccounts;
        this.customerId = customerId;
        this.securityCode = customerId;
        this.accountType = accountType;
        this.accountCurrency = accountCurrency;
        this.accountBalance = accountBalance;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void setTotalAccounts(int totalAccounts) {
        Account.totalAccounts = totalAccounts;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountCurrency() {
        return accountCurrency;
    }

    public void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double accountBalance) {
        this.accountBalance += accountBalance;
    }

    public boolean canWithdraw(double amount) {
        return this.getAccountBalance() > amount;
    }

    public void withdraw(double amount) {
        if (this.customerId == this.securityCode) {
                this.accountBalance -= amount;
        } else {
            System.out.println("No tienes permisos para retirar dinero de esta cuenta. Llamando a la policia en 3, 2, 1...");
        }

    }



}
