package Data;

import java.util.List;
import java.util.Random;
import com.initial.main;
import java.util.ArrayList;
import java.util.Stack;

public class DataGenerator {

    public static Subject generateRandomCourses(int index) {
        Random random = new Random();
        String courseName = COURSE_NAMES.get(random.nextInt(COURSE_NAMES.size())) + index;
        int courseCode = index + 1000;
        int credits = random.nextInt(5) + 1;
        int quotes = random.nextInt(50) + 1;

        return new Subject(courseName, courseCode, credits, quotes);
    }

    public static Student generateRandomStudent(int index) {
        Random random = new Random();
        String studentName = NAME_LIST.get(random.nextInt(NAME_LIST.size()));
        int studentAge = random.nextInt(21) + 10;
        String password = Integer.toString(random.nextInt(100) + 1000);
        String user = studentName + index * random.nextInt(NAME_LIST.size());
        Major majorCurrent = main.majorsInUniversity.get(random.nextInt(2));
        ArrayList<Subject> schedule = new ArrayList<>();
        Stack<Subject> doneSubjects = new Stack<>();
        Stack<Subject> remainingSubjects = new Stack<>();
        for(int i=0;i<5;i++){
            schedule.add(majorCurrent.readAllByName().get(random.nextInt(10)));
            doneSubjects.push(majorCurrent.readAllByName().get(random.nextInt(10)));
            remainingSubjects.push(majorCurrent.readAllByName().get(random.nextInt(10)));
        }

        return new Student(studentName, studentAge, majorCurrent, password, user, schedule, doneSubjects, remainingSubjects);
    }
    public static Teacher generateRandomTeacher(int index) {
        Random random = new Random();
        String TeacherName = NAME_LIST.get(random.nextInt(NAME_LIST.size()));
        int TeacherAge = random.nextInt(21) + 10;
        String password = Integer.toString(random.nextInt(100) + 1000);
        String user = TeacherName + index * random.nextInt(NAME_LIST.size());
        ArrayList<Subject> subjects = new ArrayList<>();
        for(int i=0;i<5;i++){
            subjects.add(main.DataInUniversity.readAllByName().get(random.nextInt(index+1)));
            System.out.println("añadiendo a profeosr");
            System.out.println(subjects.get(0));
        }
        return new Teacher(TeacherName, TeacherAge, user,password, subjects);
    }
    
    private static final List<String> NAME_LIST = List.of(
            "Alejandro", "Bianca", "Carlos", "Daniela", "Emilio", "Fernanda", "Gabriel", "Helena", "Iván", "Julia",
            "Kevin", "Laura", "Miguel", "Natalia", "Óscar", "Paula", "Quetzal", "Rebeca", "Santiago", "Teresa",
            "Ulises", "Valeria", "Walter", "Ximena", "Yahir", "Zoe", "Adrián", "Beatriz", "César", "Diana",
            "Eduardo", "Fabiola", "Gustavo", "Hilda", "Ismael", "Jazmín", "Klaus", "Linda", "Manuel", "Nora",
            "Octavio", "Patricia", "Raúl", "Sofía", "Tomas", "Verónica", "Yael", "Abigail", "Benjamín", "Camila",
            "Diego", "Esmeralda", "Fernando", "Giselle", "Héctor", "Irma", "Javier", "Karen", "Luis", "Mariana",
            "Nicolás", "Olivia", "Pablo", "Renata", "Sergio", "Tamara", "Uriel", "Valentina", "Xavier", "Wendy",
            "Yuri", "Zara", "Andrés", "Brenda", "Carmen", "David", "Elena", "Francisco", "Gloria", "Hugo", "Isabel",
            "Juan", "Karla", "Lorenzo", "María", "Nelson", "Paola", "Roberto", "Sara", "Tomás", "Vanesa"
    );

    private static final List<String> COURSE_NAMES = List.of(
            "Álgebra Lineal",
            "Anatomía Humana",
            "Análisis Matemático",
            "Antropología Social",
            "Arquitectura de Computadoras",
            "Astronomía",
            "Biología Celular",
            "Bioquímica",
            "Cálculo Diferencial e Integral",
            "Ciencias Políticas",
            "Comercio Internacional",
            "Composición y Redacción",
            "Contabilidad Financiera",
            "Criptografía",
            "Derecho Constitucional",
            "Desarrollo de Software",
            "Diseño Gráfico",
            "Economía Internacional",
            "Electromagnetismo",
            "Emprendimiento",
            "Enfermería",
            "Escritura Creativa",
            "Estadística",
            "Ética",
            "Física Cuántica",
            "Fisiología Humana",
            "Geología",
            "Geometría Analítica",
            "Gestión de Proyectos",
            "Historia del Arte",
            "Historia Mundial",
            "Historia de la Filosofía",
            "Idiomas Extranjeros",
            "Informática Forense",
            "Ingeniería de Sistemas",
            "Ingeniería Electrónica",
            "Inteligencia Artificial",
            "Investigación de Operaciones",
            "Lenguajes de Programación",
            "Literatura Comparada",
            "Macroeconomía",
            "Marketing",
            "Matemáticas Discretas",
            "Mecánica Cuántica",
            "Medicina Forense",
            "Microbiología",
            "Microeconomía",
            "Minería de Datos",
            "Modelos de Negocios",
            "Neurociencia",
            "Nutrición y Dietética",
            "Óptica",
            "Organización Industrial",
            "Periodismo",
            "Planificación Estratégica",
            "Probabilidad y Estadística",
            "Programación Web",
            "Psicología del Desarrollo",
            "Psicología Social",
            "Química Analítica",
            "Química Inorgánica",
            "Química Orgánica",
            "Recursos Humanos",
            "Redes de Computadoras",
            "Relaciones Internacionales",
            "Robótica",
            "Salud Pública",
            "Seguridad de la Información",
            "Semiótica",
            "Sociología",
            "Teoría de la Comunicación",
            "Teoría de la Información",
            "Teoría de Juegos",
            "Teoría de la Literatura",
            "Teoría de Sistemas",
            "Teoría de la Relatividad",
            "Teoría de las Organizaciones",
            "Teoría de las Probabilidades",
            "Teoría de las Señales",
            "Teoría del Cine",
            "Teoría del Diseño",
            "Teoría del Lenguaje",
            "Teoría del Marketing",
            "Teoría del Vuelo",
            "Topología",
            "Trabajo Social",
            "Traducción",
            "Turismo",
            "Urbanismo",
            "Ventas",
            "Videojuegos",
            "Virtualización",
            "Visualizaciónde Datos",
            "Zoología",
            "Ecología",
            "Economía Financiera",
            "Energías Renovables",
            "Epistemología",
            "Estudios de Género");
}
