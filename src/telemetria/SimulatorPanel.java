package telemetria;

//Classe do painel de simulação

public class SimulatorPanel extends javax.swing.JFrame 
{

    //Inicializador dos componentes do simulador
    public SimulatorPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Car1 = new javax.swing.JLabel();
        Car2 = new javax.swing.JLabel();
        Car3 = new javax.swing.JLabel();
        Car4 = new javax.swing.JLabel();
        Car5 = new javax.swing.JLabel();
        Car6 = new javax.swing.JLabel();
        Car7 = new javax.swing.JLabel();
        Car8 = new javax.swing.JLabel();
        Car9 = new javax.swing.JLabel();
        Car10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Pareo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(700, 300));
        setMaximumSize(new java.awt.Dimension(250, 250));
        setMinimumSize(new java.awt.Dimension(250, 250));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(250, 250));
        setResizable(false);
        getContentPane().setLayout(null);

        Car1.setForeground(new java.awt.Color(0, 0, 255));
        Car1.setText("•");
        Car1.setFocusable(false);
        getContentPane().add(Car1);
        Car1.setBounds(0, 137, 20, 20);

        Car2.setForeground(new java.awt.Color(255, 0, 255));
        Car2.setText("•");
        Car2.setFocusable(false);
        getContentPane().add(Car2);
        Car2.setBounds(0, 137, 20, 20);

        Car3.setForeground(new java.awt.Color(255, 0, 0));
        Car3.setText("•");
        Car3.setFocusable(false);
        getContentPane().add(Car3);
        Car3.setBounds(0, 137, 20, 20);

        Car4.setForeground(new java.awt.Color(255, 102, 0));
        Car4.setText("•");
        Car4.setFocusable(false);
        getContentPane().add(Car4);
        Car4.setBounds(0, 137, 20, 20);

        Car5.setForeground(new java.awt.Color(153, 153, 0));
        Car5.setText("•");
        Car5.setFocusable(false);
        getContentPane().add(Car5);
        Car5.setBounds(0, 137, 20, 20);

        Car6.setForeground(new java.awt.Color(102, 255, 0));
        Car6.setText("•");
        Car6.setFocusable(false);
        getContentPane().add(Car6);
        Car6.setBounds(0, 137, 20, 20);

        Car7.setForeground(new java.awt.Color(0, 102, 0));
        Car7.setText("•");
        Car7.setFocusable(false);
        getContentPane().add(Car7);
        Car7.setBounds(0, 137, 20, 20);

        Car8.setForeground(new java.awt.Color(0, 204, 153));
        Car8.setText("•");
        Car8.setFocusable(false);
        getContentPane().add(Car8);
        Car8.setBounds(0, 137, 20, 20);

        Car9.setForeground(new java.awt.Color(102, 0, 102));
        Car9.setText("•");
        Car9.setFocusable(false);
        getContentPane().add(Car9);
        Car9.setBounds(0, 137, 20, 20);

        Car10.setText("•");
        Car10.setFocusable(false);
        getContentPane().add(Car10);
        Car10.setBounds(0, 137, 20, 20);

        jPanel5.setBackground(new java.awt.Color(51, 204, 255));
        jPanel5.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);
        jPanel5.add(jPanel1);
        jPanel1.setBounds(10, 20, 20, 220);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);
        jPanel5.add(jPanel2);
        jPanel2.setBounds(20, 220, 220, 20);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);
        jPanel5.add(jPanel3);
        jPanel3.setBounds(220, 20, 20, 220);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);
        jPanel5.add(jPanel4);
        jPanel4.setBounds(10, 10, 230, 20);

        Pareo.setBackground(new java.awt.Color(51, 204, 255));
        Pareo.setColumns(18);
        Pareo.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        Pareo.setRows(5);
        Pareo.setText("Classificação:");
        Pareo.setAutoscrolls(false);
        Pareo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Pareo.setFocusable(false);
        jPanel5.add(Pareo);
        Pareo.setBounds(40, 40, 170, 170);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 250, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Car1;
    public static javax.swing.JLabel Car10;
    public static javax.swing.JLabel Car2;
    public static javax.swing.JLabel Car3;
    public static javax.swing.JLabel Car4;
    public static javax.swing.JLabel Car5;
    public static javax.swing.JLabel Car6;
    public static javax.swing.JLabel Car7;
    public static javax.swing.JLabel Car8;
    public static javax.swing.JLabel Car9;
    public static javax.swing.JTextArea Pareo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
