import java.util.ArrayList;
import java.util.List;

public class DATA {
    public static ArrayList ListadeAlumnos(){
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Jose","Xot", 21));
        alumnos.add(new Alumno("Mynor", "Orellana", 19));
        alumnos.add(new Alumno("Andre", "Pijije", 21));
        alumnos.add(new Alumno("Sofia", "Saquique", 18));
        alumnos.add(new Alumno("Pablo", "Mendisabal", 14));
        return alumnos;
    }
}
