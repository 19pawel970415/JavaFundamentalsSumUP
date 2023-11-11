public class Account {
    private String name;
    private int balance = 0;
    private boolean debit = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Stan konta: " + (balance - amount) + " | Wpłata: " + amount + " | Po operacji: " + balance);
        } else {
            System.out.println("Kwota wpłaty musi być dodatnia!");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0) {
            if ((balance - amount) < -1000) {
                System.out.println("Nie można wykonać operacji przekraczającej debet");
            } else {
                balance -= amount;
                if (balance < 0) {
                    debit = true;
                }
                System.out.println("Stan konta: " + (balance + amount) + " | Wypłata: " + amount + " | Po operacji: " + balance);
            }
        } else {
            System.out.println("Kwota wypłaty musi być dodatnia!");
        }
        if (debit) {
            System.out.println("Ujemny stan konta");
        }
    }

    public void transfer(Account other, int amount) {
        this.withdraw(amount);
        other.deposit(amount);
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name +
                ", balance=" + balance +
                '}';
    }
}
