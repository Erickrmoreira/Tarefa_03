package Q3;

public class Computador {
    private String marca;
    private String modelo;
    private String processador;
    private int memoriaRAM;
    private PlacaMae placaMae;

    public Computador(String marca, String modelo, String processador, int memoriaRAM, String fabricantePlaca, String chipset, int numeroSlots, String tipoMemoriaSuportada) {
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.placaMae = new PlacaMae(fabricantePlaca, chipset, numeroSlots, tipoMemoriaSuportada);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getProcessador() {
        return processador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public PlacaMae getPlacaMae() {
        return placaMae;
    }

    public void atualizarPlacaMae(String fabricante, String chipset, int numeroSlots, String tipoMemoriaSuportada) {
        this.placaMae = new PlacaMae(fabricante, chipset, numeroSlots, tipoMemoriaSuportada);
    }

    public void exibirDetalhes() {
        System.out.println("Computador: " + marca + " " + modelo);
        System.out.println("Processador: " + processador);
        System.out.println("Memória RAM: " + memoriaRAM + " GB");
        System.out.println("Placa-mãe:");
        System.out.println("  Fabricante: " + placaMae.getFabricante());
        System.out.println("  Chipset: " + placaMae.getChipset());
        System.out.println("  Número de Slots: " + placaMae.getNumeroSlots());
        System.out.println("  Tipo de Memória Suportada: " + placaMae.getTipoMemoriaSuportada());
    }
}