package creational.factory.factorymethod;

public class XmlPayloadParserFactory implements PayloadParserAbstractFactory {
    @Override
    public PayloadParser getPayloadParser() {
        return new XmlPayloadParser();
    }
}
