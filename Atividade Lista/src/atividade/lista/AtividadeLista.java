
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
        
        Pilha Teste2 = new Pilha();
        Teste2.Inserir(3);
        Teste2.Inserir(4);
        Teste2.Inserir(5);
        Teste2.Inserir(6);
        Teste2.Remover();
        System.out.println(Teste2.RetornaRemove());
        System.out.println(Teste2.Vazia());
        
        Fila Teste3 = new Fila();
        Teste3.Inserir(3);
        Teste3.Inserir(4);
        Teste3.Inserir(5);
        Teste3.Inserir(6);
        Teste3.Remover();
        System.out.println(Teste3.RetornaRemove());
        System.out.println(Teste3.Vazia());
        
        
    }
    
}
