public class User {

    // Variables
    private long id;
    private String photoId;
    private String addressId;
    private int noOfPersonalAcc;
    private int noOfISAAcc;
    private int noOfBusinessAcc;

    // Constructor
    public User(long id, String photoId, String addressId, int noOfPersonalAcc, int noOfISAAcc, int noOfBusinessAcc) {
        this.id = id;
        this.photoId = photoId;
        this.addressId = addressId;
        this.noOfPersonalAcc = noOfPersonalAcc;
        this.noOfISAAcc = noOfISAAcc;
        this.noOfBusinessAcc = noOfBusinessAcc;
    }

    // Getters and Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public int getNoOfPersonalAcc() {
        return noOfPersonalAcc;
    }

    public void setNoOfPersonalAcc(int noOfPersonalAcc) {
        this.noOfPersonalAcc = noOfPersonalAcc;
    }

    public int getNoOfISAAcc() {
        return noOfISAAcc;
    }

    public void setNoOfISAAcc(int noOfISAAcc) {
        this.noOfISAAcc = noOfISAAcc;
    }

    public int getNoOfBusinessAcc() {
        return noOfBusinessAcc;
    }

    public void setNoOfBusinessAcc(int noOfBusinessAcc) {
        this.noOfBusinessAcc = noOfBusinessAcc;
    }
}
