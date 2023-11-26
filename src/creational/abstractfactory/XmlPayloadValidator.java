package creational.abstractfactory;

public class XmlPayloadValidator implements PayloadValidator {
    @Override
    public void validate() {
        System.out.println("Validating with XML payload validator.");
    }
}
