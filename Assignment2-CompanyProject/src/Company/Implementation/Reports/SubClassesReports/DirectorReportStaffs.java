package Company.Implementation.Reports.SubClassesReports;

import Company.Implementation.Reports.Reportable;

import Company.Implementation.User;

public class DirectorReportStaffs implements Reportable {
    @Override
    public String Report(User user) {
        return user.getDetails();
    }

}

