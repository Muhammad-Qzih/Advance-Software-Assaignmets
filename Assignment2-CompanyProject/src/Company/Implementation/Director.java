package Company.Implementation;

import Company.Helpers.DetailsUsers.Details;

import java.util.List;
public class Director extends User {
    private List<User> mangers;
    private List<User> staffs;
    public Director(String name, int id, double hourlyRate, int completedHours, List<User> mangers, List<User> staffs) {
        super(name, id, hourlyRate, completedHours);
        this.mangers = mangers;
        this.staffs = staffs;
    }
    public List<User> getMangers() {
        return this.mangers;
    }
    public List<User> getStaffs() {
        return this.staffs;
    }
    @Override
    public String getDetails() {
        return super.getDetails() + "\n" + "\nStaff Members :\n" +
                Details.getDetailsUsers(this.staffs) + "\n" + "Mangers: \n" + Details.getDetailsUsers(this.mangers);
    }
}
