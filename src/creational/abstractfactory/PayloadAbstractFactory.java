package creational.abstractfactory;

public interface PayloadAbstractFactory {
    PayloadParser getPayloadParser();

    PayloadValidator getPayloadValidator();
}
