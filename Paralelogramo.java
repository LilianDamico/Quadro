public class Paralelogramo extends Quadrilatero {
    public Paralelogramo(Ponto[] pontos) {
        super();
    }

    public double calcularArea() {
        double ladoX = Math.abs(((Ponto) getPontos()[0]).getX() - ((Ponto) getPontos()[1]).getX()); 
        double ladoY = Math.abs(((Ponto) getPontos()[0]).getY() - ((Ponto) getPontos()[1]).getY());
        double altura = ladoY; 
        double base = Math.sqrt(Math.pow(ladoX, 2) + Math.pow(ladoY, 2)); 

        double area = base * altura;

        return area;
    }

    public Object[] getPontos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPontos'");
    }
}
