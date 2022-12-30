package CaseStudy.Model.Repository.Facility;

import CaseStudy.Model.model.Facility.Falicity;

public interface IFacilityRepo {
    void displayList();
    void add(Falicity falicity, int number);
    void displayListMaintenance();
}
