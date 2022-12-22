package baiTapCodegymModule2.Exeception.exception1;


//Bài 1:
//Viết chương trình nhập vào 2 số thực. Bắt ngoại lệ để khi nhập vào không phải là số.
//Cài đặt hàm chia, trong đó bắt ngoại lệ nếu số chia là 0 thì thông báo phép chia không hợp lệ và kết thúc chương trình.


public class exception1 extends Exception {
    exception1(String str ){   //truyen tam so->(kdl tham so), co the rong
        super(str);//neu truyen tham so-> super(tham so)
    }

    public exception1() {

    }
}
