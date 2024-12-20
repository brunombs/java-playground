import java.util.ArrayList;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 3, 6};
        String[] array2 = {"A", "B", "C", "D", "E", "F", "F", "G", "G", "H"};
        ArrayList<Integer> duplicate = new ArrayList<>();
        ArrayList<String> duplicate2 = new ArrayList<>();

        System.out.println("Duplicate elements:");
        for (int i = 0; i < array.length; i++) {
            for (int nextI = i + 1; nextI < array.length; nextI++) {
                if (array[i] == array[nextI]) {
                    duplicate.add(array[i]);
                }
            }
        }

        System.out.println(duplicate);


        System.out.println("Duplicate elements 2:");
        for (int i = 0; i < array2.length; i++) {
            for (int j = i + 1; j < array2.length; j++) {
                if (array2[i].equals(array2[j])) {
                    duplicate2.add(array2[i]);
                }
            }
        }

        System.out.println(duplicate2);
    }
}