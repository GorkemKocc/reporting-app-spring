package GorkemKoc.reportingApplication.business.abstracts;

import GorkemKoc.reportingApplication.business.requests.CreateLaborantRequest;
import GorkemKoc.reportingApplication.business.requests.CreateReportRequest;
import GorkemKoc.reportingApplication.business.requests.UpdateLaborantRequest;
import GorkemKoc.reportingApplication.business.requests.UpdateReportRequest;

public interface LaborantService {
    void add(CreateLaborantRequest createLaborantRequest);
    void update(UpdateLaborantRequest updateLaborantRequest);
    void delete(int id);
}
