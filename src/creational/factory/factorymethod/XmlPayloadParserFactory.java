package creational.factory.factorymethod;

public class XmlPayloadParserFactory implements PayloadParserFactory {
    @Override
    public PayloadParser getPayloadParser() {
        return new XmlPayloadParser();
    }
}
