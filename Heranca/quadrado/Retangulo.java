public class Retangulo extends FormaGeometrica {
    protected double largura;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if(largura < 0.0){
            throw new java.lang.IllegalArgumentException("Largura deve ser maior ou igual a 0");
        }
        this.largura = largura;
    }

    protected double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(largura < 0.0){
            throw new java.lang.IllegalArgumentException("Altura deve ser maior ou igual a 0");
        }
        this.altura = altura;
    }

    @Override
    public double area(){
        return getAltura() * getLargura();
    }

    public String toString() {
        return String.format("[Retangulo] %.2f / %.2f", getLargura(), getAltura());
    }
}