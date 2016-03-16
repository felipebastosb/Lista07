
public class Lista 
{
    NoLista inicio;
    
    public Lista ()
    {
        this.inicio= null;
    }
    
    public void InserirInicio(int Valor)
    {
        if(this.inicio == null)
        {
            this.inicio =   new NoLista(Valor);
        }
        else
        {
            NoLista novoNo = new NoLista(Valor);
            novoNo.next = this.inicio;
            this.inicio = novoNo;
        }
    }
    
    public void InserirMeio(int Valor, int Posicao)
    {
        NoLista novoNo = new NoLista(Valor);
        novoNo.next = null;
    }
    
    public void InserirFim(int Valor)
    {
        if(this.inicio == null)
        {
            this.inicio =   new NoLista(Valor);
        }
        else
        {
            NoLista Atual = this.inicio;
            while (Atual.next != null)
                Atual = Atual.next;
            
            Atual.next = new NoLista(Valor);
        }
    }
    
    public void Remover (int Valor)
    {
        NoLista Atual = this.inicio;
        NoLista Proximo = Atual.proximo;
            while(posAtual.valor!=valor) {
                Atual = Atual.proximo;
                Proximo = Proximo.proximo;
            }
            Atual.proximo = Proximo.proximo;   
    }
    
    public boolean Vazia ()
    {
        if(this.inicio==null)
            return true;
        else
            return false; 
    }
    
    public int getValor(int Posicao)
    {
        NoLista Atual = this.inicio;
        for(int x = 0; x<(pos-1);x++)
            Atual = Atual.proximo;
        return Atual.valor;
    }
    
    public int getPosicao(int Valor)
    {
        NoLista Atual = this.inicio;
        int Posicao = 1;
        while(Atual.valor!=valor)
        {
            Atual = Atual.proximo;
            Posicao++;
        }
        return Posicao;
    }
    
    
    
    
    
    
    
    
    
    
}
