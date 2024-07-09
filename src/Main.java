public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        int bmi = service.calculate(98, 1.87);
        System.out.println("Индекс массы тела: " + bmi);
    }
}
