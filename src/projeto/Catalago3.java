/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class Catalago3 extends javax.swing.JFrame {

    /**
     * Creates new form Catalago1
     */
    public Catalago3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/fundo.png"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        GrupoGC = new javax.swing.JLabel();
        CardCactos = new javax.swing.JPanel();
        NomeCactos = new javax.swing.JLabel();
        FotoCactos = new javax.swing.JLabel();
        AlugarCactos = new javax.swing.JButton();
        RetiradaCactos = new javax.swing.JLabel();
        DevolucaoCactos = new javax.swing.JLabel();
        DataRetiradaCactos = new javax.swing.JLabel();
        HoraRetiradaCactos = new javax.swing.JLabel();
        DataDevolucaoCactos = new javax.swing.JLabel();
        HoraDevolucaoCactos = new javax.swing.JLabel();
        LocalCactos = new javax.swing.JLabel();
        ValorCactos = new javax.swing.JLabel();
        CardKicks = new javax.swing.JPanel();
        NomeKicks = new javax.swing.JLabel();
        FotoKwid = new javax.swing.JLabel();
        AlugarKicks = new javax.swing.JButton();
        RetiradaKicks = new javax.swing.JLabel();
        DevolucaoKicks = new javax.swing.JLabel();
        DataRetiradaKicks = new javax.swing.JLabel();
        DataDevolucaoKicks = new javax.swing.JLabel();
        HoraRetiradaKicks = new javax.swing.JLabel();
        HoraDevolucaoKicks = new javax.swing.JLabel();
        LocalKicks = new javax.swing.JLabel();
        ValorKicks = new javax.swing.JLabel();
        CardDuster = new javax.swing.JPanel();
        NomeDuster = new javax.swing.JLabel();
        FotoDuster = new javax.swing.JLabel();
        AlugarDuster = new javax.swing.JButton();
        RetiradaDuster = new javax.swing.JLabel();
        DevolucaoDuster = new javax.swing.JLabel();
        DataRetiradaDuster = new javax.swing.JLabel();
        DataDevolucaoDuster = new javax.swing.JLabel();
        HoraRetiradaDuster = new javax.swing.JLabel();
        HoraDevolucaoDuster = new javax.swing.JLabel();
        LocalDuster = new javax.swing.JLabel();
        ValorDuster = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GoCar Locadora de Carros");
        setBackground(new java.awt.Color(0, 0, 0));

        GrupoGC.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        GrupoGC.setForeground(new java.awt.Color(255, 255, 0));
        GrupoGC.setText("Grupo GC - Compacto Automático");

        CardCactos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        NomeCactos.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        NomeCactos.setText("Cactos 1.6");

        FotoCactos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cactos.png"))); // NOI18N

        AlugarCactos.setBackground(new java.awt.Color(255, 255, 51));
        AlugarCactos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AlugarCactos.setText("Alugar");

        RetiradaCactos.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        RetiradaCactos.setText("Retirada");

        DevolucaoCactos.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        DevolucaoCactos.setText("Devolução");

        DataRetiradaCactos.setText("Data");

        HoraRetiradaCactos.setText("Hora");

        DataDevolucaoCactos.setText("Data");

        HoraDevolucaoCactos.setText("Hora");

        LocalCactos.setText("Local");

        ValorCactos.setText("Valor");

        javax.swing.GroupLayout CardCactosLayout = new javax.swing.GroupLayout(CardCactos);
        CardCactos.setLayout(CardCactosLayout);
        CardCactosLayout.setHorizontalGroup(
            CardCactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardCactosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NomeCactos)
                .addGap(102, 102, 102))
            .addGroup(CardCactosLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(AlugarCactos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(CardCactosLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(CardCactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LocalCactos)
                    .addComponent(HoraRetiradaCactos)
                    .addComponent(DataRetiradaCactos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CardCactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardCactosLayout.createSequentialGroup()
                        .addComponent(ValorCactos)
                        .addGap(68, 68, 68))
                    .addGroup(CardCactosLayout.createSequentialGroup()
                        .addGroup(CardCactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HoraDevolucaoCactos)
                            .addComponent(DataDevolucaoCactos))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardCactosLayout.createSequentialGroup()
                .addGroup(CardCactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CardCactosLayout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addComponent(FotoCactos, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CardCactosLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(RetiradaCactos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DevolucaoCactos)))
                .addGap(36, 36, 36))
        );
        CardCactosLayout.setVerticalGroup(
            CardCactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardCactosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(NomeCactos)
                .addGap(32, 32, 32)
                .addComponent(FotoCactos, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(CardCactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RetiradaCactos)
                    .addComponent(DevolucaoCactos))
                .addGap(13, 13, 13)
                .addGroup(CardCactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DataRetiradaCactos)
                    .addComponent(DataDevolucaoCactos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CardCactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HoraRetiradaCactos)
                    .addComponent(HoraDevolucaoCactos))
                .addGap(43, 43, 43)
                .addGroup(CardCactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocalCactos)
                    .addComponent(ValorCactos))
                .addGap(32, 32, 32)
                .addComponent(AlugarCactos)
                .addGap(21, 21, 21))
        );

        NomeKicks.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        NomeKicks.setText("Kicks 1.6");

        FotoKwid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/kicks.png"))); // NOI18N

        AlugarKicks.setBackground(new java.awt.Color(255, 255, 0));
        AlugarKicks.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AlugarKicks.setText("Alugar");

        RetiradaKicks.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        RetiradaKicks.setText("Retirada");

        DevolucaoKicks.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        DevolucaoKicks.setText("Devolução");

        DataRetiradaKicks.setText("Data");

        DataDevolucaoKicks.setText("Data");

        HoraRetiradaKicks.setText("Hora");

        HoraDevolucaoKicks.setText("Hora");

        LocalKicks.setText("Local");

        ValorKicks.setText("Valor");

        javax.swing.GroupLayout CardKicksLayout = new javax.swing.GroupLayout(CardKicks);
        CardKicks.setLayout(CardKicksLayout);
        CardKicksLayout.setHorizontalGroup(
            CardKicksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardKicksLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(CardKicksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardKicksLayout.createSequentialGroup()
                        .addComponent(NomeKicks)
                        .addGap(118, 118, 118))
                    .addGroup(CardKicksLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(CardKicksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CardKicksLayout.createSequentialGroup()
                                .addComponent(LocalKicks)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ValorKicks))
                            .addGroup(CardKicksLayout.createSequentialGroup()
                                .addGroup(CardKicksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(HoraRetiradaKicks)
                                    .addComponent(DataRetiradaKicks))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(CardKicksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DataDevolucaoKicks, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(HoraDevolucaoKicks, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardKicksLayout.createSequentialGroup()
                        .addComponent(FotoKwid)
                        .addGap(60, 60, 60))
                    .addGroup(CardKicksLayout.createSequentialGroup()
                        .addComponent(RetiradaKicks)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DevolucaoKicks)
                        .addGap(29, 29, 29))))
            .addGroup(CardKicksLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(AlugarKicks, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        CardKicksLayout.setVerticalGroup(
            CardKicksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardKicksLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(NomeKicks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FotoKwid)
                .addGap(33, 33, 33)
                .addGroup(CardKicksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RetiradaKicks)
                    .addComponent(DevolucaoKicks))
                .addGap(18, 18, 18)
                .addGroup(CardKicksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DataDevolucaoKicks)
                    .addComponent(DataRetiradaKicks))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CardKicksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HoraRetiradaKicks)
                    .addComponent(HoraDevolucaoKicks))
                .addGap(31, 31, 31)
                .addGroup(CardKicksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocalKicks)
                    .addComponent(ValorKicks))
                .addGap(35, 35, 35)
                .addComponent(AlugarKicks)
                .addGap(22, 22, 22))
        );

        NomeDuster.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        NomeDuster.setText("Duster 1.6");

        FotoDuster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/duster.png"))); // NOI18N

        AlugarDuster.setBackground(new java.awt.Color(255, 255, 0));
        AlugarDuster.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AlugarDuster.setText("Alugar");

        RetiradaDuster.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        RetiradaDuster.setText("Retirada");

        DevolucaoDuster.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        DevolucaoDuster.setText("Devolução");

        DataRetiradaDuster.setText("Data");

        DataDevolucaoDuster.setText("Data");

        HoraRetiradaDuster.setText("Hora");

        HoraDevolucaoDuster.setText("Hora");

        LocalDuster.setText("Local");

        ValorDuster.setText("Valor");

        javax.swing.GroupLayout CardDusterLayout = new javax.swing.GroupLayout(CardDuster);
        CardDuster.setLayout(CardDusterLayout);
        CardDusterLayout.setHorizontalGroup(
            CardDusterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardDusterLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(DataRetiradaDuster)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DataDevolucaoDuster)
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardDusterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NomeDuster)
                .addGap(105, 105, 105))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardDusterLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(RetiradaDuster)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DevolucaoDuster)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardDusterLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(CardDusterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HoraRetiradaDuster)
                    .addComponent(LocalDuster))
                .addGap(167, 167, 167)
                .addGroup(CardDusterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HoraDevolucaoDuster)
                    .addComponent(ValorDuster))
                .addGap(60, 60, 60))
            .addGroup(CardDusterLayout.createSequentialGroup()
                .addGroup(CardDusterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CardDusterLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(FotoDuster))
                    .addGroup(CardDusterLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(AlugarDuster, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        CardDusterLayout.setVerticalGroup(
            CardDusterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardDusterLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(NomeDuster)
                .addGap(28, 28, 28)
                .addComponent(FotoDuster)
                .addGap(52, 52, 52)
                .addGroup(CardDusterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RetiradaDuster)
                    .addComponent(DevolucaoDuster))
                .addGap(18, 18, 18)
                .addGroup(CardDusterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DataRetiradaDuster)
                    .addComponent(DataDevolucaoDuster))
                .addGap(18, 18, 18)
                .addGroup(CardDusterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HoraRetiradaDuster)
                    .addComponent(HoraDevolucaoDuster))
                .addGap(36, 36, 36)
                .addGroup(CardDusterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocalDuster)
                    .addComponent(ValorDuster))
                .addGap(18, 18, 18)
                .addComponent(AlugarDuster, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Imagem1.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jDesktopPane1.setLayer(GrupoGC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(CardCactos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(CardKicks, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(CardDuster, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(CardCactos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(GrupoGC)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(CardKicks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(CardDuster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(GrupoGC))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CardCactos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CardKicks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CardDuster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(96, 96, 96))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 293, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Catalago3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catalago3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catalago3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catalago3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catalago3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlugarCactos;
    private javax.swing.JButton AlugarDuster;
    private javax.swing.JButton AlugarKicks;
    private javax.swing.JPanel CardCactos;
    private javax.swing.JPanel CardDuster;
    private javax.swing.JPanel CardKicks;
    private javax.swing.JLabel DataDevolucaoCactos;
    private javax.swing.JLabel DataDevolucaoDuster;
    private javax.swing.JLabel DataDevolucaoKicks;
    private javax.swing.JLabel DataRetiradaCactos;
    private javax.swing.JLabel DataRetiradaDuster;
    private javax.swing.JLabel DataRetiradaKicks;
    private javax.swing.JLabel DevolucaoCactos;
    private javax.swing.JLabel DevolucaoDuster;
    private javax.swing.JLabel DevolucaoKicks;
    private javax.swing.JLabel FotoCactos;
    private javax.swing.JLabel FotoDuster;
    private javax.swing.JLabel FotoKwid;
    private javax.swing.JLabel GrupoGC;
    private javax.swing.JLabel HoraDevolucaoCactos;
    private javax.swing.JLabel HoraDevolucaoDuster;
    private javax.swing.JLabel HoraDevolucaoKicks;
    private javax.swing.JLabel HoraRetiradaCactos;
    private javax.swing.JLabel HoraRetiradaDuster;
    private javax.swing.JLabel HoraRetiradaKicks;
    private javax.swing.JLabel LocalCactos;
    private javax.swing.JLabel LocalDuster;
    private javax.swing.JLabel LocalKicks;
    private javax.swing.JLabel NomeCactos;
    private javax.swing.JLabel NomeDuster;
    private javax.swing.JLabel NomeKicks;
    private javax.swing.JLabel RetiradaCactos;
    private javax.swing.JLabel RetiradaDuster;
    private javax.swing.JLabel RetiradaKicks;
    private javax.swing.JLabel ValorCactos;
    private javax.swing.JLabel ValorDuster;
    private javax.swing.JLabel ValorKicks;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
