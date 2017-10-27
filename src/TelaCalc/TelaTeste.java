package TelaCalc;

import leidecoulomb.CargaDeUmaParticula;
import leidecoulomb.DistanciaEntreDuasParticulas;
import leidecoulomb.ForcaEletrostatica;
import leidecoulomb.LeiDECoulomb;
import javax.swing.JOptionPane;
/**
 *
 * @author InfoWay
 */
public class TelaTeste extends javax.swing.JFrame {

    /**
     * Creates new form TelaTeste
     */
    public TelaTeste() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabelCarga1 = new javax.swing.JLabel();
        jLabelCarga2 = new javax.swing.JLabel();
        jLabelDistancia = new javax.swing.JLabel();
        jLabelX1 = new javax.swing.JLabel();
        jLabelY1 = new javax.swing.JLabel();
        jLabelMetros = new javax.swing.JLabel();
        CampoCarga1 = new javax.swing.JTextField();
        CampoX1 = new javax.swing.JTextField();
        CampoY1 = new javax.swing.JTextField();
        CampoDistancia = new javax.swing.JTextField();
        jLabelCoordenadas1 = new javax.swing.JLabel();
        jLabelX2 = new javax.swing.JLabel();
        jLabeY2 = new javax.swing.JLabel();
        CampoX2 = new javax.swing.JTextField();
        CampoY2 = new javax.swing.JTextField();
        jLabelCoordenadas2 = new javax.swing.JLabel();
        CampoCarga2 = new javax.swing.JTextField();
        jComboBoxPrefixos1 = new javax.swing.JComboBox<>();
        jLabelCoulomb1 = new javax.swing.JLabel();
        jLabelCoulomb2 = new javax.swing.JLabel();
        CampoResposta = new javax.swing.JTextField();
        BotaoDetalhes = new javax.swing.JButton();
        jLabeForca = new javax.swing.JLabel();
        jLabelNewton = new javax.swing.JLabel();
        CampoForca = new javax.swing.JTextField();
        jComboBoxPrefixos2 = new javax.swing.JComboBox<>();
        jComboBoxPrefixos3 = new javax.swing.JComboBox<>();
        jComboBoxPrefixos4 = new javax.swing.JComboBox<>();
        Botao1 = new javax.swing.JButton();
        Botao4 = new javax.swing.JButton();
        Botao7 = new javax.swing.JButton();
        Botao2 = new javax.swing.JButton();
        Botao6 = new javax.swing.JButton();
        Botao3 = new javax.swing.JButton();
        Botao5 = new javax.swing.JButton();
        Botao8 = new javax.swing.JButton();
        Botao9 = new javax.swing.JButton();
        BotaoPonto = new javax.swing.JButton();
        Botao0 = new javax.swing.JButton();
        BotaoIgual = new javax.swing.JButton();
        BotaoClear = new javax.swing.JButton();
        jLabelResposta = new javax.swing.JLabel();
        BotaoLimparTudo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BarraDeMenu = new javax.swing.JMenuBar();
        MenuCalcular = new javax.swing.JMenu();
        MenuForcaEletrostatica = new javax.swing.JMenu();
        MenuForcaR1 = new javax.swing.JMenuItem();
        MenuForcaR2 = new javax.swing.JMenuItem();
        MenuCarga = new javax.swing.JMenu();
        MenuCargaR1 = new javax.swing.JMenuItem();
        MenuCargaR2 = new javax.swing.JMenuItem();
        MenuDistancia = new javax.swing.JMenu();
        MenuDistanciaR1 = new javax.swing.JMenuItem();
        MenuDistanciaR2 = new javax.swing.JMenuItem();
        MenuEditar = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        MenuAjuda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(200, 200));
        setName("CalculadoraDeCoulomb"); // NOI18N
        setResizable(false);

        jLabelCarga1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelCarga1.setText("Carga 1:");

        jLabelCarga2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelCarga2.setText("Carga 2:");

        jLabelDistancia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelDistancia.setText("Distância:");

        jLabelX1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelX1.setText("x:");

        jLabelY1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelY1.setText("y:");

        jLabelMetros.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelMetros.setText("m");

        CampoCarga1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCarga1ActionPerformed(evt);
            }
        });

        jLabelCoordenadas1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelCoordenadas1.setText("Coordenadas:");

        jLabelX2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelX2.setText("x:");

        jLabeY2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabeY2.setText("y:");

        jLabelCoordenadas2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelCoordenadas2.setText("Coordenadas:");

        jComboBoxPrefixos1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBoxPrefixos1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10^24", "10^21", "10^18", "10^15", "10^12", "10^9", "10^6", "10^3", "10^2", "10", "10^0", "10^-1", "10^-2", "10^-3", "10^-4", "10^-5", "10^-6", "10^-7", "10^-8", "10^-9", "10^-10", "10^-11", "10^-12", "10^-15", "10^-16", "10^-17", "10^-18", "10^-19", "10^-20", "10^-21", "10^-22", "10^-23", "10^-24" }));
        jComboBoxPrefixos1.setToolTipText("");
        jComboBoxPrefixos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPrefixos1ActionPerformed(evt);
            }
        });

        jLabelCoulomb1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelCoulomb1.setText("C");

        jLabelCoulomb2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelCoulomb2.setText("C");

        CampoResposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoRespostaActionPerformed(evt);
            }
        });

        BotaoDetalhes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BotaoDetalhes.setText("Mostrar Detalhes");
        BotaoDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDetalhesActionPerformed(evt);
            }
        });

        jLabeForca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabeForca.setText("Força:");

        jLabelNewton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelNewton.setText("N");

        jComboBoxPrefixos2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBoxPrefixos2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10^24", "10^21", "10^18", "10^15", "10^12", "10^9", "10^6", "10^3", "10^2", "10", "10^0", "10^-1", "10^-2", "10^-3", "10^-4", "10^-5", "10^-6", "10^-7", "10^-8", "10^-9", "10^-10", "10^-11", "10^-12", "10^-15", "10^-16", "10^-17", "10^-18", "10^-19", "10^-20", "10^-21", "10^-22", "10^-23", "10^-24" }));
        jComboBoxPrefixos2.setToolTipText("");

        jComboBoxPrefixos3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBoxPrefixos3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10^24", "10^21", "10^18", "10^15", "10^12", "10^9", "10^6", "10^3", "10^2", "10", "10^0", "10^-1", "10^-2", "10^-3", "10^-4", "10^-5", "10^-6", "10^-7", "10^-8", "10^-9", "10^-10", "10^-11", "10^-12", "10^-15", "10^-16", "10^-17", "10^-18", "10^-19", "10^-20", "10^-21", "10^-22", "10^-23", "10^-24" }));
        jComboBoxPrefixos3.setToolTipText("");

        jComboBoxPrefixos4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBoxPrefixos4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10^24", "10^21", "10^18", "10^15", "10^12", "10^9", "10^6", "10^3", "10^2", "10", "10^0", "10^-1", "10^-2", "10^-3", "10^-4", "10^-5", "10^-6", "10^-7", "10^-8", "10^-9", "10^-10", "10^-11", "10^-12", "10^-15", "10^-16", "10^-17", "10^-18", "10^-19", "10^-20", "10^-21", "10^-22", "10^-23", "10^-24" }));
        jComboBoxPrefixos4.setToolTipText("");

        Botao1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Botao1.setText("1");
        Botao1.setMinimumSize(new java.awt.Dimension(50, 35));
        Botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao1ActionPerformed(evt);
            }
        });

        Botao4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Botao4.setText("4");
        Botao4.setMinimumSize(new java.awt.Dimension(50, 35));
        Botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao4ActionPerformed(evt);
            }
        });

        Botao7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Botao7.setText("7");
        Botao7.setMinimumSize(new java.awt.Dimension(50, 35));
        Botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao7ActionPerformed(evt);
            }
        });

        Botao2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Botao2.setText("2");
        Botao2.setMinimumSize(new java.awt.Dimension(50, 35));
        Botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao2ActionPerformed(evt);
            }
        });

        Botao6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Botao6.setText("6");
        Botao6.setMinimumSize(new java.awt.Dimension(50, 35));
        Botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao6ActionPerformed(evt);
            }
        });

        Botao3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Botao3.setText("3");
        Botao3.setMinimumSize(new java.awt.Dimension(50, 35));
        Botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao3ActionPerformed(evt);
            }
        });

        Botao5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Botao5.setText("5");
        Botao5.setMinimumSize(new java.awt.Dimension(50, 35));
        Botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao5ActionPerformed(evt);
            }
        });

        Botao8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Botao8.setText("8");
        Botao8.setMinimumSize(new java.awt.Dimension(50, 35));
        Botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao8ActionPerformed(evt);
            }
        });

        Botao9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Botao9.setText("9");
        Botao9.setMinimumSize(new java.awt.Dimension(50, 35));
        Botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao9ActionPerformed(evt);
            }
        });

        BotaoPonto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BotaoPonto.setText(".");
        BotaoPonto.setMinimumSize(new java.awt.Dimension(50, 35));
        BotaoPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPontoActionPerformed(evt);
            }
        });

        Botao0.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Botao0.setText("0");
        Botao0.setMinimumSize(new java.awt.Dimension(50, 35));
        Botao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao0ActionPerformed(evt);
            }
        });

        BotaoIgual.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BotaoIgual.setText("=");
        BotaoIgual.setMinimumSize(new java.awt.Dimension(50, 35));
        BotaoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoIgualActionPerformed(evt);
            }
        });

        BotaoClear.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BotaoClear.setText("C");
        BotaoClear.setMinimumSize(new java.awt.Dimension(50, 35));
        BotaoClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoClearActionPerformed(evt);
            }
        });

        jLabelResposta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelResposta.setText("Resposta:");

        BotaoLimparTudo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BotaoLimparTudo.setText("Limpar Tudo");
        BotaoLimparTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparTudoActionPerformed(evt);
            }
        });

        jLabel1.setText("X");

        jLabel2.setText("X");

        jLabel3.setText("X");

        jLabel4.setText("X");

        MenuCalcular.setText("Calcular");

        MenuForcaEletrostatica.setText("Força Eletrostatica");

        MenuForcaR1.setText("R1");
        MenuForcaR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuForcaR1ActionPerformed(evt);
            }
        });
        MenuForcaEletrostatica.add(MenuForcaR1);

        MenuForcaR2.setText("R2");
        MenuForcaEletrostatica.add(MenuForcaR2);

        MenuCalcular.add(MenuForcaEletrostatica);

        MenuCarga.setText("Carga da Partícula");

        MenuCargaR1.setText("R1");
        MenuCargaR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCargaR1ActionPerformed(evt);
            }
        });
        MenuCarga.add(MenuCargaR1);

        MenuCargaR2.setText("R2");
        MenuCargaR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCargaR2ActionPerformed(evt);
            }
        });
        MenuCarga.add(MenuCargaR2);

        MenuCalcular.add(MenuCarga);

        MenuDistancia.setText("Distância entre Partículas");

        MenuDistanciaR1.setText("R1");
        MenuDistancia.add(MenuDistanciaR1);

        MenuDistanciaR2.setText("R2");
        MenuDistancia.add(MenuDistanciaR2);

        MenuCalcular.add(MenuDistancia);

        BarraDeMenu.add(MenuCalcular);

        MenuEditar.setText("Visualizar");

        jMenuItem3.setText("Histórico");
        MenuEditar.add(jMenuItem3);

        BarraDeMenu.add(MenuEditar);

        MenuAjuda.setText("Ajuda");

        jMenuItem1.setText("Manual");
        MenuAjuda.add(jMenuItem1);

        jMenuItem2.setText("Sobre...");
        MenuAjuda.add(jMenuItem2);

        BarraDeMenu.add(MenuAjuda);

        setJMenuBar(BarraDeMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabelY1)
                                    .addGap(18, 18, 18)
                                    .addComponent(CampoY1))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabelX1)
                                    .addGap(18, 18, 18)
                                    .addComponent(CampoX1))
                                .addComponent(jLabelCoordenadas1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCarga1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CampoCarga1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(16, 16, 16)
                                .addComponent(jComboBoxPrefixos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelCoulomb1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabeY2)
                                .addGap(18, 18, 18)
                                .addComponent(CampoY2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(152, 152, 152))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCarga2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CampoCarga2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(19, 19, 19)
                                .addComponent(jComboBoxPrefixos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelCoulomb2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelX2)
                                .addGap(18, 18, 18)
                                .addComponent(CampoX2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelCoordenadas2))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDistancia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabeForca)
                                .addGap(25, 25, 25)
                                .addComponent(CampoForca, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxPrefixos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxPrefixos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNewton)
                            .addComponent(jLabelMetros))
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BotaoLimparTudo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BotaoDetalhes))
                                    .addComponent(CampoResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelResposta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BotaoClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BotaoPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BotaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDistancia)
                            .addComponent(CampoDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMetros)
                            .addComponent(jComboBoxPrefixos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabeForca)
                            .addComponent(CampoForca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNewton)
                            .addComponent(jComboBoxPrefixos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelCarga1)
                                    .addComponent(CampoCarga1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxPrefixos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCoulomb1)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelCoordenadas1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelX1)
                                    .addComponent(CampoX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelY1)
                                    .addComponent(CampoY1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelCarga2)
                                    .addComponent(CampoCarga2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCoulomb2)
                                    .addComponent(jComboBoxPrefixos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelCoordenadas2)
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelX2)
                                    .addComponent(CampoX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabeY2)
                                    .addComponent(CampoY2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(11, 11, 11)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelResposta)
                        .addGap(18, 18, 18)
                        .addComponent(CampoResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoDetalhes)
                            .addComponent(BotaoLimparTudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BotaoClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotaoPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(BotaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao7ActionPerformed
        // TODO add your handling code here:
        CampoCarga1.setText(CampoCarga1.getText() + "7");
        CampoCarga2.setText(CampoCarga2.getText() + "7");
        CampoDistancia.setText(CampoDistancia.getText() + "7");
        CampoForca.setText(CampoForca.getText() + "7");
        CampoX1.setText(CampoX1.getText() + "7");
        CampoY1.setText(CampoY1.getText() + "7");
        CampoX2.setText(CampoX2.getText() + "7");
        CampoY2.setText(CampoY2.getText() + "7");
    }//GEN-LAST:event_Botao7ActionPerformed

    private void BotaoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoIgualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoIgualActionPerformed

    private void BotaoClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoClearActionPerformed

    private void CampoRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoRespostaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoRespostaActionPerformed

    private void MenuCargaR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCargaR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuCargaR1ActionPerformed

    private void MenuCargaR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCargaR2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuCargaR2ActionPerformed

    private void CampoCarga1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCarga1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCarga1ActionPerformed

    private void Botao0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao0ActionPerformed
        // TODO add your handling code here:
        CampoCarga1.setText(CampoCarga1.getText() + "0");
        CampoCarga2.setText(CampoCarga2.getText() + "0");
        CampoDistancia.setText(CampoDistancia.getText() + "0");
        CampoForca.setText(CampoForca.getText() + "0");
        CampoX1.setText(CampoX1.getText() + "0");
        CampoY1.setText(CampoY1.getText() + "0");
        CampoX2.setText(CampoX2.getText() + "0");
        CampoY2.setText(CampoY2.getText() + "0");
    }//GEN-LAST:event_Botao0ActionPerformed

    private void Botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao1ActionPerformed
        // TODO add your handling code here:
        CampoCarga1.setText(CampoCarga1.getText() + "1");
        CampoCarga2.setText(CampoCarga2.getText() + "1");
        CampoDistancia.setText(CampoDistancia.getText() + "1");
        CampoForca.setText(CampoForca.getText() + "1");
        CampoX1.setText(CampoX1.getText() + "1");
        CampoY1.setText(CampoY1.getText() + "1");
        CampoX2.setText(CampoX2.getText() + "1");
        CampoY2.setText(CampoY2.getText() + "1");
    }//GEN-LAST:event_Botao1ActionPerformed

    private void Botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao2ActionPerformed
        // TODO add your handling code here:
        CampoCarga1.setText(CampoCarga1.getText() + "2");
        CampoCarga2.setText(CampoCarga2.getText() + "2");
        CampoDistancia.setText(CampoDistancia.getText() + "2");
        CampoForca.setText(CampoForca.getText() + "2");
        CampoX1.setText(CampoX1.getText() + "2");
        CampoY1.setText(CampoY1.getText() + "2");
        CampoX2.setText(CampoX2.getText() + "2");
        CampoY2.setText(CampoY2.getText() + "2");
    }//GEN-LAST:event_Botao2ActionPerformed

    private void Botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao3ActionPerformed
        // TODO add your handling code here:
        CampoCarga1.setText(CampoCarga1.getText() + "3");
        CampoCarga2.setText(CampoCarga2.getText() + "3");
        CampoDistancia.setText(CampoDistancia.getText() + "3");
        CampoForca.setText(CampoForca.getText() + "3");
        CampoX1.setText(CampoX1.getText() + "3");
        CampoY1.setText(CampoY1.getText() + "3");
        CampoX2.setText(CampoX2.getText() + "3");
        CampoY2.setText(CampoY2.getText() + "3");
    }//GEN-LAST:event_Botao3ActionPerformed

    private void Botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao4ActionPerformed
        // TODO add your handling code here:
        CampoCarga1.setText(CampoCarga1.getText() + "4");
        CampoCarga2.setText(CampoCarga2.getText() + "4");
        CampoDistancia.setText(CampoDistancia.getText() + "4");
        CampoForca.setText(CampoForca.getText() + "4");
        CampoX1.setText(CampoX1.getText() + "4");
        CampoY1.setText(CampoY1.getText() + "4");
        CampoX2.setText(CampoX2.getText() + "4");
        CampoY2.setText(CampoY2.getText() + "4");
    }//GEN-LAST:event_Botao4ActionPerformed

    private void Botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao5ActionPerformed
        // TODO add your handling code here:
        CampoCarga1.setText(CampoCarga1.getText() + "5");
            

        CampoCarga2.setText(CampoCarga2.getText() + "5");
        CampoDistancia.setText(CampoDistancia.getText() + "5");
        CampoForca.setText(CampoForca.getText() + "5");
        CampoX1.setText(CampoX1.getText() + "5");
        CampoY1.setText(CampoY1.getText() + "5");
        CampoX2.setText(CampoX2.getText() + "5");
        CampoY2.setText(CampoY2.getText() + "5");
    }//GEN-LAST:event_Botao5ActionPerformed

    private void Botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao6ActionPerformed
        // TODO add your handling code here:
        CampoCarga1.setText(CampoCarga1.getText() + "6");
        CampoCarga2.setText(CampoCarga2.getText() + "6");
        CampoDistancia.setText(CampoDistancia.getText() + "6");
        CampoForca.setText(CampoForca.getText() + "6");
        CampoX1.setText(CampoX1.getText() + "6");
        CampoY1.setText(CampoY1.getText() + "6");
        CampoX2.setText(CampoX2.getText() + "6");
        CampoY2.setText(CampoY2.getText() + "6");
    }//GEN-LAST:event_Botao6ActionPerformed

    private void Botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao8ActionPerformed
        // TODO add your handling code here:
        CampoCarga1.setText(CampoCarga1.getText() + "8");
        CampoCarga2.setText(CampoCarga2.getText() + "8");
        CampoDistancia.setText(CampoDistancia.getText() + "8");
        CampoForca.setText(CampoForca.getText() + "8");
        CampoX1.setText(CampoX1.getText() + "8");
        CampoY1.setText(CampoY1.getText() + "8");
        CampoX2.setText(CampoX2.getText() + "8");
        CampoY2.setText(CampoY2.getText() + "8");
    }//GEN-LAST:event_Botao8ActionPerformed

    private void Botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao9ActionPerformed
        // TODO add your handling code here:
        CampoCarga1.setText(CampoCarga1.getText() + "9");
        CampoCarga2.setText(CampoCarga2.getText() + "9");
        CampoDistancia.setText(CampoDistancia.getText() + "9");
        CampoForca.setText(CampoForca.getText() + "9");
        CampoX1.setText(CampoX1.getText() + "9");
        CampoY1.setText(CampoY1.getText() + "9");
        CampoX2.setText(CampoX2.getText() + "9");
        CampoY2.setText(CampoY2.getText() + "9");
    }//GEN-LAST:event_Botao9ActionPerformed

    private void BotaoPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPontoActionPerformed
        // TODO add your handling code here:
        CampoCarga1.setText(CampoCarga1.getText() + ".");
        CampoCarga2.setText(CampoCarga2.getText() + ".");
        CampoDistancia.setText(CampoDistancia.getText() + ".");
        CampoForca.setText(CampoForca.getText() + ".");
        CampoX1.setText(CampoX1.getText() + ".");
        CampoY1.setText(CampoY1.getText() + ".");
        CampoX2.setText(CampoX2.getText() + ".");
        CampoY2.setText(CampoY2.getText() + ".");
    }//GEN-LAST:event_BotaoPontoActionPerformed

    private void BotaoLimparTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparTudoActionPerformed
        // TODO add your handling code here:
        CampoCarga1.setText("");
        CampoCarga2.setText("");
        CampoDistancia.setText("");
        CampoForca.setText("");
        CampoX1.setText("");
        CampoY1.setText("");
        CampoX2.setText("");
        CampoY2.setText("");
        CampoResposta.setText("");
    }//GEN-LAST:event_BotaoLimparTudoActionPerformed

    private void BotaoDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDetalhesActionPerformed
        // TODO add your handling code here:
        JOptionPane.showInputDialog("Vai dar certo");
    }//GEN-LAST:event_BotaoDetalhesActionPerformed

    private void jComboBoxPrefixos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPrefixos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPrefixos1ActionPerformed

    private void MenuForcaR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuForcaR1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_MenuForcaR1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTeste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraDeMenu;
    private javax.swing.JButton Botao0;
    private javax.swing.JButton Botao1;
    private javax.swing.JButton Botao2;
    private javax.swing.JButton Botao3;
    private javax.swing.JButton Botao4;
    private javax.swing.JButton Botao5;
    private javax.swing.JButton Botao6;
    private javax.swing.JButton Botao7;
    private javax.swing.JButton Botao8;
    private javax.swing.JButton Botao9;
    private javax.swing.JButton BotaoClear;
    private javax.swing.JButton BotaoDetalhes;
    private javax.swing.JButton BotaoIgual;
    private javax.swing.JButton BotaoLimparTudo;
    private javax.swing.JButton BotaoPonto;
    private javax.swing.JTextField CampoCarga1;
    private javax.swing.JTextField CampoCarga2;
    private javax.swing.JTextField CampoDistancia;
    private javax.swing.JTextField CampoForca;
    private javax.swing.JTextField CampoResposta;
    private javax.swing.JTextField CampoX1;
    private javax.swing.JTextField CampoX2;
    private javax.swing.JTextField CampoY1;
    private javax.swing.JTextField CampoY2;
    private javax.swing.JMenu MenuAjuda;
    private javax.swing.JMenu MenuCalcular;
    private javax.swing.JMenu MenuCarga;
    private javax.swing.JMenuItem MenuCargaR1;
    private javax.swing.JMenuItem MenuCargaR2;
    private javax.swing.JMenu MenuDistancia;
    private javax.swing.JMenuItem MenuDistanciaR1;
    private javax.swing.JMenuItem MenuDistanciaR2;
    private javax.swing.JMenu MenuEditar;
    private javax.swing.JMenu MenuForcaEletrostatica;
    private javax.swing.JMenuItem MenuForcaR1;
    private javax.swing.JMenuItem MenuForcaR2;
    private javax.swing.JComboBox<String> jComboBoxPrefixos1;
    private javax.swing.JComboBox<String> jComboBoxPrefixos2;
    private javax.swing.JComboBox<String> jComboBoxPrefixos3;
    private javax.swing.JComboBox<String> jComboBoxPrefixos4;
    private javax.swing.JLabel jLabeForca;
    private javax.swing.JLabel jLabeY2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCarga1;
    private javax.swing.JLabel jLabelCarga2;
    private javax.swing.JLabel jLabelCoordenadas1;
    private javax.swing.JLabel jLabelCoordenadas2;
    private javax.swing.JLabel jLabelCoulomb1;
    private javax.swing.JLabel jLabelCoulomb2;
    private javax.swing.JLabel jLabelDistancia;
    private javax.swing.JLabel jLabelMetros;
    private javax.swing.JLabel jLabelNewton;
    private javax.swing.JLabel jLabelResposta;
    private javax.swing.JLabel jLabelX1;
    private javax.swing.JLabel jLabelX2;
    private javax.swing.JLabel jLabelY1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
