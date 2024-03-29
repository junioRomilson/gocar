/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;
import routes.Routes;
import service.Alerta;
import service.ClienteService;
import service.UsuarioService;
import service.Utils;
import session.DadosSession;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class Alugar extends javax.swing.JFrame {

    private Routes rotas = new Routes();
    private UsuarioService usuarioService = new UsuarioService();
    private ClienteService clienteService = new ClienteService();

    /**
     * Creates new form Alugar
     */
    public Alugar() {

        if(DadosSession.existeUsuarioLogado()){
            if(clienteService.listar().isEmpty()){
                Alerta.ERROR("Erro", "Não exite clientes cadastrados. \nPara prosseguir é necessário cadastrar um cliente!");
                this.rotas.goCadastroCliente();
            } else {
                initComponents();
            }
        } else {
            fecharTelaAlugar();
            this.rotas.goLogin();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/logo.png"));
        Image image = icon.getImage();
        HoraDevolucao = new javax.swing.JLayeredPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        }
        ;
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        LocalRetirada = new javax.swing.JTextField();
        try{
            DataRetirada = new javax.swing.JFormattedTextField(Utils.getMascaraData());
            DataDevolucao = new javax.swing.JFormattedTextField(Utils.getMascaraData());
            HoraRetirada = new javax.swing.JFormattedTextField(Utils.getMascaraHora());
            HoraD = new javax.swing.JFormattedTextField(Utils.getMascaraHora());
        }catch (ParseException e){
            e.printStackTrace();
        }


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel1.setText("Local de Retirada");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel2.setText("Retirada");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel3.setText("Devolução");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("GoCar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alugar(evt);
            }
        });
        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarHome(evt);
            }
        });
        LocalRetirada.setBackground(new java.awt.Color(255, 255, 204));
        LocalRetirada.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        DataRetirada.setBackground(new java.awt.Color(255, 255, 204));
        DataRetirada.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        HoraRetirada.setBackground(new java.awt.Color(255, 255, 204));
        HoraRetirada.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        DataDevolucao.setBackground(new java.awt.Color(255, 255, 204));
        DataDevolucao.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        HoraD.setBackground(new java.awt.Color(255, 255, 204));
        HoraD.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        HoraDevolucao.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        HoraDevolucao.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        HoraDevolucao.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        HoraDevolucao.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        HoraDevolucao.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        HoraDevolucao.setLayer(LocalRetirada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        HoraDevolucao.setLayer(DataRetirada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        HoraDevolucao.setLayer(HoraRetirada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        HoraDevolucao.setLayer(DataDevolucao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        HoraDevolucao.setLayer(HoraD, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout HoraDevolucaoLayout = new javax.swing.GroupLayout(HoraDevolucao);
        HoraDevolucao.setLayout(HoraDevolucaoLayout);
        HoraDevolucaoLayout.setHorizontalGroup(
            HoraDevolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoraDevolucaoLayout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addGroup(HoraDevolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LocalRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(94, 94, 94)
                .addGroup(HoraDevolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DataRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HoraRetirada, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addGap(91, 91, 91)
                .addGroup(HoraDevolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(HoraDevolucaoLayout.createSequentialGroup()
                        .addComponent(DataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HoraD, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HoraDevolucaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(598, 598, 598))
        );
        HoraDevolucaoLayout.setVerticalGroup(
            HoraDevolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HoraDevolucaoLayout.createSequentialGroup()
                .addGap(462, 462, 462)
                .addGroup(HoraDevolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(HoraDevolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocalRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HoraRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataDevolucao, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(HoraD, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HoraDevolucao)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HoraDevolucao)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void alugar(java.awt.event.ActionEvent evt){

        if(DataRetirada.getText().equals("  /  /    ") || DataDevolucao.getText().equals("  /  /    ")
            || HoraRetirada.getText().equals("  :  ") || HoraD.getText().equals("  :  ")
            || LocalRetirada.getText().equals("")) {
            Alerta.WARNING("Alerta", "Informe todos os campos!");
        } else {
            if(Utils.validarData(DataRetirada.getText(), DataDevolucao.getText())){
                DadosSession.setDataRetirada(DataRetirada.getText());
                DadosSession.setDataDevolucao(DataDevolucao.getText());
                DadosSession.setHoraRetirada(HoraRetirada.getText());
                DadosSession.setHoraDevolucao(HoraD.getText());
                DadosSession.setAgencia(LocalRetirada.getText());
                this.rotas.goCatalogo1();
                fecharTelaAlugar();
            } else {
                Alerta.ERROR("Erro", "A data de devolução não pode ser anterior a data de retirada!");
            }

        }
    }

    private void voltarHome(ActionEvent evt){
        this.rotas.goHome();
        fecharTelaAlugar();
    }

    private void fecharTelaAlugar(){
        this.setVisible(false);
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Alugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alugar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField DataDevolucao;
    private javax.swing.JFormattedTextField DataRetirada;
    private javax.swing.JFormattedTextField HoraD;
    private javax.swing.JLayeredPane HoraDevolucao;
    private javax.swing.JFormattedTextField HoraRetirada;
    private javax.swing.JTextField LocalRetirada;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

