/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Mahasiswa {

    String nama, kelas, matkulPraktikum;
    int nim;

    public Mahasiswa(String nm, String kl, String mat, int ni) {
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();

        String input;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("putri1", "3H", "Struktur data", 2020000));
        mhs.put("2", new Mahasiswa("Agus", "3H", "Matematika", 2820812));
        mhs.put("3", new Mahasiswa("Arro", "3D", "Programan", 2020017));

        System.out.println("masukkan ID :");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null) {
            System.out.println("Data Mahasiswa : " + data.nama + ", kelas : " + data.kelas + ", mata kuliah praktikum : " + data.matkulPraktikum + ", nim : " + data.nim);

        }
    }
}
