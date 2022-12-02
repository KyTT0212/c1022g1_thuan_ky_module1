import java.util.Scanner;

public class ung_dung_doc_so_thanh_chu {
    public static void main(String[] arga){
        Scanner sc= new Scanner(System.in);
        System.out.print("moi ban nhap vao so can doc");
        String number=sc.nextLine();
        if(number.length()==1){
            switch (number){
                case "0":
                    System.out.print("Zero");
                    break;
                case "1":
                    System.out.print("One");
                    break;
                case "2":
                    System.out.print("Two");
                    break;
                case "3":
                    System.out.print("Three");
                    break;
                case "4":
                    System.out.print("Four");
                    break;
                case "5":
                    System.out.print("Five");
                    break;
                case "6":
                    System.out.print("Six");
                    break;
                case "7":
                    System.out.print("Seven");
                    break;
                case "8":
                    System.out.print("Eight");
                    break;
                case "9":
                    System.out.print("Nice");
                    break;
                default:
                    System.out.print("out of ability");

            }
        }else if(number.length()==2){
            if(Integer.parseInt(number)<20){
                switch (number){
                    case "10":
                        System.out.print("Ten");
                        break;
                    case "11":
                        System.out.print("Eleven");
                        break;
                    case "12":
                        System.out.print("Twelve");
                        break;
                    case "13":
                        System.out.print("Thirteen");
                        break;
                    case "14":
                        System.out.print("Fourteen");
                        break;
                    case "15":
                        System.out.print("Fiveteen");
                        break;
                    case "16":
                        System.out.print("Sixteen");
                        break;
                    case "17":
                        System.out.print("Seventeen");
                        break;
                    case "18":
                        System.out.print("Eigthteen");
                        break;
                    case "19":
                        System.out.print("Nineteen");
                        break;

                }
            }else if (Integer.parseInt(number)>=20 && Integer.parseInt(number)<100){
                int tens=Integer.parseInt(number)/10;
                int ones=Integer.parseInt(number)%10;
                switch (tens){
                    case 2:
                        System.out.print("Twenty");
                        break;
                    case 3:
                        System.out.print("Thirty");
                        break;
                    case 4:
                        System.out.print("Forty");
                        break;
                    case 5:
                        System.out.print("Fifty");
                        break;
                    case 6:
                        System.out.print("Sixty");
                        break;
                    case 7:
                        System.out.print("Seventy");
                        break;
                    case 8:
                        System.out.print("Eighty");
                        break;
                    case 9:
                        System.out.print("Ninety");
                        break;
                }
                switch (ones){
                    case 0:
                        break;
                    case 1:
                        System.out.print("one");
                        break;
                    case 2:
                        System.out.print("two");
                        break;
                    case 3:
                        System.out.print("three");
                        break;
                    case 4:
                        System.out.print("four");
                        break;
                    case 5:
                        System.out.print("five");
                        break;
                    case 6:
                        System.out.print("six");
                        break;
                    case 7:
                        System.out.print("seven");
                        break;
                    case 8:
                        System.out.print("eight");
                        break;
                    case 9:
                        System.out.print("nice");
                        break;
                }
            }else if(Integer.parseInt(number)>=100 && Integer.parseInt(number)<1000){
                switch (Integer.parseInt(number)/100){
                    case 1:
                        System.out.print("One hundred ");
                        break;
                    case 2:
                        System.out.print("Two hundred ");
                        break;
                    case 3:
                        System.out.print("Three hundred ");
                        break;
                    case 4:
                        System.out.print("Four hundred ");
                        break;
                    case 5:
                        System.out.print("Five hundred ");
                        break;
                    case 6:
                        System.out.print("Six hundred ");
                        break;
                    case 7:
                        System.out.print("Seven hundred ");
                        break;
                    case 8:
                        System.out.print("Eight hundred ");
                        break;
                    case 9:
                        System.out.print("Nine hundred ");
                        break;
                }
                switch (Integer.parseInt(number)/10){
                    case 1:
                        System.out.print("Ten");
                    case 2:
                        System.out.print("Twenty");
                        break;
                    case 3:
                        System.out.print("Thirty");
                        break;
                    case 4:
                        System.out.print("Forty");
                        break;
                    case 5:
                        System.out.print("Fifty");
                        break;
                    case 6:
                        System.out.print("Sixty");
                        break;
                    case 7:
                        System.out.print("Seventy");
                        break;
                    case 8:
                        System.out.print("Eighty");
                        break;
                    case 9:
                        System.out.print("Ninety");
                        break;

                }
                switch (Integer.parseInt(number)%100){
                    case 1:
                        System.out.print("One");
                        break;
                    case 2:
                        System.out.print("Two");
                        break;
                    case 3:
                        System.out.print("Three");
                        break;
                    case 4:
                        System.out.print("Four");
                        break;
                    case 5:
                        System.out.print("Five");
                        break;
                    case 6:
                        System.out.print("Six");
                        break;
                    case 7:
                        System.out.print("Seven");
                        break;
                    case 8:
                        System.out.print("Eight");
                        break;
                    case 9:
                        System.out.print("Nice");
                        break;
                }
            }
        }
    }
}
