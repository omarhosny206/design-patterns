package creational.builder;

public class Computer {
    private String processor;
    private String ram;
    private String diskStorage;
    private String monitorSizeInches;
    private String graphicsCard;

    public Computer(String processor, String ram, String diskStorage, String monitorSizeInches, String graphicsCard) {
        this.processor = processor;
        this.ram = ram;
        this.diskStorage = diskStorage;
        this.monitorSizeInches = monitorSizeInches;
        this.graphicsCard = graphicsCard;
    }

    public static ComputerBuilder builder() {
        return new ComputerBuilder();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", diskStorage='" + diskStorage + '\'' +
                ", monitorSizeInches='" + monitorSizeInches + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }

    public static class ComputerBuilder {
        private String processor = "M1";
        private String ram = "8 gb";
        private String diskStorage = "256 gb";
        private String monitorSizeInches = "13 inches";
        private String graphicsCard = "Integrated Graphics";

        public ComputerBuilder processor(String processor) {
            this.processor = processor;
            return this;
        }

        public ComputerBuilder ram(String ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder diskStorage(String diskStorage) {
            this.diskStorage = diskStorage;
            return this;
        }

        public ComputerBuilder monitorSizeInches(String monitorSizeInches) {
            this.monitorSizeInches = monitorSizeInches;
            return this;
        }

        public ComputerBuilder graphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Computer build() {
            return new Computer(processor, ram, diskStorage, monitorSizeInches, graphicsCard);
        }
    }
}
