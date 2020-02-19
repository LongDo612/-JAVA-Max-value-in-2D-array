import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int[][] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height: ");
        int height = scanner.nextInt();
        System.out.println("Enter width: ");
        int width = scanner.nextInt();
        array = new int[height][width];
        for (int i=0;i<height;i++){
            for (int j=0;j<width;j++){
                System.out.println("Enter element["+i+"]["+j+"]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Your matrix");
        for (int i=0;i<height;i++){
            for (int j=0;j<width;j++){
                System.out.print(array[i][j]+ "\t");
            }
            System.out.println();
        }

        for (int i=1;i<height;i++){
            for (int j=1;j<width;j++){
                if (array[i][j] > array[x][y]){
                    x = i;
                    y = j;
                }
            }
        }

        System.out.println("Max value of the matrix is: "+ array[x][y]);
    }
}
