

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class CalculadoraImc {
    public static void main(String[] args){
    
        double peso, altura, imc;
        
        peso = Double.parseDouble(JOptionPane.showInputDialog(" Informe seu peso.   Ex(00.0)  "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("   Informe sua altura. Ex(0.00)    "));
        
        imc = peso / (altura * altura);
        
        DecimalFormat decimal = new DecimalFormat("0.0");
        String valueFormat = decimal.format(imc);
                        
        if (imc >= 18.6 && imc <= 24.9){        
         JOptionPane.showMessageDialog(null, "  Seu IMC é:  " + valueFormat + " *> Seu peso é normal.");
         
        } else if (imc >= 25 && imc <= 29.9){
         JOptionPane.showMessageDialog(null, "  Seu IMC é:  " + valueFormat + " *> Você está acima do peso normal.");
         
        } else if (imc >= 30 && imc <= 34.9){
         JOptionPane.showMessageDialog(null, "  Seu IMC é:  " + valueFormat + " *> Você está no primeiro grau de obesidade.");
         
        } else if (imc >= 35 && imc <= 39.9){
         JOptionPane.showMessageDialog(null, "  Seu IMC é:  " + valueFormat + " *> Você está com obesidade de segundo grau.");
         
        } else if(imc >= 40){
         JOptionPane.showMessageDialog(null, "  Seu IMC é:  " + valueFormat + "  *ATENÇÃO* Você precisa se cuidar, Seu IMC é considerado de risco, com grau de nivel 3.");
         
        } else {            
         JOptionPane.showMessageDialog(null, "  Seu IMC é:  " + valueFormat + " *> Você está abaixo do peso.");
        }

    }
}