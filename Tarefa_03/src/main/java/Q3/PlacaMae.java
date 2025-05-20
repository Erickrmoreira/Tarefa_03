package Q3;

public class PlacaMae {
    private String fabricante;
    private String chipset;
    private int numeroSlots;
    private String tipoMemoriaSuportada;

    public PlacaMae(String fabricante, String chipset, int numeroSlots, String tipoMemoriaSuportada) {
        this.fabricante = fabricante;
        this.chipset = chipset;
        this.numeroSlots = numeroSlots;
        this.tipoMemoriaSuportada = tipoMemoriaSuportada;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getChipset() {
        return chipset;
    }

    public int getNumeroSlots() {
        return numeroSlots;
    }

    public String getTipoMemoriaSuportada() {
        return tipoMemoriaSuportada;
    }
}
