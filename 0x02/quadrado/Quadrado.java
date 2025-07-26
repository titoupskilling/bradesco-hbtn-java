public class Quadrado {

    public static double area(double lado) throws IllegalArgumentException {
        double resultado = 0.0;
        if(lado < 0){
            throw new IllegalArgumentException("Lado deve possuir valor positivo");
        } else {
            resultado = lado * lado;
        }
        return resultado;
    }
}