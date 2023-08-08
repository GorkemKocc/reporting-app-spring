package GorkemKoc.reportingApplication.business.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateReportRequest {
    @NotNull
    @NotBlank
    private int id;
    private String fileNumber;
    private String patientFirstName;
    private String patientLastName;
    @Size(min = 11, max = 11, message = "11 Haneli olmalı.")
    @NotBlank
    @NotNull
    private String patientIdNumber;
    private String diagnosisTitle;
    private String diagnosisDetails;
    private LocalDate reportDate;
    private String photoUrl;
    private String laborantId;
    private String laborantName;
}
