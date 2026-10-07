package Scanner;

import java.util.Scanner;

public class GettingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the data");
        int data=sc.nextInt();
        System.out.println("int data value:"+data);

        System.out.println("Enter the double data:");
        double data1=sc.nextDouble();
        System.out.println("Double data:"+data1);

        System.out.println("enter the entire line :");
        String jeeva = sc.nextLine();
        System.out.println("line entered:" + jeeva);
        sc.next();
    }
}
