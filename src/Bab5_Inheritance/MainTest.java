package Bab5_Inheritance;

import java.time.LocalDate;
/* 1. Manusia
a. Laki-laki telah menikah.
b. Perempuan telah menikah.
c. Belum menikah.
2. MahasiswaFilkom (sesuai status Anda)
a. Ipk < 3
b. Ipk 3 – 3.5
c. Ipk 3.5 – 4
3. Pekerja
a. Lama bekerja 2 tahun, anak 2
b. Lama bekerja 9 tahun
c. Lama bekerja 20 tahun, anak 10
4. Manager, lama bekerja 15 tahun dengan gaji $7500 */
public class MainTest {
   public static void main(String[] args) {
      System.out.println("======================================");
      Manusia a = new Manusia("Riyan", "1234567890", true, true);
      System.out.println(a); 
      System.out.println("======================================");
      System.out.println();
      System.out.println("======================================");
      Manusia b = new Manusia("Fauzi", "1234567899",false, true);
      System.out.println(b); 
      System.out.println("======================================");
      System.out.println();
      System.out.println("======================================");
      Manusia c = new Manusia("Mohammad", "2234567890", true, false);
      System.out.println(c); 
      System.out.println("======================================");
      System.out.println(); 


      System.out.println("======================================");
      MahasiswaFILKOM d = new MahasiswaFILKOM("225150407111025", 2.5, "Riyan", "2234567899", true, false);
      System.out.println(d);
      System.out.println("======================================");
      System.out.println();

      System.out.println("======================================");
      MahasiswaFILKOM e = new MahasiswaFILKOM("225150407111025", 3.3, "Riyan", "2234567899", true, false);
      System.out.println(e);
      System.out.println("======================================");
      System.out.println();

      System.out.println("======================================");
      MahasiswaFILKOM f = new MahasiswaFILKOM("225150407111025", 3.89, "Riyan", "2234567899", true, false);
      System.out.println(f);
      System.out.println("======================================");
      System.out.println();

      System.out.println("======================================");
      Pekerja g = new Pekerja(1000, LocalDate.of(2021, 2, 15), 2, "Fauzi", "1234567890", true, true);
      System.out.println(g);
      System.out.println("======================================");
      System.out.println();

      System.out.println("======================================");
      Pekerja h = new Pekerja(1000, LocalDate.of(2014, 3, 15), 0, "Fauzi", "2876153453", true, true);
      System.out.println(h);
      System.out.println("======================================");
      System.out.println();

      System.out.println("======================================");
      Pekerja i = new Pekerja(1000, LocalDate.of(2003, 4, 5), 10, "Mohammad", "2876159876", true, true);
      System.out.println(i);
      System.out.println("======================================");
      System.out.println(); 

      Manager j = new Manager("Riyan", "1234512345", true, true, 7500, LocalDate.of(2008, 4, 1), 0, "HRD");
      System.out.println(j); 
   }  
}

