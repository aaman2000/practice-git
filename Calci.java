import java.util.Scanner;

interface Calci{
 public int getSum(int a,int b);
 public int getProduct(int a,int b);
}
class Calciimp implements Calci{
  public int getSum(int a,int b){
    return(a+b);
  }
  public int getProduct(int a,int b){
    return(a*b);

}
}
class CalciDriver{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 1st number:");
    int n1=sc.nextInt();
    System.out.println("Enter 2st number:");
    int n2=sc.nextInt();
    Calciimp c=new Calciimp();
    CalciDriver cd=new CalciDriver();
    System.out.println(n1+"+"+n2+"="+c.getSum(n1, n2));
    System.out.println(n1+"*"+n2+"="+c.getProduct(n1, n2));
  }
}