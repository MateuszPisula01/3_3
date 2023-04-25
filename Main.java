import java.util.Random;
class Main {
  public static void main(String[] args) 
  {
        int[][] array = new int[10][10];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(101) - 50;
            }
        }

        System.out.println("Wylosowana tablica:");
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
