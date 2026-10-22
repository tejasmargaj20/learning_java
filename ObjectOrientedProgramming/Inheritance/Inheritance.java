public class Inheritance {

    public static void main(String[] args) {

        PremiumSavingAccount obj = new PremiumSavingAccount();
        obj.accountHolderName = "Tejas Margaj";
        obj.deposit(16400);
        obj.applyIntrest();
        obj.applyCashback();

    }
}

class Account {

    String accountHolderName;
    double balance;

    void deposit(double amount) {

        balance += amount; // balance = balance + amount;

        System.out.println("Deposite " + amount + " in " + accountHolderName + " Account . New Blance is " + balance);

    }

}

class SavingAccount extends Account {

    double intrestRate;

    void applyIntrest() {

        double intrest = balance * intrestRate / 100;
        balance += intrest;

        System.out.println("Deposite " + intrest + " in " + accountHolderName + " Account . New Blance is " + balance);
    }
}

class PremiumSavingAccount extends CurrentAccount {

    double cashbackRate;

    void applyCashback() {

        double cashback = balance * cashbackRate / 100;

        balance += cashback;

        System.out.println("Deposite " + cashback + " in " + accountHolderName + " Account . New Blance is " + balance);

    }
}
