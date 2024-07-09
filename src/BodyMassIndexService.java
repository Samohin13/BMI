public class BodyMassIndexService {

    public int calculate(int weightInKg, double heightInMeters) {
        double bmi = weightInKg / (heightInMeters * heightInMeters);
        return (int) bmi;
    }
}