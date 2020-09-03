package hw20200901_issue19;

public class PersonAddress {
    private String address;
    private AddressType type;

    public PersonAddress(String address, AddressType type) {
        this.address = address;
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public AddressType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "address: " + address + ", type: " + type;
    }
}
