package Demo2.Model.Service;

import Demo2.Model.Model.CongNhan;

public interface ICongNhanService {
    void list();
    void add(CongNhan congNhan);
    CongNhan findById(String id);
    void delete(CongNhan congNhan);
}
