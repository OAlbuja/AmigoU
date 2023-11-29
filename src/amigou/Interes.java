/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amigou;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ox_ar
 */
public class Interes {



    // Definir los enum para cada categoría
    public enum AreaInteres {
        
        
        DESARROLLO_APLICACIONES_MOVILES(1),
        SEGURIDAD_INFORMACION(2),
        INTELIGENCIA_ARTIFICIAL_Y_APRENDIZAJE_AUTOMATICO(3),
        ARQUITECTURA_SOFTWARE(4);

        private int value;

        AreaInteres(int value) {
            this.value = value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public enum MetodologiaDesarrollo {
        AGILE(1),
        WATERFALL(2),
        SCRUM(3),
        KANBAN(4);

        private int value;

        MetodologiaDesarrollo(int value) {
            this.value = value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public enum LenguajeProgramacion {
        JAVA(1),
        C_SHARP(2),
        PYTHON(3),
        JAVASCRIPT(4);

        private int value;

        LenguajeProgramacion(int value) {
            this.value = value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public enum HerramientasDesarrollo {
        VISUAL_STUDIO(1),
        ECLIPSE(2),
        NETBEANS(3),
        INTELLIJ_IDEA(4);

        private int value;

        HerramientasDesarrollo(int value) {
            this.value = value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public enum OpinionDesarrollo {
        ES_ESENCIAL_PARA_EL_EXITO_DEL_PROYECTO(1),
        ES_IMPORTANTE_PERO_NO_ES_CRUCIAL(2),
        NO_ES_NECESARIO_EN_ABSOLUTO(3),
        NO_TENGO_EXPERIENCIA_TRABAJANDO_EN_EQUIPO(4);

        private int value;

        OpinionDesarrollo(int value) {
            this.value = value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public enum HabilidadesConocimientosMejorar {
        VISUAL_PROGRAMACIÓN_EN_LENGUAJES_ESPECIFICOS(1),
        DISEÑO_DE_SOFTWARE_Y_ARQUITECTURA(2),
        METODOLOGIAS_AGILES_Y_DE_GESTION_DE_PROYECTOS(3),
        SEGURIDAD_DE_LA_INFORMACION(4);

        private int value;

        HabilidadesConocimientosMejorar(int value) {
            this.value = value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public enum InteresesColaborar {
        DESARROLLO_DE_APLICACIONES_PARA_ORGANIZACIONES_SIN_FINES_DE_LUCRO(1),
        PARTICIPACION_EN_HACKATHONS_O_COMPETENCIAS_DE_PROGRAMACION(2),
        INVESTIGACION_EN_INTELIGENCIA_ARTIFICIAL_Y_APRENDIZAJE(3),
        PARTICIPACION_EN_PROGRAMAS_DE_MENTORIA(4);

        private int value;

        InteresesColaborar(int value) {
            this.value = value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public enum HerramientasNecesariasSoftware {
        ACCESO_A_CURSOS_Y_TUTORIALES_EN_LINEA(1),
        PARTICIPACIÓN_EN_COMUNIDADES_DESARROLLARDORES(2),
        ACCESO_A_HERRAMIENTAS_DE_DESARROLLO_Y_SOFTWARE_PROFESIONAL(3),
        ASESORAMIENTO_Y_MENTORIA_DE_PROFESIONALES_EXPERIMENTADOS(4);

        private int value;

        HerramientasNecesariasSoftware(int value) {
            this.value = value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public enum EventosInteresAsistir {
        CONFERENCIAS_Y_SEMINARIOS(1),
        TALLERES_Y_SESIONES_DE_FORMACION(2),
        JORNADAS_DE_PUERTAS_ABIERTAS_Y_EVENTOS_DE_NETWORK(3),
        PROGRAMAS_DE_INTERCAMBIO_Y_VIAJES_DE_ESTUDIO(4);

        private int value;

        EventosInteresAsistir(int value) {
            this.value = value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public enum ColaboracionIntercambio {
        INTERCAMBIO_DE_EXPERIENCIAS_Y_PRÁCTICAS_EN_PROYECTOS(1),
        MENTORIA_Y_TUTORIA_MUTUA(2),
        COMPARTIR_RECURSOS_Y_HERRAMIENTAS_UTILES(3),
        PARTICIPAR_EN_PROYECTOS_DE_INVESTIGACION_O_DESARROLLO_COLABORATIVO(4);

        private int value;

        ColaboracionIntercambio(int value) {
            this.value = value;
        }

        public void setValue(int value) {
            if (value >= 1 && value <= 10) {
                this.value = value;
            } else {
                System.out.println("El valor debe estar en el rango de 1 a 10.");
            }
        }

        public int getValue() {
            return value;
        }
    }

    // Propiedades de Interes
    private AreaInteres areaInteres;
    private MetodologiaDesarrollo metodologiaDesarrollo;
    private LenguajeProgramacion lenguajeProgramacion;
    private HerramientasDesarrollo herramientasDesarrollo;
    private OpinionDesarrollo opinionDesarrollo;
    private HabilidadesConocimientosMejorar habilidadesConocimientosMejorar;
    private InteresesColaborar interesesColaborar;
    private HerramientasNecesariasSoftware herramientasNecesariasSoftware;
    private EventosInteresAsistir eventosInteresAsistir;
    private ColaboracionIntercambio colaboracionIntercambio;

    // Métodos get y set para cada propiedad
    public Interes(AreaInteres areaInteres, MetodologiaDesarrollo metodologiaDesarrollo, LenguajeProgramacion lenguajeProgramacion, HerramientasDesarrollo herramientasDesarrollo, OpinionDesarrollo opinionDesarrollo, HabilidadesConocimientosMejorar habilidadesConocimientosMejorar, InteresesColaborar interesesColaborar, HerramientasNecesariasSoftware herramientasNecesariasSoftware, EventosInteresAsistir eventosInteresAsistir, ColaboracionIntercambio colaboracionIntercambio) {
        this.areaInteres = areaInteres;
        this.metodologiaDesarrollo = metodologiaDesarrollo;
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.herramientasDesarrollo = herramientasDesarrollo;
        this.opinionDesarrollo = opinionDesarrollo;
        this.habilidadesConocimientosMejorar = habilidadesConocimientosMejorar;
        this.interesesColaborar = interesesColaborar;
        this.herramientasNecesariasSoftware = herramientasNecesariasSoftware;
        this.eventosInteresAsistir = eventosInteresAsistir;
        this.colaboracionIntercambio = colaboracionIntercambio;
    }

    public AreaInteres getAreaInteres() {
        return areaInteres;
    }

    public void setAreaInteres(AreaInteres areaInteres) {
        this.areaInteres = areaInteres;
    }

    public MetodologiaDesarrollo getMetodologiaDesarrollo() {
        return metodologiaDesarrollo;
    }

    public void setMetodologiaDesarrollo(MetodologiaDesarrollo metodologiaDesarrollo) {
        this.metodologiaDesarrollo = metodologiaDesarrollo;
    }

    public LenguajeProgramacion getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(LenguajeProgramacion lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public HerramientasDesarrollo getHerramientasDesarrollo() {
        return herramientasDesarrollo;
    }

    public void setHerramientasDesarrollo(HerramientasDesarrollo herramientasDesarrollo) {
        this.herramientasDesarrollo = herramientasDesarrollo;
    }

    public OpinionDesarrollo getOpinionDesarrollo() {
        return opinionDesarrollo;
    }

    public void setOpinionDesarrollo(OpinionDesarrollo opinionDesarrollo) {
        this.opinionDesarrollo = opinionDesarrollo;
    }

    public HabilidadesConocimientosMejorar getHabilidadesConocimientosMejorar() {
        return habilidadesConocimientosMejorar;
    }

    public void setHabilidadesConocimientosMejorar(HabilidadesConocimientosMejorar habilidadesConocimientosMejorar) {
        this.habilidadesConocimientosMejorar = habilidadesConocimientosMejorar;
    }

    public InteresesColaborar getInteresesColaborar() {
        return interesesColaborar;
    }

    public void setInteresesColaborar(InteresesColaborar interesesColaborar) {
        this.interesesColaborar = interesesColaborar;
    }

    public HerramientasNecesariasSoftware getHerramientasNecesariasSoftware() {
        return herramientasNecesariasSoftware;
    }

    public void setHerramientasNecesariasSoftware(HerramientasNecesariasSoftware herramientasNecesariasSoftware) {
        this.herramientasNecesariasSoftware = herramientasNecesariasSoftware;
    }

    public EventosInteresAsistir getEventosInteresAsistir() {
        return eventosInteresAsistir;
    }

    public void setEventosInteresAsistir(EventosInteresAsistir eventosInteresAsistir) {
        this.eventosInteresAsistir = eventosInteresAsistir;
    }

    public ColaboracionIntercambio getColaboracionIntercambio() {
        return colaboracionIntercambio;
    }

    public void setColaboracionIntercambio(ColaboracionIntercambio colaboracionIntercambio) {
        this.colaboracionIntercambio = colaboracionIntercambio;
    }

    // Constructor
    public Interes() {
    }

    // Métodos get y set para cada propiedad
    public Interes elegirInteres() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int value = 0;
        Interes interes = new Interes();
        System.out.println("¿Cuál es tu área de interés principal dentro de la carrera de Ingeniería en Software? [1-4]:");
        int i = 1;
        for (AreaInteres a : AreaInteres.values()) {
            System.out.println(i + ". " + a);
            i++;
        }
        opcion = sc.nextInt();
        interes.setAreaInteres(Interes.AreaInteres.values()[opcion - 1]);
        System.out.println("¿Qué valor le quieres asignar a la opción elegida? [1-10]:");
        value = sc.nextInt();
        while (value < 1 || value > 10) {
            System.out.println("El valor debe estar entre 1 y 10. Por favor, ingresa un valor válido:");
            value = sc.nextInt();
        }
        interes.areaInteres.setValue(value);

        System.out.println("¿Qué metodología de desarrollo de software prefieres utilizar? [1-4]:");
        i = 1;
        for (MetodologiaDesarrollo m : MetodologiaDesarrollo.values()) {
            System.out.println(i + ". " + m);
            i++;
        }
        opcion = sc.nextInt();
        interes.setMetodologiaDesarrollo(Interes.MetodologiaDesarrollo.values()[opcion - 1]);
        System.out.println("¿Qué valor le quieres asignar a la opción elegida? [1-10]:");
        value = sc.nextInt();
        while (value < 1 || value > 10) {
            System.out.println("El valor debe estar entre 1 y 10. Por favor, ingresa un valor válido:");
            value = sc.nextInt();
        }
        interes.metodologiaDesarrollo.setValue(value);

        System.out.println("¿Qué lenguajes de programación te sientes más cómodo utilizando? [1-4]");
        i = 1;
        for (LenguajeProgramacion l : LenguajeProgramacion.values()) {
            System.out.println(i + ". " + l);
            i++;
        }
        opcion = sc.nextInt();
        interes.setLenguajeProgramacion(Interes.LenguajeProgramacion.values()[opcion - 1]);
        System.out.println("¿Qué valor le quieres asignar a la opción elegida? [1-10]:");
        value = sc.nextInt();
        while (value < 1 || value > 10) {
            System.out.println("El valor debe estar entre 1 y 10. Por favor, ingresa un valor válido:");
            value = sc.nextInt();
        }
        interes.lenguajeProgramacion.setValue(value);

        System.out.println("¿Qué herramientas de desarrollo utilizas con más frecuencia?[1-4] :");
        i = 1;
        for (HerramientasDesarrollo m : HerramientasDesarrollo.values()) {
            System.out.println(i + ". " + m);
            i++;
        }
        opcion = sc.nextInt();
        interes.setHerramientasDesarrollo(Interes.HerramientasDesarrollo.values()[opcion - 1]);
        System.out.println("¿Qué valor le quieres asignar a la opción elegida? [1-10]:");
        value = sc.nextInt();
        while (value < 1 || value > 10) {
            System.out.println("El valor debe estar entre 1 y 10. Por favor, ingresa un valor válido:");
            value = sc.nextInt();
        }
        interes.herramientasDesarrollo.setValue(value);

        System.out.println("¿Cuál es tu opinión sobre el trabajo en equipo en el desarrollo de Software? [1-4] :");
        i = 1;
        for (OpinionDesarrollo m : OpinionDesarrollo.values()) {
            System.out.println(i + ". " + m);
            i++;
        }
        opcion = sc.nextInt();
        interes.setOpinionDesarrollo(Interes.OpinionDesarrollo.values()[opcion - 1]);
        System.out.println("¿Qué valor le quieres asignar a la opción elegida? [1-10]:");
        value = sc.nextInt();
        while (value < 1 || value > 10) {
            System.out.println("El valor debe estar entre 1 y 10. Por favor, ingresa un valor válido:");
            value = sc.nextInt();
        }
        interes.opinionDesarrollo.setValue(value);

        System.out.println("¿Cuáles son las habilidades y conocimientos en los que te gustaría mejorar? [1-4] :");
        i = 1;
        for (HabilidadesConocimientosMejorar m : HabilidadesConocimientosMejorar.values()) {
            System.out.println(i + ". " + m);
            i++;
        }
        opcion = sc.nextInt();
        interes.setHabilidadesConocimientosMejorar(Interes.HabilidadesConocimientosMejorar.values()[opcion - 1]);
        System.out.println("¿Qué valor le quieres asignar a la opción elegida? [1-10]:");
        value = sc.nextInt();
        while (value < 1 || value > 10) {
            System.out.println("El valor debe estar entre 1 y 10. Por favor, ingresa un valor válido:");
            value = sc.nextInt();
        }
        interes.habilidadesConocimientosMejorar.setValue(value);

        System.out.println("¿Qué proyectos o iniciativas relacionadas con la carrera de Ingeniería en Software te interesaría colaborar? [1-4] :");
        i = 1;
        for (InteresesColaborar m : InteresesColaborar.values()) {
            System.out.println(i + ". " + m);
            i++;
        }
        opcion = sc.nextInt();
        interes.setInteresesColaborar(Interes.InteresesColaborar.values()[opcion - 1]);
        System.out.println("¿Qué valor le quieres asignar a la opción elegida? [1-10]:");
        value = sc.nextInt();
        while (value < 1 || value > 10) {
            System.out.println("El valor debe estar entre 1 y 10. Por favor, ingresa un valor válido:");
            value = sc.nextInt();
        }
        interes.interesesColaborar.setValue(value);

        System.out.println("¿Qué tipo de recursos o herramientas consideras necesarias para mejorar tu desempeño como Ingeniero/a en Software? [1-4] :");
        i = 1;
        for (HerramientasNecesariasSoftware m : HerramientasNecesariasSoftware.values()) {
            System.out.println(i + ". " + m);
            i++;
        }
        opcion = sc.nextInt();
        interes.setHerramientasNecesariasSoftware(Interes.HerramientasNecesariasSoftware.values()[opcion - 1]);
        System.out.println("¿Qué valor le quieres asignar a la opción elegida? [1-10]:");
        value = sc.nextInt();
        while (value < 1 || value > 10) {
            System.out.println("El valor debe estar entre 1 y 10. Por favor, ingresa un valor válido:");
            value = sc.nextInt();
        }
        interes.herramientasNecesariasSoftware.setValue(value);

        System.out.println("¿Qué eventos o actividades relacionadas con la carrera de Ingeniería en Software te gustaría asistir u organizar? [1-4] :");
        i = 1;
        for (EventosInteresAsistir m : EventosInteresAsistir.values()) {
            System.out.println(i + ". " + m);
            i++;
        }
        opcion = sc.nextInt();
        interes.setEventosInteresAsistir(Interes.EventosInteresAsistir.values()[opcion - 1]);
        System.out.println("¿Qué valor le quieres asignar a la opción elegida? [1-10]:");
        value = sc.nextInt();
        while (value < 1 || value > 10) {
            System.out.println("El valor debe estar entre 1 y 10. Por favor, ingresa un valor válido:");
            value = sc.nextInt();
        }
        interes.eventosInteresAsistir.setValue(value);
//        
        System.out.println("¿Qué tipo de colaboración o intercambio de conocimiento te gustaría tener \ncon otros profesionales o estudiantes en la carrera de Ingeniería en Software? [1-4] :");
        i = 1;
        for (ColaboracionIntercambio m : ColaboracionIntercambio.values()) {
            System.out.println(i + ". " + m);
            i++;
        }
        opcion = sc.nextInt();
        interes.setColaboracionIntercambio(Interes.ColaboracionIntercambio.values()[opcion - 1]);
        System.out.println("¿Qué valor le quieres asignar a la opción elegida? [1-10]:");
        value = sc.nextInt();
        while (value < 1 || value > 10) {
            System.out.println("El valor debe estar entre 1 y 10. Por favor, ingresa un valor válido:");
            value = sc.nextInt();
        }
        interes.colaboracionIntercambio.setValue(value);

        return interes;
    }

    @Override
    public String toString() {
        return "Sus Interes elegidos son: {" 
                + "areaInteres=" + areaInteres +"\n"
                + ", metodologiaDesarrollo=" + metodologiaDesarrollo +"\n"
                + ", lenguajeProgramacion=" + lenguajeProgramacion +"\n"
                + ", herramientasDesarrollo=" + herramientasDesarrollo +"\n"
                + ", opinionDesarrollo=" + opinionDesarrollo +"\n"
                + ", habilidadesConocimientosMejorar=" + habilidadesConocimientosMejorar +"\n"
                + ", interesesColaborar=" + interesesColaborar +"n"
                + ", herramientasNecesariasSoftware=" + herramientasNecesariasSoftware +"\n"
                + ", eventosInteresAsistir=" + eventosInteresAsistir +"\n"
                + ", colaboracionIntercambio=" + colaboracionIntercambio + '}'+"\n";
    }

}
