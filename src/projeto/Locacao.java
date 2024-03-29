/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;
import model.Aluguel;
import model.Cliente;
import routes.Routes;
import service.AluguelService;
import service.ClienteService;
import service.UsuarioService;
import service.Utils;
import service.Alerta;

import session.DadosSession;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.util.LinkedList;
import javax.jws.WebParam;
import javax.swing.*;


/**
 *
 * @author Usuario
 */
public class Locacao extends javax.swing.JFrame {
    private Routes rotas = new Routes();
    private UsuarioService usuarioService = new UsuarioService();
    private ClienteService clienteService = new ClienteService();
    private AluguelService aluguelService = new AluguelService();
    private String[] clientes;
    /**
     * Creates new form Locacao
     */
    public Locacao() {
        if(DadosSession.existeUsuarioLogado()){
            initComponents();
        } else {
            rotas.goLogin();
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
        this.setExtendedState(Frame.MAXIMIZED_BOTH);
        clientes = buscarClientes();
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/fundo.png"));
        Image image = icon.getImage();
        jLayeredPane1 = new javax.swing.JLayeredPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        }
        ;
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RgCliente = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        NomeClienteAlugar = new javax.swing.JComboBox(clientes);
        jLabel4 = new javax.swing.JLabel();
        try{
            CpfClienteAlugar = new javax.swing.JFormattedTextField(Utils.getMascaraCPF());
        } catch (ParseException e){
            e.printStackTrace();
        }
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ModeloCarro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AnoCarro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        PlacaCarro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        LocalCarro = new javax.swing.JTextField();
        Alugar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        DataRetirada = new javax.swing.JLabel();
        HoraRetirada = new javax.swing.JLabel();
        DataDevolucao = new javax.swing.JLabel();
        HoraDevolucao = new javax.swing.JLabel();
        Voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logop.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Locação de Veículos");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel3.setText("Nome do Cliente");

        NomeClienteAlugar.setBackground(new java.awt.Color(255, 255, 204));
        if(DadosSession.getCliente() != null){
            NomeClienteAlugar.setSelectedItem(clientes[DadosSession.getIndexCliente()]);
        }
        NomeClienteAlugar.setFont(new java.awt.Font("Tahoma", 0, 14));
        NomeClienteAlugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarCliente(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel4.setText("CPF");

        CpfClienteAlugar.setBackground(new java.awt.Color(255, 255, 204));
        CpfClienteAlugar.setEditable(false);
        if(DadosSession.getCliente() != null){
            CpfClienteAlugar.setText(""+DadosSession.getCliente().getCpf());
        }
        CpfClienteAlugar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel5.setText("RG");
        jLabel5.setToolTipText("");

        jTextField1.setBackground(new java.awt.Color(255, 255, 204));
        jTextField1.setEditable(false);
        if(DadosSession.getCliente() != null){
            jTextField1.setText(""+DadosSession.getCliente().getRg());
        }
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel6.setText("Modelo do Carro");

        ModeloCarro.setBackground(new java.awt.Color(255, 255, 204));
        ModeloCarro.setText(DadosSession.getCarroAluguel().getMarca());
        ModeloCarro.setEditable(false);
        ModeloCarro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel7.setText("Ano do Carro");

        AnoCarro.setBackground(new java.awt.Color(255, 255, 204));
        AnoCarro.setText(""+DadosSession.getCarroAluguel().getAno());
        AnoCarro.setEditable(false);
        AnoCarro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel8.setText("Placa");

        PlacaCarro.setBackground(new java.awt.Color(255, 255, 204));
        PlacaCarro.setText(DadosSession.getCarroAluguel().getPlaca());
        PlacaCarro.setEditable(false);
        PlacaCarro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel9.setText("Local");

        LocalCarro.setBackground(new java.awt.Color(255, 255, 204));
        LocalCarro.setText(DadosSession.getAgencia());
        LocalCarro.setEditable(false);
        LocalCarro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Alugar.setBackground(new java.awt.Color(255, 255, 0));
        Alugar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Alugar.setText("Alugar");
        Alugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alugar(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel10.setText("Devolução");

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel11.setText("Retirada");

        DataRetirada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DataRetirada.setText(DadosSession.getDataRetirada());

        HoraRetirada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        HoraRetirada.setText(DadosSession.getHoraRetirada());

        DataDevolucao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DataDevolucao.setText(DadosSession.getDataDevolucao());

        HoraDevolucao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        HoraDevolucao.setText(DadosSession.getHoraDevolucao());

        Voltar.setBackground(new java.awt.Color(255, 255, 0));
        Voltar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar(evt);
            }
        });
        javax.swing.GroupLayout RgClienteLayout = new javax.swing.GroupLayout(RgCliente);
        RgCliente.setLayout(RgClienteLayout);
        RgClienteLayout.setHorizontalGroup(
            RgClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RgClienteLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(RgClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RgClienteLayout.createSequentialGroup()
                        .addGroup(RgClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(NomeClienteAlugar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(AnoCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGroup(RgClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RgClienteLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(RgClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CpfClienteAlugar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(RgClienteLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(RgClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(ModeloCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addGroup(RgClienteLayout.createSequentialGroup()
                                        .addComponent(DataDevolucao)
                                        .addGap(28, 28, 28)
                                        .addComponent(HoraDevolucao))))))
                    .addGroup(RgClienteLayout.createSequentialGroup()
                        .addComponent(DataRetirada)
                        .addGap(18, 18, 18)
                        .addComponent(HoraRetirada)))
                .addGap(96, 96, 96)
                .addGroup(RgClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addGroup(RgClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(LocalCarro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addComponent(PlacaCarro, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RgClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addComponent(Alugar)
                .addGap(228, 228, 228))
        );
        RgClienteLayout.setVerticalGroup(
            RgClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RgClienteLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(RgClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RgClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeClienteAlugar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CpfClienteAlugar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(RgClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RgClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(RgClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ModeloCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AnoCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PlacaCarro))
                .addGap(59, 59, 59)
                .addGroup(RgClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RgClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RgClienteLayout.createSequentialGroup()
                        .addGroup(RgClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LocalCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RgClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(DataRetirada)
                                .addComponent(HoraRetirada)
                                .addComponent(DataDevolucao)))
                        .addGap(40, 133, Short.MAX_VALUE))
                    .addGroup(RgClienteLayout.createSequentialGroup()
                        .addComponent(HoraDevolucao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(RgClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Alugar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45))))
        );

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(RgCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(544, 544, 544))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(278, Short.MAX_VALUE)
                .addComponent(RgCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(266, 266, 266))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(RgCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selecionarCliente(ActionEvent evt) {
        String nomeCliente = clientes[NomeClienteAlugar.getSelectedIndex()];
        if(nomeCliente.equalsIgnoreCase(Utils.SELECIONE)){
            DadosSession.setIndexCliente(0);
            DadosSession.setCliente(null);
        } else {
            DadosSession.setIndexCliente(getIndex(nomeCliente));
            DadosSession.setCliente(clienteService.consultarPorNome(nomeCliente));
        }
        this.rotas.goLotacao();
        fecharTelaLocacao();
    }

    private int getIndex(String nomeCliente) {
        int i = 0;
        int index = 0;
        for (String nome: clientes) {
            if(nomeCliente.equalsIgnoreCase(nome)){
                index = i;
            }
            i++;
        }
        return index;
    }

    private String[] buscarClientes() {
        LinkedList<Cliente> clientes = clienteService.listar();
        String[] listaRetorno = new String[clientes.size() + 1];
        int i = 1;
        listaRetorno[0] = Utils.SELECIONE;
        for (Cliente cliente: clientes) {
            listaRetorno[i] = cliente.getNome();
            i++;
        }
        return listaRetorno;
    }

    private void voltar(ActionEvent evt) {
        DadosSession.setIndexCliente(0);
        DadosSession.setCliente(null);
        switch (DadosSession.getCatalogo()){
            case 1:
                this.rotas.goCatalogo1();
            break;
            case 2:
                this.rotas.goCatalogo2();
            break;
            case 3:
                this.rotas.goCatalogo3();
            break;
            default:
                this.rotas.goCatalogo1();
        }
        fecharTelaLocacao();
    }

    private void fecharTelaLocacao() {
        this.setVisible(false);
    }

    private void alugar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlugarActionPerformed
        if(clientes[NomeClienteAlugar.getSelectedIndex()].equalsIgnoreCase(Utils.SELECIONE)){
            Alerta.WARNING("Alerta","Informe o cliente!");
        } else {
            Object[] options = { "OK", "CANCELAR"};
            String resposta = String.valueOf(JOptionPane.showOptionDialog(null, "Deseja confirmar a operação", "Aviso",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                    null, options, options[0]));
            if(resposta.equals("0")){
                Alerta.SUCESSO("Sucesso", "Operação Realizada com Sucesso");
                aluguelService.adicionar(montarAluguel());
                this.rotas.goHome();
                DadosSession.setCliente(null);
                DadosSession.setIndexCliente(0);
                fecharTelaLocacao();
            }
        }
    }

    private Aluguel montarAluguel() {
        Aluguel aluguel = new Aluguel();
        aluguel.setCliente(DadosSession.getCliente());
        aluguel.setCarro(DadosSession.getCarroAluguel());
        aluguel.setValorAluguel(DadosSession.getValorAluguel());
        aluguel.setDataDevolucao(DadosSession.getDataDevolucao());
        aluguel.setDataRetirada(DadosSession.getDataRetirada());
        aluguel.setLocalRetirada(DadosSession.getAgencia());
        aluguel.setUsuario(DadosSession.getUsuarioLogado());
        return aluguel;
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
            java.util.logging.Logger.getLogger(Locacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Locacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Locacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Locacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Locacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alugar;
    private javax.swing.JTextField AnoCarro;
    private javax.swing.JFormattedTextField CpfClienteAlugar;
    private javax.swing.JLabel DataDevolucao;
    private javax.swing.JLabel DataRetirada;
    private javax.swing.JLabel HoraDevolucao;
    private javax.swing.JLabel HoraRetirada;
    private javax.swing.JTextField LocalCarro;
    private javax.swing.JTextField ModeloCarro;
    private javax.swing.JComboBox NomeClienteAlugar;
    private javax.swing.JTextField PlacaCarro;
    private javax.swing.JPanel RgCliente;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
