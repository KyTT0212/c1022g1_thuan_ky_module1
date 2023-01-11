package Demo2.Model.Service;

import Demo2.Model.Model.CongNhan;
import Demo2.Model.Repository.CongNhanRepo;

public class CongNhanService implements ICongNhanService{
    CongNhanRepo congNhanRepo = new CongNhanRepo();

    @Override
    public void list() {
        congNhanRepo.list();
    }

    @Override
    public void add(CongNhan congNhan) {
        congNhanRepo.add(congNhan);
    }

    @Override
    public CongNhan findById(String id) {
        return congNhanRepo.findById(id);
    }

    @Override
    public void delete(CongNhan congNhan) {
        congNhanRepo.delete(congNhan);
    }
}
