package section_7;

public class BankAccount {
    private String accountNumber;
    private String accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositingFunds(String accountNumber, String accountBalance) {

        System.out.println("You just called depositingFunds method.");

        try {
            if (accountNumber.equals(this.accountNumber)) {
                int originAccountBalance = Integer.parseInt(this.accountBalance);
                int acceptAccountBalance = Integer.parseInt(accountBalance);
                originAccountBalance += acceptAccountBalance;

                String afterAcBalance = String.valueOf(originAccountBalance);

                this.accountBalance = afterAcBalance;

                System.out.println("after depositingFunds method, accountBalance value is  = " + this.accountBalance);
            } else {
                System.out.println("It is invalid accountNumber, please check account number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("When enter a account number and account balance you have to" +
                    " enter a numeric value. please check your input value again.");
        }
    }

    public void withDrawingFunds(String accountNumber, String accountBalance) {

        System.out.println("You just called withDrawingFunds method.");

        try {
            if (accountNumber.equals(this.accountNumber)) {
                int originAccountBalance = Integer.parseInt(this.accountBalance);
                int acceptAccountBalance = Integer.parseInt(accountBalance);

                if ((originAccountBalance - acceptAccountBalance) <= 0) {
                    System.out.println("The account balance is insufficient.");
                } else {
                    originAccountBalance -= acceptAccountBalance;

                    String afterAcBalance = String.valueOf(originAccountBalance);

                    this.accountBalance = afterAcBalance;

                    System.out.println("after withDrawingFunds method, accountBalance value is  = " + this.accountBalance);
                }
            } else {
                System.out.println("It is invalid accountNumber, please check account number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("When enter a account number and account balance you have to" +
                    " enter a numeric value. please check your input value again.");
        }
    }
}
