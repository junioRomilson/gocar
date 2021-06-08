package service;

import javax.swing.*;

public class Alerta {

    public static void SUCESSO(String titulo, String mensagem){
        JOptionPane.showMessageDialog(null, mensagem,
                titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    public static void ERROR(String titulo, String mensagem){
        JOptionPane.showMessageDialog(null, mensagem,
                titulo, JOptionPane.ERROR_MESSAGE);
    }
    public static void WARNING(String titulo, String mensagem){
        JOptionPane.showMessageDialog(null, mensagem,
                titulo, JOptionPane.WARNING_MESSAGE);
    }

}
