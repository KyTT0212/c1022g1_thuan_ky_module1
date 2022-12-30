package CaseStudy;

public class RegexExpression {
    //    Mã dịch vụ villa
    private static final String REGEX_SERVIVEVILLA = "^[SV][VL]/-[0-9]{4}$";
    //    Mã dịch vụ room
    private static final String REGEX_SERVIVEROOM = "^[SV][RO]/-[0-9]{4}$";
    //    Tên dịch vụ
    private static final String REGEX_SERVIVENAME = "^[A-Z][a-z]+$";
    //    Diện tích sử dụng
    private static final String REGES_USABLEAREA = "^[3-9][0-9]{1,5}$";
    //    Diện tích hồ bơi
    private static final String REGES_SWIMMINGAREA = "^[3-9][0-9]{1,5}$";
    //    Chi phí thuê
    private static final String REGES_PRICE = "^[1-9][0-9]+$";
    //    Số lượng người tối đa
    private static final String REGES_PEOPLEMAXIMUM = "^[0-1][1-9]|10$";
    //    Số tầng
    private static final String REGEX_NUMFLOORS = "^[0-9]+$";
    //    Kiểu thuê
    private static final String REGEX_RENTALTYPE = "^[A-Z][a-z]+$";
    //    Tiêu chuẩn phòng
    private static final String REGEX_STANDARD = "^[A-Z][a-z]+$";
}
