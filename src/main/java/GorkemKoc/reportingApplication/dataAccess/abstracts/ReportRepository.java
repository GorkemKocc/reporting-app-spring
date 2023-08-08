package GorkemKoc.reportingApplication.dataAccess.abstracts;

import GorkemKoc.reportingApplication.entities.concretes.Report;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ReportRepository extends JpaRepository<Report,Integer>{

    List<Report> findByPatientIdNumber(String patientIdNumber);
    List<Report> findByPatientFirstNameAndPatientLastName(String patientFirstName, String patientLastName);
    List<Report> findByLaborantFirstNameAndLaborantLastNameContainingIgnoreCase(String laborantFirstName, String laborantLastName);
    //boolean existsByName(String name);
}
