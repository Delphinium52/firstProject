package calcProject.level2;

public class App {
    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();
        try {
            System.out.println(calc.calculate("/", 0, 4));
        }catch (BadException e) {
            System.out.println(e.getMessage());
        }
    }
}
