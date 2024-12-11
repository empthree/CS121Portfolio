package weekNine;

class BankAccountMain {
    public static void main(String[] args) {

        BankAccount regularAccount = new BankAccount("John", "Doe", 30, "Checking", 1000.0);
        System.out.println("---REGULAR ACCOUNT---");
        regularAccount.displayAccountInfo();
        System.out.println();

        BankAccount premiumAccount = new BankAccount("CUST12345", "Checking");
        System.out.println("---PREMIUM ACCOUNT---");
        premiumAccount.displayAccountInfo();

    }
}