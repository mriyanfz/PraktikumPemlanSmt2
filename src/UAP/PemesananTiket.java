package Contest;

class PemesananTiket {
    // Do your magic here...
    public static TiketKonser pilihTiket(int choice) throws InvalidInputException {
        switch (choice) {
            case 0:
                return new CAT8();
            case 1:
                return new CAT1();
            case 2:
                return new FESTIVAL();
            case 3:
                return new VIP();
            case 4:
                return new VVIP();
            default:
                throw new InvalidInputException("Pilihan tiket tidak valid!");
        }
    }
}
