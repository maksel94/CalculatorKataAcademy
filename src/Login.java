import java.util.*;

public class Login {

//    class Log {
//
//        private String username;
//        private String password;
//
//        public void setUsername(String username) {
//            this.username = username;
//        }
//
//        public String getUsername() {
//            return username;
//        }
//
//        public void setPassword(String password) {
//            this.password = password;
//        }
//
//        public String getPassword() {
//            return password;
//        }
//
//    }

    public static void main(String[] args) {
//        int userNum = new Scanner(System.in).nextInt();
//
//        var number = new Random().nextInt(10);

//        v1
//        String result;
//        if (userNum==number){
//            result = "Вы угадали число";
//        } else {
//            result = "Вы не угадали число";
//        }

//        v2
//        String result = userNum == number ?
//                "Вы угадали число" :
//                "Вы не угадали число";
//
//        System.out.println(result);

//        --------------------------------------

//        int[] displayMaxNumber = {4, 7, -1, 0, 99, -12,32, 1, 3, 46, 555, -115, 5, Integer.MAX_VALUE};
//
//        int maxNum = displayMaxNumber[0];
//        for (int j : displayMaxNumber){
//            if (j > maxNum)
//                maxNum = j;
//        }
//        System.out.println("Maximum number = " + maxNum);
//        -----------------------------------------

//        int month = new Scanner(System.in).nextInt();
//        switch (month){
//            case 1:
//            case 2:
//            case 12:{
//                System.out.println("Зима");
//                break;
//            }
//            case 3:
//            case 4:
//            case 5:{
//                System.out.println("Весна");
//                break;
//            }
//            case 6:
//            case 7:
//            case 8:{
//                System.out.println("Лето");
//                break;
//            }
//            case 9:
//            case 10:
//            case 11:{
//                System.out.println("Осень");
//                break;
//            }
//            default:{
//                System.out.println("Некорректное значение " + month);
//            }
//        }
//        ------------------------------------------

//        int year = new Scanner(System.in).nextInt();
//        boolean isLeap;
//        if (year % 400 == 0){
//            isLeap = true;
//        } else if (year % 100 == 0) {
//            isLeap = false;
//        } else if (year % 4 == 0) {
//            isLeap = true;
//        } else {
//            isLeap = false;
//        }
//        System.out.println(isLeap ? year + " год високосный" : year + " не високосный");
//        -----------------------------------------------------

        for (int i = 0; i <= 50; i+=2) {
            System.out.print(i + " ");
        }
    }
}
