import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner ler=new Scanner(System.in);
    int []vet1= new int[10];
    int i=0;
    vet1[0] = 10;
    vet1[1] = 20;
    vet1[2] = 30;
    vet1[3] = 40;
    vet1[4] = 50;
    vet1[5] = 60;
    vet1[6] = 70;
    vet1[7] = 80;
    vet1[8] = 90;
    vet1[9] = 100;
     System.out.println("informe um número para saber se tem no vetor ");
    i = ler.nextInt();
    if(i == vet1[0]){
      System.out.println("esse numero esta no vetor [0] ");
    }else  if(i == vet1[1]){
      System.out.println("esse numero esta no vetor [1] ");
    }else  if(i == vet1[2]){
      System.out.println("esse numero esta no vetor [2] ");
    }else  if(i == vet1[3]){
      System.out.println("esse numero esta no vetor [3] ");
    }else  if(i == vet1[4]){
      System.out.println("esse numero esta no vetor [4] ");
    }else  if(i == vet1[5]){
      System.out.println("esse numero esta no vetor [5] ");
    }else  if(i == vet1[6]){
      System.out.println("esse numero esta no vetor [6] ");
    }else  if(i == vet1[7]){
      System.out.println("esse numero esta no vetor [7] ");
    }else  if(i == vet1[8]){
      System.out.println("esse numero esta no vetor [8] ");
    }else  if(i == vet1[9]){
      System.out.println("esse numero esta no vetor [9] ");
    }else{
      System.out.println("esse numero não tem no vetor ");
    }
  }
}