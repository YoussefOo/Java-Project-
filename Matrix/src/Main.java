import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        char  characktar;

        System.out.println("This is a Matrix of Roms and Columns of Charachtar ");
        System.out.print("Enter your Rows ");
        rows= scanner.nextInt();
        System.out.println("Enter your Columns ");
        columns = scanner.nextInt();
        System.out.println("Enter your Charactar ");
        characktar = scanner.next().charAt(0);

        for(int i= 0; i < rows; i++){
            for(int j =0; j< columns;j++){
                System.out.print(characktar);
            }
            System.out.println();
        }

        scanner.close();

    }
}