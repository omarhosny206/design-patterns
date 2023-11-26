package creational.factory.factorymethod;

public class Main {
    public static void main(String[] args) {
        PayloadParser jsonPayloadParser = FactoryClient.getPayloadParser(new JsonPayloadParserFactory());
        PayloadParser xmlPayloadParser = FactoryClient.getPayloadParser(new XmlPayloadParserFactory());
        jsonPayloadParser.parse();
        xmlPayloadParser.parse();
    }
}
