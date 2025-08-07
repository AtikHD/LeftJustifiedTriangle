import java.util.Scanner;
public class LeftJustifiedTriangle {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(
                "Enter the hight of the Left justified triangle"
        );
        int h=sc.nextInt();
        for(int i=1; i<=h; i++){
            for(int j=1; j<=h; j++){
                if(i>=j) {
                    System.out.print(
                            j
                    );
                }
                else{
                    System.out.print("");
                }
            }
            System.out.println("");
        }
    }
}

