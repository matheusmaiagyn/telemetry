package Carros;

import DataBaseObject.Voltas;
import DataBaseModify.VoltasModify;
import static java.lang.Thread.sleep;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import telemetria.Frame;
import javax.swing.JLabel;

//Classe responsável pelo movimento do carro.

public class MoveCarro
{   
    //Declaração de variável para acesso a classe Carro
    public Carro Car = new Carro();
    VoltasModify voltasModify = new VoltasModify();
    
    public void MoveCar(JLabel volta1, JLabel volta2, JLabel total, JLabel car, boolean State, String NomeCarro) //Movimentar o carro
    {
        //Seta o carro (JLabel do frame SimulatorPanel) que será movido
        Car.setCarro(car);
        //Seta o estado do carro
        Car.setState(State);
        //Seta o nome do carro
        Thread t = new Thread() //Declaração da Thread
            {
                public void run()//Método para rodar dentro da Thread
                {
                    //Declaração variáveis inteiras de controle
                    int volta = 0, hr = 0, min = 0, sec = 0, mil = 0, speed = 40, ctrspeed = 0, x = 20, y = 100; 
                    //Declaração variáveis String de controle
                    String milstr = "", secstr = "", minstr = "", hrstr = "";
                    
                    //Acesso objeto do Banco de Dados
                    Voltas voltas = new Voltas();

                    while(Car.isState()) //Enquanto status for verdadeiro:
                    {
                        if(Frame.stopreset) //Se o programa tiver sido pausado e resetado:
                        {
                            //Seta o local do carro para a linha de chegada
                            x = 20; 
                            y = 100;
                            Car.getCarro().setLocation(20, 100);
                        }
                        if(x == 20 && y >= 15 && y < 220) //Se estiver entre essas posições (Lado esquerdo da pista)
                        {
                            while(Car.isState()) //Enquanto status for verdadeiro:
                            {
                                try
                                {
                                    //ctrspeed: (Inicia no 0, ao chegar no 20, a velocidade do carro é mudada para uma aleatória
                                    if(ctrspeed == 20) //Se controle de velocidade for 20:
                                    {
                                        speed = ThreadLocalRandom.current().nextInt(20, 30); //Muda velocidade do carro
                                        ctrspeed = 0; //Reseta controle de velocidade
                                    }
                                    ctrspeed += 1; //Incrementa no controle de velocidade
                                    sleep(speed); //Seta a velocidade do carro
                                    Car.getCarro().setLocation(x, y); //Movimenta o carro para a nova localização
                                    y += 1; //Incrementa no y para fazer o carro movimentar para baixo
                                }
                                catch(Exception ex)
                                {
                                }
                                if(y == 220) //Se chegar ao y 220:
                                    break; //Finaliza este while
                                if(x == 20 && y == 100) //Se chegar na linha de chegada:
                                {
                                    volta += 1; //Incremente volta
                                    if(volta == 1) //Se for a 1° volta
                                    {
                                        //Pega o tempo que o carro levou para realizar a volta
                                        hr = Integer.parseInt(Frame.Hour.getText()); 
                                        min = Integer.parseInt(Frame.Minute.getText());
                                        sec = Integer.parseInt(Frame.Second.getText());
                                        mil = Integer.parseInt(Frame.Ms.getText());
                                        
                                        ///Tratemento de erros para valores no ms caso preciso
                                        //Pois valores inteiros como 0, não são mostrados 00 e nem valores menos que 10
                                        //São mostrados com 01/02/03... Por exemplo
                                        if(mil == 0) //Se mil for 0
                                            milstr = Integer.toString(mil) + "0"; //Transforma em String e adiciona um 0 no fim
                                        else if(mil < 10) //Se for menos que 10
                                            milstr = "0" +Integer.toString(mil); //Transforma em String e adiciona um 0 no começo
                                        else //Senão
                                            milstr = Integer.toString(mil); //Somente transforma em String (Por questões da variável inserida no campo)
                                        //Seguintes Ifs possuem mesmo comportamento que os de cima porém para as outras medidas
                                        if(sec == 0)
                                            secstr = Integer.toString(sec) + "0";
                                        else if(sec < 10)
                                            secstr = "0" +Integer.toString(sec);
                                        else
                                            secstr = Integer.toString(sec);
                                        if(min == 0)
                                            minstr = Integer.toString(min) + "0";
                                        else if(min < 10)
                                            minstr = "0" +Integer.toString(min);
                                        else
                                            minstr = Integer.toString(min);
                                        if(hr == 0)
                                            hrstr = Integer.toString(hr) + "0";
                                        else if(hr < 10)
                                            hrstr = "0" +Integer.toString(hr);
                                        else
                                            hrstr = Integer.toString(hr);
                                        //Finalização controle de erros
                                        
                                        //Seta tempo da volta
                                        volta1.setText("" + hrstr +
                                            ":" + minstr +
                                            ":" + secstr +
                                            ":" + milstr);
                                    }
                                    else //Caso seja segunda volta:
                                    {
                                        //Pega o valor gastado pelo carro somente na segunda volta
                                        hr = Integer.parseInt(Frame.Hour.getText()) - hr;
                                        min = Integer.parseInt(Frame.Minute.getText()) - min;
                                        sec = Integer.parseInt(Frame.Second.getText()) - sec;
                                        mil = Integer.parseInt(Frame.Ms.getText()) - mil;
                                        
                                        //Tratamento de erro caso o resultado da subtração a cima seja negativo
                                        if(mil < 0)
                                            mil *= -1;
                                        if(sec < 0)
                                            sec *= -1;
                                        if(min < 0)
                                            min *= -1;
                                        if(hr < 0)
                                            hr *= -1;
                                        
                                        //Tratemento de erros para valores no ms caso preciso
                                        //Pois valores inteiros como 0, não são mostrados 00 e nem valores menores que 10
                                        //São mostrados com 01/02/03... Por exemplo
                                        if(mil == 0) //Se mil for 0
                                            milstr = Integer.toString(mil) + "0"; //Transforma em String e adiciona um 0 no fim
                                        else if(mil < 10) //Se for menos que 10
                                            milstr = "0" +Integer.toString(mil); //Transforma em String e adiciona um 0 no começo
                                        else //Senão
                                            milstr = Integer.toString(mil); //Somente transforma em String (Por questões da variável inserida no campo)
                                        //Seguintes Ifs possuem mesmo comportamento que os de cima porém para as outras medidas
                                        if(sec == 0)
                                            secstr = Integer.toString(sec) + "0";
                                        else if(sec < 10)
                                            secstr = "0" +Integer.toString(sec);
                                        else
                                            secstr = Integer.toString(sec);
                                        if(min == 0)
                                            minstr = Integer.toString(min) + "0";
                                        else if(min < 10)
                                            minstr = "0" +Integer.toString(min);
                                        else
                                            minstr = Integer.toString(min);
                                        if(hr == 0)
                                            hrstr = Integer.toString(hr) + "0";
                                        else if(hr < 10)
                                            hrstr = "0" +Integer.toString(hr);
                                        else
                                            hrstr = Integer.toString(hr);
                                        //Finalização controle de erros
                                        
                                        //Seta tempo da volta
                                        volta2.setText("" + hrstr +
                                            ":" + minstr +
                                            ":" + secstr +
                                            ":" + milstr);
                                        
                                        //Status: Pausado
                                        Car.setState(false);
                                        //Chama controle carros para verificar se foi o ultimo carro a cruzar a linha de chegada para

                                        //Finalizar o programa
                                        ControleCarro.CountCarro();
                                        //Seta tempo total do carro na corrida:
                                        total.setText(Frame.Hour.getText() + ":" +
                                                Frame.Minute.getText() + ":" +
                                                Frame.Second.getText() + ":" +
                                                Frame.Ms.getText());
                                        //Adiciona carro ao páreo
                                        ControleCarro.Pareo(NomeCarro);
                                        //Seta o tempo da primeira volta para ser colocado na tabela Voltas
                                        voltas.setTempoVolta(volta1.getText());
                                        //Seta os dados e insere no BD
                                        voltasModify.setaDados(NomeCarro, 1, voltas);
                                        try {
                                            //Delay de 3,5 segundos para que os dados fiquem organizados no Banco de dados
                                            sleep(3500);
                                            voltas.setTempoVolta(volta2.getText()); //Seta o tempo da volta 2
                                            voltasModify.setaDados(NomeCarro, 2, voltas); //Seta dados e insere no BD
                                            ControleCarro.CountCarro(); //Chama novamente o contador de carros para "contar o 11°" carro para que
                                            //seja inserido os dados na tabela corrida
                                        } catch (InterruptedException ex) {
                                            Logger.getLogger(MoveCarro.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                        //Pausa o while
                                        break;
                                    }
                                }
                            }

                        }
                        else if(x >= 20 && x < 230 && y == 220) //Se estiver entre essas posições (Lado debaixo da pista)
                        {
                            while(Car.isState()) //Equanto status está ativo:
                            {
                                try
                                {
                                    //ctrspeed: (Inicia no 0, ao chegar no 20, a velocidade do carro é mudada para uma aleatória
                                    if(ctrspeed == 20) //Se controle de velocidade for 20:
                                    {
                                        speed = ThreadLocalRandom.current().nextInt(20, 30); //Muda velocidade do carro
                                        ctrspeed = 0; //Reseta controle de velocidade
                                    }
                                    ctrspeed += 1; //Incrementa no controle de velocidade
                                    sleep(speed); //Seta a velocidade do carro
                                    Car.getCarro().setLocation(x, y); //Movimenta o carro para a nova localização
                                    x += 1; // Incrementa no x para fazer o carro mover para a direita
                                }
                                catch(Exception ex)
                                {
                                }
                                if(x == 230) //Se estiver nessa localização:
                                    break; //Para esse while
                            }
                        }
                        else if(x == 230 && y <= 220 && y > 15) //Se estiver entre essas posições (Lado direito da pista)
                        {
                            while(Car.isState()) //Equanto status está ativo:
                            {
                                try
                                {
                                    //ctrspeed: (Inicia no 0, ao chegar no 20, a velocidade do carro é mudada para uma aleatória
                                    if(ctrspeed == 20) //Se controle de velocidade for 20:
                                    {
                                        speed = ThreadLocalRandom.current().nextInt(20, 30); //Muda velocidade do carro
                                        ctrspeed = 0; //Reseta controle de velocidade
                                    }
                                    ctrspeed += 1; //Incrementa no controle de velocidade
                                    sleep(speed); //Seta a velocidade do carro
                                    Car.getCarro().setLocation(x, y); //Movimenta o carro para a nova localização
                                    y -= 1; //Decrementa do y para fazer o carro subir
                                }
                                catch(Exception ex)
                                {
                                }
                                if(y == 15) //Se chegar nessa posição:
                                    break; //Para esse while
                            }
                        }
                        else if(x <= 230 && x > 20 && y == 15) //Se estiver entre essas posições (Lado de cima da pista)
                        {
                             while(Car.isState()) //Equanto status está ativo:
                            {
                                try
                                {
                                    //ctrspeed: (Inicia no 0, ao chegar no 20, a velocidade do carro é mudada para uma aleatória
                                    if(ctrspeed == 20) //Se controle de velocidade for 20:
                                    {
                                        speed = ThreadLocalRandom.current().nextInt(20, 30); //Muda velocidade do carro
                                        ctrspeed = 0; //Reseta controle de velocidade
                                    }
                                    ctrspeed += 1; //Incrementa no controle de velocidade
                                    sleep(speed); //Seta a velocidade do carro
                                    Car.getCarro().setLocation(x, y); //Movimenta o carro para a nova localização
                                    x -= 1; //Decrementa do x para mover o carro par a direita
                                }
                                catch(Exception ex)
                                {
                                }
                                if(x == 20) //Se estiver nessa localização:
                                    break; //Para esse while
                            }
                        }
                        while(!Car.isState()) //Se o status estiver falso:
                        {
                            if(volta == 2) //Se for a segunda volta:
                            {
                                //Reseta variáveis de controle
                                volta = 0;
                                hr = 0;
                                min = 0; 
                                sec = 0;
                                mil = 0;
                            }
                            if(Frame.reiniciar == 1) //Se o botão de reiniciar foi ativado:
                            {
                                //Reseta a localização do carro para a linha de partida
                                x = 20;
                                y = 100;
                                Car.getCarro().setLocation(20, 100);
                                //Reseta as voltas
                                volta = 0;
                            }
                            PauseThread(); //Pausa a Thread usando o comenado Wait()
                        }
                    }
                }
            };
        t.start(); //Inicializa a Thread
    }
    
    public void PauseThread() //Método para pausar a Thread
    {
        synchronized (this) //Sincroniza este bloco com a classe
        {
            try 
            {
                wait(); //Pausa a execução da Thread até ser reativada com o Notify()
            } catch (InterruptedException ex) 
            {
                Logger.getLogger(MoveCarro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void ReturnT() //Retoma a Thread
    {
        synchronized (this) //Sincroniza este bloco com a classe
        {
            Car.setState(true); //Retorna estado para true
            notify(); //Notifica e retorna a Thread
        }
    }
    
    public void ReturnTReset() //Retoma a Thread caso programa tenha sido parado e resetado
    {
        synchronized (this) //Sincroniza este bloco com a classe
        {
            Car.setState(true); //Retorna estado para true
            notify(); //Notifica e retorna a Thread
        }
    }
}
