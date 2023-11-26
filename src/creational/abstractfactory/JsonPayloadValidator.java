package creational.abstractfactory;

public class JsonPayloadValidator implements PayloadValidator {
    @Override
    public void validate() {
        System.out.println("Validating with JSON payload validator.");
    }
}
