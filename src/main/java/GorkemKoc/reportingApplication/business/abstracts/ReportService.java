package GorkemKoc.reportingApplication.business.abstracts;

import GorkemKoc.reportingApplication.business.reponses.*;
import GorkemKoc.reportingApplication.business.requests.CreateReportRequest;
import GorkemKoc.reportingApplication.business.requests.UpdateReportRequest;

import java.util.List;

public interface ReportService {
    List<GetAllReportResponse> getAll();
    List<GetByPatientIdNumberResponse>  getByPatientIdNumber(String patientIdNumber);
    List<GetByPatientNameResponse> getByPatientName(String patientFirstName, String patientLastName);
   List<GetByLaborantNameResponse> getByLaborantName(String laborantFirstName, String laborantLastName);
    List<SortByDescendingReportDateResponse> sortByDescendingReportDate();
    List<SortByAscendingReportDateResponse> sortByAscendingReportDate();
    void add(CreateReportRequest createReportRequest);
    void update(UpdateReportRequest updateReportRequest);
    void delete(int id);

}
