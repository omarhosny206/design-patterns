package creational.factory.simplefactory;

public class Main {
    public static void main(String[] args) {
        PayloadParser jsonPayloadParser = PayloadParserFactory.getPayloadParser("JSON");
        PayloadParser xmlPayloadParser = PayloadParserFactory.getPayloadParser("XML");
        jsonPayloadParser.parse();
        xmlPayloadParser.parse();
    }
}
