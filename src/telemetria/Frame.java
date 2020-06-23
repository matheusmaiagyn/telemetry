package telemetria;

import Carros.IniciaCarro;
import Carros.ControleCarro;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import DataBaseModify.CorridasModify;

//Classe do frame principal

public class Frame extends javax.swing.JFrame 
{   
    //Declaração de variáveis privadas para acesso de classes
    private final Timer timer = new Timer();
    SimulatorPanel simulator = new SimulatorPanel();
    IniciaCarro initCar = new IniciaCarro();
    ControleCarro ctrCar = new ControleCarro();
    CorridasModify corridasModify = new CorridasModify();
    
    //Declaração de variáveis para controle de erros
    
    private int parar = 0;
    private int control = 0;
    public static int reiniciar = 0;
    public static boolean stopreset;
    
    public Frame() 
    {
        initComponents(); //Inciar componentes no frame
    }
    
    //COnstrução da tela
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Lbl1 = new javax.swing.JLabel();
        Start = new javax.swing.JButton();
        Stop = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Hour = new javax.swing.JLabel();
        Minute = new javax.swing.JLabel();
        Second = new javax.swing.JLabel();
        Ms = new javax.swing.JLabel();
        TotalCar1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Volta1Car2 = new javax.swing.JLabel();
        Volta1Car3 = new javax.swing.JLabel();
        Volta1Car4 = new javax.swing.JLabel();
        Volta1Car5 = new javax.swing.JLabel();
        Volta1Car6 = new javax.swing.JLabel();
        Volta1Car7 = new javax.swing.JLabel();
        Volta1Car8 = new javax.swing.JLabel();
        Volta1Car9 = new javax.swing.JLabel();
        Volta1Car10 = new javax.swing.JLabel();
        Close = new javax.swing.JButton();
        Car1Label1 = new javax.swing.JLabel();
        Volta1Car1 = new javax.swing.JLabel();
        Volta2Car1 = new javax.swing.JLabel();
        Car2Label1 = new javax.swing.JLabel();
        Car3Label1 = new javax.swing.JLabel();
        Car4Label1 = new javax.swing.JLabel();
        Car5Label1 = new javax.swing.JLabel();
        Car6Label1 = new javax.swing.JLabel();
        Car7Label1 = new javax.swing.JLabel();
        Car8Label1 = new javax.swing.JLabel();
        Car9Label1 = new javax.swing.JLabel();
        Car10Label1 = new javax.swing.JLabel();
        Volta2Car2 = new javax.swing.JLabel();
        Volta2Car3 = new javax.swing.JLabel();
        Volta2Car4 = new javax.swing.JLabel();
        Volta2Car5 = new javax.swing.JLabel();
        Volta2Car6 = new javax.swing.JLabel();
        Volta2Car7 = new javax.swing.JLabel();
        Volta2Car8 = new javax.swing.JLabel();
        Volta2Car9 = new javax.swing.JLabel();
        Volta2Car10 = new javax.swing.JLabel();
        TotalCar4 = new javax.swing.JLabel();
        TotalCar9 = new javax.swing.JLabel();
        TotalCar2 = new javax.swing.JLabel();
        TotalCar3 = new javax.swing.JLabel();
        TotalCar5 = new javax.swing.JLabel();
        TotalCar8 = new javax.swing.JLabel();
        TotalCar10 = new javax.swing.JLabel();
        TotalCar7 = new javax.swing.JLabel();
        TotalCar6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        setLocation(new java.awt.Point(300, 200));
        setMinimumSize(new java.awt.Dimension(400, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 450));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 450));
        jPanel1.setLayout(null);

        Lbl1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Lbl1.setText("Tempo Total:");
        jPanel1.add(Lbl1);
        Lbl1.setBounds(10, 11, 140, 23);

        Start.setText("Start");
        Start.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });
        jPanel1.add(Start);
        Start.setBounds(20, 310, 70, 23);

        Stop.setText("Stop");
        Stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopActionPerformed(evt);
            }
        });
        jPanel1.add(Stop);
        Stop.setBounds(160, 310, 60, 23);

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel1.add(Reset);
        Reset.setBounds(290, 310, 70, 23);

        Hour.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Hour.setText("00");
        jPanel1.add(Hour);
        Hour.setBounds(174, 11, 40, 23);

        Minute.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Minute.setText("00");
        jPanel1.add(Minute);
        Minute.setBounds(223, 11, 40, 23);

        Second.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Second.setText("00");
        jPanel1.add(Second);
        Second.setBounds(268, 11, 40, 23);

        Ms.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Ms.setText("00");
        jPanel1.add(Ms);
        Ms.setBounds(313, 11, 40, 23);

        TotalCar1.setForeground(new java.awt.Color(0, 0, 255));
        TotalCar1.setText("00:00:00:00");
        jPanel1.add(TotalCar1);
        TotalCar1.setBounds(290, 90, 80, 14);

        jLabel1.setText("Volta 1:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 70, 50, 14);

        jLabel2.setText("Volta 2:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(200, 70, 50, 14);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText(":");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(210, 11, 7, 23);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText(":");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(255, 11, 7, 23);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setText(":");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(300, 11, 7, 23);

        jLabel6.setText("Total:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(300, 70, 40, 14);

        Volta1Car2.setForeground(new java.awt.Color(255, 0, 255));
        Volta1Car2.setText("00:00:00:00");
        jPanel1.add(Volta1Car2);
        Volta1Car2.setBounds(90, 110, 80, 14);

        Volta1Car3.setForeground(new java.awt.Color(255, 0, 0));
        Volta1Car3.setText("00:00:00:00");
        jPanel1.add(Volta1Car3);
        Volta1Car3.setBounds(90, 130, 80, 14);

        Volta1Car4.setForeground(new java.awt.Color(255, 102, 0));
        Volta1Car4.setText("00:00:00:00");
        jPanel1.add(Volta1Car4);
        Volta1Car4.setBounds(90, 150, 80, 14);

        Volta1Car5.setForeground(new java.awt.Color(153, 153, 0));
        Volta1Car5.setText("00:00:00:00");
        jPanel1.add(Volta1Car5);
        Volta1Car5.setBounds(90, 170, 80, 14);

        Volta1Car6.setForeground(new java.awt.Color(102, 255, 0));
        Volta1Car6.setText("00:00:00:00");
        jPanel1.add(Volta1Car6);
        Volta1Car6.setBounds(90, 190, 80, 14);

        Volta1Car7.setForeground(new java.awt.Color(0, 102, 0));
        Volta1Car7.setText("00:00:00:00");
        jPanel1.add(Volta1Car7);
        Volta1Car7.setBounds(90, 210, 80, 14);

        Volta1Car8.setForeground(new java.awt.Color(0, 204, 153));
        Volta1Car8.setText("00:00:00:00");
        jPanel1.add(Volta1Car8);
        Volta1Car8.setBounds(90, 230, 80, 14);

        Volta1Car9.setForeground(new java.awt.Color(102, 0, 102));
        Volta1Car9.setText("00:00:00:00");
        jPanel1.add(Volta1Car9);
        Volta1Car9.setBounds(90, 250, 80, 14);

        Volta1Car10.setText("00:00:00:00");
        jPanel1.add(Volta1Car10);
        Volta1Car10.setBounds(90, 270, 80, 14);

        Close.setText("Fechar Simulador");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        jPanel1.add(Close);
        Close.setBounds(120, 350, 140, 23);

        Car1Label1.setForeground(new java.awt.Color(0, 0, 255));
        Car1Label1.setText("Z4:");
        jPanel1.add(Car1Label1);
        Car1Label1.setBounds(10, 90, 70, 14);

        Volta1Car1.setForeground(new java.awt.Color(0, 0, 255));
        Volta1Car1.setText("00:00:00:00");
        jPanel1.add(Volta1Car1);
        Volta1Car1.setBounds(90, 90, 80, 14);

        Volta2Car1.setForeground(new java.awt.Color(0, 0, 255));
        Volta2Car1.setText("00:00:00:00");
        jPanel1.add(Volta2Car1);
        Volta2Car1.setBounds(190, 90, 80, 14);

        Car2Label1.setForeground(new java.awt.Color(255, 0, 255));
        Car2Label1.setText("BRZ:");
        jPanel1.add(Car2Label1);
        Car2Label1.setBounds(10, 110, 70, 14);

        Car3Label1.setForeground(new java.awt.Color(255, 0, 0));
        Car3Label1.setText("MX-5 Miata:");
        jPanel1.add(Car3Label1);
        Car3Label1.setBounds(10, 130, 70, 14);

        Car4Label1.setForeground(new java.awt.Color(255, 102, 0));
        Car4Label1.setText("370Z:");
        jPanel1.add(Car4Label1);
        Car4Label1.setBounds(10, 150, 70, 14);

        Car5Label1.setForeground(new java.awt.Color(153, 153, 0));
        Car5Label1.setText("GTI:");
        jPanel1.add(Car5Label1);
        Car5Label1.setBounds(10, 170, 70, 14);

        Car6Label1.setForeground(new java.awt.Color(102, 255, 0));
        Car6Label1.setText("R8:");
        jPanel1.add(Car6Label1);
        Car6Label1.setBounds(10, 190, 70, 14);

        Car7Label1.setForeground(new java.awt.Color(0, 102, 0));
        Car7Label1.setText("WRX:");
        jPanel1.add(Car7Label1);
        Car7Label1.setBounds(10, 210, 70, 14);

        Car8Label1.setForeground(new java.awt.Color(0, 204, 153));
        Car8Label1.setText("Corvette:");
        jPanel1.add(Car8Label1);
        Car8Label1.setBounds(10, 230, 70, 14);

        Car9Label1.setForeground(new java.awt.Color(102, 0, 102));
        Car9Label1.setText("Camaro:");
        jPanel1.add(Car9Label1);
        Car9Label1.setBounds(10, 250, 70, 14);

        Car10Label1.setText("Cayman:");
        jPanel1.add(Car10Label1);
        Car10Label1.setBounds(10, 270, 70, 14);

        Volta2Car2.setForeground(new java.awt.Color(255, 0, 255));
        Volta2Car2.setText("00:00:00:00");
        jPanel1.add(Volta2Car2);
        Volta2Car2.setBounds(190, 110, 80, 14);

        Volta2Car3.setForeground(new java.awt.Color(255, 0, 0));
        Volta2Car3.setText("00:00:00:00");
        jPanel1.add(Volta2Car3);
        Volta2Car3.setBounds(190, 130, 80, 14);

        Volta2Car4.setForeground(new java.awt.Color(255, 102, 0));
        Volta2Car4.setText("00:00:00:00");
        jPanel1.add(Volta2Car4);
        Volta2Car4.setBounds(190, 150, 80, 14);

        Volta2Car5.setForeground(new java.awt.Color(153, 153, 0));
        Volta2Car5.setText("00:00:00:00");
        jPanel1.add(Volta2Car5);
        Volta2Car5.setBounds(190, 170, 80, 14);

        Volta2Car6.setForeground(new java.awt.Color(102, 255, 0));
        Volta2Car6.setText("00:00:00:00");
        jPanel1.add(Volta2Car6);
        Volta2Car6.setBounds(190, 190, 80, 14);

        Volta2Car7.setForeground(new java.awt.Color(0, 102, 0));
        Volta2Car7.setText("00:00:00:00");
        jPanel1.add(Volta2Car7);
        Volta2Car7.setBounds(190, 210, 80, 14);

        Volta2Car8.setForeground(new java.awt.Color(0, 204, 153));
        Volta2Car8.setText("00:00:00:00");
        jPanel1.add(Volta2Car8);
        Volta2Car8.setBounds(190, 230, 80, 14);

        Volta2Car9.setForeground(new java.awt.Color(102, 0, 102));
        Volta2Car9.setText("00:00:00:00");
        jPanel1.add(Volta2Car9);
        Volta2Car9.setBounds(190, 250, 80, 14);

        Volta2Car10.setText("00:00:00:00");
        jPanel1.add(Volta2Car10);
        Volta2Car10.setBounds(190, 270, 80, 14);

        TotalCar4.setForeground(new java.awt.Color(255, 102, 0));
        TotalCar4.setText("00:00:00:00");
        jPanel1.add(TotalCar4);
        TotalCar4.setBounds(290, 150, 80, 14);

        TotalCar9.setForeground(new java.awt.Color(102, 0, 102));
        TotalCar9.setText("00:00:00:00");
        jPanel1.add(TotalCar9);
        TotalCar9.setBounds(290, 250, 80, 14);

        TotalCar2.setForeground(new java.awt.Color(255, 0, 255));
        TotalCar2.setText("00:00:00:00");
        jPanel1.add(TotalCar2);
        TotalCar2.setBounds(290, 110, 80, 14);

        TotalCar3.setForeground(new java.awt.Color(255, 0, 0));
        TotalCar3.setText("00:00:00:00");
        jPanel1.add(TotalCar3);
        TotalCar3.setBounds(290, 130, 80, 14);

        TotalCar5.setForeground(new java.awt.Color(153, 153, 0));
        TotalCar5.setText("00:00:00:00");
        jPanel1.add(TotalCar5);
        TotalCar5.setBounds(290, 170, 80, 14);

        TotalCar8.setForeground(new java.awt.Color(0, 204, 153));
        TotalCar8.setText("00:00:00:00");
        jPanel1.add(TotalCar8);
        TotalCar8.setBounds(290, 230, 80, 14);

        TotalCar10.setText("00:00:00:00");
        jPanel1.add(TotalCar10);
        TotalCar10.setBounds(290, 270, 80, 14);

        TotalCar7.setForeground(new java.awt.Color(0, 102, 0));
        TotalCar7.setText("00:00:00:00");
        jPanel1.add(TotalCar7);
        TotalCar7.setBounds(290, 210, 80, 14);

        TotalCar6.setForeground(new java.awt.Color(102, 255, 0));
        TotalCar6.setText("00:00:00:00");
        jPanel1.add(TotalCar6);
        TotalCar6.setBounds(290, 190, 80, 14);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 420, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Ação botão Reiniciar
    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        Timer.Reiniciar(); //Reiniciar contadores
        SimulatorPanel.Pareo.setText("Classificação:"); //Reiniciar painel de classificação
        reiniciar = 1; //Variável controle
        //Setar status de carros para falso
        ctrCar.ResetaCarro();
        if(parar == 1) //Se progrma tiver sido parado
            stopreset = true; //Variável de controle
        if(parar == 0)//Se o programa está pausado
        {
            try 
            {
                sleep(100); //Dar um delay para voltar a default
                reiniciar = 0; //voltar variável de controle para default
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_ResetActionPerformed

    //Ação botão Parar
    private void StopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopActionPerformed
        //Tratamento de erros
        if(Timer.State) //Se estiver rodando
        {
            parar = 1; //Variável de controle
            //Seta estado do carro para falso
            ctrCar.ParaCarro();
            Timer.Parar(); //Parar cronômetro
        }
        else //Senão, não faça nada
        {
        }
    }//GEN-LAST:event_StopActionPerformed

    //Ação botão iniciar
    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
        corridasModify.Adiciona();
        //Tratamento de erros
        if(control == 0) //Se o botão ainda não foi apertado:
        {
            //Inicia o cronômetro
            timer.Iniciar();
            //Inicializa o simulador
            simulator.setVisible(true);
            //Inicializa carros de corrida no simulador
            ctrCar.IniciaCarro();
            control += 1; //Adiciona controle para indicar que botão foi apertado
        }
        else if(Timer.State) //Se programa já estiver em execução, não faz nada
        {
        }
        else if(parar == 1 && reiniciar == 1) //Se o programa tiver parado e em seguida resetado:
        {
            Timer.Reiniciar(); //Reinia o cronômetro
            ControleCarro.countCarros = 0; //Reinicia o contador de carros
            SimulatorPanel.Pareo.setText("Classificação:"); //Reinicia painel de classificação
            simulator.setVisible(true); //Inicializa simulador, caso não esteja visível
            //Retorna status e local dos carros e sua movimentação
            ctrCar.RetornaCarroParado_Resetado();
            //Reinicia o Cronômetro
            timer.Iniciar();
            //Retorna valor padrão para variáveis de controle
            parar = 0;
            reiniciar = 0;
            try {
                sleep(150); //Delay para setar variável de controle para false
                stopreset = false; //Seta variável de controle para falsa
            } catch (InterruptedException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(parar == 1) //Se o programa foi pausado, retoma de onde ele parou
        {
            //Retorna status dos carros e sua movimentação
            ctrCar.RetornaCarroParado();
            //Retoma cronômetro
            timer.Iniciar();
            //Retorna variável de controle do botão de pausa para estado default
            parar = 0;
        }
        else //Caso programa tenha terminado a execução (Realizada as duas voltas)
        {
            Timer.Reiniciar(); //Reinia o cronômetro
            ControleCarro.countCarros = 0; //Reinicia o contador de carros
            SimulatorPanel.Pareo.setText("Classificação:"); //Reinicia painel de classificação
            simulator.setVisible(true); //Inicializa simulador, caso não esteja visível
            //Retorna status dos carros e sua movimentação
            ctrCar.RetornaCarroParado();
            //Reinicia o Cronômetro
            timer.Iniciar();
        }
    }//GEN-LAST:event_StartActionPerformed

    //Ação para botão de fechar simulador
    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        ResetActionPerformed(evt);
        simulator.setVisible(false); //Fecha o simulador
    }//GEN-LAST:event_CloseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Car10Label1;
    public static javax.swing.JLabel Car1Label1;
    public static javax.swing.JLabel Car2Label1;
    public static javax.swing.JLabel Car3Label1;
    public static javax.swing.JLabel Car4Label1;
    public static javax.swing.JLabel Car5Label1;
    public static javax.swing.JLabel Car6Label1;
    public static javax.swing.JLabel Car7Label1;
    public static javax.swing.JLabel Car8Label1;
    public static javax.swing.JLabel Car9Label1;
    private javax.swing.JButton Close;
    public static javax.swing.JLabel Hour;
    private javax.swing.JLabel Lbl1;
    public static javax.swing.JLabel Minute;
    public static javax.swing.JLabel Ms;
    private javax.swing.JButton Reset;
    public static javax.swing.JLabel Second;
    private javax.swing.JButton Start;
    private javax.swing.JButton Stop;
    public static javax.swing.JLabel TotalCar1;
    public static javax.swing.JLabel TotalCar10;
    public static javax.swing.JLabel TotalCar2;
    public static javax.swing.JLabel TotalCar3;
    public static javax.swing.JLabel TotalCar4;
    public static javax.swing.JLabel TotalCar5;
    public static javax.swing.JLabel TotalCar6;
    public static javax.swing.JLabel TotalCar7;
    public static javax.swing.JLabel TotalCar8;
    public static javax.swing.JLabel TotalCar9;
    public static javax.swing.JLabel Volta1Car1;
    public static javax.swing.JLabel Volta1Car10;
    public static javax.swing.JLabel Volta1Car2;
    public static javax.swing.JLabel Volta1Car3;
    public static javax.swing.JLabel Volta1Car4;
    public static javax.swing.JLabel Volta1Car5;
    public static javax.swing.JLabel Volta1Car6;
    public static javax.swing.JLabel Volta1Car7;
    public static javax.swing.JLabel Volta1Car8;
    public static javax.swing.JLabel Volta1Car9;
    public static javax.swing.JLabel Volta2Car1;
    public static javax.swing.JLabel Volta2Car10;
    public static javax.swing.JLabel Volta2Car2;
    public static javax.swing.JLabel Volta2Car3;
    public static javax.swing.JLabel Volta2Car4;
    public static javax.swing.JLabel Volta2Car5;
    public static javax.swing.JLabel Volta2Car6;
    public static javax.swing.JLabel Volta2Car7;
    public static javax.swing.JLabel Volta2Car8;
    public static javax.swing.JLabel Volta2Car9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
