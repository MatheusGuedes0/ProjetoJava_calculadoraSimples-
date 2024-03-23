/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entregacalculadora2;

/**
 *
 * @author mathe
 */
public class Controller {

    View view = new View();
    Calculadora calculadora = new Calculadora();
    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void iniciaMenu() {
        view.Menu();
    }

    public void iniciaOpcoes(String op) {
        if ("!".equals(op) || "²".equals(op) || "+".equals(op) || "-".equals(op) || "*".equals(op) || "/".equals(op)) {
            view.Opcoes(op);
        } else {
            view.opcaoInvalida();
        }
    }

    public void iniciaCalculo(String op) {
        double resultado = calculadora.calcular(x, y, op);
        view.resultado(resultado);
    }

}
