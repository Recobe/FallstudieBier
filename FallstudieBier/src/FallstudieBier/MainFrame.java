package FallstudieBier;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class MainFrame extends javax.swing.JFrame implements ActionListener {
	
	static Simulation sim = new Simulation();
	DauerLieferant dlieferant;
	Spieler[] spieler = sim.getSpieler();
	int aktSpieler = 0;
	static String[] name = new String[4];
	Biergarten[] biergarten = sim.getBiergaerten();
	Brauerei[] brauerei;
	Supermarkt[] supermarkt1 = sim.getSupermarkt();
	EinmaligerLieferant lieferant = sim.getEinmaligerL();

	//Konstruktor
    public MainFrame() {
        initComponents();
    }
    
    //Komponenten initialisieren
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	dlieferant = sim.getDLieferant();
    	rohstoffe1 = new javax.swing.JPanel();
        sponsor2 = new javax.swing.JLabel();
        angebot2 = new javax.swing.JLabel();
        eingabe2 = new javax.swing.JTextField();
        flaschen2 = new javax.swing.JLabel();
        absenden2 = new javax.swing.JButton();
        kosten2 = new javax.swing.JLabel();
        background = new javax.swing.JPanel();
        kosten = new javax.swing.JLabel();
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
        overview = new javax.swing.JScrollPane();
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
        spielerWechsel = new javax.swing.JMenuItem(); 
        new_game = new javax.swing.JMenuItem();
        quit_game = new javax.swing.JMenuItem();
        sponsor = new javax.swing.JLabel();
        angebot = new javax.swing.JLabel();
        flaschen = new javax.swing.JLabel();
        absenden = new javax.swing.JButton();
        sponsoring = new javax.swing.JPanel();
        eingabe = new javax.swing.JTextField();
        supermarkt = new javax.swing.JPanel();
        sponsor1 = new javax.swing.JLabel();
        angebot1 = new javax.swing.JLabel();
        eingabe1 = new javax.swing.JTextField();
        flaschen1 = new javax.swing.JLabel();
        absenden1 = new javax.swing.JButton();
        kosten1 = new javax.swing.JLabel();
        jTextArea2 = new javax.swing.JTextArea();


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
        tabbedPane.setTabPlacement(SwingConstants.LEFT);

        uebersicht.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        overview.setViewportView(jTextArea2);

        javax.swing.GroupLayout uebersichtLayout = new javax.swing.GroupLayout(uebersicht);
        uebersicht.setLayout(uebersichtLayout);
        uebersichtLayout.setHorizontalGroup(
            uebersichtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uebersichtLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(overview, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                .addContainerGap())
        );
        uebersichtLayout.setVerticalGroup(
            uebersichtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uebersichtLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(overview, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbedPane.addTab("�bersicht", null, uebersicht, "�bersicht");

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

        beschriftung_1.setText("Preis: " + DauerLieferant.getMarktPreis() + "� pro St�ck");

        beschriftung_2.setText("Kauf von");

        beschriftung_3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        beschriftung_3.setText("Rohstoffe zum Festpreis");

        beschriftung_4.setText("St�ck");

        jetzt_kaufen.setText("Jetzt kaufen");
        jetzt_kaufen.addActionListener(this);
        
        spielerWechsel.setText("n�chster Spieler");
        spielerWechsel.addActionListener(this);
        

        tonnen.setHorizontalAlignment(SwingConstants.RIGHT);
        tonnen.setText("0");
               
        //Festpreis
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

        rohstoffe1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        angebot2.setText("Angebot �ber ");

        flaschen2.setText("�");

        absenden2.setText("Angebot absenden");
        absenden2.addActionListener(this);

        javax.swing.GroupLayout rohstoffe1Layout = new javax.swing.GroupLayout(rohstoffe1);
        rohstoffe1.setLayout(rohstoffe1Layout);
        rohstoffe1Layout.setHorizontalGroup(
            rohstoffe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rohstoffe1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rohstoffe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sponsor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(rohstoffe1Layout.createSequentialGroup()
                        .addComponent(angebot2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eingabe2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(flaschen2, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rohstoffe1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(absenden2))
                    .addComponent(kosten2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        rohstoffe1Layout.setVerticalGroup(
            rohstoffe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rohstoffe1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sponsor2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kosten2)
                .addGap(15, 15, 15)
                .addGroup(rohstoffe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angebot2)
                    .addComponent(eingabe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flaschen2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(absenden2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

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
                    .addComponent(beschriftung_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rohstoffe1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rohstoffe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 84, Short.MAX_VALUE))
        );

        //Ausschreibungen 
        ausschreibungen.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ausschreibungen", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        beschriftung_8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        beschriftung_8.setText("Aktuell sind keine Ausschreibungen vorhanden");

        sponsoring.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        angebot.setText("Angebot �ber ");

        flaschen.setText("Flaschen pro Monat.");

        absenden.setText("Angebot absenden");
        absenden.addActionListener(this);

        //Sponsorn
        javax.swing.GroupLayout sponsoringLayout = new javax.swing.GroupLayout(sponsoring);
        sponsoring.setLayout(sponsoringLayout);
        sponsoringLayout.setHorizontalGroup(
            sponsoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sponsoringLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sponsoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sponsor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(sponsoringLayout.createSequentialGroup()
                        .addComponent(angebot)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eingabe, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(flaschen, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sponsoringLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(absenden))
                    .addComponent(kosten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        sponsoringLayout.setVerticalGroup(
            sponsoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sponsoringLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sponsor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kosten)
                .addGap(15, 15, 15)
                .addGroup(sponsoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angebot)
                    .addComponent(eingabe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flaschen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(absenden)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ausschreibungenLayout = new javax.swing.GroupLayout(ausschreibungen);
        ausschreibungen.setLayout(ausschreibungenLayout);
        ausschreibungenLayout.setHorizontalGroup(
            ausschreibungenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ausschreibungenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ausschreibungenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sponsoring, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ausschreibungenLayout.createSequentialGroup()
                        .addComponent(beschriftung_8, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addComponent(supermarkt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ausschreibungenLayout.setVerticalGroup(
            ausschreibungenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ausschreibungenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(beschriftung_8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supermarkt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sponsoring, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        
        //Supermarkt ausschreibungen
        supermarkt.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        angebot1.setText("Angebot �ber ");

        flaschen1.setText("� pro Monat.");

        absenden1.setText("Angebot absenden");
        absenden1.addActionListener(this);

        javax.swing.GroupLayout supermarktLayout = new javax.swing.GroupLayout(supermarkt);
        
        supermarkt.setLayout(supermarktLayout);
        supermarktLayout.setHorizontalGroup(
            supermarktLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supermarktLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(supermarktLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sponsor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(supermarktLayout.createSequentialGroup()
                        .addComponent(angebot1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eingabe1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(flaschen1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supermarktLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(absenden1))
                    .addComponent(kosten1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        supermarktLayout.setVerticalGroup(
            supermarktLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supermarktLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sponsor1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kosten1)
                .addGap(15, 15, 15)
                .addGroup(supermarktLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angebot1)
                    .addComponent(eingabe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flaschen1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(absenden1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Einkauf/Verkauf", null, einkaufVerkauf, "Einkauf/Verkauf");

        spielerranking.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Spielerranking", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("");
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
        spielerWechsel.setText("n�chster Spieler");
        
        spielerWechsel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        new_game.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        new_game.setText("Neues Spiel");
        datei.add(new_game);

        quit_game.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        quit_game.setText("Beenden");
        quit_game.addActionListener(this);
        datei.add(quit_game);
        datei.add(spielerWechsel);

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
        
        this.setTitle("Brauereisimulator 2014 - Spieler: " + spieler[aktSpieler].getName());
        sponsoring.setVisible(false);
        supermarkt.setVisible(false);
        rohstoffe1.setVisible(false);
        jTextArea2.setEditable(false);
        jTextArea2.setFont(new Font("Arial", Font.PLAIN, 18));
        
        ueberblick();
        pack();           
    }// </editor-fold>//GEN-END:initComponents
    //Spiel beenden

    //ActionPerformed - Buttons und JMenuItems
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.quit_game) {
			System.exit(0);
		}
		
		//Rohstoffe kaufen
    	if(e.getSource() == this.jetzt_kaufen) {
    		int option = JOptionPane.showConfirmDialog(this, tonnen.getText() + " St�ck zum Preis von " + Math.round(100.0 * dlieferant.getMarktPreis()*Float.parseFloat(tonnen.getText()))/100.0 + " �", "Best�tigung", JOptionPane.OK_CANCEL_OPTION);
    		switch(option) {
    		case 0: System.out.println(aktSpieler);
    				spieler[aktSpieler].dLiefern(Integer.parseInt(tonnen.getText()));
    				break;
    		case 1: break;
    		}
    	}
    	
    	//Ausschreibungen kaufen Biergarten
    	if(e.getSource() == this.absenden) {
    		int option = JOptionPane.showConfirmDialog(this,  eingabe.getText() + " Flaschen an Biergarten versenden?", "Ausschreibung", JOptionPane.OK_CANCEL_OPTION);
    		switch(option) {
    		case 0: spieler[aktSpieler].setAngebotBiergarten(Integer.parseInt(eingabe.getText()));
    				eingabe.setText("");
    				break;
    		case 1: eingabe.setText("");
    				break;
    		}
    	}
    	
    	//Ausschreibungen f�r Rohstoffe
    	if(e.getSource() == this.absenden2) {
    		int option = JOptionPane.showConfirmDialog(this, eingabe2.getText() + " St�ck kaufen?", "Ausschreibung", JOptionPane.OK_CANCEL_OPTION);
    		switch(option) {
    		case 0: spieler[aktSpieler].setELieferantAngebot(Integer.parseInt(eingabe2.getText()));
    				eingabe2.setText(""); break;
    		case 1: eingabe2.setText(""); break;
    		}
    	}
    	
    	//Ausschreibungen kaufen Supermarkt
    	if(e.getSource() == this.absenden1) {
    		int option = JOptionPane.showConfirmDialog(this, eingabe1.getText() + " � f�r " + supermarkt1[sim.supermarktNr].getKaufkraft() + " Flaschen?", "Ausschreibung", JOptionPane.OK_CANCEL_OPTION);
    		switch(option) {
    		case 0: spieler[aktSpieler].setSupermarktAngebot(Integer.parseInt(eingabe1.getText()));
    				eingabe1.setText("");
    				break;
    		case 1: eingabe1.setText("");
    				break;
    		}
    	}
    	
    	//Spielerwechsel 
    	if(e.getSource() == this.spielerWechsel) {
    		if(aktSpieler+1 == sim.getAnzahlSpieler()) {  
    			beschriftung_1.setText("Preis: " + Math.round(100.0 * dlieferant.getMarktPreis())/100.0 + "� pro St�ck");
    			if(sim.getBiergartenNr() != 100) {
    				biergarten[sim.getBiergartenNr()].auswerten();
    				sponsoring.setVisible(false);
    				beschriftung_8.setVisible(true);
    			}
    			
    			if(sim.isELieferant() != true) {
    				lieferant.auswerten();
    				beschriftung_7.setVisible(true);
    				rohstoffe1.setVisible(false);
    			}
    			    			
    			if(sim.getSupermarktNr() != 100) {
    				supermarkt1[sim.getSupermarktNr()].auswerten();
    				supermarkt.setVisible(false);
    			}
    			
    			aktSpieler = 0;
        		ueberblick();
    			sim.naechsteRunde();
    			//setRanking();
    			
    			//Rohstoffe
    			if(sim.isELieferant() == true) {
    				this.rohstoffeAusschreibungen(lieferant);
    			}
    			//Supermarkt
    			if(sim.getSupermarktNr() != 100) {
    				this.superMarktAusschreibungen(supermarkt1[sim.getSupermarktNr()]);
    			}
    			//Biergarten
    			if(sim.getBiergartenNr() != 100) {
    				this.biergartenAusschreibung(biergarten[sim.getBiergartenNr()]);
    			}
    			this.setTitle("Brauereisimulator 2014 - Spieler: " + spieler[aktSpieler].getName() + " | Monat: " + sim.getMonat()); 
    		} else {
    			sponsoring.setVisible(false);
    			supermarkt.setVisible(false);
    			beschriftung_8.setVisible(true);
    			if(sim.isELieferant() == true) {
    				this.rohstoffeAusschreibungen(lieferant);
    			}
    			if(sim.getSupermarktNr() != 100) {
    				this.superMarktAusschreibungen(supermarkt1[sim.getSupermarktNr()]);
    			}
    			if(sim.getBiergartenNr() != 100) {
    				this.biergartenAusschreibung(biergarten[sim.getBiergartenNr()]);
    			}
    			aktSpieler++;
        		ueberblick();
    			this.setTitle("Brauereisimulator 2014 - Spieler: " + spieler[aktSpieler].getName() + " | Monat: " + sim.getMonat());  
    		}
    	}
	}
    
	//Main-Methode
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        Object[] option = {"2", "3", "4"};
        int auswahl = JOptionPane.showOptionDialog(null, "Wie viele Spieler m�chten Sie erstellen?", "Spieler erstellen", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
        switch(auswahl) {
        case 0: name[0] = JOptionPane.showInputDialog(null, "Name Spieler 1", JOptionPane.YES_OPTION);
        		name[1] = JOptionPane.showInputDialog(null, "Name Spieler 2", JOptionPane.YES_OPTION);
        		sim.start(name);
        		break;
        case 1: name[0] = JOptionPane.showInputDialog(null, "Name Spieler 1", JOptionPane.YES_OPTION);
				name[1] = JOptionPane.showInputDialog(null, "Name Spieler 2", JOptionPane.YES_OPTION);
				name[2] = JOptionPane.showInputDialog(null, "Name Spieler 3", JOptionPane.YES_OPTION);
				sim.start(name);
				break;
        case 2: name[0] = JOptionPane.showInputDialog(null, "Name Spieler 1", JOptionPane.YES_OPTION);
				name[1] = JOptionPane.showInputDialog(null, "Name Spieler 2", JOptionPane.YES_OPTION);
				name[2] = JOptionPane.showInputDialog(null, "Name Spieler 3", JOptionPane.YES_OPTION);
				name[3] = JOptionPane.showInputDialog(null, "Name Spieler 4", JOptionPane.YES_OPTION);
				sim.start(name);
				break;
        }
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
			public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    //Ausschreibungen Biergarten
	public void biergartenAusschreibung(Biergarten biergarten) {
		if(spieler[aktSpieler].getX(aktSpieler) - spieler[aktSpieler].getRange(aktSpieler) < this.biergarten[sim.getBiergartenNr()].getPox_x() && this.biergarten[sim.getBiergartenNr()].getPox_x() < spieler[aktSpieler].getX(aktSpieler) + spieler[aktSpieler].getRange(aktSpieler) && spieler[aktSpieler].getY(aktSpieler) - spieler[aktSpieler].getRange(aktSpieler) < this.biergarten[sim.getBiergartenNr()].getPos_y() && this.biergarten[sim.getBiergartenNr()].getPos_y() < spieler[aktSpieler].getY(aktSpieler) + spieler[aktSpieler].getRange(aktSpieler)){
			sponsor.setText("Der Biergarten " + biergarten.getName() + " sucht einen neuen Sponsor.");
			kosten.setText("Die einmaligen Kosten zur Ausstattung des Biergartens betragen " + biergarten.getPreis() + " �.");
			sponsoring.setVisible(true);
			beschriftung_8.setVisible(false);
		}
	}
	
	//Ausschreibungen Supermarkt
	public void superMarktAusschreibungen(Supermarkt supermarkt2) {
		if(spieler[aktSpieler].getX(aktSpieler) - spieler[aktSpieler].getRange(aktSpieler) < this.supermarkt1[sim.getSupermarktNr()].getPox_x() && this.supermarkt1[sim.getSupermarktNr()].getPox_x() < spieler[aktSpieler].getX(aktSpieler) + spieler[aktSpieler].getRange(aktSpieler) && spieler[aktSpieler].getY(aktSpieler) - spieler[aktSpieler].getRange(aktSpieler) < this.supermarkt1[sim.getSupermarktNr()].getPos_y() && this.supermarkt1[sim.getSupermarktNr()].getPos_y() < spieler[aktSpieler].getY(aktSpieler) + spieler[aktSpieler].getRange(aktSpieler)){
			sponsor1.setText("Der Supermarkt " + supermarkt2.getName() + " sucht eine neue Brauerei.");
			kosten1.setText("Er m�chte " + supermarkt2.getKaufkraft() + " Flaschen pro Monat beziehen.");
			supermarkt.setVisible(true);
			beschriftung_8.setVisible(false);
		}
	}
	
	//Ausschreibungen Rohstoffe
    public void rohstoffeAusschreibungen(EinmaligerLieferant lieferant) {
    	sponsor2.setText("Ein Lieferant bietet Rohstoffe zum Kauf an");
    	kosten2.setText("Er bietet " + lieferant.getKapazitaet() + " St�ck Rohstoffe an.");
    	rohstoffe1.setVisible(true);
    	beschriftung_7.setVisible(false);
    }
    
    //�berblick Startseite
	public void ueberblick() {
		jTextArea2.setText("Lager\n "
				+ "Rohstoffe: " + spieler[aktSpieler].getRohstoffe() + "\n " 
				+ "Bier: " + spieler[aktSpieler].getBier() + "\n "
				+ "Kapazit�t: " + spieler[aktSpieler].getLagerKap() + "\n \n"
				+ "Brauerei\n "
				+ "Kapazit�t: " + spieler[aktSpieler].getBrauereiKap(aktSpieler) + "\n \n"
				+ "Spieler\n "
				+ "Kontostand: " + spieler[aktSpieler].getKontostand() + " �\n \n"
				+ "Vertr�ge\n "
				+ "Flaschen pro Zug: " + spieler[aktSpieler].getFlaschenProZug() + "\n "
				+ "Kosten pro Zug: " + spieler[aktSpieler].getKostenProZug());
	}
	
	//Ranking
	/*public void setRanking() {
		sim.reihenfolge();
		jTextArea1.setText("1.\t" +spieler[sim.reihenfolge[0]].getName() + "\n"
						  +"2.\t" +spieler[sim.reihenfolge[1]].getName() + "\n");
		if(sim.reihenfolge.length == 3) {
			jTextArea1.append("3.\t" + spieler[sim.reihenfolge[2]].getName() + "\n");
		}
		
		if(sim.reihenfolge.length == 4) {
			jTextArea1.append("4.\t" + spieler[sim.reihenfolge[3]].getName() + "\n");
		}
	}*/
	
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
    private javax.swing.JLabel sponsor;
    private javax.swing.JLabel angebot;
    private javax.swing.JLabel flaschen;
    private javax.swing.JButton absenden;
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
    private javax.swing.JMenuItem spielerWechsel;
    private javax.swing.JPanel sponsoring;
    private javax.swing.JTextField eingabe;
    private javax.swing.JLabel kosten;
    private javax.swing.JPanel supermarkt;
    private javax.swing.JLabel sponsor1;
    private javax.swing.JLabel angebot1;
    private javax.swing.JTextField eingabe1;
    private javax.swing.JLabel flaschen1;
    private javax.swing.JButton absenden1;
    private javax.swing.JLabel kosten1;
    private javax.swing.JPanel rohstoffe1;
    private javax.swing.JLabel sponsor2;
    private javax.swing.JLabel angebot2;
    private javax.swing.JTextField eingabe2;
    private javax.swing.JLabel flaschen2;
    private javax.swing.JButton absenden2;
    private javax.swing.JLabel kosten2;
    private javax.swing.JScrollPane overview;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
