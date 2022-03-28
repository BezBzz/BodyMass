public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bmi = service.calculate(80F, 1.75F);
        System.out.println("Индекс массы тела:" + bmi);

        float bmi1 = service.calculate(90F, 1.60F);
        System.out.println("Индекс массы тела:" + bmi1);

        float bmi2 = service.calculate(100F, 2.05F);
        System.out.println("Индекс массы тела:" + bmi2);

        float bmi3 = service.calculate(75F, 1.75F);
        System.out.println("Индекс массы тела:" + bmi3);

        float bmi4 = service.calculate(80F, 1.75F);
        System.out.println("Индекс массы тела:" + bmi4);
    }

}
