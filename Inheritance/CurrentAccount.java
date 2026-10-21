public class CurrentAccount {

    public static void main(String[] args) {

        Currentacount obj = new Currentacount();
        SavingAccount = new SavingAccount();

        obj.accountHolderName = "Tejas Margaj";

        obj.overDraftLimit = 1000;
    }

    class Account {

        String accountHolderName;
        double balance;

        void deposit(double amount) {

            balance += amount; // balance = balance + amount;

            System.out
                    .println("Deposite " + amount + " in " + accountHolderName + " Account . New Blance is " + balance);

        }

    }

    class SavingAccount extends Account {

        double intrestRate;

        void applyIntrest() {

            double intrest = balance * intrestRate / 100;
            balance += intrest;

            System.out.println(
                    "Deposite " + intrest + " in " + accountHolderName + " Account . New Blance is " + balance);
        }
    }

class Currentacount extends Account {

    double overDraftLimit;

    void withdraw(double amount) {

        if (amount <= overDraftLimit + balance) {

            balance -= amount;
            System.out
                    .println("Withdraw " + amount + " in " + accountHolderName + " Account . New Blance is " + balance);

        } else {
            System.out.println("Overdraft Limit Exceeds");

        }

    }
}
