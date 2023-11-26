package creational.factory.factorymethod;

public class JsonPayloadParser implements PayloadParser {
    @Override
    public void parse() {
        System.out.println("Parsing with JSON payload parser.");
    }
}
