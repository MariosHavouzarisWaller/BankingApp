// This object is for the Personal Account abstract class
public class PersonalAccount extends Account {
    public PersonalAccount(long accountNumber, long sortCode, char accountType, double userFunds, boolean directDebit, boolean standingOrder, boolean tax) {
        super(accountNumber, sortCode, accountType, userFunds, directDebit, standingOrder, tax);
    }
}
