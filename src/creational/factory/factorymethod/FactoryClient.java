package creational.factory.factorymethod;

public class FactoryClient {
    public static PayloadParser getPayloadParser(PayloadParserFactory payloadParserFactory) {
        return payloadParserFactory.getPayloadParser();
    }
}
