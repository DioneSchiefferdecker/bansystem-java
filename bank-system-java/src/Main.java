package src;
public class Main {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Dione Rafael", 12345);

        account1.openAccount();

        account1.deposit(1000);
        boolean withdrawSuccess = account1.withdraw(300);

        System.out.println(account1);

        if (!withdrawSuccess) {
            System.out.println("Withdraw failed.");
        }
    }
}

