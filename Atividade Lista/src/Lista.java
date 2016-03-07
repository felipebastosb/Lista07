
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
        
    }
    
    public boolean Vazia ()
    {
       return false; 
    }
    
    public int getValor(int Posicao)
    {
        return 33;
    }
    
    public int getPosicao(int Vallor)
    {
        return 33;
    }
    
    
    
    
    
    
    
    
    
    
}
