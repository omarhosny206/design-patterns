package creational.factory.simplefactory;

public class XmlPayloadParser implements PayloadParser {
    @Override
    public void parse() {
        System.out.println("Parsing with XML payload parser.");
    }
}
