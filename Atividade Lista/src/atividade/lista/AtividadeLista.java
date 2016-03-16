
package atividade.lista;

public class AtividadeLista {


    public static void main(String[] args) 
    {
        Lista Teste = new Lista(); 
        Teste.inserirInicio(4);
        Teste.inserirFim(3);
        Teste.inserirMeio(2);
        Teste.inserirFim(1);
        Teste.Remover(2);
        Teste.getValor(1);
        Teste.getPosicao(2);
        Teste.Vazia();
        System.out.println(Teste.getValor(1));
        System.out.println(Teste.getPosicao(2));
        System.out.println(Teste.Vazia(););
    }
    
}
