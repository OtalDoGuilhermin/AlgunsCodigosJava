import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner ler=new Scanner(System.in);
    int []mega= new int[6];
    int []result = new int[6];
    System.out.println("quais numeros da mega foram sorteados ? ");
    for (int i= 0; i < 6; i++){
    mega[i] = ler.nextInt();
      }
    System.out.println("quais numeros da mega voce jogou? ");
    for(int j=0;j<6;j++){
   result[j] = ler.nextInt();  
      }
    int h=0;
  if (mega[0] == result[0] ){
    h = 1;
  }
    if (mega[1] == result[1] ){
    h = h+1;
  }  if (mega[2] == result[2] ){
    h = h+1;
  }
    if (mega[3] == result[3] ){
    h = h+1;
  }
    if (mega[4] == result[4] ){
    h = h+1;
  }
    if (mega[5] == result[5] ){
    h = h+1;
  }
    if (h == 0){
      System.out.println("Não acertou nenhum");
    }
    if (h == 1){
      System.out.println("Voce acertou 1");
    }if (h>1){
  System.out.println("Seu numero de acertos é :"+h);
  }
  }
}
