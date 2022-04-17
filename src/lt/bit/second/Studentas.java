package lt.bit.second;

public class Studentas {
    private String studentoId;
    private int kursas;
    private String adresas;
    private String saskaita;

    public Studentas(String studentoId, int kursas, String adresas, String saskaita) {
        this.studentoId = studentoId;
        this.kursas = kursas;
        this.adresas = adresas;
        this.saskaita = saskaita;
    }

    public String getStudentoId() {
        return studentoId;
    }

    public int getKursas() {
        return kursas;
    }

    public String getAdresas() {
        return adresas;
    }

    public String getSaskaita() {
        return saskaita;
    }

    @Override
    public String toString() {
        return "studentoId='" + studentoId + '\'' +
                ", kursas=" + kursas +
                ", adresas='" + adresas + '\'' +
                ", saskaita='" + saskaita + '\'';
    }
}
