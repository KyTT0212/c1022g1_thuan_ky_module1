package Demo2.Model.Repository;

import Demo2.Model.Model.CongNhan;

public interface ICongNhanRepo {
    void list();
    void add(CongNhan congNhan);
    CongNhan findById(String id);
    void delete(CongNhan congNhan);
}
