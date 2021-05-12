package Pokemon;

import java.util.Scanner;

public class BatalhaPokemon{
  private static Scanner leitor;
  private static Scanner leitor2 = new Scanner(System.in);

static int ataqueJogador1() {
  leitor = new Scanner(System.in);
  System.out.println("Escolha o seus Três Pokemons:");
  System.out.println("=============================");
  System.out.println("=============================");
  System.out.println("1 - Vaporeon = (Água)");
  System.out.println("2 - Flareon = (Fogo)");
  System.out.println("3 - Jolteon = (Raio)");
  System.out.println("4 - Eevee = (Normal)");
  System.out.println("5 - Umbreon = (Escuridão)");
  System.out.println("6 - Leafeon = (Fantasma)");
  System.out.println("============================");
  System.out.println("============================");
  System.out.println("Os pokemons escolhidos são:");
  return leitor.nextInt();
 }

 static int ataqueJogador2() {
  System.out.println("Escolha o seus Três Pokemons:");
  System.out.println("=============================");
  System.out.println("=============================");
  System.out.println("1 - Vaporeon = (Água)");
  System.out.println("2 - Flareon = (Fogo)");
  System.out.println("3 - Jolteon = (Raio)");
  System.out.println("4 - Eevee = (Normal)");
  System.out.println("5 - Umbreon = (Escuridão)");
  System.out.println("6 - Leafeon = (Fantasma)");
  System.out.println("=============================");
  System.out.println("=============================");
  System.out.println("Os pokemons escolhidos são:");
  return leitor2.nextInt();
 }

 static void imprimeHP(int hpJogador1, int hpJogador2) {
  System.out.println("====================");
  System.out.println("====================");
  System.out.println("- HP Jogador 1: " + hpJogador1);
  System.out.println("====================");
  System.out.println("====================");
  System.out.println("- HP Jogador 2: " + hpJogador2);
  System.out.println("====================");
  System.out.println("====================");
 }

 static void batalha() {
  int hpJogador1 = 250;
  int hpJogador2 = 250;
  int escolhaAtaque;

  while (hpJogador1 > 0) {

   System.out.println("====================\n");
   System.out.println("\n      INICIO      \n");
   System.out.println("====================\n");

   while (hpJogador1 > 0 && hpJogador2 > 0) {
    imprimeHP(hpJogador1, hpJogador2);
    escolhaAtaque = ataqueJogador1();
    switch (escolhaAtaque) {
  case 1: {
        System.out.println("Jogador 1 aplicou o ataque Water Gun.");
        hpJogador2 -= 10;
        break;   
           }
  case 2: {
        System.out.println("Jogador 1 aplicou um ataque Hydro Pump.");
        hpJogador2 -= 30;
        break;
        }
  case 3:{
      System.out.println("Jogador 1 aplicou um ataque Flamethrower.");
      hpJogador2 -= 30;
      break;
         }
  case 4:{
      System.out.println("Jogador 1 aplicou um ataque HitKill.");
      hpJogador2 -= 40;
      break;
         }
  case 5:{
      System.out.println("Jogador 1 aplicou um ataque Attack of Shadows.");
      hpJogador2 -= 50;
      break;
         }
  case 6:{
      System.out.println("Jogador 1 aplicou um ataque Ilusion.");
      hpJogador2 -= 60;
      break;
         }     
  default: System.out.println("Opcao invalida");
    }
    if (hpJogador2 > 0) {
     escolhaAtaque = ataqueJogador2();
     switch (escolhaAtaque) {
     case 1:{
         System.out.println("Jogador 2 aplicou um ataque Ember.");
         hpJogador1 -= 15;
         break;
            }
     case 2:{
         System.out.println("Jogador 2 aplicou um ataque 	Fire Blast.");
         hpJogador1 -= 10;
         break;
            }
     case 3:{
         System.out.println("Jogador 2 aplicou um ataque  Flamethrower.");
         hpJogador1 -= 32;
         break;
           }
    case 4:{
         System.out.println("Jogador 2 aplicou um ataque  HitKill.");
         hpJogador2 -= 40;
         break;
           }
    case 5:{
        System.out.println("Jogador 2 aplicou um ataque  Attack of Shadows.");
        hpJogador2 -= 50;
        break;
           }
    case 6:{
        System.out.println("Jogador 2 aplicou um ataque  Ilusion.");
        hpJogador2 -= 60;
        break;
       }
    default: System.out.println("Opcao invalida");     
     }
    } else {
     System.out.println("Jogador 2 derrotado");
    } 
   }
  }
}

 public static void main(String[] args) {
  int continua = 1;
  while (continua == 1) {
    batalha();
   System.out.println("Fim de jogo. Deseja continuar? (1) Sim (2) Nao");
   continua = new  Scanner(System.in).nextInt();
  }
 }
}