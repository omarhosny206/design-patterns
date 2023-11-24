package creational.builder;

public class Main {
    public static void main(String[] args) {
        Computer computer = Computer.builder()
                .processor("M3 Max")
                .ram("32 gb")
                .diskStorage("512 gb")
                .monitorSizeInches("16 inches")
                .build();

        System.out.println(computer);
    }
}
