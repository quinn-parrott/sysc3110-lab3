import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    public boolean removeBuddy(BuddyInfo buddy) {
        return buddies.remove(buddy);
    }

    public boolean addBuddy(BuddyInfo buddy) {
        return buddies.add(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
