package Company.Implementation.Reports.SubClassesReports;

import Company.Implementation.Reports.Reportable;

import Company.Implementation.User;

public class MangerReportStaffs implements Reportable {
    @Override
    public String Report(User user) {
        return user.getDetails();
    }
}
