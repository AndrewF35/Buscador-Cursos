package Data;

public class Cuadratica {

    private static Major timeSubjects = new Major();

    public static void dibujar(Plano p) {
        for (float x = -10; x < 10; x += .1) {
            float y = (float) Math.sin(x);
            p.dibujarPunto(x, y);
        }
    }

    public static void dibujar2(Plano p) {

        int[] inputSizes = {1000, 10000, 3000, 50000};
        for (int size : inputSizes) {
            System.out.println("Testing with " + size + " courses:");
            long startTime, endTime, elapsedTime;

            // Add subjects
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                timeSubjects.addSubjectToMajor(DataGenerator.generateRandomCourses(i));
            }
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            p.dibujarPunto(size, elapsedTime);
        }
    }

}

class Metodos {

    public static void measureMethods() {
        long startTime, endTime, elapsedTime;
        System.out.println("Time for addSubjectToMajor(): " + 3 / 1_000_000 + " ms");
        // Read subjects by code
        startTime = System.nanoTime();
        for (int i = 0; i < 4; i++) {
//                timeSubjects.readByCode(i + 1000);
        }
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Time for readByCode(): " + elapsedTime / 1_000_000 + " ms");

        // Delete subjects by code
        startTime = System.nanoTime();
        for (int i = 6; i > 0; i--) {
            //              timeSubjects.deleteByCode(i + 999);
        }
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Time for deleteByCode(): " + elapsedTime / 1_000_000 + " ms");

        //TODO: Añadir la medición de la implementación del Árbol
    }
}
