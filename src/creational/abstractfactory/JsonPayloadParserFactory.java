package creational.abstractfactory;

public class JsonPayloadParserFactory implements PayloadParserAbstractFactory {
    @Override
    public PayloadParser getPayloadParser() {
        return new JsonPayloadParser();
    }
}
