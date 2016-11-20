package com.bananaboy.app12141382;

import static com.bananaboy.app12141382.App12141382.main;
import java.util.Scanner;
import static jdk.internal.org.objectweb.asm.util.CheckClassAdapter.main;


public class App12141382 {
    
    
    public static void main(String[] args) {
    Leveldkk main = new Leveldkk();

        
    Scanner inputString = new Scanner(System.in);
    Scanner inputAngka = new Scanner(System.in);
            
        do{
            System.out.println("Masukkam nama anda untuk memulai game atau tekan 'T' untuk keluar");
            main.nama=inputString.nextLine();
        
            if("T".equals(main.nama)){
                System.out.println("Game Over");
                System.out.println("Score : ");
                main.History();
                break;
            }
            
            else{
                do{ 
                    main.random=(short)(Math.random()*main.level());
                    System.out.println("#Level "+main.level);
                    System.out.println("Selamat Datang "+main.nama);
                    //System.out.println("Angka random = "+main.random);
                    System.out.println("Silahkan Tebak angka antara 1 s/d "+main.level());
                    System.out.println("Anda memiliki kesempatan menebak sebanyak "+main.kesempatan+" kali");
                    main.sisa=main.kesempatan;
                    
                    do{
                        System.out.println();
                        System.out.println("Silahkan Masukkan Tebakan anda = ");
                        main.tebak=inputAngka.nextShort();
                        main.hasilmenebak();
                        
                        }while(main.tebak!=main.random&&main.sisa>0);
                    
                    if(main.tebak==main.random){
                        main.Nilai();
                        //System.out.println("Skor anda adalah "+main.score );
                        System.out.println("ketik Y dan tekan Enter untuk lanjut level berikutnya atau ketik T untuk keluar : ");
                        main.jawab=inputString.nextLine().charAt(0);
                        main.level++;
                        main.banyak=0;
                    
                        }if (main.level>5){
                            break;}
                    
                }while(main.jawab=='y');
                main.totalNilai();
                main.reset();
                
            }
        
        
        }while(!"T".equals(main.nama));
    }
      
}
