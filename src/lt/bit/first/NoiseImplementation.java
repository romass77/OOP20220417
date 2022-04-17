package lt.bit.first;

public interface NoiseImplementation {
    // Pagal nutytlejima -> public static final
    String TIPAS = "Zinduoliai";

    // Pagal nutylėjima -> public abstract
    void makeBiggerNoise();

    default void sayGreetings(){
        System.out.println("Hi there, human!");
    }

    static void layDown(){
        System.out.println("Laying down");
    }

    private static void waitCommand(){
        System.out.println("Waiting command.");
    }
}
