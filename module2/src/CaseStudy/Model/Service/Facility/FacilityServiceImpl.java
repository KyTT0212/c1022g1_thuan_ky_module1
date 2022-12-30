package CaseStudy.Model.Service.Facility;

import CaseStudy.Model.Repository.Facility.FacilityRepo;
import CaseStudy.Model.model.Facility.Falicity;

public class FacilityServiceImpl implements IFacilityService{
   FacilityRepo facilityRepo = new FacilityRepo();

    @Override
    public void displayList() {
        facilityRepo.displayList();
    }

    @Override
    public void add(Falicity falicity, int number) {
        facilityRepo.add(falicity,number);
    }

    @Override
    public void displayListMaintenance() {
        facilityRepo.displayListMaintenance();
    }
}
