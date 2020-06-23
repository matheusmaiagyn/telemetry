package Carros;


import java.util.ArrayList;
import java.util.List;

//Classe para inicializar os 10 carros

public class IniciaCarro 
{
    //Array de objetos dos carros
    List<MoveCarro> Carros = new ArrayList<>(10);
    public IniciaCarro()
    {
        //Loop para adicionar 10 objetos de carros para o array
        for(int i = 0; i < 10; i++)
        {
            Carros.add(new MoveCarro()); //Adicionar carros ao array
        }
    }
}
