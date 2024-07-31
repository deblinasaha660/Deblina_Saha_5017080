package BuilderPatternExample;

public class BuilderPatternTest {
    public static void main(String[] args) {
        // Build a basic computer
        Computer basicComputer = new Computer.Builder("Intel i3", 8, 256)
                .build();
        System.out.println("Basic Computer: " + basicComputer);

        // Build a gaming computer
        Computer gamingComputer = new Computer.Builder("Intel i7", 32, 1000)
                .setGpu("NVIDIA RTX 3080")
                .setOperatingSystem("Windows 10")
                .build();
        System.out.println("Gaming Computer: " + gamingComputer);

        // Build a work computer
        Computer workComputer = new Computer.Builder("AMD Ryzen 9", 64, 2000)
                .setOperatingSystem("Ubuntu 20.04")
                .build();
        System.out.println("Work Computer: " + workComputer);
    }
}
