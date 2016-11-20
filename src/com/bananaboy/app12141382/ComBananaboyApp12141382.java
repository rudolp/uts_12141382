package com.bananaboy.app12141382;

import java.util.Scanner;


public class ComBananaboyApp12141382 {

    
    public static void main(String[] args) {
        
    game main = new game();
    
    Scanner inputString = new Scanner(System.in);
    Scanner inputAngka = new Scanner(System.in);
            
        do{
            System.out.println("Masukkam nama anda untuk memulai game atau tekan 'T' untuk keluar");
            main.nama=String.nextLine();
        
            if("T".equals(main.nama)){
                break;
            }
            else{
                do{
                    main.random=(short)(Math.random()*main.Level());
                    System.out.printl("#Level"+main.level);
                    System.out.println("Selamat Datang"+main.nama);
                    System.out.printl("Silahkan Tebak angka antara 1 s/d "+main.Level());
                    System.out.printl("Anda masih memiliki kesempatan menebak sebanyak"+main.kesempatan+"kali");
                    main.sisa=main.kesempatan;
                }
            
            }
        
        
        }while(!"T".equals(main.nama));
    }
      
}
