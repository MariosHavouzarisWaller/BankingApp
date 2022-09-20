import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// This will act as the main class where we initialise everything in the Banking App
public class Main {

    public static void main(String[] args) {
        // PERSONAL ACCOUNT DEFAULT DATA SECTION START
        // This creates default Personal Account info for the admin to check
        List paList = new ArrayList<User>();

        PersonalAccount pa1 = new PersonalAccount(1, "tempPhotoId", "tempAddressId", 1, 2, 3, 2, 1, 'd', 5, false, false, false, 5, false, 5);
        PersonalAccount pa2 = new PersonalAccount(2, "tempPhotoId", "tempAddressId", 1, 2, 3, 2, 1, 'd', 5, false, false, false, 5, false, 5);
        PersonalAccount pa3 = new PersonalAccount(3, "tempPhotoId", "tempAddressId", 1, 2, 3, 2, 1, 'd', 5, false, false, false, 5, false, 5);

        paList.add(pa1);
        paList.add(pa2);
        paList.add(pa3);

        // Output the results of one of the Personal Accounts created (test)
//        System.out.println("ID: " + pa1.getId() + "\nPhoto ID: " + pa1.getPhotoId() + "\nAddress ID:" + pa1.getAddressId() + "\nNumber of Personal Accounts: " + pa1.getNoOfPersonalAcc() + "\nNumber of ISA Accounts: " +
//                pa1.getNoOfISAAcc() + "\nNumber of Business Accounts: " + pa1.getNoOfBusinessAcc() + "\nAccount Number: " + pa1.getAccountNumber() + "\nSort Code: " + pa1.getSortCode() + "\nTax: " +
//                pa1.getAccountType() + "\nUser Funds: " + pa1.getUserFunds() + "\nDirect Debit: " + pa1.isDirectDebit() + "\nStanding Orders: " + pa1.isStandingOrder() + "\nTax: " +
//                pa1.isTax() + "\nMinimum Charge: " + pa1.getMinimumCharge() + "\nDebt: " + pa1.isInDebt() + "\nCharges: " + pa1.getCharges() + "\n\n\n");



        // PERSONAL ACCOUNT DEFAULT DATA SECTION END

        // Business Account Default Data
        List baList = new ArrayList<User>();

        BusinessAccount ba1 = new BusinessAccount(1,"tempPhotoId", "tempAddressId", 1, 2, 1, 2432, 432, 'b',32, true,  true,  true, true,"tempBannedBusiness","private", true,10000,5000);
        BusinessAccount ba2 = new BusinessAccount(2,"tempPhotoId", "tempAddressId", 1, 2, 1, 2432, 432, 'b',32, true,  true,  true, true,"tempBannedBusiness","private", true,10000,5000);
        BusinessAccount ba3 = new BusinessAccount(3,"tempPhotoId", "tempAddressId", 1, 2, 1, 2432, 432, 'b',32, true,  true,  true, true,"tempBannedBusiness","private", true,10000,5000);

        baList.add(ba1);
        baList.add(ba2);
        baList.add(ba3);
        //output the results of default business Account (test)
//        System.out.println("ID:" + ba1.getId() + "\nPhoto ID: " + ba1.getPhotoId() + "\nAddress ID:" + ba1.getAddressId() + "\nNumber of Personal Accounts: " + ba1.getNoOfPersonalAcc() + "\nNumber of ISA Accounts: " +
//                ba1.getNoOfISAAcc() + "\nNumber of Business Accounts: " + ba1.getNoOfBusinessAcc() + "\nAccount Number: " + ba1.getAccountNumber() + "\nSort Code: " + ba1.getSortCode() + "\nTax: " +
//                ba1.getAccountType() + "\nUser Funds: " + ba1.getUserFunds() + "\nDirect Debit: " + ba1.isDirectDebit() + "\nStanding Orders: " + ba1.isStandingOrder() + "\nTax: " +
//                ba1.isTax() + "\nBusinessProof" +getBusinessProof() +"\nBannedBuisness" + getBannedBuisness() + "\nBusinessSector" getBusinessSector()+ "\nChequebookReq"
//                getChequebookReq() +"\nOverdraft" getOverdraft() +"\nLoanValue" getLoanValue() + "\n\n\n");
        // BUSINESS ACCOUNT DEFAULT DATA SECTION END

        // ISA ACCOUNT DEFAULT DATA SECTION START
        List iaList = new ArrayList<User>();

        ISAAccount ia1 = new ISAAccount(1,"tempPhotoId", "tempAddressId", 1, 3, 0, 1, 1, 'd', 5, true, false, false, true, false, true, true, false, 15000, 22);
        ISAAccount ia2 = new ISAAccount(2,"tempPhotoId", "tempAddressId", 1, 4, 0, 1, 1, 'd', 5, false, false, false, true, true, true, true, true, 7777, 40);
        ISAAccount ia3 = new ISAAccount(3,"tempPhotoId", "tempAddressId", 1, 2, 2, 4, 1, 'd', 5, true, false, false, true, false, true, false, false, 2000, 69);

        paList.add(iaList);
        paList.add(iaList);
        paList.add(iaList);
        // ISA ACCOUNT DEFAULT DATA SECTION END#

        // LOGIN SYSTEM
        String userName = "admin";
        String password = "admin";

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter username: ");
        String enteredUsername = reader.nextLine().toLowerCase().trim();
        System.out.print("Enter password: ");
        String enteredPassword = reader.nextLine();

        if (userName.equals(enteredUsername) && (password.equals(enteredPassword))){
            System.out.println("User Authorised");

            // Menu for choosing an account
            System.out.println(" ## Main Menu ## ");
            System.out.println("1. Search Personal Account");
            System.out.println("2. Search ISA Account");
            System.out.println("3. Search Business Account");
            System.out.println("x. Exit Program");

            System.out.println("Make your entry (1, 2, 3, 4)");
            int userEntry = reader.nextInt();
            if (userEntry == 1) {
                System.out.println("Enter ID: ");
                int idEntry = reader.nextInt();
                if (idEntry < paList.size()) {
                    System.out.println(paList.get(userEntry - 1));
                }
            }
            if (userEntry == 2) {
                System.out.println("Enter ID: ");
                int idEntry = reader.nextInt();
                if (idEntry < iaList.size()) {
                    System.out.println(iaList.get(userEntry - 1));
                }
            }
            if (userEntry == 3) {
                System.out.println("Enter ID: ");
                int idEntry = reader.nextInt();
                if (idEntry < baList.size()) {
                    System.out.println(baList.get(userEntry - 1));
                }
            }
            if (userEntry == 4) {
                System.out.println("Exiting Program");
                System.exit(0);
            }
        }
        else {
            System.out.println("Invalid username/password");
        }
    }
}
