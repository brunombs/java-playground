public class FindDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 3, 6};
        String[] array2 = {"A", "B", "C", "D", "E", "F", "F", "G", "G", "H"};

        System.out.println("Duplicate elements:");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                }
            }
        }

        System.out.println("Duplicate elements 2:");
        for (int i = 0; i < array2.length; i++) {
            for (int j = i + 1; j < array2.length; j++) {
                if (array2[i].equals(array2[j])) {
                    System.out.println(array2[i]);
                }
            }
        }
    }
}