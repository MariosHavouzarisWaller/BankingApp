// This object is the Account super class
public class Account extends User {

    private long accountNumber;
    private long sortCode;
    private char accountType;
    private double userFunds;
    private boolean directDebit;
    private boolean standingOrder;
    private boolean tax;

    // Constructor
    public Account(long id, String photoId, String addressId, int noOfPersonalAcc, int noOfISAAcc, int noOfBusinessAcc,
                   long accountNumber, long sortCode, char accountType, double userFunds, boolean directDebit, boolean standingOrder, boolean tax) {
        super(id, photoId, addressId, noOfPersonalAcc, noOfISAAcc, noOfBusinessAcc);
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.accountType = accountType;
        this.userFunds = userFunds;
        this.directDebit = directDebit;
        this.standingOrder = standingOrder;
        this.tax = tax;
    }

    // Getter's and Setter's
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getSortCode() {
        return sortCode;
    }

    public void setSortCode(long sortCode) {
        this.sortCode = sortCode;
    }

    public char getAccountType() {
        return accountType;
    }

    public void setAccountType(char accountType) {
        this.accountType = accountType;
    }

    public double getUserFunds() {
        return userFunds;
    }

    public void setUserFunds(double userFunds) {
        this.userFunds = userFunds;
    }

    public boolean isTax() {
        return tax;
    }

    public void setTax(boolean tax) {
        this.tax = tax;
    }

    public boolean isDirectDebit() {
        return directDebit = true;
    }
    public void setDirectDebit(boolean directDebit) {
        this.directDebit = directDebit;
    }

    public boolean isStandingOrder() {
        return standingOrder = true;
    }

    public void setStandingOrder(boolean standingOrder) {
        this.standingOrder = standingOrder;
    }
}