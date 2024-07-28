package EX1;

public class Processos {
    
   protected String nome;
   protected int id;
   
   public Processos(String nm, int i){
    nome = nm;
    id = i;

   }

   public String toString() {
        
      return String.format("(%s, %d)", nome, id);  // para poder imprimir o processo
  }

}
