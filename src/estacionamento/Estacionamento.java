package estacionamento;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Estacionamento {

    public static void main(String[] args) {
        
        double entrada,saida,diferenca,total;
        String modelo,placa,cor;
        DecimalFormat formato = new DecimalFormat("00.00");
        
        modelo = JOptionPane.showInputDialog("Digite o modelo do carro: ");
        placa = JOptionPane.showInputDialog("Digite a placa do carro: ");
        cor = JOptionPane.showInputDialog("Digite a cor do carro: ");
        entrada = Double.parseDouble(JOptionPane.showInputDialog("Digite a hora de entrada:\n"
                + "Exemplo: 15.30"));
        saida = Double.parseDouble(JOptionPane.showInputDialog("Digite a hora de sada:\n"
                + "Exemplo: 17.30"));
        
        diferenca = saida-entrada;        
        total = Math.ceil(diferenca)*4;
        
        if (entrada >24 || saida >24 || diferenca<0) {
            JOptionPane.showMessageDialog(null,"[ERRO] DIGITE HORARIOS DE FORMA CORRETA!");
            System.exit(0);
        }
        
        JOptionPane.showMessageDialog(null, "Placa do carro: "
                + placa
                + "\nModelo do carro: "
                + modelo
                + "\nCor do carro: "
                + cor
                + "\n\nHorario de Entrada: "
                + formato.format(entrada)
                + "\nHorario de Saída: "
                + formato.format(saida)
                + "\nTempo estacionado: "
                + formato.format(diferenca)
                + "\nTotal a Pagar: R$"
                + formato.format(total));
    }
}