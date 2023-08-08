package GorkemKoc.reportingApplication.business.reponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SortByDescendingReportDateResponse {
    private int id;
    private String fileNumber;
    private String patientFirstName;
    private String patientLastName;
    private String patientIdNumber;
    private String diagnosisTitle;
    private String diagnosisDetails;
    private LocalDate reportDate;
    private String photoUrl;
    private int laborantId;
    private String laborantFirstName;
    private String laborantLastName;
}
