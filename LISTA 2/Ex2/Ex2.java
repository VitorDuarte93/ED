public class Ex2 {

    public static void main(String[] args) {
   
       Fila f1 = new Fila(3);
       Fila f2 = new Fila(5);
       Fila f3 = new Fila (8);


       
       for(int i = 0; i < 3; i++){

               f1.insere(i);
       }
   
       for(int i = 0; i < 5; i++){
   
           f2.insere(i+10);
       }

       f3.combinaFilas(f1, f2);


   }
}