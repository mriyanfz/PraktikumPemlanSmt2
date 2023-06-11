package Bab8_Abstraksi;

public abstract class Vehicle {
  // buat variabel nama, tahun, dan rpm
  String nama;
  int tahun;
  double rpm;

  // buat sebuah method abstrak yang nantinya akan di override oleh class Car
  public abstract void data();
}