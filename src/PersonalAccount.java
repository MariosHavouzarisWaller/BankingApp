// This object is for the Personal Account abstract class
public class PersonalAccount extends Account {
    private double minimumCharge;
    private boolean inDebt;
    private double charges;

    // Constructor
    public PersonalAccount(long id, String photoId, String addressId, int noOfPersonalAcc,
                           int noOfISAAcc, int noOfBusinessAcc, long accountNumber, long sortCode,
                           char accountType, double userFunds, boolean directDebit, boolean standingOrder,
                           boolean tax, double minimumCharge, boolean inDebt, double charges) {
        super(id, photoId, addressId, noOfPersonalAcc, noOfISAAcc, noOfBusinessAcc, accountNumber, sortCode, accountType, userFunds, directDebit, standingOrder, tax);
        this.minimumCharge = minimumCharge;
        this.inDebt = inDebt;
        this.charges = charges;
    }

    // Getter's and Setter's
    public double getMinimumCharge() {
        return minimumCharge = 1.0;
    }

    public void setMinimumCharge(double minimumCharge) {
        this.minimumCharge = minimumCharge;
    }

    public boolean isInDebt() {
        if (getUserFunds() < 0) {
            return inDebt = true;
        }
        else {
            return inDebt = false;
        }
    }

    public void setInDebt(boolean inDebt) {
        this.inDebt = inDebt;
    }

    public double getCharges() {
        if (isInDebt() == true) {
            charges = getUserFunds() * (-0.3);
            return charges;
        } else {
            return 0;
        }
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }
}