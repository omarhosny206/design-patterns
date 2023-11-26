package creational.abstractfactory;

public class XmlPayloadFactory implements PayloadAbstractFactory {
    @Override
    public PayloadParser getPayloadParser() {
        return new XmlPayloadParser();
    }

    @Override
    public PayloadValidator getPayloadValidator() {
        return new XmlPayloadValidator();
    }
}
