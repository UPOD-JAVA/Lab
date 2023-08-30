import java.time.LocalDate;

public final class Odunc {
    private final Kisi kisi;
    private final Medya medya;
    private final LocalDate alinmaTarihi;
    // LocalDate- LocalDateTime - Date

    public Odunc(Kisi kisi, Medya medya) {
        this.kisi = kisi;
        this.medya = medya;
        this.alinmaTarihi = LocalDate.now();
    }

    public Kisi getKisi() {
        return kisi;
    }

    public Medya getMedya() {
        return medya;
    }

    public LocalDate getAlinmaTarihi() {
        return alinmaTarihi;
    }
}
