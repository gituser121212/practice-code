import java.util.*;
public class butterfly{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row=sc.nextInt();
        pattern(row);
    }
    public static void pattern(int n){
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }

            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }

            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}