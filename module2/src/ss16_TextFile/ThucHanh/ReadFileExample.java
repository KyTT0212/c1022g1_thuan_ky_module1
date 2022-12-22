package ss16_TextFile.ThucHanh;

import java.io.*;

//Tạo lớp ReadFileExample
public class ReadFileExample {
//    Tạo phương thức readFileText với đối số truyền vào là đường dẫn file mà người dùng nhập
    public void readFileText (String filePath){
        try{
            //Đọc file theo đường dẫn
            File file = new File(filePath);
            //Kiểm tra nếu file không tồn tại ném ra ngoại lệ
            if (!file.exists()){
                throw new FileNotFoundException();
            }
//            Đọc file và tiến hành tổng

            //Tạo bộ nhớ đệm
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));


            //Đọc file "line" nếu khác rỗng điều kiện chạy
            String line="";
            int sum = 0;

            //đọc từng phần tử trong chuỗi(bufferedReader.readLine())
            while ((line = bufferedReader.readLine()) !=null){
                System.out.println(line);
                sum = sum+Integer.parseInt(line);
            }
            //Đóng bộ nhớ đệm
            bufferedReader.close();

            //Hiển thị tổng ra mh
            System.out.println("Tổng = "+sum);

        }  catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }catch (Exception e) {
            System.out.println("lỗi");
        }

    }
}
