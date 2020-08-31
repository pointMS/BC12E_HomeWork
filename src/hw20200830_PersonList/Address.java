package hw20200830_PersonList;

public class Address {
    private String post;
    private String mail;
    private String ip;

    public Address(String post, String mail, String ip) {
        this.post = post;
        this.mail = mail;
        this.ip = ip;
    }

    public Address(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return  mail;
    }

}
