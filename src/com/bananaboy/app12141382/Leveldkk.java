
package com.bananaboy.app12141382;

/**
 *
 * @author windows10
 */
public class Leveldkk {
    static Object java;
    String nama;
    byte level=1;
    byte kesempatan=5, sisa;
    short banyak;
    short tebak;
    int inputAngka;
    int random, score, total;
    char jawab, pilih;
    
    
    public int level(){
        return level*100;
    }
    
    void hasilmenebak(){
        sisa--;
        banyak++;
        
        System.out.println("Tebakan anda?" + tebak);
            if(tebak<random&&sisa>0){
                System.out.println("Tebakan anda terlalu kecil! Anda masih mempunya kesempatan "+ sisa + " kali lagi");
            }
            if(tebak>random&&sisa>0){
                System.out.println("Tebakan anda terlalu besar! Anda masih mempunya kesempatan "+ sisa + " kali lagi");
            }
            if(tebak==random){
                System.out.println("Selamat tebakan anda benar");
                System.out.println("Anda berhasil menebak dalam " + banyak + " kali percobaan.");
            }
            if(sisa<1){
                System.out.println("Game Over");
            }     
    }
    
    public void Nilai(){
        if(banyak>0){
            score = 100*level;
        }
        if(banyak>1){
            score = 70*level;
        }
        if(banyak>2){
            score = 50*level;
        }
        if(banyak>3){
            score = 30*level;
        }
        else {
            score = 0*level;
        }
    System.out.println("SCORE");
    System.out.println(nama+" : "+score);
    total=total+score;
    }
    
   public void reset(){
       level = 1;
       kesempatan = 5;
       banyak = 0;
       total = 0;
   }

    void totalNilai() {
    System.out.println("Total Nilai anda adalah "+ total);
    }
    
    
}
