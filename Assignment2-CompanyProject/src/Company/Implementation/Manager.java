package Company.Implementation;

import Company.Helpers.DetailsUsers.Details;

import java.util.List;

public class Manager extends User {
    private List<User> staffs;
    public Manager(String name, int id, double hourlyRate, int completedHours, List<User> staffs) {
        super(name, id, hourlyRate, completedHours);
        this.staffs = staffs;
    }
    public List<User> getStaffs() {
        return staffs;
    }
    public void setStaffs(List<User> staffs) {
        this.staffs = staffs;
    }
    @Override
    public String getDetails() {
        return super.getDetails() + "\n" + "\nStaff Members :\n" +
                Details.getDetailsUsers(this.staffs) + "\n" ;
    }
}
