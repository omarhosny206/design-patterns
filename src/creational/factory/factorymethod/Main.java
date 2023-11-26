package creational.factory.factorymethod;

public class Main {
    public static void main(String[] args) {
        PayloadParser jsonPayloadParser = PayloadParserFactory.getPayloadParser(new JsonPayloadParserFactory());
        PayloadParser xmlPayloadParser = PayloadParserFactory.getPayloadParser(new XmlPayloadParserFactory());
        jsonPayloadParser.parse();
        xmlPayloadParser.parse();
    }
}
