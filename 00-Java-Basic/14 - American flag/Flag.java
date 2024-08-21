// Write a Java program to print an American flag on the screen.

public class Flag {
    public static void main(String[] args) {
        String p1 = "* * * * * * ==================================";
        String p2 = " * * * * *  ==================================";
        String p3 = "==============================================";

        for (int times = 1; times <= 9; times++) {
            if (times % 2 != 0) {
                System.out.println(p1);
            } else {
                System.out.println(p2);
            }
        }

        for (int times = 1; times <= 6; times++) {
            System.out.println(p3);
        }
    }
}
