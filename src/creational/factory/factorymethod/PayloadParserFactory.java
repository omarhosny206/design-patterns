package creational.factory.factorymethod;

public class PayloadParserFactory {
    public static PayloadParser getPayloadParser(PayloadParserAbstractFactory payloadParserAbstractFactory) {
        return payloadParserAbstractFactory.getPayloadParser();
    }
}