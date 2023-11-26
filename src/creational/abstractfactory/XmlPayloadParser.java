package creational.abstractfactory;

public class XmlPayloadParser implements PayloadParser {
    @Override
    public void parse() {
        System.out.println("Parsing with XML payload parser.");
    }
}
