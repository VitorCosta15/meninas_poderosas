package com.maquina;




public class Memoria {
   private String[] memoria = new String[1000]; //Se cada palavra da memória deve ter 16 Bits, 2 Bytes, com 1000 posições temos 2KB de memória
   
   public String getDataFromMemory(int endereco){
        return memoria[endereco];
   }

   public void setDataOnMemory(int endereco, String dado){
        memoria[endereco] = dado;
   }

   public static void teste(String oi){
     System.out.println(oi);
   }

}
