package Contest;

abstract class TiketKonser implements HargaTiket {
    // Do your magic here...
    private String nama;

    public TiketKonser(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}
