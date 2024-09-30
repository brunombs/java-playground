public class Computer {
    String gpu;
    String cpu;
    String ram;
    String disk;

    public Computer(String gpu, String cpu, String ram, String disk) {
        this.gpu = gpu;
        this.cpu = cpu;
        this.ram = ram;
        this.disk = disk;
    }

    public String getGpu() {
        return gpu;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getDisk() {
        return disk;
    }

    public static void main(String[] args) {
        Computer myComputer = new Computer("M1", "M1", "8GB", "256GB");
        Computer dreamComputer = new Computer("M3", "M3", "64GB", "2TB");

        System.out.println("My computer:\n" +
                "GPU: " + myComputer.getGpu() +
                "\nCPU: " + myComputer.getCpu() +
                "\nRAM: " + myComputer.getRam() +
                "\nDISK: " + myComputer.getDisk());

        System.out.println("My Dream computer:\n" +
                "GPU: " + dreamComputer.getCpu() +
                "\nCPU: " + dreamComputer.getCpu() +
                "\nRAM: " + dreamComputer.getRam() +
                "\nDISK: " + dreamComputer.getDisk());
    }
}
