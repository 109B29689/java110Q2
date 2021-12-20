import java.util.Scanner;
class RuntimeException extends Exception{
    public RuntimeException(String string) {System.out.print(string);}
}
public class J1{
    public static void main(String[] args) throws RuntimeException{
        Scanner sc=new Scanner(System.in);
        System.out.println("密碼輸入測試");
        System.out.print("請輸入密碼:");
        int a=sc.nextInt();
            System.out.print("請再輸入一次密碼:");
            int b=sc.nextInt(); 
            if(b==a) System.out.println("密碼正確");
            else {
                System.out.println("與輸入的第一次不同!");
                System.out.print("請再輸入一次密碼:");
                int c=sc.nextInt();
                if(c==a) System.out.println("密碼正確");
                else{
                    System.out.println("與輸入的第一次不同!");
                    System.out.print("請再輸入一次密碼:");
                    int d=sc.nextInt();
                    if(d==a) System.out.println("密碼正確");
                    else {
                        System.out.println("與輸入的第一次不同!");
                        throw  new  RuntimeException("輸入三次錯誤！程式停止！");
                }
            }
        }
    }
}

/*output------------------------------------------------------------------------------------
密碼輸入測試
請輸入密碼:1234
請再輸入一次密碼:21212
請再輸入一次密碼:43434
與輸入的第一次不同!
請再輸入一次密碼:54554
與輸入的第一次不同!
輸入三次錯誤！程式停止！Exception in thread "main" RuntimeException at J1.main(J1.java:26)


密碼輸入測試
請再輸入一次密碼:365
與輸入的第一次不同!
請再輸入一次密碼:354
與輸入的第一次不同!
請再輸入一次密碼:1234
密碼正確
------------------------------------------------------------------------------------------*/
