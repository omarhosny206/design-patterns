package creational.abstractfactory;

public class JsonPayloadFactory implements PayloadAbstractFactory {
    @Override
    public PayloadParser getPayloadParser() {
        return new JsonPayloadParser();
    }

    @Override
    public PayloadValidator getPayloadValidator() {
        return new JsonPayloadValidator();
    }
}
