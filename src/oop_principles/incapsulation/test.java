package oop_principles.incapsulation;

public class test {
    public static void main(String[] args) {
        AccountHolder accountHolder = new AccountHolder();

        accountHolder.firstName = "John";
        accountHolder.lastName = "Doe";
        accountHolder.address = "Chicago";
        accountHolder.phoneNumber = "(312) 000-0000";
        accountHolder.setSSN("123-12-1234");
        accountHolder.setBalance(1000.00);

        System.out.println("First name = " + accountHolder.firstName);
        System.out.println("Balance = " + accountHolder.getBalance());
        System.out.println("SSN = " + accountHolder.getSSN());
        System.out.println(accountHolder);
    }
}