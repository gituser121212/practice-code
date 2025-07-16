import java.util.*;
public class hollowtriangle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n=sc.nextInt();
        pattern(n);
    }

    public static void pattern(int n){
        for(int i=0; i<n; i++){
            
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                if(i==n-1){
                    System.out.print("*");
                }
                else{
                    if(j==0 || j==2*i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}