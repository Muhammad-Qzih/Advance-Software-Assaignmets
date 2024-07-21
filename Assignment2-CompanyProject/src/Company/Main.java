package Company;

import Company.Database.Database;
import Company.Implementation.Director;
import Company.Implementation.Manager;
import Company.Implementation.Reports.SubClassesReports.DirectorBudgetReport;
import Company.Implementation.Reports.SubClassesReports.DirectorReportStaffs;
import Company.Implementation.Reports.SubClassesReports.MangerBudgetReports;
import Company.Implementation.Reports.SubClassesReports.MangerReportStaffs;
import Company.Implementation.Reports.TemplateReportsGenerator;
import Company.Implementation.Staff;
import Company.Implementation.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        User ahmad    = new Staff("Ahmad", 1100, 3.1, 100);
        User sara     = new Staff("Sara", 1101, 3.2, 101);
        User mohammed = new Staff("Mohammed", 1102, 3.3, 102);
        User lina     = new Staff("Lina", 1103, 3.4, 103);
        User omar     = new Staff("Omar", 1104, 3.5, 104);
        User layla    = new Staff("Layla", 1105, 3.6, 105);
        User khaled   = new Staff("Khaled", 1106, 3.7, 106);
        User rana     = new Staff("Rana", 1107, 3.8, 107);
        User yousef   = new Staff("Yousef", 1108, 3.9, 108);


        Database database  = Database.getInstance("MySql/Url:LocalHost:3000");

        Database.connect(ahmad);
        Database.connect(sara);

        Database.addUser(ahmad);
        Database.addUser(sara);
        Database.addUser(omar);

        Database.disConnect(ahmad);


        User manger = new Manager("Momen", 30000, 10.2, 200, List.of(ahmad, sara, mohammed, lina));
        User director = new Director("Jeahad", 40000, 11.2, 201, List.of(omar, layla, khaled), List.of(rana, yousef, manger));

        System.out.println(manger.getDetails());
        System.out.println("-------------------------------------------------------");

        System.out.println(director.getDetails());

        System.out.println("************************************************************");

        TemplateReportsGenerator TemplateManagerReports = new TemplateReportsGenerator(new MangerReportStaffs(), new MangerBudgetReports());
        System.out.println(TemplateManagerReports.generateTemplateReport(manger));

        TemplateReportsGenerator templateDirectorReports = new TemplateReportsGenerator(new DirectorReportStaffs(), new DirectorBudgetReport());
        System.out.println(templateDirectorReports.generateTemplateReport(director));

    }
}



