package GorkemKoc.reportingApplication.entities.concretes;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Table(name="reports")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name="fileNumber")
    private String fileNumber;
    @Column(name="patientFirstName")
    private String patientFirstName;
    @Column(name="patientLastName")
    private String patientLastName;
    @Column(name="patientIdNumber")
    private String patientIdNumber;
    @Column(name = "diagnosisTitle")
    private String diagnosisTitle;
    @Column(name = "diagnosisDetails" , length = 500)
    private String diagnosisDetails;
    @Column(name = "reportDate")
    private LocalDate reportDate;
    @Column(name = "photoUrl")
    private String photoUrl;

    @ManyToOne
    @JoinColumn(name = "laborant_id")
    private Laborant laborant;

}
