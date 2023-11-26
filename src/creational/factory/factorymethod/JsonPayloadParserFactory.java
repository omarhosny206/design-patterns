package creational.factory.factorymethod;

public class JsonPayloadParserFactory implements PayloadParserAbstractFactory {
    @Override
    public PayloadParser getPayloadParser() {
        return new JsonPayloadParser();
    }
}
