package Carros;

import javax.swing.JLabel;

//Classe de definição do carro

public class Carro 
{
    //Declaração de variável do carro
    JLabel Carro = new JLabel();
    //Variável do estado do carro
    boolean State;

    //Setters e Getters das variáveis:
    public boolean isState() {
        return State;
    }

    public void setState(boolean State) {
        this.State = State;
    }

    public JLabel getCarro() {
        return Carro;
    }

    public void setCarro(JLabel Carro) {
        this.Carro = Carro;
    }
    
    
}
