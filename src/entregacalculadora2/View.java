/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entregacalculadora2;

import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class View {

    public void Menu() {
        Controller controller = new Controller();
        String op = JOptionPane.showInputDialog(null, "Escolha a operação: \n[+] - Somar\n [-] - Subtrair\n [*] - Multiplicar\n [/] - Dividir\n [²] - Potencia\n[!] - Fatorial\n Escolha: ");
        controller.iniciaOpcoes(op);
    }

    public void Opcoes(String op) {
        Controller controller = new Controller();
        if ("!".equals(op)) {

            double x = Double.parseDouble(JOptionPane.showInputDialog("Escolha um numero: "));
            controller.setX(x);
            double y = 0;
            controller.setY(y);
        } else {
            double x = Double.parseDouble(JOptionPane.showInputDialog("Escolha o primeiro numero: "));
            controller.setX(x);
            double y = Double.parseDouble(JOptionPane.showInputDialog("Escolha o segundo numero: "));
            controller.setY(y);
        }
        controller.iniciaCalculo(op);
    }

    public void resultado(double resultado) {
        
        JOptionPane.showMessageDialog(null, "Resultado:" + resultado);
    }
    
    public void opcaoInvalida(){
       JOptionPane.showMessageDialog(null, "Opção invalida!!" ); 
    }

}
