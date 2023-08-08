package GorkemKoc.reportingApplication.business.rules;

import GorkemKoc.reportingApplication.core.exceptions.BusinessExepction;
import GorkemKoc.reportingApplication.dataAccess.abstracts.ReportRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ReportBusinessRules {
    private ReportRepository reportRepository;

    /*public void checkIfReportExists(String fileNumber){
        if(this.reportRepository.existsByName(fileNumber)){
            throw new BusinessExepction("Report already exists");
        }
    }*/
}
