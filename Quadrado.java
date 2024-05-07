public class Quadrado extends Retangulo {
    public Quadrado(Ponto[] pontos) {
        super(pontos);
    }

    public double calcularArea() {
        
         double lado = Math.abs(((Ponto) getPontos()[0]).getX() - ((Ponto) getPontos()[1]).getX()); // Ou qualquer outro ponto

         double area = lado * lado;
 
         return area;
    }
}
