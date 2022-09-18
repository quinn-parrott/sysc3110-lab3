
public class BuddyInfo {
    private String name;
    private String number;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public BuddyInfo(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        BuddyInfo buddyInfo = new BuddyInfo("Homer", "123 Bank St", "911");
        System.out.print("Hello ");
        System.out.println(buddyInfo.getName());
    }
}
