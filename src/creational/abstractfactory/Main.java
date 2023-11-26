package creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        PayloadAbstractFactory jsonPayloadFactory = new JsonPayloadFactory();
        PayloadAbstractFactory xmlPayloadFactory = new XmlPayloadFactory();

        PayloadParser jsonPayloadParser = PayloadFactoryClient.getPayloadParser(jsonPayloadFactory);
        PayloadValidator jsonPayloadValidator = PayloadFactoryClient.getPayloadValidator(jsonPayloadFactory);

        PayloadParser xmlPayloadParser = PayloadFactoryClient.getPayloadParser(xmlPayloadFactory);
        PayloadValidator xmlPayloadValidator = PayloadFactoryClient.getPayloadValidator(xmlPayloadFactory);

        jsonPayloadParser.parse();
        jsonPayloadValidator.validate();

        xmlPayloadParser.parse();
        xmlPayloadValidator.validate();
    }
}
