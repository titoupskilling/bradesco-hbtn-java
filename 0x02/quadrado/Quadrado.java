public class Quadrado {

    public static double area(double lado){
        double resultado = 0.0;
        if(lado < 0){
            throw new java.lang.IllegalArgumentException("Lado deve possuir valor positivo.");
        } else {
            resultado = lado * lado;
        }
        return resultado;
    }
}