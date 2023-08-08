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
public class CreateReportRequest {
    @NotBlank
    @NotNull
    private String fileNumber;

    @NotBlank
    @NotNull
    private String patientFirstName;

    @NotBlank
    @NotNull
    private String patientLastName;

    @Size(min = 11, max = 11, message = "11 Haneli olmalı.")
    @NotBlank
    @NotNull
    private String patientIdNumber;

    @NotBlank
    @NotNull
    private String diagnosisTitle;

    @NotBlank
    @NotNull
    private String diagnosisDetails;

    @NotBlank
    @NotNull
    private LocalDate reportDate;

    @NotBlank
    @NotNull
    private String photoUrl;

    @NotBlank
    @NotNull
    private String laborantId;

}
