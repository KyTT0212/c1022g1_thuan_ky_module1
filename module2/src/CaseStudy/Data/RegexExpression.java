package CaseStudy.Data;

public class RegexExpression {
    //    Mã dịch vụ villa
    public static final String REGEX_SERVICEVILLA = "^[SV][VL]/-[0-9]{4}$";
    //    Mã dịch vụ room
    public static final String REGEX_SERVICEROOM = "^[SV][RO]/-[0-9]{4}$";
    //    Tên dịch vụ
    public static final String REGEX_SERVICENAME = "^[A-Z][a-z]+$";
    //    Diện tích sử dụng
    public static final String REGES_USABLEAREA = "^[3-9][0-9]{1,5}$";
    //    Diện tích hồ bơi
    public static final String REGES_SWIMMINGAREA = "^[3-9][0-9]{1,5}$";
    //    Chi phí thuê
    public static final String REGES_PRICE = "^[1-9][0-9]+$";
    //    Số lượng người tối đa
    public static final String REGES_PEOPLEMAXIMUM = "^[0-1][1-9]|10$";
    //    Số tầng
    public static final String REGEX_NUMFLOORS = "^[0-9]+$";
    //    Kiểu thuê
    public static final String REGEX_RENTALTYPE = "^[A-Z][a-z]+$";
    //    Tiêu chuẩn phòng
    public static final String REGEX_STANDARD = "^[A-Z][a-z]+$";

}
