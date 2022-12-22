package ss16_TextFile.BaiTap.DocFile;

public class ListOfCountries {
    private int id;
    private String sign;
    private String countryName;

    public ListOfCountries() {
    }

    public ListOfCountries(int id, String sign, String countryName) {
        this.id = id;
        this.sign = sign;
        this.countryName = countryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "ListOfCountries{" +
                "id=" + id +
                ", sign='" + sign + '\'' +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}
