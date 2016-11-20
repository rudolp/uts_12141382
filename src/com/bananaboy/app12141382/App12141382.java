/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bananaboy.app12141382;

/**
 *
 * @author windows10
 */
public class App12141382 {
    String nama;
    byte level=1;
    byte kesempatan=5,sisa;
    short banyak;
    short tebak;
    int inputAngka;
    int random, score=0;
    char jawab, pilih;
    
    
    public int level(){
        return level*100;
    }
    
    public void hasilmenebak(){
        sisa--;
        banyak++;
        
        System.out.println("Tebakan anda?" + tebak);
            if(tebak<random){
                System.out.println("Tebakan anda terlalu kecil");
            }
            if(tebak>random){
                System.out.println("Tebakan anda terlalu bear");
            }
            if(tebak==random){
                System.out.println("Selamat tebakan anda benar");
                System.out.println("Anda berhasil menebak dalam" + banyak + "kali percobaan");
            }
    }
}
