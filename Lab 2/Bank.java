import java.util.Scanner;

public class Bank {
    
    // my bank account class
    static class BankAccount {
        String name;
        String accountNum;
        double money;
        String pinCode;
        
        // constructor thing
        public BankAccount(String n, String a, double m) {
            name = n.trim().toUpperCase();
            accountNum = a;
            money = m;
        }
        
        // get first name
        public String firstName() {
            int space = name.indexOf(" ");
            if(space == -1) {
                return name;
            }
            return name.substring(0, space);
        }
        
        // count letters no spaces
        public int letterCount() {
            String noSpace = name.replace(" ", "");
            return noSpace.length();
        }
        
        // check if account number good
        public boolean goodAccount() {
            if(accountNum.length() != 8) {
                return false;
            }
            if(accountNum.charAt(0) != '1') {
                return false;
            }
            for(int i=0; i<accountNum.length(); i++) {
                if(!Character.isDigit(accountNum.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
        
        // add money
        public void addMoney(double amount) {
            money = money + amount;
        }
        
        // take money
        public void takeMoney(double amount) {
            money = money - amount;
        }
        
        // set pin
        public boolean makePin(String p) {
            if(p.length() != 4) {
                return false;
            }
            for(int i=0; i<p.length(); i++) {
                if(!Character.isDigit(p.charAt(i))) {
                    return false;
                }
            }
            pinCode = p;
            return true;
        }
        
        // check pin
        public boolean login(String p) {
            if(pinCode.equals(p)) {
                return true;
            }
            return false;
        }
        
        // show everything
        public void showInfo() {
            System.out.println("ACCOUNT INFO");
            System.out.println("Name: " + name);
            System.out.println("First name: " + firstName());
            System.out.println("Letters: " + letterCount());
            System.out.println("Account: " + accountNum);
            System.out.println("Money: $" + money);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("BANK PROGRAM");
        System.out.print("name: ");
        String userName = input.nextLine();
        System.out.print("account number: ");
        String acc = input.nextLine();
        System.out.print("starting money: ");
        double startMoney = input.nextDouble();
        
        BankAccount myAccount = new BankAccount(userName, acc, startMoney);
        
        // show name stuff
        System.out.println("your name is: " + myAccount.name);
        System.out.println("first name: " + myAccount.firstName());
        System.out.println("name letters: " + myAccount.letterCount());
        
        // check account
        if(!myAccount.goodAccount()) {
            System.out.println("bad account number!");
            return;
        }
        
        // money stuff
        System.out.print("how much deposit? ");
        myAccount.addMoney(input.nextDouble());
        System.out.print("how much withdraw? ");
        myAccount.takeMoney(input.nextDouble());
        
        input.nextLine();
        
        // pin stuff
        System.out.print("make pin: ");
        String userPin = input.nextLine();
        if(!myAccount.makePin(userPin)) {
            System.out.println("pin must be 4 numbers");
            return;
        }
        
        System.out.print("type pin again: ");
        String checkPin = input.nextLine();
        
        if(myAccount.login(checkPin)) {
            System.out.println("LOGIN OK!");
            myAccount.showInfo();
        } else {
            System.out.println("WRONG PIN!");
        }
    }
}
