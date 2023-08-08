package GorkemKoc.reportingApplication.business.concretes;

import GorkemKoc.reportingApplication.business.abstracts.LaborantService;
import GorkemKoc.reportingApplication.business.requests.CreateLaborantRequest;
import GorkemKoc.reportingApplication.business.requests.UpdateLaborantRequest;
import GorkemKoc.reportingApplication.business.rules.LaborantBusinessRules;
import GorkemKoc.reportingApplication.core.utilities.mappers.ModelMapperService;
import GorkemKoc.reportingApplication.dataAccess.abstracts.LaborantRepository;
import GorkemKoc.reportingApplication.dataAccess.abstracts.ReportRepository;
import GorkemKoc.reportingApplication.entities.concretes.Laborant;
import GorkemKoc.reportingApplication.entities.concretes.Report;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class LaborantManager implements LaborantService {
    private LaborantRepository laborantRepository;
    private ModelMapperService modelMapperService;
    private LaborantBusinessRules laborantBusinessRules;

    @Override
    public void add(CreateLaborantRequest createLaborantRequest) {

        Laborant laborant = this.modelMapperService.forRequest().map(createLaborantRequest,Laborant.class);
        this.laborantRepository.save(laborant);
    }

    @Override
    public void update(UpdateLaborantRequest updateLaborantRequest) {
        Laborant laborant = this.modelMapperService.forRequest().map(updateLaborantRequest,Laborant.class);
        this.laborantRepository.save(laborant);
    }

    @Override
    public void delete(int id) {
        this.laborantRepository.deleteById(id);
    }
}
