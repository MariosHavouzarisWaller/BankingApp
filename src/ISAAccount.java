public class ISAAccount extends Account {

    private boolean cashAccount;

    private boolean stockAccount;

    private boolean innovativeAccount;

    private boolean lifetimeAccount;

    private boolean liveOverseas;

    private double maxValue;

    private int ageRange;

    public ISAAccount(long id, String photoId, String addressId, int noOfPersonalAcc, int noOfISAAcc, int noOfBusinessAcc, long accountNumber, long sortCode, char accountType, double userFunds, boolean directDebit, boolean standingOrder, boolean tax, boolean cashAccount, boolean stockAccount, boolean innovativeAccount, boolean lifetimeAccount, boolean liveOverseas, double maxValue, int ageRange) {
        super(id, photoId, addressId, noOfPersonalAcc, noOfISAAcc, noOfBusinessAcc, accountNumber, sortCode, accountType, userFunds, directDebit, standingOrder, tax);
        this.cashAccount = cashAccount;
        this.stockAccount = stockAccount;
        this.innovativeAccount = innovativeAccount;
        this.lifetimeAccount = lifetimeAccount;
        this.liveOverseas = liveOverseas;
        this.maxValue = maxValue;
        this.ageRange = ageRange;
    }



    public boolean isCashAccount() {
        return cashAccount;
    }

    public void setCashAccount(boolean cashAccount) {
        this.cashAccount = cashAccount;
    }

    public boolean isStockAccount() {
        return stockAccount;
    }

    public void setStockAccount(boolean stockAccount) {
        this.stockAccount = stockAccount;
    }

    public boolean isInnovativeAccount() {
        return innovativeAccount;
    }

    public void setInnovativeAccount(boolean innovativeAccount) {
        this.innovativeAccount = innovativeAccount;
    }

    public boolean isLifetimeAccount() {
        return lifetimeAccount;
    }

    public void setLifetimeAccount(boolean lifetimeAccount) {
        this.lifetimeAccount = lifetimeAccount;
    }

    public boolean isLiveOverseas() {
        return liveOverseas;
    }

    public void setLiveOverseas(boolean liveOverseas) {
        this.liveOverseas = liveOverseas;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    public int getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(int ageRange) {
        this.ageRange = ageRange;
    }
}
