package FallstudieBier;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        ueberschrift = new javax.swing.JLabel();
        tabbedPane = new javax.swing.JTabbedPane();
        uebersicht = new javax.swing.JPanel();
        skillTree = new javax.swing.JPanel();
        herstellung = new javax.swing.JPanel();
        forschung = new javax.swing.JPanel();
        marketing = new javax.swing.JPanel();
        einkaufVerkauf = new javax.swing.JPanel();
        rohstoffe = new javax.swing.JPanel();
        festpreis = new javax.swing.JPanel();
        beschriftung_1 = new javax.swing.JLabel();
        beschriftung_2 = new javax.swing.JLabel();
        beschriftung_3 = new javax.swing.JLabel();
        beschriftung_4 = new javax.swing.JLabel();
        beschriftung_5 = new javax.swing.JLabel();
        jetzt_kaufen = new javax.swing.JButton();
        tonnen = new javax.swing.JTextField();
        beschriftung_6 = new javax.swing.JLabel();
        beschriftung_7 = new javax.swing.JLabel();
        ausschreibungen = new javax.swing.JPanel();
        beschriftung_8 = new javax.swing.JLabel();
        ranking = new javax.swing.JPanel();
        spielerranking = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        menu = new javax.swing.JMenuBar();
        datei = new javax.swing.JMenu();
        new_game = new javax.swing.JMenuItem();
        quit_game = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Brauereisimulator 2014");
        setMaximumSize(new java.awt.Dimension(1024, 786));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(800, 550));
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setToolTipText("");
        background.setMinimumSize(new java.awt.Dimension(750, 500));

        ueberschrift.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ueberschrift.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ueberschrift.setText("Brauereisimulator 2014");
        ueberschrift.setToolTipText("");

        tabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        tabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        uebersicht.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout uebersichtLayout = new javax.swing.GroupLayout(uebersicht);
        uebersicht.setLayout(uebersichtLayout);
        uebersichtLayout.setHorizontalGroup(
            uebersichtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 683, Short.MAX_VALUE)
        );
        uebersichtLayout.setVerticalGroup(
            uebersichtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Übersicht", null, uebersicht, "Übersicht");

        herstellung.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Herstellung", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        javax.swing.GroupLayout herstellungLayout = new javax.swing.GroupLayout(herstellung);
        herstellung.setLayout(herstellungLayout);
        herstellungLayout.setHorizontalGroup(
            herstellungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 206, Short.MAX_VALUE)
        );
        herstellungLayout.setVerticalGroup(
            herstellungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        forschung.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Forschung", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        javax.swing.GroupLayout forschungLayout = new javax.swing.GroupLayout(forschung);
        forschung.setLayout(forschungLayout);
        forschungLayout.setHorizontalGroup(
            forschungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 206, Short.MAX_VALUE)
        );
        forschungLayout.setVerticalGroup(
            forschungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        marketing.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marketing", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        marketing.setPreferredSize(new java.awt.Dimension(202, 35));

        javax.swing.GroupLayout marketingLayout = new javax.swing.GroupLayout(marketing);
        marketing.setLayout(marketingLayout);
        marketingLayout.setHorizontalGroup(
            marketingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );
        marketingLayout.setVerticalGroup(
            marketingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout skillTreeLayout = new javax.swing.GroupLayout(skillTree);
        skillTree.setLayout(skillTreeLayout);
        skillTreeLayout.setHorizontalGroup(
            skillTreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(skillTreeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(herstellung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forschung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(marketing, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );
        skillTreeLayout.setVerticalGroup(
            skillTreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(skillTreeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(skillTreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(herstellung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(forschung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marketing, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPane.addTab("Skilltree", null, skillTree, "Skilltree");

        rohstoffe.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rohstoffe", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        festpreis.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        beschriftung_1.setText("Preis: 500€ pro Tonne");

        beschriftung_2.setText("Kauf von");

        beschriftung_3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        beschriftung_3.setText("Rohstoffe zum Festpreis");

        beschriftung_4.setText("Tonnen");

        beschriftung_5.setText("Preis für 0 Tonnen: 0,00€");

        jetzt_kaufen.setText("Jetzt kaufen");

        tonnen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tonnen.setText("0");

        javax.swing.GroupLayout festpreisLayout = new javax.swing.GroupLayout(festpreis);
        festpreis.setLayout(festpreisLayout);
        festpreisLayout.setHorizontalGroup(
            festpreisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(festpreisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(festpreisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(beschriftung_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, festpreisLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jetzt_kaufen))
                    .addGroup(festpreisLayout.createSequentialGroup()
                        .addGroup(festpreisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(beschriftung_3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(festpreisLayout.createSequentialGroup()
                                .addComponent(beschriftung_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tonnen, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(beschriftung_4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(beschriftung_5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 39, Short.MAX_VALUE)))
                .addContainerGap())
        );
        festpreisLayout.setVerticalGroup(
            festpreisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(festpreisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(beschriftung_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(beschriftung_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(festpreisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beschriftung_2)
                    .addComponent(tonnen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beschriftung_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(beschriftung_5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jetzt_kaufen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        beschriftung_6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        beschriftung_6.setText("Rohstoff-Ausschreibungen");

        beschriftung_7.setText("Aktuell sind keine Ausschreibungen vorhanden");

        javax.swing.GroupLayout rohstoffeLayout = new javax.swing.GroupLayout(rohstoffe);
        rohstoffe.setLayout(rohstoffeLayout);
        rohstoffeLayout.setHorizontalGroup(
            rohstoffeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rohstoffeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rohstoffeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(festpreis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(rohstoffeLayout.createSequentialGroup()
                        .addComponent(beschriftung_6, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(beschriftung_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        rohstoffeLayout.setVerticalGroup(
            rohstoffeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rohstoffeLayout.createSequentialGroup()
                .addComponent(festpreis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(beschriftung_6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(beschriftung_7)
                .addGap(0, 209, Short.MAX_VALUE))
        );

        ausschreibungen.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ausschreibungen", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        beschriftung_8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        beschriftung_8.setText("Aktuell sind keine Ausschreibungen vorhanden");

        javax.swing.GroupLayout ausschreibungenLayout = new javax.swing.GroupLayout(ausschreibungen);
        ausschreibungen.setLayout(ausschreibungenLayout);
        ausschreibungenLayout.setHorizontalGroup(
            ausschreibungenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ausschreibungenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(beschriftung_8, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        ausschreibungenLayout.setVerticalGroup(
            ausschreibungenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ausschreibungenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(beschriftung_8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout einkaufVerkaufLayout = new javax.swing.GroupLayout(einkaufVerkauf);
        einkaufVerkauf.setLayout(einkaufVerkaufLayout);
        einkaufVerkaufLayout.setHorizontalGroup(
            einkaufVerkaufLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(einkaufVerkaufLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rohstoffe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ausschreibungen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        einkaufVerkaufLayout.setVerticalGroup(
            einkaufVerkaufLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(einkaufVerkaufLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(einkaufVerkaufLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rohstoffe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ausschreibungen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPane.addTab("Einkauf/Verkauf", null, einkaufVerkauf, "Einkauf/Verkauf");

        spielerranking.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Spielerranking", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("\n 1\tOskar\t50.000€\n\n 2\tChristian\t45.000€\n\n 3\tDominic\t22.321€\n\n 4\tJan\t12.002€");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout spielerrankingLayout = new javax.swing.GroupLayout(spielerranking);
        spielerranking.setLayout(spielerrankingLayout);
        spielerrankingLayout.setHorizontalGroup(
            spielerrankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spielerrankingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                .addContainerGap())
        );
        spielerrankingLayout.setVerticalGroup(
            spielerrankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spielerrankingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout rankingLayout = new javax.swing.GroupLayout(ranking);
        ranking.setLayout(rankingLayout);
        rankingLayout.setHorizontalGroup(
            rankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rankingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spielerranking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        rankingLayout.setVerticalGroup(
            rankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rankingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spielerranking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbedPane.addTab("Ranking", null, ranking, "Ranking");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ueberschrift, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane)
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addComponent(ueberschrift, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPane)
                .addContainerGap())
        );

        datei.setText("Datei");

        new_game.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        new_game.setText("Neues Spiel");
        datei.add(new_game);

        quit_game.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        quit_game.setText("Beenden");
        quit_game.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quit_gameActionPerformed(evt);
            }
        });
        datei.add(quit_game);

        menu.add(datei);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quit_gameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quit_gameActionPerformed
        System.exit(0); //Spiel beenden
    }//GEN-LAST:event_quit_gameActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ausschreibungen;
    private javax.swing.JPanel background;
    private javax.swing.JLabel beschriftung_1;
    private javax.swing.JLabel beschriftung_2;
    private javax.swing.JLabel beschriftung_3;
    private javax.swing.JLabel beschriftung_4;
    private javax.swing.JLabel beschriftung_5;
    private javax.swing.JLabel beschriftung_6;
    private javax.swing.JLabel beschriftung_7;
    private javax.swing.JLabel beschriftung_8;
    private javax.swing.JMenu datei;
    private javax.swing.JPanel einkaufVerkauf;
    private javax.swing.JPanel festpreis;
    private javax.swing.JPanel forschung;
    private javax.swing.JPanel herstellung;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jetzt_kaufen;
    private javax.swing.JPanel marketing;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem new_game;
    private javax.swing.JMenuItem quit_game;
    private javax.swing.JPanel ranking;
    private javax.swing.JPanel rohstoffe;
    private javax.swing.JPanel skillTree;
    private javax.swing.JPanel spielerranking;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTextField tonnen;
    private javax.swing.JLabel ueberschrift;
    private javax.swing.JPanel uebersicht;
    // End of variables declaration//GEN-END:variables
}
