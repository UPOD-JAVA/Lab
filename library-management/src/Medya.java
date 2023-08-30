public abstract class Medya {
    private Long id;
    private String baslik;

    public Medya(Long id, String baslik) {
        this.id = id;
        this.baslik = baslik;
    }

    public abstract String getTur();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }
}
