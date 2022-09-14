        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

// This will act as the main class where we initialise everything in the Banking App
public class Main {

    public static void main(String[] args) {
        // PERSONAL ACCOUNT DEFAULT DATA SECTION START
        // This creates default Personal Account info for the admin to check
        List paList = new ArrayList<User>();
        Scanner scan = new Scanner(System.in);

        PersonalAccount pa1 = new PersonalAccount(1, "tempPhotoId", "tempAddressId", 1,
                2, 3, 2, 1, 'd', 5,
                false, false, false, 5, false, 5);
        PersonalAccount pa2 = new PersonalAccount(2, "tempPhotoId", "tempAddressId", 1,
                2, 3, 2, 1, 'd', 5,
                false, false, false, 5, false, 5);
        PersonalAccount pa3 = new PersonalAccount(3, "tempPhotoId", "tempAddressId", 1,
                2, 3, 2, 1, 'd', 5,
                false, false, false, 5, false, 5);
        ISAAccount pa4 = new ISAAccount(4,"tempPhotoId", "tempAddressId", 1, 3,
                0, 1, 1, 'd', 5, true, false, false,
                true, false, true, true, false, 15000, 22);
        ISAAccount pa5 = new ISAAccount(5,"tempPhotoId", "tempAddressId", 1, 4,
                0, 1, 1, 'd', 5, false, false, false,
                true, true, true, true, true, 7777, 40);
        ISAAccount pa6 = new ISAAccount(6,"tempPhotoId", "tempAddressId", 1, 2,
                2, 4, 1, 'd', 5, true, false, false,
                true, false, true, false, false, 2000, 69);
        paList.add(pa1);
        paList.add(pa2);
        paList.add(pa3);
        paList.add(pa4);
        paList.add(pa5);
        paList.add(pa6);

        // Output the results of one of the Personal Accounts created
        System.out.println("ID: " + pa1.getId() + "\nPhoto ID: " + pa1.getPhotoId() + "\nAddress ID:" + pa1.getAddressId() + "\nNumber of Personal Accounts: " + pa1.getNoOfPersonalAcc() + "\nNumber of ISA Accounts: " +
                pa1.getNoOfISAAcc() + "\nNumber of Business Accounts: " + pa1.getNoOfBusinessAcc() + "\nAccount Number: " + pa1.getAccountNumber() + "\nSort Code: " + pa1.getSortCode() + "\nTax: " +
                pa1.getAccountType() + "\nUser Funds: " + pa1.getUserFunds() + "\nDirect Debit: " + pa1.isDirectDebit() + "\nStanding Orders: " + pa1.isStandingOrder() + "\nTax: " +
                pa1.isTax() + "\nMinimum Charge: " + pa1.getMinimumCharge() + "\nDebt: " + pa1.isInDebt() + "\nCharges: " + pa1.getCharges() + "\n\n\n");

        // PERSONAL ACCOUNT DEFAULT DATA SECTION END
    }
}
