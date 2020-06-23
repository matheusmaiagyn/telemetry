package Carros;

import telemetria.SimulatorPanel;
import telemetria.Timer;
import static telemetria.Frame.TotalCar1;
import static telemetria.Frame.TotalCar10;
import static telemetria.Frame.TotalCar2;
import static telemetria.Frame.TotalCar3;
import static telemetria.Frame.TotalCar4;
import static telemetria.Frame.TotalCar5;
import static telemetria.Frame.TotalCar6;
import static telemetria.Frame.TotalCar7;
import static telemetria.Frame.TotalCar8;
import static telemetria.Frame.TotalCar9;
import static telemetria.Frame.Volta1Car1;
import static telemetria.Frame.Volta1Car10;
import static telemetria.Frame.Volta1Car2;
import static telemetria.Frame.Volta1Car3;
import static telemetria.Frame.Volta1Car4;
import static telemetria.Frame.Volta1Car5;
import static telemetria.Frame.Volta1Car6;
import static telemetria.Frame.Volta1Car7;
import static telemetria.Frame.Volta1Car8;
import static telemetria.Frame.Volta1Car9;
import static telemetria.Frame.Volta2Car1;
import static telemetria.Frame.Volta2Car10;
import static telemetria.Frame.Volta2Car2;
import static telemetria.Frame.Volta2Car3;
import static telemetria.Frame.Volta2Car4;
import static telemetria.Frame.Volta2Car5;
import static telemetria.Frame.Volta2Car6;
import static telemetria.Frame.Volta2Car7;
import static telemetria.Frame.Volta2Car8;
import static telemetria.Frame.Volta2Car9;
import DataBaseModify.CorridasModify;

//Classe de controle dos carros

public class ControleCarro 
{   
    //Variáveis de acesso a outras classes
    MoveCarro car = new MoveCarro();
    IniciaCarro initCar = new IniciaCarro();
    static CorridasModify corridasModify = new CorridasModify();
    
    public static int countCarros = 0; //Variável de controle para contar carros que finalizaram a ultima volta
    
    public static void CountCarro() //Ao terminar a corrida o carro chama esse método
    {
        countCarros += 1; //Adicionando valor para variável de controle
        if(countCarros == 10) //Se todos os carros terminaram a corrida:
            Timer.State = false; //Pausa o cronônometro
        if(countCarros == 11) //Quando terminar a corrida "conta" um carro amais para realizar a inserção no Banco de dados
            corridasModify.setaDados(); //Seta os dados e insere no BD
    }
    
    public static void Pareo(String carro) //Método para a construção do painel de classificação
    {
        SimulatorPanel.Pareo.setText(SimulatorPanel.Pareo.getText() + "\n" + carro); //Adiciona o carro ao páreo
    }
    
    public void ParaCarro() //Método para parar o carro
    {
        initCar.Carros.get(0).MoveCar(Volta1Car1,Volta2Car1, TotalCar1, SimulatorPanel.Car1, false, "Z4");
        initCar.Carros.get(1).MoveCar(Volta1Car2,Volta2Car2, TotalCar2, SimulatorPanel.Car2, false, "BRZ");
        initCar.Carros.get(2).MoveCar(Volta1Car3,Volta2Car3, TotalCar3, SimulatorPanel.Car3, false, "MX-5 Miata");
        initCar.Carros.get(3).MoveCar(Volta1Car4,Volta2Car4, TotalCar4, SimulatorPanel.Car4, false, "370Z");
        initCar.Carros.get(4).MoveCar(Volta1Car5,Volta2Car5, TotalCar5, SimulatorPanel.Car5, false, "GTI");
        initCar.Carros.get(5).MoveCar(Volta1Car6,Volta2Car6, TotalCar6, SimulatorPanel.Car6, false, "R8");
        initCar.Carros.get(6).MoveCar(Volta1Car7,Volta2Car7, TotalCar7, SimulatorPanel.Car7, false, "WRX");
        initCar.Carros.get(7).MoveCar(Volta1Car8,Volta2Car8, TotalCar8, SimulatorPanel.Car8, false, "Corvette");
        initCar.Carros.get(8).MoveCar(Volta1Car9,Volta2Car9, TotalCar9, SimulatorPanel.Car9, false, "Camaro");
        initCar.Carros.get(9).MoveCar(Volta1Car10,Volta2Car10, TotalCar10, SimulatorPanel.Car10, false, "Cayman");
    }
    
