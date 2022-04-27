public class Main {
    public static void main(String[] args) {
        Name name = new Name();
        name.sayHi("Максим");

        BmiService service = new BmiService();
        double index = service.calculate(1.85, 75.6);
        System.out.println("Индекс массы телла: " + index);
    }

}
