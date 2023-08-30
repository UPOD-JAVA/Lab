public class Kitap extends Medya {

    private int sayfaSayisi;

    public Kitap(Long id, String baslik, int sayfaSayisi) {
        super(id, baslik);
        this.sayfaSayisi = sayfaSayisi;
    }

    @Override
    public String getTur() {
        return MedyaTur.KITAP.name();
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }
}