    public void ResetaCarro() //Método para resetar o carro
    {
        ParaCarro();
        SimulatorPanel.Car1.setLocation(20, 100);
        SimulatorPanel.Car2.setLocation(20, 100);
        SimulatorPanel.Car3.setLocation(20, 100);
        SimulatorPanel.Car4.setLocation(20, 100);
        SimulatorPanel.Car5.setLocation(20, 100);
        SimulatorPanel.Car6.setLocation(20, 100);
        SimulatorPanel.Car7.setLocation(20, 100);
        SimulatorPanel.Car8.setLocation(20, 100);
        SimulatorPanel.Car9.setLocation(20, 100);
        SimulatorPanel.Car10.setLocation(20, 100);
    }
    
    public void IniciaCarro() //Método para iniciar o carro
    {
        initCar.Carros.get(0).MoveCar(Volta1Car1,Volta2Car1, TotalCar1, SimulatorPanel.Car1, true, "Z4");
        initCar.Carros.get(1).MoveCar(Volta1Car2,Volta2Car2, TotalCar2, SimulatorPanel.Car2, true, "BRZ");
        initCar.Carros.get(2).MoveCar(Volta1Car3,Volta2Car3, TotalCar3, SimulatorPanel.Car3, true, "MX-5 Miata");
        initCar.Carros.get(3).MoveCar(Volta1Car4,Volta2Car4, TotalCar4, SimulatorPanel.Car4, true, "370Z");
        initCar.Carros.get(4).MoveCar(Volta1Car5,Volta2Car5, TotalCar5, SimulatorPanel.Car5, true, "GTI");
        initCar.Carros.get(5).MoveCar(Volta1Car6,Volta2Car6, TotalCar6, SimulatorPanel.Car6, true, "R8");
        initCar.Carros.get(6).MoveCar(Volta1Car7,Volta2Car7, TotalCar7, SimulatorPanel.Car7, true, "WRX");
        initCar.Carros.get(7).MoveCar(Volta1Car8,Volta2Car8, TotalCar8, SimulatorPanel.Car8, true, "Corvette");
        initCar.Carros.get(8).MoveCar(Volta1Car9,Volta2Car9, TotalCar9, SimulatorPanel.Car9, true, "Camaro");
        initCar.Carros.get(9).MoveCar(Volta1Car10,Volta2Car10, TotalCar10, SimulatorPanel.Car10, true, "Cayman");
    }
    
    public void RetornaCarroParado_Resetado() //Método para retornar a movimentação do carro que foi parado e resetado
    {
        initCar.Carros.get(0).ReturnTReset();
        initCar.Carros.get(1).ReturnTReset();
        initCar.Carros.get(2).ReturnTReset();
        initCar.Carros.get(3).ReturnTReset();
        initCar.Carros.get(4).ReturnTReset();
        initCar.Carros.get(5).ReturnTReset();
        initCar.Carros.get(6).ReturnTReset();
        initCar.Carros.get(7).ReturnTReset();
        initCar.Carros.get(8).ReturnTReset();
        initCar.Carros.get(9).ReturnTReset();
    }
    
    public void RetornaCarroParado() //Método para retornar movimento do carro parado
    {
        initCar.Carros.get(0).ReturnT();
        initCar.Carros.get(1).ReturnT();
        initCar.Carros.get(2).ReturnT();
        initCar.Carros.get(3).ReturnT();
        initCar.Carros.get(4).ReturnT();
        initCar.Carros.get(5).ReturnT();
        initCar.Carros.get(6).ReturnT();
        initCar.Carros.get(7).ReturnT();
        initCar.Carros.get(8).ReturnT();
        initCar.Carros.get(9).ReturnT();
    }
}
