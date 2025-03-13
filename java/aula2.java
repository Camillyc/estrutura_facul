public class Pessoa {
   public static void main (String []args) {
    Pessia a = new Pessoa () 
    a.nome = "Joao";
    a.idade = 20;

    Pessoa b = new Pessoa () ;
    b.nome = "Maria" ;
    b.idade = 30;

    Pessoa c = new Pessoa ()
    c.nome = "Pedro";
    b.idade = 5;

    Pessoa[] vet = new Pessoa[3];
    vet[0] = a;
    vet[1] = b;
    vet[2] = c;

    System.out.println(encontraNomeMaisVelha (vet)); 

   }

   static String encontraNomeMaisVelha (Pessoa[] dados){
    for (int i = 0; i <dados.length; ++i) {
        if (dados[i].idade >idadeTemp) {
            idadeTemp = dados[i].idade;
            nomeTemp = dados[i].idade;
            nomeTemp = dados[i].nome;
        }
    }
   }
   return nomeTemp;
}
  