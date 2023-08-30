public class Dvd extends Medya {
    private int uzunluk;

    public Dvd(Long id, String baslik, int uzunluk) {
        super(id, baslik);
        this.uzunluk = uzunluk;
    }

    @Override
    public String getTur() {
        return MedyaTur.DVD.name();
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }
}
