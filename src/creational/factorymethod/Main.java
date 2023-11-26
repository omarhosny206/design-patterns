package creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        PayloadParser jsonPayloadParser = PayloadParserFactory.getPayloadParser("JSON");
        PayloadParser xmlPayloadParser = PayloadParserFactory.getPayloadParser("ML");
        jsonPayloadParser.parse();
        xmlPayloadParser.parse();
    }
}
