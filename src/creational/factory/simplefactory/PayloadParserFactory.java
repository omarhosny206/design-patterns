package creational.factory.simplefactory;

public class PayloadParserFactory {
    public static PayloadParser getPayloadParser(String payloadParserType) {
        return switch (payloadParserType) {
            case "JSON" -> new JsonPayloadParser();
            case "XML" -> new XmlPayloadParser();
            default -> throw new IllegalArgumentException("Unsupported payload parser type: " + payloadParserType);
        };
    }
}
