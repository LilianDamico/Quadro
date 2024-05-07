public class Retangulo extends Paralelogramo {
    public Retangulo(Ponto[] pontos) {
        super(pontos);
    }

    public double calcularArea() {

         double base = Math.abs(((Ponto) getPontos()[0]).getX() - ((Ponto) getPontos()[1]).getX()); 

         double altura = Math.abs(((Ponto) getPontos()[0]).getY() - ((Ponto) getPontos()[3]).getY()); 
 
         double area = base * altura;
 
         return area;
    }
}
