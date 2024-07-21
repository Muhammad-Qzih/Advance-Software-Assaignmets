package Company.Helpers.DetailsUsers;

import Company.Implementation.User;

import java.util.List;
public class Details {
    public static String getDetailsUsers(List<User> users) {
        StringBuilder informationStaffs = new StringBuilder();
        for (User staff : users) {
            informationStaffs.append(staff.getName()).append(":\n");
            informationStaffs.append("ID: ").append(staff.getId()).append("\n");
            informationStaffs.append("Hourly Rate: $").append(staff.getHourlyRate()).append("\n");
            informationStaffs.append("Completed Hours: ").append(staff.getCompletedHours()).append("\n\n");
        }
        return informationStaffs.toString();
    }
}
