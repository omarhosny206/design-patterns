package creational.factory.factorymethod;

public class JsonPayloadParserFactory implements PayloadParserFactory {
    @Override
    public PayloadParser getPayloadParser() {
        return new JsonPayloadParser();
    }
}
