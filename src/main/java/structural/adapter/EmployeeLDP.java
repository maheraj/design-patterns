package structural.adapter;

public class EmployeeLDP {

    private String cn;
    private String firstName;
    private String givenName;
    private String emailAddress;

    public EmployeeLDP(String cn, String firstName, String givenName, String emailAddress) {
        this.cn = cn;
        this.firstName = firstName;
        this.givenName = givenName;
        this.emailAddress = emailAddress;
    }

    public String getCn() {
        return cn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}
