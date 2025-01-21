public class Main {
    public static void main(String[] args) {
        String[] array = {"A", "B", "B", "C"};

        for (int i = 0; i < array.length; i++) {
            for (int nextInt = i + 1; nextInt < array.length; nextInt++) {
                if (array[i].equals(array[nextInt])) {
                    System.out.println(array[i]);
                }
            }
        }
    }
}
