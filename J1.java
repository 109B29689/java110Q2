import java.util.Scanner;
class RuntimeException extends Exception{
  public RuntimeException(String s){
    System.out.println(s);
  }
}
public class J1{
  public static void main(String args[]) throws RuntimeException{
    Scanner sc=new Scanner(System.in);
    System.out.println("密碼輸入測試"+"\n"+"請輸入密碼：");
    int a=sc.nextInt();
    for(int i=0;i<=3;i++){
      System.out.println("請在輸入一次密碼：");
      int b=sc.nextInt();
      if(b==a){
        System.out.println("密碼正確");
        break;
      }else if(i==2 && b!=a) {
        System.out.println("與第一次輸入的不同！");
        throw new RuntimeException("輸入三次錯誤！程式停止！");
      }else System.out.println("與第一次輸入的不同！");
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
輸入三次錯誤！程式停止！Exception in thread "main" RuntimeException at J1.main(J1.java:20)


密碼輸入測試
請輸入密碼:1234
請再輸入一次密碼:365
與輸入的第一次不同!
請再輸入一次密碼:354
與輸入的第一次不同!
請再輸入一次密碼:1234
密碼正確
------------------------------------------------------------------------------------------*/
