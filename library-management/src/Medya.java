public abstract class Medya {
    private Long id;
    private String baslik;

    public Medya(Long id, String baslik) {
        this.id = id;
        this.baslik = baslik;
    }

    public abstract String getTur();

}
