package telemetria;

import static java.lang.Thread.sleep;

//Classe do cronômetro

public class Timer {
    //Declaração das variáveis inteiras de tempo
    static int Milliseconds = 0;
    static int Seconds = 0;
    static int Minutes = 0;
    static int Hours = 0;
    
    //Declaração das variáveis strings de tempo (explicação do pq delas no momento de utilização)
    public String mil = "", sec = "", min = "", hr = "";
    
    //Declaração da variável de controle de estado (Executando ou não)
    public static boolean State = false;
    
    public void Iniciar() //Iniciar crônometro
    {
        //Tratamento de erro
        if(State) //Se já estiver executando, não irá fazer nada
            return;
        State = true;
        
        //Declaração da Thread do crônometro
        Thread t = new Thread()
        {
            // Método a ser executado ao iniciar a Thread
            public void run()
            {
                while(State) //Enquanto State estiver verdadeiro:
                {
                    try //Tente:
                    {
                        sleep(9); //Delay para controle do tempo (O valor que fique mais próximo ao tempo de um crônometro normal)
                        Milliseconds++; //Aumenta valor do ms

                        if(Milliseconds == 100) //Se chegar ao valor 100
                        {
                            Seconds++; //Aumenta segundos
                            Milliseconds = 0; //Reiniciar ms
                        }
                        if(Seconds == 60) //Se segundos chegar ao 60
                        {
                            Minutes++; //Aumenta minutos
                            Seconds = 0; //Reiniciar Segundos
                        }
                        if(Minutes == 60) //Se minutos chegar ao 60
                        {
                            Hours++; //Aumenta horas
                            Minutes = 0; //Reiniciar Minutos
                        }

                        //Tratemento de erros para valores no ms caso preciso
                        //Pois valores inteiros como 0, não são mostrados 00 e nem valores menos que 10
                        //São mostrados com 01/02/03... Por exemplo
                        if(Milliseconds == 0) //Se ms for 0
                            mil = Integer.toString(Milliseconds) + "0"; //Transforma em string e adiciona um 0 no fim
                        else if(Milliseconds < 10) // Se ms for menor que 10
                            mil =  "0" +Integer.toString(Milliseconds); //Transforma em string e adiciona um 0 no começo
                        else //Caso nenhuma das opções
                            mil = Integer.toString(Milliseconds); //Somente transforma em String (Por questões da variável inserida no campo)
                        //Seguintes Ifs possuem mesmo comportamento que os de cima porém para as outras medidas
                        if(Seconds == 0)
                            sec = Integer.toString(Seconds) + "0";
                        else if(Seconds < 10)
                            sec =  "0" +Integer.toString(Seconds);
                        else
                            sec =  Integer.toString(Seconds);
                        if(Minutes == 0)
                            min = Integer.toString(Minutes) + "0";
                        else if(Minutes < 10)
                            min =  "0" +Integer.toString(Minutes);
                        else
                            min =  Integer.toString(Minutes);
                        if(Hours == 0)
                            hr = Integer.toString(Hours) + "0";
                        else if(Hours < 10)
                            hr =  "0" +Integer.toString(Hours);
                        else
                            hr =  Integer.toString(Hours);
                        //Finalização controle de erros

                        //Atualiza campos de HR, Min, Sec e MS
                        Frame.Hour.setText(hr);
                        Frame.Minute.setText(min);
                        Frame.Second.setText(sec);
                        Frame.Ms.setText(mil);

                        //Reseta valores da String de tempo para não haver bugs
                        mil = "";
                        sec = "";
                        min = "";
                        hr = "";
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        };
        t.start(); //Iniciar Thread
    }    
   
    public static void Parar() //Pausar cronômetro
    {
        State = false;
    }
    
    public static void Reiniciar() //Reiniciar cronômetro
    {
        State = false; //Parar croônometro
        
        try
        {
            sleep(10); //Delay para tratamento de erro
            Hours = 00;
            Minutes = 00;
            Seconds = 00;
            Milliseconds = 00;

            //Seta texto da área do cronômetro
            Frame.Hour.setText("00");
            Frame.Minute.setText("00");
            Frame.Second.setText("00");
            Frame.Ms.setText("00");
        }
        catch(Exception e)
        {
        }
        
        //Reseta tempo dos carros na corrida
        Frame.TotalCar1.setText("00:00:00:00");
        Frame.TotalCar2.setText("00:00:00:00");
        Frame.TotalCar3.setText("00:00:00:00");
        Frame.TotalCar4.setText("00:00:00:00");
        Frame.TotalCar5.setText("00:00:00:00");
        Frame.TotalCar6.setText("00:00:00:00");
        Frame.TotalCar7.setText("00:00:00:00");
        Frame.TotalCar8.setText("00:00:00:00");
        Frame.TotalCar9.setText("00:00:00:00");
        Frame.TotalCar10.setText("00:00:00:00");
        Frame.Volta1Car1.setText("00:00:00:00");
        Frame.Volta1Car2.setText("00:00:00:00");
        Frame.Volta1Car3.setText("00:00:00:00");
        Frame.Volta1Car4.setText("00:00:00:00");
        Frame.Volta1Car5.setText("00:00:00:00");
        Frame.Volta1Car6.setText("00:00:00:00");
        Frame.Volta1Car7.setText("00:00:00:00");
        Frame.Volta1Car8.setText("00:00:00:00");
        Frame.Volta1Car9.setText("00:00:00:00");
        Frame.Volta1Car10.setText("00:00:00:00");
        Frame.Volta2Car1.setText("00:00:00:00");
        Frame.Volta2Car2.setText("00:00:00:00");
        Frame.Volta2Car3.setText("00:00:00:00");
        Frame.Volta2Car4.setText("00:00:00:00");
        Frame.Volta2Car5.setText("00:00:00:00");
        Frame.Volta2Car6.setText("00:00:00:00");
        Frame.Volta2Car7.setText("00:00:00:00");
        Frame.Volta2Car8.setText("00:00:00:00");
        Frame.Volta2Car9.setText("00:00:00:00");
        Frame.Volta2Car10.setText("00:00:00:00");
    }
}
