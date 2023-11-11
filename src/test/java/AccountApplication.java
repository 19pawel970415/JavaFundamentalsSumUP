public class AccountApplication {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Konto Premium");
        System.out.println("Nazwa: " + account.getName());
        System.out.println("Stan konta: " + account.getBalance());
        account.deposit(-10);
        account.deposit(0);
        account.withdraw(-15);
        account.withdraw(0);
        account.deposit(100);
        account.withdraw(150);
        account.withdraw(1000);
        Account account1 = new Account();
        account1.setName("Koto za zero");
        System.out.println();
        System.out.println();
        System.out.println();
        account.transfer(account1, 500);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(account);
        System.out.println(account1);
    }
}
