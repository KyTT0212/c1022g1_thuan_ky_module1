package CaseStudy.Model.Service.Facility;

import CaseStudy.Model.Service.IService;
import CaseStudy.Model.model.Facility.Furama;

public interface IFacilityService extends IService {
    void list(Furama furama);
}
