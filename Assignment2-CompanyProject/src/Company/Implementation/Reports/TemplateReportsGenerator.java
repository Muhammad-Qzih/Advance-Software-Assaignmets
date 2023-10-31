package Company.Implementation.Reports;

import Company.Implementation.User;

public class TemplateReportsGenerator {
    private Reportable[] template = null;

    public TemplateReportsGenerator(Reportable... reports) {
        this.template = reports;
    }

    public String endTemplateBorder() {
        String endTemplate = "EDN OF TEMPLATE";
        String border = "******************************";
        return border + " " + endTemplate + " " + border;
    }

    public String beginningTemplateBorder() {
        String beginningTemplate = "BEGINNING OF TEMPLATE";

        String border = "******************************";
        return border + " " + beginningTemplate + " " + border;
    }

    public String generateTemplateReport(User User) {

        StringBuilder multipleReports = new StringBuilder();

        multipleReports.append(beginningTemplateBorder()).
                append("\n").append("Reports for ")
                .append(User.getName())
                .append(":\n");

        int index = 1;
        for (Reportable report : this.template) {

            multipleReports.
                    append("Report").
                    append(index).append(" :\n").
                    append(report.Report(User)).
                    append("\n");

            index += 1;
        }

        return multipleReports.append(endTemplateBorder()).toString();
    }
}
