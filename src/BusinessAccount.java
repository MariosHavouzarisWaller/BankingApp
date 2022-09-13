public class BusinessAccount extends Account{

    private boolean businessProof;

    private String bannedBuisness;

    private String businessSector;

    private boolean chequebookReq;

    private double overdraft;

    private double loanValue;

    public BusinessAccount(long accountNumber, long sortCode, char accountType, double userFunds, boolean directDebit, boolean standingOrder, boolean tax){
        super(accountNumber, sortCode, accountType, userFunds, directDebit, standingOrder, tax);
        this.businessProof = businessProof;
        this.bannedBuisness = bannedBuisness;
        this.businessSector = businessSector;
        this.chequebookReq = chequebookReq;
        this.overdraft = overdraft;
        this.loanValue = loanValue;
    }

}

