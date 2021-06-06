/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;
import routes.Routes;
import service.UsuarioService;
import session.DadosSession;

import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class Catalago2 extends javax.swing.JFrame {

    private Routes rotas = new Routes();
    private UsuarioService usuarioService = new UsuarioService();

    /**
     * Creates new form Catalago1
     */
    public Catalago2() {
        if(DadosSession.existeUsuarioLogado()){
            initComponents();
            calcularValorAluguel();
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

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/fundo.png"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        GrupoFS = new javax.swing.JLabel();
        CardHb20 = new javax.swing.JPanel();
        NomeHb20 = new javax.swing.JLabel();
        FotoGol = new javax.swing.JLabel();
        AlugarHb20 = new javax.swing.JButton();
        RetiradaHb20 = new javax.swing.JLabel();
        DevolucaoHb20 = new javax.swing.JLabel();
        DataRetiradaHb20 = new javax.swing.JLabel();
        HoraRetiradaHb20 = new javax.swing.JLabel();
        DataDevolucaoHb20 = new javax.swing.JLabel();
        HoraDevolucaoHb20 = new javax.swing.JLabel();
        LocalHb20 = new javax.swing.JLabel();
        ValorHb20 = new javax.swing.JLabel();
        CardCronos = new javax.swing.JPanel();
        NomeCronos = new javax.swing.JLabel();
        FotoCrono = new javax.swing.JLabel();
        AlugarCronos = new javax.swing.JButton();
        RetiradaCronos = new javax.swing.JLabel();
        DevolucaoCronos = new javax.swing.JLabel();
        DataRetiradaCronos = new javax.swing.JLabel();
        DataDevolucaoCronos = new javax.swing.JLabel();
        HoraRetiradaCronos = new javax.swing.JLabel();
        HoraDevolucaoCronos = new javax.swing.JLabel();
        LocalCronos = new javax.swing.JLabel();
        ValorCronos = new javax.swing.JLabel();
        CardVersa = new javax.swing.JPanel();
        NomeVersa = new javax.swing.JLabel();
        FotoVersa = new javax.swing.JLabel();
        AlugarVersa = new javax.swing.JButton();
        RetiradaVersa = new javax.swing.JLabel();
        DevolucaoVersa = new javax.swing.JLabel();
        DataRetiradaVersa = new javax.swing.JLabel();
        DataDevolucaoVersa = new javax.swing.JLabel();
        HoraRetiradaVersa = new javax.swing.JLabel();
        HoraDevolucaoVersa = new javax.swing.JLabel();
        LocalVersa = new javax.swing.JLabel();
        ValorVersa = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Voltar = new javax.swing.JButton();
        Proximo = new javax.swing.JButton();
        Anterior = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GoCar Locadora de Carros");
        setBackground(new java.awt.Color(0, 0, 0));

        GrupoFS.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        GrupoFS.setForeground(new java.awt.Color(255, 255, 0));
        GrupoFS.setText("Grupo FS - Sedan");

        CardHb20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        NomeHb20.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        NomeHb20.setText("HB20s 1.6");

        FotoGol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/HB20s.png"))); // NOI18N

        AlugarHb20.setBackground(new java.awt.Color(255, 255, 51));
        AlugarHb20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AlugarHb20.setText("Alugar");

        RetiradaHb20.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        RetiradaHb20.setText("Retirada");

        DevolucaoHb20.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        DevolucaoHb20.setText("Devolução");

        DataRetiradaHb20.setText("Data");

        HoraRetiradaHb20.setText("Hora");

        DataDevolucaoHb20.setText("Data");

        HoraDevolucaoHb20.setText("Hora");

        LocalHb20.setText("Local");

        ValorHb20.setText("Valor");

        javax.swing.GroupLayout CardHb20Layout = new javax.swing.GroupLayout(CardHb20);
        CardHb20.setLayout(CardHb20Layout);
        CardHb20Layout.setHorizontalGroup(
            CardHb20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardHb20Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(CardHb20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LocalHb20)
                    .addComponent(HoraRetiradaHb20)
                    .addComponent(DataRetiradaHb20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CardHb20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardHb20Layout.createSequentialGroup()
                        .addComponent(ValorHb20)
                        .addGap(68, 68, 68))
                    .addGroup(CardHb20Layout.createSequentialGroup()
                        .addGroup(CardHb20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HoraDevolucaoHb20)
                            .addComponent(DataDevolucaoHb20))
                        .addContainerGap())))
            .addGroup(CardHb20Layout.createSequentialGroup()
                .addGroup(CardHb20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CardHb20Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(AlugarHb20))
                    .addGroup(CardHb20Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(NomeHb20)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardHb20Layout.createSequentialGroup()
                .addGroup(CardHb20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CardHb20Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(RetiradaHb20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DevolucaoHb20))
                    .addGroup(CardHb20Layout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addComponent(FotoGol, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        CardHb20Layout.setVerticalGroup(
            CardHb20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardHb20Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(NomeHb20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(FotoGol, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(CardHb20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RetiradaHb20)
                    .addComponent(DevolucaoHb20))
                .addGap(26, 26, 26)
                .addGroup(CardHb20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DataRetiradaHb20)
                    .addComponent(DataDevolucaoHb20))
                .addGap(26, 26, 26)
                .addGroup(CardHb20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HoraDevolucaoHb20)
                    .addComponent(HoraRetiradaHb20))
                .addGap(28, 28, 28)
                .addGroup(CardHb20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocalHb20)
                    .addComponent(ValorHb20))
                .addGap(18, 18, 18)
                .addComponent(AlugarHb20)
                .addGap(14, 14, 14))
        );

        NomeCronos.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        NomeCronos.setText("Cronos 1.6");

        FotoCrono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cronos.png"))); // NOI18N

        AlugarCronos.setBackground(new java.awt.Color(255, 255, 0));
        AlugarCronos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AlugarCronos.setText("Alugar");

        RetiradaCronos.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        RetiradaCronos.setText("Retirada");

        DevolucaoCronos.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        DevolucaoCronos.setText("Devolução");

        DataRetiradaCronos.setText("Data");

        DataDevolucaoCronos.setText("Data");

        HoraRetiradaCronos.setText("Hora");

        HoraDevolucaoCronos.setText("Hora");

        LocalCronos.setText("Local");

        ValorCronos.setText("Valor");

        javax.swing.GroupLayout CardCronosLayout = new javax.swing.GroupLayout(CardCronos);
        CardCronos.setLayout(CardCronosLayout);
        CardCronosLayout.setHorizontalGroup(
            CardCronosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardCronosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AlugarCronos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(CardCronosLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(CardCronosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CardCronosLayout.createSequentialGroup()
                        .addGroup(CardCronosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HoraRetiradaCronos)
                            .addComponent(LocalCronos))
                        .addGap(147, 147, 147)
                        .addGroup(CardCronosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ValorCronos)
                            .addComponent(HoraDevolucaoCronos))
                        .addGap(49, 71, Short.MAX_VALUE))
                    .addGroup(CardCronosLayout.createSequentialGroup()
                        .addComponent(DataRetiradaCronos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DataDevolucaoCronos)
                        .addGap(72, 72, 72))))
            .addGroup(CardCronosLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(CardCronosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CardCronosLayout.createSequentialGroup()
                        .addComponent(FotoCrono)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(CardCronosLayout.createSequentialGroup()
                        .addComponent(RetiradaCronos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DevolucaoCronos)
                        .addGap(35, 35, 35))))
            .addGroup(CardCronosLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(NomeCronos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CardCronosLayout.setVerticalGroup(
            CardCronosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardCronosLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(NomeCronos)
                .addGap(37, 37, 37)
                .addComponent(FotoCrono)
                .addGap(18, 18, 18)
                .addGroup(CardCronosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RetiradaCronos)
                    .addComponent(DevolucaoCronos))
                .addGap(18, 18, 18)
                .addGroup(CardCronosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DataRetiradaCronos)
                    .addComponent(DataDevolucaoCronos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(CardCronosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HoraRetiradaCronos)
                    .addComponent(HoraDevolucaoCronos))
                .addGap(31, 31, 31)
                .addGroup(CardCronosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocalCronos)
                    .addComponent(ValorCronos))
                .addGap(33, 33, 33)
                .addComponent(AlugarCronos)
                .addGap(24, 24, 24))
        );

        NomeVersa.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        NomeVersa.setText("Nissan Versa 1.6");

        FotoVersa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/versa.png"))); // NOI18N

        AlugarVersa.setBackground(new java.awt.Color(255, 255, 0));
        AlugarVersa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AlugarVersa.setText("Alugar");

        RetiradaVersa.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        RetiradaVersa.setText("Retirada");

        DevolucaoVersa.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        DevolucaoVersa.setText("Devolução");

        DataRetiradaVersa.setText("Data");

        DataDevolucaoVersa.setText("Data");

        HoraRetiradaVersa.setText("Hora");

        HoraDevolucaoVersa.setText("Hora");

        LocalVersa.setText("Local");

        ValorVersa.setText("Valor");

        javax.swing.GroupLayout CardVersaLayout = new javax.swing.GroupLayout(CardVersa);
        CardVersa.setLayout(CardVersaLayout);
        CardVersaLayout.setHorizontalGroup(
            CardVersaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardVersaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CardVersaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardVersaLayout.createSequentialGroup()
                        .addComponent(AlugarVersa, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardVersaLayout.createSequentialGroup()
                        .addComponent(NomeVersa)
                        .addGap(74, 74, 74))))
            .addGroup(CardVersaLayout.createSequentialGroup()
                .addGroup(CardVersaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CardVersaLayout.createSequentialGroup()
                        .addContainerGap(64, Short.MAX_VALUE)
                        .addComponent(FotoVersa))
                    .addGroup(CardVersaLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(RetiradaVersa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DevolucaoVersa)))
                .addGap(25, 25, 25))
            .addGroup(CardVersaLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(CardVersaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CardVersaLayout.createSequentialGroup()
                        .addComponent(LocalVersa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ValorVersa)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardVersaLayout.createSequentialGroup()
                        .addGroup(CardVersaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(CardVersaLayout.createSequentialGroup()
                                .addComponent(DataRetiradaVersa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DataDevolucaoVersa))
                            .addGroup(CardVersaLayout.createSequentialGroup()
                                .addComponent(HoraRetiradaVersa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(HoraDevolucaoVersa)))
                        .addGap(53, 53, 53))))
        );
        CardVersaLayout.setVerticalGroup(
            CardVersaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardVersaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(NomeVersa)
                .addGap(38, 38, 38)
                .addComponent(FotoVersa)
                .addGap(18, 18, 18)
                .addGroup(CardVersaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RetiradaVersa)
                    .addComponent(DevolucaoVersa))
                .addGap(18, 18, 18)
                .addGroup(CardVersaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DataRetiradaVersa)
                    .addComponent(DataDevolucaoVersa))
                .addGap(18, 18, 18)
                .addGroup(CardVersaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HoraDevolucaoVersa)
                    .addComponent(HoraRetiradaVersa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(CardVersaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocalVersa)
                    .addComponent(ValorVersa))
                .addGap(24, 24, 24)
                .addComponent(AlugarVersa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logop.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        Voltar.setBackground(new java.awt.Color(255, 255, 0));
        Voltar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar(evt);
            }
        });

        Anterior.setBackground(new java.awt.Color(255, 255, 0));
        Anterior.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Anterior.setText("Anterior");
        Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anterior(evt);
            }
        });

        Proximo.setBackground(new java.awt.Color(255, 255, 0));
        Proximo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Proximo.setText("Proximo");
        Proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximo(evt);
            }
        });

        jDesktopPane1.setLayer(GrupoFS, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(CardHb20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(CardCronos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(CardVersa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Voltar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Proximo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Anterior, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(CardHb20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(CardCronos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(CardVersa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(208, 208, 208)
                        .addComponent(GrupoFS))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(Voltar)
                        .addGap(248, 248, 248)
                        .addComponent(Anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248)
                        .addComponent(Proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GrupoFS)
                        .addGap(48, 48, 48))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CardVersa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(CardCronos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CardHb20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(19, 19, 19)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Proximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Anterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
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

    private void calcularValorAluguel() {
        System.out.println(DadosSession.getDataRetirada());
        //Date dataRetirada = new Date(DadosSession.getDataRetirada());
        //Date dataDevolucao = new Date(DadosSession.getDataDevolucao());
    }

    private void voltar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        this.rotas.goAlugar();
        fecharCatalogo2();
    }

    private void anterior(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        this.rotas.goCatalogo1();
        fecharCatalogo2();
    }

    private void proximo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        this.rotas.goCatalogo3();
        fecharCatalogo2();
    }

    private void fecharCatalogo2() {
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
            java.util.logging.Logger.getLogger(Catalago2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catalago2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catalago2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catalago2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catalago2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlugarCronos;
    private javax.swing.JButton AlugarHb20;
    private javax.swing.JButton AlugarVersa;
    private javax.swing.JPanel CardCronos;
    private javax.swing.JPanel CardHb20;
    private javax.swing.JPanel CardVersa;
    private javax.swing.JLabel DataDevolucaoCronos;
    private javax.swing.JLabel DataDevolucaoHb20;
    private javax.swing.JLabel DataDevolucaoVersa;
    private javax.swing.JLabel DataRetiradaCronos;
    private javax.swing.JLabel DataRetiradaHb20;
    private javax.swing.JLabel DataRetiradaVersa;
    private javax.swing.JLabel DevolucaoCronos;
    private javax.swing.JLabel DevolucaoHb20;
    private javax.swing.JLabel DevolucaoVersa;
    private javax.swing.JLabel FotoCrono;
    private javax.swing.JLabel FotoGol;
    private javax.swing.JLabel FotoVersa;
    private javax.swing.JLabel GrupoFS;
    private javax.swing.JLabel HoraDevolucaoCronos;
    private javax.swing.JLabel HoraDevolucaoHb20;
    private javax.swing.JLabel HoraDevolucaoVersa;
    private javax.swing.JLabel HoraRetiradaCronos;
    private javax.swing.JLabel HoraRetiradaHb20;
    private javax.swing.JLabel HoraRetiradaVersa;
    private javax.swing.JLabel LocalCronos;
    private javax.swing.JLabel LocalHb20;
    private javax.swing.JLabel LocalVersa;
    private javax.swing.JLabel NomeCronos;
    private javax.swing.JLabel NomeHb20;
    private javax.swing.JLabel NomeVersa;
    private javax.swing.JButton Proximo;
    private javax.swing.JButton Anterior;
    private javax.swing.JLabel RetiradaCronos;
    private javax.swing.JLabel RetiradaHb20;
    private javax.swing.JLabel RetiradaVersa;
    private javax.swing.JLabel ValorCronos;
    private javax.swing.JLabel ValorHb20;
    private javax.swing.JLabel ValorVersa;
    private javax.swing.JButton Voltar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
