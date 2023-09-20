package co.com.tigo.qa.models;

public class ServiciosPremium {
    private String infoCard1;
    private String servicioCard1;
    private String valorCard1;
    private String promocionCard1;
    private String infoCard2;
    private String servicioCard2;
    private String valorCard2;
    private String promocionCard2;

    public ServiciosPremium(String infoCard1, String servicioCard1, String valorCard1, String promocionCard1, String infoCard2, String servicioCard2, String valorCard2, String promocionCard2) {
        this.infoCard1 = infoCard1;
        this.servicioCard1 = servicioCard1;
        this.valorCard1 = valorCard1;
        this.promocionCard1 = promocionCard1;
        this.infoCard2 = infoCard2;
        this.servicioCard2 = servicioCard2;
        this.valorCard2 = valorCard2;
        this.promocionCard2 = promocionCard2;
    }

    public String getInfoCard1() {
        return infoCard1;
    }

    public String getServicioCard1() {
        return servicioCard1;
    }

    public String getValorCard1() {
        return valorCard1;
    }

    public String getPromocionCard1() {
        return promocionCard1;
    }
    public String getInfoCard2() {
        return infoCard2;
    }

    public String getServicioCard2() {
        return servicioCard2;
    }

    public String getValorCard2() {
        return valorCard2;
    }

    public String getPromocionCard2() {
        return promocionCard2;
    }

}
