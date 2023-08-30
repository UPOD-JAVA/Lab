public class Katalog {
    private Kisi[] kisiler = new Kisi[10];
    private int kisiSayac = 0;
    private Medya[] medyalar = new Medya[10];
    private int medyaSayac = 0;

    private Odunc[] oduncler = new Odunc[100];
    private int oduncSayac = 0;

    public void medyaEkle(Medya medya) throws Exception {
        if (medyaSayac >= medyalar.length) {
            throw new Exception("Daha fazla medya ekleyemezsiniz.");
        }
        checkMedyaIsExist(medya);
        medyalar[medyaSayac] = medya;
        medyaSayac++;
    }

    public void kisiEkle(Kisi kisi) throws Exception {
        if (kisiSayac >= kisiler.length) {
            throw new Exception("Daha fazla kişi ekleyemezsiniz.");
        }
        checkKisiIsExist(kisi);
        kisiler[kisiSayac] = kisi;
        kisiSayac++;
    }

    public void oduncAl(Long kisiId, Long medyaId) throws KisiNotFoundException, MedyaNotFoundException {
        if (oduncSayac >= oduncler.length) {
            // odunc array'inin boyutu arttırılacak ve eski kayıtlar
            // yeni array'e taşınacak.
        }
        Kisi kisi = kisiBul(kisiId);
        Medya medya = medyaBul(medyaId);
        Odunc odunc = new Odunc((long) oduncSayac, kisi, medya);
        oduncler[oduncSayac] = odunc;
        oduncSayac++;
    }

    public void teslimEt(Long oduncId) {
        Odunc odunc = oduncBul(oduncId);
        odunc.teslimEt();
    }
    private Odunc oduncBul(Long id){
        for (Odunc odunc : oduncler) {
            if(odunc.getId().compareTo(id) == 0){
                return odunc;
            }
        }
        return null;
    }

    private Medya medyaBul(Long id) throws MedyaNotFoundException {
        for (Medya medya : medyalar) {
            if (medya.getId().compareTo(id) == 0) {
                return medya;
            }
        }
        throw new MedyaNotFoundException(id + " id'li medya bulunamadı");
    }

    private Kisi kisiBul(Long id) throws KisiNotFoundException {
        for (Kisi kisi : kisiler) {
            if (kisi.getId().compareTo(id) == 0) {
                return kisi;
            }
        }
        throw new KisiNotFoundException(id + " id'li kişi bulunamadı");
    }

    private void checkKisiIsExist(Kisi kisi) throws KisiAlreadyExistException {
        for (Kisi k : kisiler) {
            if (k.getId().compareTo(kisi.getId()) == 0) {
                throw new KisiAlreadyExistException(kisi.getId()
                        + " id'li kişi zaten eklenmiş.");
            }
        }
    }

    private void checkMedyaIsExist(Medya medya) throws MedyaAlreadyExistException {
        for (Medya m : medyalar) {
            if (m.getId().compareTo(medya.getId()) == 0
                    || m.getBaslik().equalsIgnoreCase(medya.getBaslik())) {
                throw new MedyaAlreadyExistException(medya.getBaslik()
                        + " isimde zaten bir medya var.");
            }
        }
    }

}
