// This Java program prints a text-based triangle pattern. It uses an array of strings to store each line of the triangle and a for loop to print each line, resulting in a symmetrical triangle shape made of asterisks.


public class Triangle {
    public static void main(String[] args) {
        String[] array = new String[5];

        array[0] = "    *";
        array[1] = "   ***";
        array[2] = "  *****";
        array[3] = " *******";
        array[4] = "*********";

        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
