package GorkemKoc.reportingApplication.webApi.controllers;

import GorkemKoc.reportingApplication.business.abstracts.LaborantService;
import GorkemKoc.reportingApplication.business.abstracts.ReportService;
import GorkemKoc.reportingApplication.business.reponses.*;

import GorkemKoc.reportingApplication.business.requests.CreateReportRequest;

import GorkemKoc.reportingApplication.business.requests.UpdateReportRequest;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RequestMapping("/report")
@RestController
@CrossOrigin
public class ReportsController {
    private ReportService reportService;


    @GetMapping("/getAll")
    public List<GetAllReportResponse> getAll() {
        return reportService.getAll();
    }


    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody() @Valid CreateReportRequest createReportRequest) {
        this.reportService.add(createReportRequest);
    }


    @GetMapping("/getByPatientIdNumber")
    public List<GetByPatientIdNumberResponse> getByPatientIdNumber(@RequestParam String patientIdNumber) {
        return reportService.getByPatientIdNumber(patientIdNumber);
    }

    @GetMapping("/getByPatientName")
    public List<GetByPatientNameResponse> getByPatientName(@RequestParam String patientFirstName, String patientLastName) {
        return reportService.getByPatientName(patientFirstName, patientLastName);
    }

    @GetMapping("/getByLaborantName")
    public List<GetByLaborantNameResponse> getByLaborantName(@RequestParam String laborantFirstName, String laborantLastName) {
        return reportService.getByLaborantName(laborantFirstName, laborantLastName);
    }

    @GetMapping("/sortByAscendingReportDate")
    public List<SortByAscendingReportDateResponse> sortByAscendingReportDate() {
        return reportService.sortByAscendingReportDate();
    }

    @GetMapping("/sortByDescendingReportDate")
    public List<SortByDescendingReportDateResponse> sortByDescendingReportDates() {
        return reportService.sortByDescendingReportDate();
    }

    @PutMapping("/update")
    public void update(@RequestBody() @Valid UpdateReportRequest updateReportRequest) {
        this.reportService.update(updateReportRequest);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam int id) {
        this.reportService.delete(id);
    }

}
