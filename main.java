import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:-");
        int num=sc.nextInt();
        int ina=sc.nextInt();
        String str="";
        for(int i=0;i<=num;i=i+ina){
            str=str+i+",";
        }
        for(int i=0;i<str.length()-1;i++)
        System.out.print(str.charAt(i));
    }
}
