
package ticketeria;

public class Ingresso{
    
    //Interações cliente - ingresso 
    String nomeCliente;
    String tipo;
    int lugar;
    
    //Preços
    double precoMeia = 8.50;
    double precoInteira = 17; 
    double codigoCompra;
    
    //compra de ingresso
    public void comprarIngresso(String cliente,Sessao sessao,int lugar, boolean inteiraOUmeia){
        
        nomeCliente = cliente;
        this.lugar = lugar;
        
        if( sessao.disponivel == true){
        sessao.registrarAssento(lugar, cliente);
        
        
        if(inteiraOUmeia == true){
            this.tipo = "meia";
        }else{
            this.tipo = "inteira";
        }
        
        }else{
            
            System.out.println("Sessao indisponivel!");
            
        }
    }
}
