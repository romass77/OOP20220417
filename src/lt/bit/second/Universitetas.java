package lt.bit.second;

import java.util.ArrayList;

public class Universitetas {
    private String universitetoId;
    private String adresas;
    private String telefonoNumeris; // +3706..
    // Kompozicija -> Composition
    private ArrayList<Studentas> studentai;

    public Universitetas(String universitetoId, String adresas, String telefonoNumeris, ArrayList<Studentas> studentai) {
        this.universitetoId = universitetoId;
        this.adresas = adresas;
        this.telefonoNumeris = telefonoNumeris;
        this.studentai = studentai;
    }

    public String getUniversitetoId() {
        return universitetoId;
    }

    public String getAdresas() {
        return adresas;
    }

    public String getTelefonoNumeris() {
        return telefonoNumeris;
    }

    public ArrayList<Studentas> getStudentai() {
        return studentai;
    }
}
