package structural.adapter;

public class EmployeeAdapterLDP implements IEmployee{

    private EmployeeLDP instance;

    public EmployeeAdapterLDP(EmployeeLDP instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getFirstName();
    }

    @Override
    public String getLastName() {
        return instance.getGivenName();
    }

    @Override
    public String getEmailAddress() {
        return instance.getEmailAddress();
    }

    public String toString() {
        return "ID: " + instance.getCn();
    }
}
