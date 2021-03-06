package de.techdev.trackr.domain.employee.expenses.reports;

import de.techdev.trackr.domain.company.Company;
import de.techdev.trackr.domain.employee.Employee;
import de.techdev.trackr.domain.employee.expenses.TravelExpense;
import de.techdev.trackr.domain.project.Project;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;
import java.util.List;

/**
 * @author Moritz Schulze
 */
public class Projections {
    @Projection(types = Report.class, name = "overview")
    public interface TravelExpenseReportForOverviewProjection {
        Long getId();

        Employee getEmployee();

        Report.Status getStatus();

        List<TravelExpense> getExpenses();

        Date getSubmissionDate();

        Date getApprovalDate();

        Employee getApprover();

        Company getDebitor();

        Project getProject();
    }

    @Projection(types = Report.class, name = "withEmployeeAndExpenses")
    public interface TravelExpenseReportWithEmployeeAndTravelExpensesProjection {
        Long getId();

        Integer getVersion();

        Employee getEmployee();

        List<TravelExpense> getExpenses();

        Report.Status getStatus();

        Date getSubmissionDate();
    }

    @Projection(types = Report.class, name = "withExpensesAndDebitor")
    public interface TravelExpenseReportWithExpensesAndDebitorProjection {
        Long getId();

        Integer getVersion();

        List<TravelExpense> getExpenses();

        Report.Status getStatus();

        Date getSubmissionDate();

        Date getApprovalDate();

        Company getDebitor();
    }

}
