/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Minggu6;

/**
 *
 * @author Kysuna
 */

class Kampus{
    private String nama;
    Kampus(String nama){
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class Mahasiswa{
    private String nama;
    Mahasiswa(String nama){
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class Association {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kampus km = new Kampus("Polban");
        Mahasiswa mhs = new Mahasiswa("Oky");
        System.out.println(mhs.getNama() + " adalah mahasiswa "
                + "" + km.getNama());
    }
    
}
