/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Minggu6;

import java.util.*;

/**
 *
 * @author Kysuna
 */

class Mahasiswa{
    String nama, jurusan;
    
    Mahasiswa(String nama, String jurusan){
        this.nama = nama;
        this.jurusan = jurusan;
    }
}

class Jurusan{
    String nama;
    private List<Mahasiswa> mhs;
    
    Jurusan(String nama, List<Mahasiswa> mhs){
        this.nama = nama;
        this.mhs = mhs;
    }
    
    public List<Mahasiswa> getMhs(){
        return mhs;
    }
}

class Kampus{
    String nama;
    private List<Jurusan> jrs;
    
    Kampus(String nama, List<Jurusan> jrs){
        this.nama = nama;
        this.jrs = jrs;
    }
    
    public int getTotalMhs(){
        int sum = 0;
        List<Mahasiswa> mhs;
        for(Jurusan jrs : jrs){
            mhs = jrs.getMhs();
            for(Mahasiswa m : mhs){
                sum++;
            }
        }
        return sum;
    }
}

public class Agregation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa m1 = new Mahasiswa("Oky", "JTK");
        Mahasiswa m2 = new Mahasiswa("Bagus", "AMP");
        Mahasiswa m3 = new Mahasiswa("Lukmana", "BING");
        
        List<Mahasiswa> mhsJtk = new ArrayList<Mahasiswa>();
        mhsJtk.add(m1);
        
        List<Mahasiswa> mhsAmp = new ArrayList<Mahasiswa>();
        mhsAmp.add(m2);
        
        List<Mahasiswa> mhsBing = new ArrayList<Mahasiswa>();
        mhsBing.add(m3);
        
        Jurusan jr1 = new Jurusan("JTK", mhsJtk);
        Jurusan jr2 = new Jurusan("AMP", mhsAmp);
        Jurusan jr3 = new Jurusan("BING", mhsBing);
        
        List<Jurusan> jr = new ArrayList<Jurusan>();
        jr.add(jr1);
        jr.add(jr2);
        jr.add(jr3);
        
        Kampus km = new Kampus("Polban", jr);
        
        System.out.println("Total mahasiswa : " + km.getTotalMhs());
    }
    
}
