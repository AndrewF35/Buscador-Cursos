package Data;

public class Init {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante();
        
        Major cienciasDeLaComputacion = new Major();
        
        cienciasDeLaComputacion.addSubjectToMajor(new Subject("Matemáticas"));
        
        Subject curso = cienciasDeLaComputacion.getSubjectsFromMajor(0);
        estudiante.addSubjectToSchedule(curso);

        estudiante.printSchedule();
        //System.out.println(cursos.readAllByName());
        // System.out.println(cursos.readByCode(11).getNameSubject());
        // System.out.println(cursos.modify(12,"Fisica2"));
        // System.out.println(cursos.readAllByName());
        // System.out.println(cursos.delete(11));
        // System.out.println(cursos.readAllByName());
        // for (Subject curso:cursos.readAll()) {
        //     System.out.println(curso.getNameSubject());
        // }
    }

}
