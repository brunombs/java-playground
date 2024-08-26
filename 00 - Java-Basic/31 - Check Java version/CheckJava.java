// Write a Java program to check whether Java is installed on your computer.

public class CheckJava {
    public static void main(String[] args) {
        String javaVersion = System.getProperty("java.version");
        String javaRuntimeVersion = System.getProperty("java.runtime.version");
        String javaHome = System.getProperty("java.home");
        String javaVendor = System.getProperty("java.vendor");
        String javaVendorURL = System.getProperty("java.vendor.url");
        String javaClassPath = System.getProperty("java.class.path");
        String osName = System.getProperty("os.name");
        String osArch = System.getProperty("os.arch");
        String osVersion = System.getProperty("os.version");

        System.out.println("Java Information:");
        System.out.println("-----------------");
        System.out.println("Java Version: " + javaVersion);
        System.out.println("Java Runtime Version: " + javaRuntimeVersion);
        System.out.println("Java Home: " + javaHome);
        System.out.println("Java Vendor: " + javaVendor);
        System.out.println("Java Vendor URL: " + javaVendorURL);
        System.out.println("Java Class Path: " + javaClassPath);
        System.out.println();
        System.out.println("Operating System Information:");
        System.out.println("----------------------------");
        System.out.println("OS Name: " + osName);
        System.out.println("OS Architecture: " + osArch);
        System.out.println("OS Version: " + osVersion);
    }
}
