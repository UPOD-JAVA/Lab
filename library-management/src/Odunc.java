import java.time.LocalDate;

public final class Odunc {
    private final Long id;
    private final Kisi kisi;
    private final Medya medya;
    private final LocalDate alinmaTarihi;

    private LocalDate teslimTarihi;
    // LocalDate- LocalDateTime - Date

    public Odunc(Long id, Kisi kisi, Medya medya) {
        this.id = id;
        this.kisi = kisi;
        this.medya = medya;
        this.alinmaTarihi = LocalDate.now();
    }

    public LocalDate getTeslimTarihi() {
        return teslimTarihi;
    }

    public void teslimEt() {
        this.teslimTarihi = LocalDate.now();
    }

    public Long getId() {
        return id;
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
