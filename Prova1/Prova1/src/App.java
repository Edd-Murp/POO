import model.Fatura;

public class App {
    public static void main(String[] args) throws Exception {
        Fatura f1 = new Fatura("CLeber", 850, "Industrial");
        System.out.println(f1.getTitular());
        System.out.println(f1.getkWhMes());
        System.out.println(f1.getConsumidor());
        System.out.println(f1.calcularFatura(f1));
    }
}
