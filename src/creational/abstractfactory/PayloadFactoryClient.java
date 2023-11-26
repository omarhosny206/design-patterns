package creational.abstractfactory;

public class PayloadFactoryClient {
    public static PayloadParser getPayloadParser(PayloadAbstractFactory payloadParserAbstractFactory) {
        return payloadParserAbstractFactory.getPayloadParser();
    }

    public static PayloadValidator getPayloadValidator(PayloadAbstractFactory payloadParserAbstractFactory) {
        return payloadParserAbstractFactory.getPayloadValidator();
    }
}
