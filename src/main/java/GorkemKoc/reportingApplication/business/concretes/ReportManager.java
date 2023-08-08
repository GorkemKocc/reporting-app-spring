package GorkemKoc.reportingApplication.business.concretes;


import GorkemKoc.reportingApplication.business.abstracts.ReportService;
import GorkemKoc.reportingApplication.business.reponses.*;
import GorkemKoc.reportingApplication.business.requests.CreateReportRequest;
import GorkemKoc.reportingApplication.business.requests.UpdateReportRequest;
import GorkemKoc.reportingApplication.business.rules.ReportBusinessRules;
import GorkemKoc.reportingApplication.core.utilities.mappers.ModelMapperService;
import GorkemKoc.reportingApplication.dataAccess.abstracts.ReportRepository;
import GorkemKoc.reportingApplication.entities.concretes.Report;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ReportManager implements ReportService {
    private ReportRepository reportRepository;
    private ModelMapperService modelMapperService;
    //private ReportBusinessRules reportBusinessRules;

    @Override
    public List<GetAllReportResponse> getAll() {
        List<Report> reports = reportRepository.findAll();
        List<GetAllReportResponse> reportResponse = reports.stream()
                .map(report -> this.modelMapperService.forResponse()
                        .map(report,GetAllReportResponse.class)).collect(Collectors.toList());
        return reportResponse ;
    }

    @Override
    public List<GetByPatientIdNumberResponse>  getByPatientIdNumber(String patientIdNumber) {
        List<Report> reports = this.reportRepository.findByPatientIdNumber(patientIdNumber);

        List<GetByPatientIdNumberResponse> reportResponse = reports.stream()
                .map(report -> this.modelMapperService.forResponse()
                        .map(report, GetByPatientIdNumberResponse.class)).collect(Collectors.toList());
        return reportResponse ;
    }

    @Override
    public List<GetByPatientNameResponse> getByPatientName(String patientFirstName, String patientLastName) {
        List<Report> reports = this.reportRepository.findByPatientFirstNameAndPatientLastName(patientFirstName,patientLastName);

        List<GetByPatientNameResponse> reportResponse = reports.stream()
                .map(report -> this.modelMapperService.forResponse()
                        .map(report, GetByPatientNameResponse.class)).collect(Collectors.toList());
        return reportResponse ;
    }

    @Override
    public List<GetByLaborantNameResponse> getByLaborantName(String laborantFirstName, String laborantLastName) {
        List<Report> reports = this.reportRepository.findByLaborantFirstNameAndLaborantLastNameContainingIgnoreCase(laborantFirstName,laborantLastName);

        List<GetByLaborantNameResponse> reportResponse = reports.stream()
                .map(report -> this.modelMapperService.forResponse()
                        .map(report,GetByLaborantNameResponse.class)).collect(Collectors.toList());
        return reportResponse ;
    }


    @Override
    public List<SortByDescendingReportDateResponse> sortByDescendingReportDate() {
        List<Report> reports = this.reportRepository.findAll(Sort.by(Sort.Direction.DESC, "reportDate"));

        List<SortByDescendingReportDateResponse> reportResponse = reports.stream()
                .map(report -> this.modelMapperService.forResponse()
                        .map(report, SortByDescendingReportDateResponse.class)).collect(Collectors.toList());
        return reportResponse ;
    }

    @Override
    public List<SortByAscendingReportDateResponse> sortByAscendingReportDate() {
        List<Report> reports = this.reportRepository.findAll(Sort.by(Sort.Direction.ASC, "reportDate"));

        List<SortByAscendingReportDateResponse> reportResponse = reports.stream()
                .map(report -> this.modelMapperService.forResponse()
                        .map(report, SortByAscendingReportDateResponse.class)).collect(Collectors.toList());
        return reportResponse ;
    }

    @Override
    public void add(CreateReportRequest createReportRequest) {

        //this.reportBusinessRules.checkIfReportExists(createReportRequest.getFileNumber());

        Report report = this.modelMapperService.forRequest().map(createReportRequest,Report.class);
        this.reportRepository.save(report);
    }

    @Override
    public void update(UpdateReportRequest updateReportRequest) {
        Report report = this.modelMapperService.forRequest().map(updateReportRequest,Report.class);
        this.reportRepository.save(report);
    }

    @Override
    public void delete(int id) {
        this.reportRepository.deleteById(id);
    }

}
