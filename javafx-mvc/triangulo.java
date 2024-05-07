
/**
 * Modela o cálculo de área
 * 
 * @author icaropereira1
 * @version 0.01
 */
public class triangulo
{
    double base;
    double altura;
    double area;
    
    public triangulo() {
        this.base = 0;
        this.altura = 0;
        this.area = 0;
    }
    
    /**
     * Construtor para objetos da classe Calculadora de áŕea de triângulos
     */
    public triangulo(double altura, double base)
    {
        this.altura = altura;  
        this.base = base;
    }

    /**
     * Calcula o a área
     * 
     
     */
    public double calcular()
    {
        if (this.altura <= 0 || this.base <= 0)
            return 0;
        return (this.base*this.altura)/2;
    }
    public String interpretar() {
        String resultado = "";
        double areaTriangulo = this.calcular();
        if (areaTriangulo == 0)
            resultado += "Esse triangulo nao existe";
        else 
            resultado += area + " centímetros quadrados";
        return resultado;
}
}