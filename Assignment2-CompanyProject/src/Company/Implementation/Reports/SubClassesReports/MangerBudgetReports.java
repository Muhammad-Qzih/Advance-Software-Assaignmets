package Company.Implementation.Reports.SubClassesReports;

import Company.Helpers.BudgetCalculator.Budget;
import Company.Implementation.Manager;
import Company.Implementation.Reports.Reportable;
import Company.Implementation.User;

public class MangerBudgetReports implements Reportable {
    @Override
    public String Report(User user) {
        Manager manger = (Manager) user;
        return    "Name:" + user.getName() + " ID:" + user.getId() + Budget.calculateBudget(manger.getStaffs());
    }
}

