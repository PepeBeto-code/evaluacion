package proyect;
import proyect.Forma;
public class Rectangulo implements Forma {
    private int area;
    private int base;
    private int altura;

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Rectangulo(int base, int altura){
        this.base=base;
        this.altura=altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "area=" + area +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }

    @Override
    public void calcularArea(){
        area = base * altura;
    }
}
