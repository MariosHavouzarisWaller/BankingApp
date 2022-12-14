public class BusinessAccount extends Account{
    private boolean businessProof;
    private String bannedBusiness;
    private String businessSector;
    private boolean chequebookReq;
    private double overdraft;
    private double loanValue;

    public BusinessAccount(long id, String photoId, String addressId, int noOfPersonalAcc, int noOfISAAcc, int noOfBusinessAcc, long accountNumber, long sortCode, char accountType, double userFunds, boolean directDebit, boolean standingOrder, boolean tax, boolean businessProof, String bannedBusiness, String businessSector, boolean chequebookReq, double overdraft, double loanValue) {
        super(id, photoId, addressId, noOfPersonalAcc, noOfISAAcc, noOfBusinessAcc, accountNumber, sortCode, accountType, userFunds, directDebit, standingOrder, tax);
        this.businessProof = businessProof;
        this.bannedBusiness = bannedBusiness;
        this.businessSector = businessSector;
        this.chequebookReq = chequebookReq;
        this.overdraft = overdraft;
        this.loanValue = loanValue;
    }
    public boolean getBusinessProof()
    {return businessProof;}
    public void setBusinessProof(boolean businessProof){this.businessProof = businessProof;}
    public String getBannedBuisness(){return bannedBusiness;}
    public void setBannedBuisness (String bannedBuisness){this.bannedBusiness = bannedBuisness;}
    public String getBusinessSector (){return businessSector;}
    public void setBusinessSector(String businessSector){this.businessSector = businessSector;}
    public boolean getChequebookReq (){return chequebookReq;}
    public void setChequebookReq (boolean chequebookReq){this.chequebookReq = chequebookReq;}
    public double getOverdraft() {return overdraft;}
    public void setOverdraft(double overdraft) {this.overdraft = overdraft;}
    public double getLoanValue() {return loanValue = 10.0;}
    public void setLoanValue(double loanValue) {this.loanValue = loanValue;}
}

