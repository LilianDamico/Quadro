public class Trapezio extends Quadrilatero {
    public Trapezio(Ponto[] pontos) {
        super();
    }

    public double calcularArea() {
        double baseMaior = Math.abs(((Ponto) getPontos()[0]).getX() - ((Ponto) getPontos()[1]).getX()); 
        double baseMenor = Math.abs(((Ponto) getPontos()[2]).getX() - ((Ponto) getPontos()[3]).getX()); 
        double altura = Math.abs(((Ponto) getPontos()[0]).getY() - ((Ponto) getPontos()[2]).getY()); 
        double area = ((baseMaior + baseMenor) * altura) / 2;

        return area;
    }

    private Object[] getPontos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPontos'");
    }
}
