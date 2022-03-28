class Bank{
    String name;
    String code;

    void addBranch(){}
    void removeBranch(){}
    void getBranch(){}
    void getAllBranches(){}
}

class Branch{
    String branchCode;
    String city;

    void addAccount(){};
    void removeAccount(){};
    void getAccount(){};
}

interface Account{
    String accNo;
    double balance;

    void debitAmount();
    void creditAmount();
    void getBalance();
}

class SavingsAccount implements Account{
    double minBalance;
    String dateOfOpening;

    void addCustomer(){}
    void removeCustomer(){}
    
    void debitAmount(){return;}
    void creditAmount(){}
    void getBalance(){}
}
class CurrentAccount implements Account{
    double interestRate;
    String dateOfOpening;

    void addCustomer(){}
    void removeCustomer(){}
    
    void debitAmount(){return;}
    void creditAmount(){}
    void getBalance(){}
}
class Customer{
    String custID;
    String name;
    String address;
    String phone;
}
class BankingSystem{
    public static void main(String[] args) {
        
    }
}