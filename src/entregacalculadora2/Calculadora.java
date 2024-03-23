/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entregacalculadora2;

/**
 *
 * @author mathe
 */
public class Calculadora {

    private double resultado;

    private double somar(double x, double y) {
        return x + y;
    }

    private double subtrair(double x, double y) {
        return x - y;
    }

    private double multiplicar(double x, double y) {
        return x * y;
    }

    private double dividir(double x, double y) {
        return x / y;
    }

    public double calcular(double x, double y, String z) {
        Controller controller = new Controller();
        switch (z) {

            case "+":
                resultado = somar(x, y);
                break;
            case "-":
                resultado = subtrair(x, y);
                break;
            case "*":
                resultado = multiplicar(x, y);
                break;
            case "/":
                resultado = dividir(x, y);
                break;
            case "²":
                int cont = 1;
                for (int i = 0; i < y; i++) {
                    cont *= x;
                }
                resultado = cont;
                break;
            case "!":
                cont = 1;
                for (int i = (int) x; i >= 1; i--) {
                    cont *= i;
                }
                resultado = cont;
                break;
            default:
                resultado = 0;
                
                break;
        }
        return resultado;
    }

}
