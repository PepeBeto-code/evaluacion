import proyect.Rectangulo;

public class Mundo {
    public static void main(String[] args) {
        Rectangulo rec=new Rectangulo(3,7);
        rec.calcularArea();
        System.out.println(rec.toString());
    }
}
