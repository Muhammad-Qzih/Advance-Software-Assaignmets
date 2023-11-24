package Company.Helpers.BudgetCalculator;

import Company.Implementation.User;

import java.util.List;

public class Budget {
    public static double earningsCalculator(User user) {
        return user.getHourlyRate() * user.getCompletedHours();
    }

    public static double calculateBudget(List<User> users) {
        double budget = 0.0;
        for (User staff : users) {
            budget += earningsCalculator(staff);
        }
        return budget;
    }

}
