package Demo2.Model.Repository;

import Demo2.Model.Model.CongNhan;
import Demo2.ReaderWriteFile.ReaderWriteCongNhan;
import sun.awt.image.OffScreenImage;

import java.util.ArrayList;
import java.util.List;

public class CongNhanRepo implements ICongNhanRepo {


//    c1---------------------------------------------------------------------------
    public static List<CongNhan> myListCongNhan = new ArrayList<>();

    @Override
    public void list() {
        for (int i = 0; i <myListCongNhan.size() ; i++) {
            System.out.println(myListCongNhan.get(i));
        }myListCongNhan = ReaderWriteCongNhan.readFileCongNhan();
    }

    @Override
    public void add(CongNhan congNhan) {
        myListCongNhan.add(congNhan);
         ReaderWriteCongNhan.writeCongNhan(myListCongNhan);
    }

    @Override
    public CongNhan findById(String id) {
        return null;
    }

    @Override
    public void delete(CongNhan congNhan) {

    }

//    @Override
//    public CongNhan findById(String id) {
//        for (CongNhan c : myListCongNhan){
//            if (c.getId().equals(c));
//            return c;
//        }
//        return null;
//    }
//
//    @Override
//    public void delete(CongNhan congNhan) {
//        for (int i = 0; i < myListCongNhan.size(); i++) {
//            if (myListCongNhan.get(i).getId().equals(congNhan.getId()));
//            myListCongNhan.remove(myListCongNhan.get(i));
//        }
//    }

////    c2----------------------------------------------------
//@Override
//public void list() {
//    List<CongNhan> myListCongNhan =ReaderWriteCongNhan.readFileCongNhan();
//    for (int i = 0; i <myListCongNhan.size() ; i++) {
//        System.out.println(myListCongNhan.get(i));
//    }
//}
//
//    @Override
//    public void add(CongNhan congNhan) {
//        List<CongNhan> myListCongNhan = new ArrayList<>();
//        myListCongNhan.add(congNhan);
//        ReaderWriteCongNhan.writeCongNhan(myListCongNhan);
//    }
}
