package Company.Implementation.Reports.SubClassesReports;

import Company.Helpers.BudgetCalculator.Budget;
import Company.Implementation.Director;
import Company.Implementation.Reports.Reportable;
import Company.Implementation.User;

public class DirectorBudgetReport implements Reportable {
    @Override
    public String Report(User user) {
        Director director = (Director) user;
        return    "Name:" + user.getName() + " ID:" + user.getId() + " Budget:" +
                Budget.calculateBudget(director.getStaffs()) + Budget.calculateBudget(director.getMangers());
    }
}
