package com.bananaboy.app12141382;

import java.util.Scanner;


public class ComBananaboyApp12141382 {
    String nama;
    byte level=1;
    byte kesempatan=5,sisa;
    short banyak;
    short tebak;
    int inputAngka;
    int random, score=0;
    char jawab, pilih;
    
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
                    main.random=(short)(Math.random()*main.level());
                    System.out.println("#Level"+main.level);
                    System.out.println("Selamat Datang"+main.nama);
                    System.out.println("Silahkan Tebak angka antara 1 s/d "+main.level());
                    System.out.println("Anda masih memiliki kesempatan menebak sebanyak"+main.kesempatan+"kali");
                    main.sisa=main.kesempatan;
                    
                    do{
                        System.out.println();
                        System.out.println("Silahkan Masukkan Tebakan anda = ");
                        main.tebak=InputAngka.nextShort();
                        main.hasilmenebak();
                        
                        }while(main.tebak!=main.random&&main.sisa>0);
                    
                    if(main.tebak==main.random){
                        main.nilai();
                        System.out.println("Apakah anda ingin melanjutkan ke level berikutnya?y/t");
                        main.jawab=inputString.nextLine().charAt(0);
                        main.level++;
                        main.banyak=0;
                    
                        }else{break;}
                    
                }while(main.jawab=='y');
                main.totalNilai();
                main.Reset();
            }
        
        
        }while(!"T".equals(main.nama));
    }
      
}
