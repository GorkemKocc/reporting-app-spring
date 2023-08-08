package GorkemKoc.reportingApplication.business.rules;

import GorkemKoc.reportingApplication.core.exceptions.BusinessExepction;
import GorkemKoc.reportingApplication.dataAccess.abstracts.LaborantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class LaborantBusinessRules {
    private LaborantRepository laborantRepository;

}
