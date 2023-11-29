/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package amigou;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Aplicacion {

    public static void agregarUsuariosPorDefecto(AmigoU amigos) {

// Estas lineas de codigo se pueden utilizar para imprimir los intereses de cada uno de los datos quemados  (EJEMPLO)      
//        List<Interes> interQuem1 = new ArrayList<>();        
//        interQuem1.add(new Interes(
//                Interes.AreaInteres.valueOf("INTELIGENCIA_ARTIFICIAL_Y_APRENDIZAJE_AUTOMATICO"),
//                Interes.MetodologiaDesarrollo.valueOf("AGILE"),
//                Interes.LenguajeProgramacion.valueOf("JAVA"),
//                Interes.HerramientasDesarrollo.valueOf("NETBEANS"),
//                Interes.OpinionDesarrollo.valueOf("ES_ESENCIAL_PARA_EL_EXITO_DEL_PROYECTO"),
//                Interes.HabilidadesConocimientosMejorar.valueOf("SEGURIDAD_DE_LA_INFORMACION"),
//                Interes.InteresesColaborar.valueOf("PARTICIPACION_EN_HACKATHONS_O_COMPETENCIAS_DE_PROGRAMACION"),
//                Interes.HerramientasNecesariasSoftware.valueOf("ACCESO_A_CURSOS_Y_TUTORIALES_EN_LINEA"),
//                Interes.EventosInteresAsistir.valueOf("CONFERENCIAS_Y_SEMINARIOS"),
//                Interes.ColaboracionIntercambio.valueOf("MENTORIA_Y_TUTORIA_MUTUA")
//        )
//        );
        List<Integer> interQuem1Int = new ArrayList<>();

        Interes.AreaInteres interes1 = Interes.AreaInteres.INTELIGENCIA_ARTIFICIAL_Y_APRENDIZAJE_AUTOMATICO;
        interes1.setValue(new Random().nextInt(10) + 1);
        Interes.MetodologiaDesarrollo interes2 = Interes.MetodologiaDesarrollo.AGILE;
        interes2.setValue(new Random().nextInt(10) + 1);
        Interes.LenguajeProgramacion interes3 = Interes.LenguajeProgramacion.JAVA;
        interes3.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasDesarrollo interes4 = Interes.HerramientasDesarrollo.NETBEANS;
        interes4.setValue(new Random().nextInt(10) + 1);
        Interes.OpinionDesarrollo interes5 = Interes.OpinionDesarrollo.ES_ESENCIAL_PARA_EL_EXITO_DEL_PROYECTO;
        interes5.setValue(new Random().nextInt(10) + 1);
        Interes.HabilidadesConocimientosMejorar interes6 = Interes.HabilidadesConocimientosMejorar.SEGURIDAD_DE_LA_INFORMACION;
        interes6.setValue(new Random().nextInt(10) + 1);
        Interes.InteresesColaborar interes7 = Interes.InteresesColaborar.PARTICIPACION_EN_HACKATHONS_O_COMPETENCIAS_DE_PROGRAMACION;
        interes7.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasNecesariasSoftware interes8 = Interes.HerramientasNecesariasSoftware.ACCESO_A_CURSOS_Y_TUTORIALES_EN_LINEA;
        interes8.setValue(new Random().nextInt(10) + 1);
        Interes.EventosInteresAsistir interes9 = Interes.EventosInteresAsistir.CONFERENCIAS_Y_SEMINARIOS;
        interes9.setValue(new Random().nextInt(10) + 1);
        Interes.ColaboracionIntercambio interes10 = Interes.ColaboracionIntercambio.MENTORIA_Y_TUTORIA_MUTUA;
        interes10.setValue(new Random().nextInt(10) + 1);
        interQuem1Int.add(interes1.getValue());
        interQuem1Int.add(interes2.getValue());
        interQuem1Int.add(interes3.getValue());
        interQuem1Int.add(interes4.getValue());
        interQuem1Int.add(interes5.getValue());
        interQuem1Int.add(interes6.getValue());
        interQuem1Int.add(interes7.getValue());
        interQuem1Int.add(interes8.getValue());
        interQuem1Int.add(interes9.getValue());
        interQuem1Int.add(interes10.getValue());
        amigos.agregarUsuario(new Usuario("MARIA", "VAZCONES", "MARIA.VASCONEZ.REA@UDLA.EDU.EC",
                "FEMENINO", "ESTUDIANTE", 4, interQuem1Int));

        List<Integer> interQuem2Int = new ArrayList<>();

        Interes.AreaInteres interes11 = Interes.AreaInteres.ARQUITECTURA_SOFTWARE;
        interes11.setValue(new Random().nextInt(10) + 1);
        Interes.MetodologiaDesarrollo interes12 = Interes.MetodologiaDesarrollo.SCRUM;
        interes12.setValue(new Random().nextInt(10) + 1);
        Interes.LenguajeProgramacion interes13 = Interes.LenguajeProgramacion.PYTHON;
        interes13.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasDesarrollo interes14 = Interes.HerramientasDesarrollo.VISUAL_STUDIO;
        interes14.setValue(new Random().nextInt(10) + 1);
        Interes.OpinionDesarrollo interes15 = Interes.OpinionDesarrollo.ES_ESENCIAL_PARA_EL_EXITO_DEL_PROYECTO;
        interes15.setValue(new Random().nextInt(10) + 1);
        Interes.HabilidadesConocimientosMejorar interes16 = Interes.HabilidadesConocimientosMejorar.DISEÑO_DE_SOFTWARE_Y_ARQUITECTURA;
        interes16.setValue(new Random().nextInt(10) + 1);
        Interes.InteresesColaborar interes17 = Interes.InteresesColaborar.PARTICIPACION_EN_HACKATHONS_O_COMPETENCIAS_DE_PROGRAMACION;
        interes17.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasNecesariasSoftware interes18 = Interes.HerramientasNecesariasSoftware.ACCESO_A_HERRAMIENTAS_DE_DESARROLLO_Y_SOFTWARE_PROFESIONAL;
        interes18.setValue(new Random().nextInt(10) + 1);
        Interes.EventosInteresAsistir interes19 = Interes.EventosInteresAsistir.JORNADAS_DE_PUERTAS_ABIERTAS_Y_EVENTOS_DE_NETWORK;
        interes19.setValue(new Random().nextInt(10) + 1);
        Interes.ColaboracionIntercambio interes20 = Interes.ColaboracionIntercambio.COMPARTIR_RECURSOS_Y_HERRAMIENTAS_UTILES;
        interes20.setValue(new Random().nextInt(10) + 1);
        interQuem2Int.add(interes11.getValue());
        interQuem2Int.add(interes12.getValue());
        interQuem2Int.add(interes13.getValue());
        interQuem2Int.add(interes14.getValue());
        interQuem2Int.add(interes15.getValue());
        interQuem2Int.add(interes16.getValue());
        interQuem2Int.add(interes17.getValue());
        interQuem2Int.add(interes18.getValue());
        interQuem2Int.add(interes19.getValue());
        interQuem2Int.add(interes20.getValue());
        amigos.agregarUsuario(new Usuario("ARIEL", "RAURA", "ARIEL.RAURA@UDLA.EDU.EC", "MASCULINO", "ESTUDIANTE", 4, interQuem2Int));

        List<Integer> interQuem3Int = new ArrayList<>();

        Interes.AreaInteres interes21 = Interes.AreaInteres.ARQUITECTURA_SOFTWARE;
        interes21.setValue(new Random().nextInt(10) + 1);
        Interes.MetodologiaDesarrollo interes22 = Interes.MetodologiaDesarrollo.SCRUM;
        interes22.setValue(new Random().nextInt(10) + 1);
        Interes.LenguajeProgramacion interes23 = Interes.LenguajeProgramacion.PYTHON;
        interes23.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasDesarrollo interes24 = Interes.HerramientasDesarrollo.VISUAL_STUDIO;
        interes24.setValue(new Random().nextInt(10) + 1);
        Interes.OpinionDesarrollo interes25 = Interes.OpinionDesarrollo.ES_ESENCIAL_PARA_EL_EXITO_DEL_PROYECTO;
        interes25.setValue(new Random().nextInt(10) + 1);
        Interes.HabilidadesConocimientosMejorar interes26 = Interes.HabilidadesConocimientosMejorar.DISEÑO_DE_SOFTWARE_Y_ARQUITECTURA;
        interes26.setValue(new Random().nextInt(10) + 1);
        Interes.InteresesColaborar interes27 = Interes.InteresesColaborar.PARTICIPACION_EN_HACKATHONS_O_COMPETENCIAS_DE_PROGRAMACION;
        interes27.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasNecesariasSoftware interes28 = Interes.HerramientasNecesariasSoftware.ACCESO_A_HERRAMIENTAS_DE_DESARROLLO_Y_SOFTWARE_PROFESIONAL;
        interes28.setValue(new Random().nextInt(10) + 1);
        Interes.EventosInteresAsistir interes29 = Interes.EventosInteresAsistir.JORNADAS_DE_PUERTAS_ABIERTAS_Y_EVENTOS_DE_NETWORK;
        interes29.setValue(new Random().nextInt(10) + 1);
        Interes.ColaboracionIntercambio interes30 = Interes.ColaboracionIntercambio.COMPARTIR_RECURSOS_Y_HERRAMIENTAS_UTILES;
        interes30.setValue(new Random().nextInt(10) + 1);
        interQuem3Int.add(interes21.getValue());
        interQuem3Int.add(interes22.getValue());
        interQuem3Int.add(interes23.getValue());
        interQuem3Int.add(interes24.getValue());
        interQuem3Int.add(interes25.getValue());
        interQuem3Int.add(interes26.getValue());
        interQuem3Int.add(interes27.getValue());
        interQuem3Int.add(interes28.getValue());
        interQuem3Int.add(interes29.getValue());
        interQuem3Int.add(interes30.getValue());

        amigos.agregarUsuario(new Usuario("CARLOS", "GUAGRILLA", "CARLOS.GUAGRILLA@UDLA.EDU.EC", "MASCULINO", "ESTUDIANTE", 4, interQuem3Int));

        List<Integer> interQuem4Int = new ArrayList<>();
        Interes.AreaInteres interes31 = Interes.AreaInteres.DESARROLLO_APLICACIONES_MOVILES;
        interes31.setValue(new Random().nextInt(10) + 1);
        Interes.MetodologiaDesarrollo interes32 = Interes.MetodologiaDesarrollo.WATERFALL;
        interes32.setValue(new Random().nextInt(10) + 1);
        Interes.LenguajeProgramacion interes33 = Interes.LenguajeProgramacion.JAVA;
        interes33.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasDesarrollo interes34 = Interes.HerramientasDesarrollo.VISUAL_STUDIO;
        interes34.setValue(new Random().nextInt(10) + 1);
        Interes.OpinionDesarrollo interes35 = Interes.OpinionDesarrollo.ES_ESENCIAL_PARA_EL_EXITO_DEL_PROYECTO;
        interes35.setValue(new Random().nextInt(10) + 1);
        Interes.HabilidadesConocimientosMejorar interes36 = Interes.HabilidadesConocimientosMejorar.VISUAL_PROGRAMACIÓN_EN_LENGUAJES_ESPECIFICOS;
        interes36.setValue(new Random().nextInt(10) + 1);
        Interes.InteresesColaborar interes37 = Interes.InteresesColaborar.DESARROLLO_DE_APLICACIONES_PARA_ORGANIZACIONES_SIN_FINES_DE_LUCRO;
        interes37.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasNecesariasSoftware interes38 = Interes.HerramientasNecesariasSoftware.ACCESO_A_CURSOS_Y_TUTORIALES_EN_LINEA;
        interes38.setValue(new Random().nextInt(10) + 1);
        Interes.EventosInteresAsistir interes39 = Interes.EventosInteresAsistir.CONFERENCIAS_Y_SEMINARIOS;
        interes39.setValue(new Random().nextInt(10) + 1);
        Interes.ColaboracionIntercambio interes40 = Interes.ColaboracionIntercambio.INTERCAMBIO_DE_EXPERIENCIAS_Y_PRÁCTICAS_EN_PROYECTOS;
        interes40.setValue(new Random().nextInt(10) + 1);
        interQuem4Int.add(interes31.getValue());
        interQuem4Int.add(interes32.getValue());
        interQuem4Int.add(interes33.getValue());
        interQuem4Int.add(interes34.getValue());
        interQuem4Int.add(interes35.getValue());
        interQuem4Int.add(interes36.getValue());
        interQuem4Int.add(interes37.getValue());
        interQuem4Int.add(interes38.getValue());
        interQuem4Int.add(interes39.getValue());
        interQuem4Int.add(interes40.getValue());
        amigos.agregarUsuario(new Usuario("MARTIN", "ZUMARRAGA", "MARTIN.ZUMARRAGA@UDLA.EDU.EC", "MASCULINO", "ESTUDIANTE", 4, interQuem4Int));

        List<Integer> interQuem5Int = new ArrayList<>();
        Interes.AreaInteres interes41 = Interes.AreaInteres.INTELIGENCIA_ARTIFICIAL_Y_APRENDIZAJE_AUTOMATICO;
        interes41.setValue(new Random().nextInt(10) + 1);
        Interes.MetodologiaDesarrollo interes42 = Interes.MetodologiaDesarrollo.WATERFALL;
        interes42.setValue(new Random().nextInt(10) + 1);
        Interes.LenguajeProgramacion interes43 = Interes.LenguajeProgramacion.JAVA;
        interes43.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasDesarrollo interes44 = Interes.HerramientasDesarrollo.VISUAL_STUDIO;
        interes44.setValue(new Random().nextInt(10) + 1);
        Interes.OpinionDesarrollo interes45 = Interes.OpinionDesarrollo.ES_ESENCIAL_PARA_EL_EXITO_DEL_PROYECTO;
        interes45.setValue(new Random().nextInt(10) + 1);
        Interes.HabilidadesConocimientosMejorar interes46 = Interes.HabilidadesConocimientosMejorar.METODOLOGIAS_AGILES_Y_DE_GESTION_DE_PROYECTOS;
        interes46.setValue(new Random().nextInt(10) + 1);
        Interes.InteresesColaborar interes47 = Interes.InteresesColaborar.DESARROLLO_DE_APLICACIONES_PARA_ORGANIZACIONES_SIN_FINES_DE_LUCRO;
        interes47.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasNecesariasSoftware interes48 = Interes.HerramientasNecesariasSoftware.ACCESO_A_CURSOS_Y_TUTORIALES_EN_LINEA;
        interes48.setValue(new Random().nextInt(10) + 1);
        Interes.EventosInteresAsistir interes49 = Interes.EventosInteresAsistir.CONFERENCIAS_Y_SEMINARIOS;
        interes49.setValue(new Random().nextInt(10) + 1);
        Interes.ColaboracionIntercambio interes50 = Interes.ColaboracionIntercambio.MENTORIA_Y_TUTORIA_MUTUA;
        interes50.setValue(new Random().nextInt(10) + 1);
        interQuem5Int.add(interes41.getValue());
        interQuem5Int.add(interes42.getValue());
        interQuem5Int.add(interes43.getValue());
        interQuem5Int.add(interes44.getValue());
        interQuem5Int.add(interes45.getValue());
        interQuem5Int.add(interes46.getValue());
        interQuem5Int.add(interes47.getValue());
        interQuem5Int.add(interes48.getValue());
        interQuem5Int.add(interes49.getValue());
        interQuem5Int.add(interes50.getValue());
        amigos.agregarUsuario(new Usuario("GUILLERMO", "ALVAREZ", "GUILLERMO.ALVAREZ@UDLA.EDU.EC", "MASCULINO", "ESTUDIANTE", 4, interQuem5Int));

        List<Integer> interQuem6Int = new ArrayList<>();
        Interes.AreaInteres interes51 = Interes.AreaInteres.INTELIGENCIA_ARTIFICIAL_Y_APRENDIZAJE_AUTOMATICO;
        interes51.setValue(new Random().nextInt(10) + 1);
        Interes.MetodologiaDesarrollo interes52 = Interes.MetodologiaDesarrollo.AGILE;
        interes52.setValue(new Random().nextInt(10) + 1);
        Interes.LenguajeProgramacion interes53 = Interes.LenguajeProgramacion.PYTHON;
        interes53.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasDesarrollo interes54 = Interes.HerramientasDesarrollo.VISUAL_STUDIO;
        interes54.setValue(new Random().nextInt(10) + 1);
        Interes.OpinionDesarrollo interes55 = Interes.OpinionDesarrollo.ES_ESENCIAL_PARA_EL_EXITO_DEL_PROYECTO;
        interes55.setValue(new Random().nextInt(10) + 1);
        Interes.HabilidadesConocimientosMejorar interes56 = Interes.HabilidadesConocimientosMejorar.VISUAL_PROGRAMACIÓN_EN_LENGUAJES_ESPECIFICOS;
        interes56.setValue(new Random().nextInt(10) + 1);
        Interes.InteresesColaborar interes57 = Interes.InteresesColaborar.INVESTIGACION_EN_INTELIGENCIA_ARTIFICIAL_Y_APRENDIZAJE;
        interes57.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasNecesariasSoftware interes58 = Interes.HerramientasNecesariasSoftware.ACCESO_A_CURSOS_Y_TUTORIALES_EN_LINEA;
        interes58.setValue(new Random().nextInt(10) + 1);
        Interes.EventosInteresAsistir interes59 = Interes.EventosInteresAsistir.PROGRAMAS_DE_INTERCAMBIO_Y_VIAJES_DE_ESTUDIO;
        interes59.setValue(new Random().nextInt(10) + 1);
        Interes.ColaboracionIntercambio interes60 = Interes.ColaboracionIntercambio.COMPARTIR_RECURSOS_Y_HERRAMIENTAS_UTILES;
        interes60.setValue(new Random().nextInt(10) + 1);
        interQuem6Int.add(interes51.getValue());
        interQuem6Int.add(interes52.getValue());
        interQuem6Int.add(interes53.getValue());
        interQuem6Int.add(interes54.getValue());
        interQuem6Int.add(interes55.getValue());
        interQuem6Int.add(interes56.getValue());
        interQuem6Int.add(interes57.getValue());
        interQuem6Int.add(interes58.getValue());
        interQuem6Int.add(interes59.getValue());
        interQuem6Int.add(interes60.getValue());
        amigos.agregarUsuario(new Usuario("ANDRES", "LOZA", "ANDRES.LOZA.CHACON@UDLA.EDU.EC", "MASCULINO", "ESTUDIANTE", 4, interQuem6Int));

        List<Integer> interQuem7Int = new ArrayList<>();
        Interes.AreaInteres interes61 = Interes.AreaInteres.INTELIGENCIA_ARTIFICIAL_Y_APRENDIZAJE_AUTOMATICO;
        interes61.setValue(new Random().nextInt(10) + 1);
        Interes.MetodologiaDesarrollo interes62 = Interes.MetodologiaDesarrollo.AGILE;
        interes62.setValue(new Random().nextInt(10) + 1);
        Interes.LenguajeProgramacion interes63 = Interes.LenguajeProgramacion.PYTHON;
        interes63.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasDesarrollo interes64 = Interes.HerramientasDesarrollo.VISUAL_STUDIO;
        interes64.setValue(new Random().nextInt(10) + 1);
        Interes.OpinionDesarrollo interes65 = Interes.OpinionDesarrollo.ES_ESENCIAL_PARA_EL_EXITO_DEL_PROYECTO;
        interes65.setValue(new Random().nextInt(10) + 1);
        Interes.HabilidadesConocimientosMejorar interes66 = Interes.HabilidadesConocimientosMejorar.VISUAL_PROGRAMACIÓN_EN_LENGUAJES_ESPECIFICOS;
        interes66.setValue(new Random().nextInt(10) + 1);
        Interes.InteresesColaborar interes67 = Interes.InteresesColaborar.DESARROLLO_DE_APLICACIONES_PARA_ORGANIZACIONES_SIN_FINES_DE_LUCRO;
        interes67.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasNecesariasSoftware interes68 = Interes.HerramientasNecesariasSoftware.ACCESO_A_CURSOS_Y_TUTORIALES_EN_LINEA;
        interes68.setValue(new Random().nextInt(10) + 1);
        Interes.EventosInteresAsistir interes69 = Interes.EventosInteresAsistir.TALLERES_Y_SESIONES_DE_FORMACION;
        interes69.setValue(new Random().nextInt(10) + 1);
        Interes.ColaboracionIntercambio interes70 = Interes.ColaboracionIntercambio.MENTORIA_Y_TUTORIA_MUTUA;
        interes70.setValue(new Random().nextInt(10) + 1);
        interQuem7Int.add(interes61.getValue());
        interQuem7Int.add(interes62.getValue());
        interQuem7Int.add(interes63.getValue());
        interQuem7Int.add(interes64.getValue());
        interQuem7Int.add(interes65.getValue());
        interQuem7Int.add(interes66.getValue());
        interQuem7Int.add(interes67.getValue());
        interQuem7Int.add(interes68.getValue());
        interQuem7Int.add(interes69.getValue());
        interQuem7Int.add(interes70.getValue());
        amigos.agregarUsuario(new Usuario("GABRIEL", "ERAZO", "GABRIEL.ERAZO.MERINO@UDLA.EDU.EC", "MASCULINO", "ESTUDIANTE", 4, interQuem7Int));

        List<Integer> interQuem8Int = new ArrayList<>();
        Interes.AreaInteres interes71 = Interes.AreaInteres.INTELIGENCIA_ARTIFICIAL_Y_APRENDIZAJE_AUTOMATICO;
        interes71.setValue(new Random().nextInt(10) + 1);
        Interes.MetodologiaDesarrollo interes72 = Interes.MetodologiaDesarrollo.SCRUM;
        interes72.setValue(new Random().nextInt(10) + 1);
        Interes.LenguajeProgramacion interes73 = Interes.LenguajeProgramacion.JAVA;
        interes73.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasDesarrollo interes74 = Interes.HerramientasDesarrollo.NETBEANS;
        interes74.setValue(new Random().nextInt(10) + 1);
        Interes.OpinionDesarrollo interes75 = Interes.OpinionDesarrollo.ES_IMPORTANTE_PERO_NO_ES_CRUCIAL;
        interes75.setValue(new Random().nextInt(10) + 1);
        Interes.HabilidadesConocimientosMejorar interes76 = Interes.HabilidadesConocimientosMejorar.METODOLOGIAS_AGILES_Y_DE_GESTION_DE_PROYECTOS;
        interes76.setValue(new Random().nextInt(10) + 1);
        Interes.InteresesColaborar interes77 = Interes.InteresesColaborar.DESARROLLO_DE_APLICACIONES_PARA_ORGANIZACIONES_SIN_FINES_DE_LUCRO;
        interes77.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasNecesariasSoftware interes78 = Interes.HerramientasNecesariasSoftware.ACCESO_A_CURSOS_Y_TUTORIALES_EN_LINEA;
        interes78.setValue(new Random().nextInt(10) + 1);
        Interes.EventosInteresAsistir interes79 = Interes.EventosInteresAsistir.JORNADAS_DE_PUERTAS_ABIERTAS_Y_EVENTOS_DE_NETWORK;
        interes79.setValue(new Random().nextInt(10) + 1);
        Interes.ColaboracionIntercambio interes80 = Interes.ColaboracionIntercambio.INTERCAMBIO_DE_EXPERIENCIAS_Y_PRÁCTICAS_EN_PROYECTOS;
        interes80.setValue(new Random().nextInt(10) + 1);
        interQuem8Int.add(interes71.getValue());
        interQuem8Int.add(interes72.getValue());
        interQuem8Int.add(interes73.getValue());
        interQuem8Int.add(interes74.getValue());
        interQuem8Int.add(interes75.getValue());
        interQuem8Int.add(interes76.getValue());
        interQuem8Int.add(interes77.getValue());
        interQuem8Int.add(interes78.getValue());
        interQuem8Int.add(interes79.getValue());
        interQuem8Int.add(interes80.getValue());
        amigos.agregarUsuario(new Usuario("ENRIQUE", "MERIZALDE", "ENRIQUE.MERIZALDE@UDLA.EDU.EC", "MASCULINO", "ESTUDIANTE", 4, interQuem8Int));

        List<Integer> interQuem9Int = new ArrayList<>();
        Interes.AreaInteres interes81 = Interes.AreaInteres.ARQUITECTURA_SOFTWARE;
        interes81.setValue(new Random().nextInt(10) + 1);
        Interes.MetodologiaDesarrollo interes82 = Interes.MetodologiaDesarrollo.SCRUM;
        interes82.setValue(new Random().nextInt(10) + 1);
        Interes.LenguajeProgramacion interes83 = Interes.LenguajeProgramacion.JAVASCRIPT;
        interes83.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasDesarrollo interes84 = Interes.HerramientasDesarrollo.NETBEANS;
        interes84.setValue(new Random().nextInt(10) + 1);
        Interes.OpinionDesarrollo interes85 = Interes.OpinionDesarrollo.ES_IMPORTANTE_PERO_NO_ES_CRUCIAL;
        interes85.setValue(new Random().nextInt(10) + 1);
        Interes.HabilidadesConocimientosMejorar interes86 = Interes.HabilidadesConocimientosMejorar.VISUAL_PROGRAMACIÓN_EN_LENGUAJES_ESPECIFICOS;
        interes86.setValue(new Random().nextInt(10) + 1);
        Interes.InteresesColaborar interes87 = Interes.InteresesColaborar.PARTICIPACION_EN_PROGRAMAS_DE_MENTORIA;
        interes87.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasNecesariasSoftware interes88 = Interes.HerramientasNecesariasSoftware.ACCESO_A_CURSOS_Y_TUTORIALES_EN_LINEA;
        interes88.setValue(new Random().nextInt(10) + 1);
        Interes.EventosInteresAsistir interes89 = Interes.EventosInteresAsistir.TALLERES_Y_SESIONES_DE_FORMACION;
        interes89.setValue(new Random().nextInt(10) + 1);
        Interes.ColaboracionIntercambio interes90 = Interes.ColaboracionIntercambio.COMPARTIR_RECURSOS_Y_HERRAMIENTAS_UTILES;
        interes90.setValue(new Random().nextInt(10) + 1);
        interQuem9Int.add(interes81.getValue());
        interQuem9Int.add(interes82.getValue());
        interQuem9Int.add(interes83.getValue());
        interQuem9Int.add(interes84.getValue());
        interQuem9Int.add(interes85.getValue());
        interQuem9Int.add(interes86.getValue());
        interQuem9Int.add(interes87.getValue());
        interQuem9Int.add(interes88.getValue());
        interQuem9Int.add(interes89.getValue());
        interQuem9Int.add(interes90.getValue());
        amigos.agregarUsuario(new Usuario("MATEO", "ENCALADA", "MATEO.ENCALADA@UDLA.EDU.EC", "MASCULINO", "ESTUDIANTE", 4, interQuem9Int));
        ////////////////////////////////////////////
        List<Integer> interQuem10Int = new ArrayList<>();
        Interes.AreaInteres interes91 = Interes.AreaInteres.SEGURIDAD_INFORMACION;
        interes91.setValue(new Random().nextInt(10) + 1);
        Interes.MetodologiaDesarrollo interes92 = Interes.MetodologiaDesarrollo.WATERFALL;
        interes92.setValue(new Random().nextInt(10) + 1);
        Interes.LenguajeProgramacion interes93 = Interes.LenguajeProgramacion.C_SHARP;
        interes93.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasDesarrollo interes94 = Interes.HerramientasDesarrollo.NETBEANS;
        interes94.setValue(new Random().nextInt(10) + 1);
        Interes.OpinionDesarrollo interes95 = Interes.OpinionDesarrollo.ES_ESENCIAL_PARA_EL_EXITO_DEL_PROYECTO;
        interes95.setValue(new Random().nextInt(10) + 1);
        Interes.HabilidadesConocimientosMejorar interes96 = Interes.HabilidadesConocimientosMejorar.VISUAL_PROGRAMACIÓN_EN_LENGUAJES_ESPECIFICOS;
        interes96.setValue(new Random().nextInt(10) + 1);
        Interes.InteresesColaborar interes97 = Interes.InteresesColaborar.PARTICIPACION_EN_HACKATHONS_O_COMPETENCIAS_DE_PROGRAMACION;
        interes97.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasNecesariasSoftware interes98 = Interes.HerramientasNecesariasSoftware.PARTICIPACIÓN_EN_COMUNIDADES_DESARROLLARDORES;
        interes98.setValue(new Random().nextInt(10) + 1);
        Interes.EventosInteresAsistir interes99 = Interes.EventosInteresAsistir.TALLERES_Y_SESIONES_DE_FORMACION;
        interes99.setValue(new Random().nextInt(10) + 1);
        Interes.ColaboracionIntercambio interes100 = Interes.ColaboracionIntercambio.INTERCAMBIO_DE_EXPERIENCIAS_Y_PRÁCTICAS_EN_PROYECTOS;
        interes100.setValue(new Random().nextInt(10) + 1);
        interQuem10Int.add(interes91.getValue());
        interQuem10Int.add(interes92.getValue());
        interQuem10Int.add(interes93.getValue());
        interQuem10Int.add(interes94.getValue());
        interQuem10Int.add(interes95.getValue());
        interQuem10Int.add(interes96.getValue());
        interQuem10Int.add(interes97.getValue());
        interQuem10Int.add(interes98.getValue());
        interQuem10Int.add(interes99.getValue());
        interQuem10Int.add(interes100.getValue());
        amigos.agregarUsuario(new Usuario("MAURO", "SALGUERO", "MAURO.SALGUERO@UDLA.EDU.EC", "MASCULINO", "ESTUDIANTE", 4, interQuem10Int));

        List<Integer> interQuem11Int = new ArrayList<>();
        Interes.AreaInteres interes101 = Interes.AreaInteres.SEGURIDAD_INFORMACION;
        interes101.setValue(new Random().nextInt(10) + 1);
        Interes.MetodologiaDesarrollo interes102 = Interes.MetodologiaDesarrollo.SCRUM;
        interes102.setValue(new Random().nextInt(10) + 1);
        Interes.LenguajeProgramacion interes103 = Interes.LenguajeProgramacion.JAVA;
        interes103.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasDesarrollo interes104 = Interes.HerramientasDesarrollo.NETBEANS;
        interes104.setValue(new Random().nextInt(10) + 1);
        Interes.OpinionDesarrollo interes105 = Interes.OpinionDesarrollo.ES_ESENCIAL_PARA_EL_EXITO_DEL_PROYECTO;
        interes105.setValue(new Random().nextInt(10) + 1);
        Interes.HabilidadesConocimientosMejorar interes106 = Interes.HabilidadesConocimientosMejorar.SEGURIDAD_DE_LA_INFORMACION;
        interes106.setValue(new Random().nextInt(10) + 1);
        Interes.InteresesColaborar interes107 = Interes.InteresesColaborar.PARTICIPACION_EN_HACKATHONS_O_COMPETENCIAS_DE_PROGRAMACION;
        interes107.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasNecesariasSoftware interes108 = Interes.HerramientasNecesariasSoftware.ACCESO_A_HERRAMIENTAS_DE_DESARROLLO_Y_SOFTWARE_PROFESIONAL;
        interes108.setValue(new Random().nextInt(10) + 1);
        Interes.EventosInteresAsistir interes109 = Interes.EventosInteresAsistir.JORNADAS_DE_PUERTAS_ABIERTAS_Y_EVENTOS_DE_NETWORK;
        interes109.setValue(new Random().nextInt(10) + 1);
        Interes.ColaboracionIntercambio interes110 = Interes.ColaboracionIntercambio.INTERCAMBIO_DE_EXPERIENCIAS_Y_PRÁCTICAS_EN_PROYECTOS;
        interes110.setValue(new Random().nextInt(10) + 1);
        interQuem11Int.add(interes101.getValue());
        interQuem11Int.add(interes102.getValue());
        interQuem11Int.add(interes103.getValue());
        interQuem11Int.add(interes104.getValue());
        interQuem11Int.add(interes105.getValue());
        interQuem11Int.add(interes106.getValue());
        interQuem11Int.add(interes107.getValue());
        interQuem11Int.add(interes108.getValue());
        interQuem11Int.add(interes109.getValue());
        interQuem11Int.add(interes110.getValue());
        amigos.agregarUsuario(new Usuario("PAULO", "GUERRA", "PAULO.GUERRA.CHAMBA@UDLA.EDU.EC", "MASCULINO", "ESTUDIANTE", 4, interQuem11Int));

        List<Integer> interQuem12Int = new ArrayList<>();
        Interes.AreaInteres interes111 = Interes.AreaInteres.INTELIGENCIA_ARTIFICIAL_Y_APRENDIZAJE_AUTOMATICO;
        interes111.setValue(new Random().nextInt(10) + 1);
        Interes.MetodologiaDesarrollo interes112 = Interes.MetodologiaDesarrollo.SCRUM;
        interes112.setValue(new Random().nextInt(10) + 1);
        Interes.LenguajeProgramacion interes113 = Interes.LenguajeProgramacion.C_SHARP;
        interes113.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasDesarrollo interes114 = Interes.HerramientasDesarrollo.VISUAL_STUDIO;
        interes114.setValue(new Random().nextInt(10) + 1);
        Interes.OpinionDesarrollo interes115 = Interes.OpinionDesarrollo.ES_ESENCIAL_PARA_EL_EXITO_DEL_PROYECTO;
        interes115.setValue(new Random().nextInt(10) + 1);
        Interes.HabilidadesConocimientosMejorar interes116 = Interes.HabilidadesConocimientosMejorar.VISUAL_PROGRAMACIÓN_EN_LENGUAJES_ESPECIFICOS;
        interes116.setValue(new Random().nextInt(10) + 1);
        Interes.InteresesColaborar interes117 = Interes.InteresesColaborar.PARTICIPACION_EN_HACKATHONS_O_COMPETENCIAS_DE_PROGRAMACION;
        interes117.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasNecesariasSoftware interes118 = Interes.HerramientasNecesariasSoftware.ACCESO_A_CURSOS_Y_TUTORIALES_EN_LINEA;
        interes118.setValue(new Random().nextInt(10) + 1);
        Interes.EventosInteresAsistir interes119 = Interes.EventosInteresAsistir.JORNADAS_DE_PUERTAS_ABIERTAS_Y_EVENTOS_DE_NETWORK;
        interes119.setValue(new Random().nextInt(10) + 1);
        Interes.ColaboracionIntercambio interes120 = Interes.ColaboracionIntercambio.INTERCAMBIO_DE_EXPERIENCIAS_Y_PRÁCTICAS_EN_PROYECTOS;
        interes120.setValue(new Random().nextInt(10) + 1);
        interQuem12Int.add(interes111.getValue());
        interQuem12Int.add(interes112.getValue());
        interQuem12Int.add(interes113.getValue());
        interQuem12Int.add(interes114.getValue());
        interQuem12Int.add(interes115.getValue());
        interQuem12Int.add(interes116.getValue());
        interQuem12Int.add(interes117.getValue());
        interQuem12Int.add(interes118.getValue());
        interQuem12Int.add(interes119.getValue());
        interQuem12Int.add(interes120.getValue());
        amigos.agregarUsuario(new Usuario("JULISSA", "RUALES", "JULISSA.RUALES@UDLA.EDU.EC", "FEMENINO", "ESTUDIANTE", 4, interQuem12Int));

        List<Integer> interQuem13Int = new ArrayList<>();
        Interes.AreaInteres interes121 = Interes.AreaInteres.INTELIGENCIA_ARTIFICIAL_Y_APRENDIZAJE_AUTOMATICO;
        interes121.setValue(new Random().nextInt(10) + 1);
        Interes.MetodologiaDesarrollo interes122 = Interes.MetodologiaDesarrollo.SCRUM;
        interes122.setValue(new Random().nextInt(10) + 1);
        Interes.LenguajeProgramacion interes123 = Interes.LenguajeProgramacion.PYTHON;
        interes123.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasDesarrollo interes124 = Interes.HerramientasDesarrollo.VISUAL_STUDIO;
        interes124.setValue(new Random().nextInt(10) + 1);
        Interes.OpinionDesarrollo interes125 = Interes.OpinionDesarrollo.ES_ESENCIAL_PARA_EL_EXITO_DEL_PROYECTO;
        interes125.setValue(new Random().nextInt(10) + 1);
        Interes.HabilidadesConocimientosMejorar interes126 = Interes.HabilidadesConocimientosMejorar.DISEÑO_DE_SOFTWARE_Y_ARQUITECTURA;
        interes126.setValue(new Random().nextInt(10) + 1);
        Interes.InteresesColaborar interes127 = Interes.InteresesColaborar.INVESTIGACION_EN_INTELIGENCIA_ARTIFICIAL_Y_APRENDIZAJE;
        interes127.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasNecesariasSoftware interes128 = Interes.HerramientasNecesariasSoftware.ASESORAMIENTO_Y_MENTORIA_DE_PROFESIONALES_EXPERIMENTADOS;
        interes128.setValue(new Random().nextInt(10) + 1);
        Interes.EventosInteresAsistir interes129 = Interes.EventosInteresAsistir.PROGRAMAS_DE_INTERCAMBIO_Y_VIAJES_DE_ESTUDIO;
        interes129.setValue(new Random().nextInt(10) + 1);
        Interes.ColaboracionIntercambio interes130 = Interes.ColaboracionIntercambio.PARTICIPAR_EN_PROYECTOS_DE_INVESTIGACION_O_DESARROLLO_COLABORATIVO;
        interes130.setValue(new Random().nextInt(10) + 1);
        interQuem13Int.add(interes121.getValue());
        interQuem13Int.add(interes122.getValue());
        interQuem13Int.add(interes123.getValue());
        interQuem13Int.add(interes124.getValue());
        interQuem13Int.add(interes125.getValue());
        interQuem13Int.add(interes126.getValue());
        interQuem13Int.add(interes127.getValue());
        interQuem13Int.add(interes128.getValue());
        interQuem13Int.add(interes129.getValue());
        interQuem13Int.add(interes130.getValue());
        amigos.agregarUsuario(new Usuario("DANIEL", "VIZCARRA", "DANIEL.VIZCARRA@UDLA.EDU.EC", "MASCULINO", "ESTUDIANTE", 4, interQuem13Int));

        List<Integer> interQuem14Int = new ArrayList<>();
        Interes.AreaInteres interes131 = Interes.AreaInteres.INTELIGENCIA_ARTIFICIAL_Y_APRENDIZAJE_AUTOMATICO;
        interes131.setValue(new Random().nextInt(10) + 1);
        Interes.MetodologiaDesarrollo interes132 = Interes.MetodologiaDesarrollo.SCRUM;
        interes132.setValue(new Random().nextInt(10) + 1);
        Interes.LenguajeProgramacion interes133 = Interes.LenguajeProgramacion.JAVA;
        interes133.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasDesarrollo interes134 = Interes.HerramientasDesarrollo.VISUAL_STUDIO;
        interes134.setValue(new Random().nextInt(10) + 1);
        Interes.OpinionDesarrollo interes135 = Interes.OpinionDesarrollo.ES_ESENCIAL_PARA_EL_EXITO_DEL_PROYECTO;
        interes135.setValue(new Random().nextInt(10) + 1);
        Interes.HabilidadesConocimientosMejorar interes136 = Interes.HabilidadesConocimientosMejorar.DISEÑO_DE_SOFTWARE_Y_ARQUITECTURA;
        interes136.setValue(new Random().nextInt(10) + 1);
        Interes.InteresesColaborar interes137 = Interes.InteresesColaborar.INVESTIGACION_EN_INTELIGENCIA_ARTIFICIAL_Y_APRENDIZAJE;
        interes137.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasNecesariasSoftware interes138 = Interes.HerramientasNecesariasSoftware.PARTICIPACIÓN_EN_COMUNIDADES_DESARROLLARDORES;
        interes138.setValue(new Random().nextInt(10) + 1);
        Interes.EventosInteresAsistir interes139 = Interes.EventosInteresAsistir.JORNADAS_DE_PUERTAS_ABIERTAS_Y_EVENTOS_DE_NETWORK;
        interes139.setValue(new Random().nextInt(10) + 1);
        Interes.ColaboracionIntercambio interes140 = Interes.ColaboracionIntercambio.INTERCAMBIO_DE_EXPERIENCIAS_Y_PRÁCTICAS_EN_PROYECTOS;
        interes140.setValue(new Random().nextInt(10) + 1);
        interQuem14Int.add(interes131.getValue());
        interQuem14Int.add(interes132.getValue());
        interQuem14Int.add(interes133.getValue());
        interQuem14Int.add(interes134.getValue());
        interQuem14Int.add(interes135.getValue());
        interQuem14Int.add(interes136.getValue());
        interQuem14Int.add(interes137.getValue());
        interQuem14Int.add(interes138.getValue());
        interQuem14Int.add(interes139.getValue());
        interQuem14Int.add(interes140.getValue());
        amigos.agregarUsuario(new Usuario("JOSSUE", "JATIVA", "JOSSUE.JATIVA@UDLA.EDU.EC", "MASCULINO", "ESTUDIANTE", 4, interQuem14Int));

        List<Integer> interQuem15Int = new ArrayList<>();
        Interes.AreaInteres interes141 = Interes.AreaInteres.SEGURIDAD_INFORMACION;
        interes141.setValue(new Random().nextInt(10) + 1);
        Interes.MetodologiaDesarrollo interes142 = Interes.MetodologiaDesarrollo.SCRUM;
        interes142.setValue(new Random().nextInt(10) + 1);
        Interes.LenguajeProgramacion interes143 = Interes.LenguajeProgramacion.PYTHON;
        interes143.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasDesarrollo interes144 = Interes.HerramientasDesarrollo.NETBEANS;
        interes144.setValue(new Random().nextInt(10) + 1);
        Interes.OpinionDesarrollo interes145 = Interes.OpinionDesarrollo.ES_ESENCIAL_PARA_EL_EXITO_DEL_PROYECTO;
        interes145.setValue(new Random().nextInt(10) + 1);
        Interes.HabilidadesConocimientosMejorar interes146 = Interes.HabilidadesConocimientosMejorar.SEGURIDAD_DE_LA_INFORMACION;
        interes146.setValue(new Random().nextInt(10) + 1);
        Interes.InteresesColaborar interes147 = Interes.InteresesColaborar.INVESTIGACION_EN_INTELIGENCIA_ARTIFICIAL_Y_APRENDIZAJE;
        interes147.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasNecesariasSoftware interes148 = Interes.HerramientasNecesariasSoftware.ACCESO_A_CURSOS_Y_TUTORIALES_EN_LINEA;
        interes148.setValue(new Random().nextInt(10) + 1);
        Interes.EventosInteresAsistir interes149 = Interes.EventosInteresAsistir.PROGRAMAS_DE_INTERCAMBIO_Y_VIAJES_DE_ESTUDIO;
        interes149.setValue(new Random().nextInt(10) + 1);
        Interes.ColaboracionIntercambio interes150 = Interes.ColaboracionIntercambio.MENTORIA_Y_TUTORIA_MUTUA;
        interes150.setValue(new Random().nextInt(10) + 1);
        interQuem15Int.add(interes141.getValue());
        interQuem15Int.add(interes142.getValue());
        interQuem15Int.add(interes143.getValue());
        interQuem15Int.add(interes144.getValue());
        interQuem15Int.add(interes145.getValue());
        interQuem15Int.add(interes146.getValue());
        interQuem15Int.add(interes147.getValue());
        interQuem15Int.add(interes148.getValue());
        interQuem15Int.add(interes149.getValue());
        interQuem15Int.add(interes150.getValue());
        amigos.agregarUsuario(new Usuario("MATEO", "CARTAGENA", "MATEO.CARTAGENA@UDLA.EDU.EC", "MASCULINO", "ESTUDIANTE", 4, interQuem15Int));

        List<Integer> interQuem16Int = new ArrayList<>();
        Interes.AreaInteres interes151 = Interes.AreaInteres.ARQUITECTURA_SOFTWARE;
        interes151.setValue(new Random().nextInt(10) + 1);
        Interes.MetodologiaDesarrollo interes152 = Interes.MetodologiaDesarrollo.AGILE;
        interes152.setValue(new Random().nextInt(10) + 1);
        Interes.LenguajeProgramacion interes153 = Interes.LenguajeProgramacion.C_SHARP;
        interes153.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasDesarrollo interes154 = Interes.HerramientasDesarrollo.VISUAL_STUDIO;
        interes154.setValue(new Random().nextInt(10) + 1);
        Interes.OpinionDesarrollo interes155 = Interes.OpinionDesarrollo.ES_IMPORTANTE_PERO_NO_ES_CRUCIAL;
        interes155.setValue(new Random().nextInt(10) + 1);
        Interes.HabilidadesConocimientosMejorar interes156 = Interes.HabilidadesConocimientosMejorar.DISEÑO_DE_SOFTWARE_Y_ARQUITECTURA;
        interes156.setValue(new Random().nextInt(10) + 1);
        Interes.InteresesColaborar interes157 = Interes.InteresesColaborar.PARTICIPACION_EN_HACKATHONS_O_COMPETENCIAS_DE_PROGRAMACION;
        interes157.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasNecesariasSoftware interes158 = Interes.HerramientasNecesariasSoftware.PARTICIPACIÓN_EN_COMUNIDADES_DESARROLLARDORES;
        interes158.setValue(new Random().nextInt(10) + 1);
        Interes.EventosInteresAsistir interes159 = Interes.EventosInteresAsistir.TALLERES_Y_SESIONES_DE_FORMACION;
        interes159.setValue(new Random().nextInt(10) + 1);
        Interes.ColaboracionIntercambio interes160 = Interes.ColaboracionIntercambio.COMPARTIR_RECURSOS_Y_HERRAMIENTAS_UTILES;
        interes160.setValue(new Random().nextInt(10) + 1);
        interQuem16Int.add(interes151.getValue());
        interQuem16Int.add(interes152.getValue());
        interQuem16Int.add(interes153.getValue());
        interQuem16Int.add(interes154.getValue());
        interQuem16Int.add(interes155.getValue());
        interQuem16Int.add(interes156.getValue());
        interQuem16Int.add(interes157.getValue());
        interQuem16Int.add(interes158.getValue());
        interQuem16Int.add(interes159.getValue());
        interQuem16Int.add(interes160.getValue());
        amigos.agregarUsuario(new Usuario("JUAN", "RAMÍREZ", "JUAN.RAMIREZ.FREIRE@UDLA.EDU.EC", "MASCULINO", "ESTUDIANTE", 4, interQuem16Int));

        List<Integer> interQuem17Int = new ArrayList<>();
        Interes.AreaInteres interes161 = Interes.AreaInteres.INTELIGENCIA_ARTIFICIAL_Y_APRENDIZAJE_AUTOMATICO;
        interes161.setValue(new Random().nextInt(10) + 1);
        Interes.MetodologiaDesarrollo interes162 = Interes.MetodologiaDesarrollo.SCRUM;
        interes162.setValue(new Random().nextInt(10) + 1);
        Interes.LenguajeProgramacion interes163 = Interes.LenguajeProgramacion.PYTHON;
        interes163.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasDesarrollo interes164 = Interes.HerramientasDesarrollo.VISUAL_STUDIO;
        interes164.setValue(new Random().nextInt(10) + 1);
        Interes.OpinionDesarrollo interes165 = Interes.OpinionDesarrollo.ES_ESENCIAL_PARA_EL_EXITO_DEL_PROYECTO;
        interes165.setValue(new Random().nextInt(10) + 1);
        Interes.HabilidadesConocimientosMejorar interes166 = Interes.HabilidadesConocimientosMejorar.VISUAL_PROGRAMACIÓN_EN_LENGUAJES_ESPECIFICOS;
        interes166.setValue(new Random().nextInt(10) + 1);
        Interes.InteresesColaborar interes167 = Interes.InteresesColaborar.INVESTIGACION_EN_INTELIGENCIA_ARTIFICIAL_Y_APRENDIZAJE;
        interes167.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasNecesariasSoftware interes168 = Interes.HerramientasNecesariasSoftware.ACCESO_A_CURSOS_Y_TUTORIALES_EN_LINEA;
        interes168.setValue(new Random().nextInt(10) + 1);
        Interes.EventosInteresAsistir interes169 = Interes.EventosInteresAsistir.PROGRAMAS_DE_INTERCAMBIO_Y_VIAJES_DE_ESTUDIO;
        interes169.setValue(new Random().nextInt(10) + 1);
        Interes.ColaboracionIntercambio interes170 = Interes.ColaboracionIntercambio.INTERCAMBIO_DE_EXPERIENCIAS_Y_PRÁCTICAS_EN_PROYECTOS;
        interes170.setValue(new Random().nextInt(10) + 1);
        interQuem17Int.add(interes161.getValue());
        interQuem17Int.add(interes162.getValue());
        interQuem17Int.add(interes163.getValue());
        interQuem17Int.add(interes164.getValue());
        interQuem17Int.add(interes165.getValue());
        interQuem17Int.add(interes166.getValue());
        interQuem17Int.add(interes167.getValue());
        interQuem17Int.add(interes168.getValue());
        interQuem17Int.add(interes169.getValue());
        interQuem17Int.add(interes170.getValue());
        amigos.agregarUsuario(new Usuario("JUAN", "ARISTIZABAL", "JUAN.ARISTIZABAL@UDLA.EDU.EC", "MASCULINO", "ESTUDIANTE", 4, interQuem17Int));

        List<Integer> interQuem18Int = new ArrayList<>();
        Interes.AreaInteres interes171 = Interes.AreaInteres.DESARROLLO_APLICACIONES_MOVILES;
        interes171.setValue(new Random().nextInt(10) + 1);
        Interes.MetodologiaDesarrollo interes172 = Interes.MetodologiaDesarrollo.AGILE;
        interes172.setValue(new Random().nextInt(10) + 1);
        Interes.LenguajeProgramacion interes173 = Interes.LenguajeProgramacion.JAVA;
        interes173.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasDesarrollo interes174 = Interes.HerramientasDesarrollo.NETBEANS;
        interes174.setValue(new Random().nextInt(10) + 1);
        Interes.OpinionDesarrollo interes175 = Interes.OpinionDesarrollo.ES_IMPORTANTE_PERO_NO_ES_CRUCIAL;
        interes175.setValue(new Random().nextInt(10) + 1);
        Interes.HabilidadesConocimientosMejorar interes176 = Interes.HabilidadesConocimientosMejorar.DISEÑO_DE_SOFTWARE_Y_ARQUITECTURA;
        interes176.setValue(new Random().nextInt(10) + 1);
        Interes.InteresesColaborar interes177 = Interes.InteresesColaborar.DESARROLLO_DE_APLICACIONES_PARA_ORGANIZACIONES_SIN_FINES_DE_LUCRO;
        interes177.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasNecesariasSoftware interes178 = Interes.HerramientasNecesariasSoftware.ACCESO_A_HERRAMIENTAS_DE_DESARROLLO_Y_SOFTWARE_PROFESIONAL;
        interes178.setValue(new Random().nextInt(10) + 1);
        Interes.EventosInteresAsistir interes179 = Interes.EventosInteresAsistir.TALLERES_Y_SESIONES_DE_FORMACION;
        interes179.setValue(new Random().nextInt(10) + 1);
        Interes.ColaboracionIntercambio interes180 = Interes.ColaboracionIntercambio.INTERCAMBIO_DE_EXPERIENCIAS_Y_PRÁCTICAS_EN_PROYECTOS;
        interes180.setValue(new Random().nextInt(10) + 1);
        interQuem18Int.add(interes171.getValue());
        interQuem18Int.add(interes172.getValue());
        interQuem18Int.add(interes173.getValue());
        interQuem18Int.add(interes174.getValue());
        interQuem18Int.add(interes175.getValue());
        interQuem18Int.add(interes176.getValue());
        interQuem18Int.add(interes177.getValue());
        interQuem18Int.add(interes178.getValue());
        interQuem18Int.add(interes179.getValue());
        interQuem18Int.add(interes180.getValue());
        amigos.agregarUsuario(new Usuario("JOSE", "CARRERA", "JOSE.CARRERA.MONTESDEOCA@UDLA.EDU.EC", "MASCULINO", "ESTUDIANTE", 4, interQuem18Int));

        List<Integer> interQuem19Int = new ArrayList<>();
        Interes.AreaInteres interes181 = Interes.AreaInteres.DESARROLLO_APLICACIONES_MOVILES;
        interes181.setValue(new Random().nextInt(10) + 1);
        Interes.MetodologiaDesarrollo interes182 = Interes.MetodologiaDesarrollo.AGILE;
        interes182.setValue(new Random().nextInt(10) + 1);
        Interes.LenguajeProgramacion interes183 = Interes.LenguajeProgramacion.JAVA;
        interes183.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasDesarrollo interes184 = Interes.HerramientasDesarrollo.NETBEANS;
        interes184.setValue(new Random().nextInt(10) + 1);
        Interes.OpinionDesarrollo interes185 = Interes.OpinionDesarrollo.ES_IMPORTANTE_PERO_NO_ES_CRUCIAL;
        interes185.setValue(new Random().nextInt(10) + 1);
        Interes.HabilidadesConocimientosMejorar interes186 = Interes.HabilidadesConocimientosMejorar.DISEÑO_DE_SOFTWARE_Y_ARQUITECTURA;
        interes186.setValue(new Random().nextInt(10) + 1);
        Interes.InteresesColaborar interes187 = Interes.InteresesColaborar.DESARROLLO_DE_APLICACIONES_PARA_ORGANIZACIONES_SIN_FINES_DE_LUCRO;
        interes187.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasNecesariasSoftware interes188 = Interes.HerramientasNecesariasSoftware.ACCESO_A_CURSOS_Y_TUTORIALES_EN_LINEA;
        interes188.setValue(new Random().nextInt(10) + 1);
        Interes.EventosInteresAsistir interes189 = Interes.EventosInteresAsistir.CONFERENCIAS_Y_SEMINARIOS;
        interes189.setValue(new Random().nextInt(10) + 1);
        Interes.ColaboracionIntercambio interes190 = Interes.ColaboracionIntercambio.MENTORIA_Y_TUTORIA_MUTUA;
        interes190.setValue(new Random().nextInt(10) + 1);
        interQuem19Int.add(interes181.getValue());
        interQuem19Int.add(interes182.getValue());
        interQuem19Int.add(interes183.getValue());
        interQuem19Int.add(interes184.getValue());
        interQuem19Int.add(interes185.getValue());
        interQuem19Int.add(interes186.getValue());
        interQuem19Int.add(interes187.getValue());
        interQuem19Int.add(interes188.getValue());
        interQuem19Int.add(interes189.getValue());
        interQuem19Int.add(interes190.getValue());
        amigos.agregarUsuario(new Usuario("CAMILA", "CABRERA", "CAMILA.CABRERA.TAPIA@UDLA.EDU.EC", "FEMENINO", "ESTUDIANTE", 4, interQuem19Int));

        List<Integer> interQuem20Int = new ArrayList<>();
        Interes.AreaInteres interes191 = Interes.AreaInteres.INTELIGENCIA_ARTIFICIAL_Y_APRENDIZAJE_AUTOMATICO;
        interes191.setValue(new Random().nextInt(10) + 1);
        Interes.MetodologiaDesarrollo interes192 = Interes.MetodologiaDesarrollo.WATERFALL;
        interes192.setValue(new Random().nextInt(10) + 1);
        Interes.LenguajeProgramacion interes193 = Interes.LenguajeProgramacion.PYTHON;
        interes193.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasDesarrollo interes194 = Interes.HerramientasDesarrollo.ECLIPSE;
        interes194.setValue(new Random().nextInt(10) + 1);
        Interes.OpinionDesarrollo interes195 = Interes.OpinionDesarrollo.ES_IMPORTANTE_PERO_NO_ES_CRUCIAL;
        interes195.setValue(new Random().nextInt(10) + 1);
        Interes.HabilidadesConocimientosMejorar interes196 = Interes.HabilidadesConocimientosMejorar.METODOLOGIAS_AGILES_Y_DE_GESTION_DE_PROYECTOS;
        interes196.setValue(new Random().nextInt(10) + 1);
        Interes.InteresesColaborar interes197 = Interes.InteresesColaborar.PARTICIPACION_EN_HACKATHONS_O_COMPETENCIAS_DE_PROGRAMACION;
        interes197.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasNecesariasSoftware interes198 = Interes.HerramientasNecesariasSoftware.ASESORAMIENTO_Y_MENTORIA_DE_PROFESIONALES_EXPERIMENTADOS;
        interes198.setValue(new Random().nextInt(10) + 1);
        Interes.EventosInteresAsistir interes199 = Interes.EventosInteresAsistir.JORNADAS_DE_PUERTAS_ABIERTAS_Y_EVENTOS_DE_NETWORK;
        interes199.setValue(new Random().nextInt(10) + 1);
        Interes.ColaboracionIntercambio interes200 = Interes.ColaboracionIntercambio.MENTORIA_Y_TUTORIA_MUTUA;
        interes200.setValue(new Random().nextInt(10) + 1);
        interQuem20Int.add(interes191.getValue());
        interQuem20Int.add(interes192.getValue());
        interQuem20Int.add(interes193.getValue());
        interQuem20Int.add(interes194.getValue());
        interQuem20Int.add(interes195.getValue());
        interQuem20Int.add(interes196.getValue());
        interQuem20Int.add(interes197.getValue());
        interQuem20Int.add(interes198.getValue());
        interQuem20Int.add(interes199.getValue());
        interQuem20Int.add(interes200.getValue());
        amigos.agregarUsuario(new Usuario("OSCAR", "ALBUJA", "OSCAR.ALBUJA@UDLA.EDU.EC", "MASCULINO", "ESTUDIANTE", 4, interQuem20Int));

        List<Integer> interQuem21Int = new ArrayList<>();
        Interes.AreaInteres interes201 = Interes.AreaInteres.INTELIGENCIA_ARTIFICIAL_Y_APRENDIZAJE_AUTOMATICO;
        interes201.setValue(new Random().nextInt(10) + 1);
        Interes.MetodologiaDesarrollo interes202 = Interes.MetodologiaDesarrollo.SCRUM;
        interes202.setValue(new Random().nextInt(10) + 1);
        Interes.LenguajeProgramacion interes203 = Interes.LenguajeProgramacion.PYTHON;
        interes203.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasDesarrollo interes204 = Interes.HerramientasDesarrollo.NETBEANS;
        interes204.setValue(new Random().nextInt(10) + 1);
        Interes.OpinionDesarrollo interes205 = Interes.OpinionDesarrollo.ES_ESENCIAL_PARA_EL_EXITO_DEL_PROYECTO;
        interes205.setValue(new Random().nextInt(10) + 1);
        Interes.HabilidadesConocimientosMejorar interes206 = Interes.HabilidadesConocimientosMejorar.SEGURIDAD_DE_LA_INFORMACION;
        interes206.setValue(new Random().nextInt(10) + 1);
        Interes.InteresesColaborar interes207 = Interes.InteresesColaborar.DESARROLLO_DE_APLICACIONES_PARA_ORGANIZACIONES_SIN_FINES_DE_LUCRO;
        interes207.setValue(new Random().nextInt(10) + 1);
        Interes.HerramientasNecesariasSoftware interes208 = Interes.HerramientasNecesariasSoftware.ACCESO_A_HERRAMIENTAS_DE_DESARROLLO_Y_SOFTWARE_PROFESIONAL;
        interes208.setValue(new Random().nextInt(10) + 1);
        Interes.EventosInteresAsistir interes209 = Interes.EventosInteresAsistir.CONFERENCIAS_Y_SEMINARIOS;
        interes209.setValue(new Random().nextInt(10) + 1);
        Interes.ColaboracionIntercambio interes210 = Interes.ColaboracionIntercambio.COMPARTIR_RECURSOS_Y_HERRAMIENTAS_UTILES;
        interes210.setValue(new Random().nextInt(10) + 1);
        interQuem21Int.add(interes201.getValue());
        interQuem21Int.add(interes202.getValue());
        interQuem21Int.add(interes203.getValue());
        interQuem21Int.add(interes204.getValue());
        interQuem21Int.add(interes205.getValue());
        interQuem21Int.add(interes206.getValue());
        interQuem21Int.add(interes207.getValue());
        interQuem21Int.add(interes208.getValue());
        interQuem21Int.add(interes209.getValue());
        interQuem21Int.add(interes210.getValue());
        amigos.agregarUsuario(new Usuario("MARÍA", "JIMÉNEZ", "MARIACRISTINA.JIMENEZ@UDLA.EDU.EC", "FEMENINO", "DOCENTE", 4, interQuem21Int));

//        System.out.println(interes1.getValue());
//        System.out.println(interes2.getValue());
    }

    public static Usuario registrarUsuario(AmigoU amigos) {

        List<Interes> intereses = new ArrayList<>();
        Interes interes = new Interes();
        List<Integer> interesesInt = new ArrayList<>();

        String nombre = Consola.leer("¿Cuál es tu nombre?");
        String apellido = Consola.leer("¿Cuál es tu apellido?");
        String email = Consola.leer("¿Cuál es tu email?");
        String genero = Consola.leer("¿Cuál es tu genero?");
        String tipoUsuario = Consola.leer("¿Qué tipo de usuario eres?");
        int semestreCursado = Consola.leerEntero("¿En qué semestre estás?");
        intereses.add(interes.elegirInteres());
        for (Interes i : intereses) {
            interesesInt.add(i.getAreaInteres().getValue());
            interesesInt.add(i.getMetodologiaDesarrollo().getValue());
            interesesInt.add(i.getLenguajeProgramacion().getValue());
            interesesInt.add(i.getHerramientasDesarrollo().getValue());
            interesesInt.add(i.getOpinionDesarrollo().getValue());
            interesesInt.add(i.getHabilidadesConocimientosMejorar().getValue());
            interesesInt.add(i.getInteresesColaborar().getValue());
            interesesInt.add(i.getHerramientasNecesariasSoftware().getValue());
            interesesInt.add(i.getEventosInteresAsistir().getValue());
            interesesInt.add(i.getColaboracionIntercambio().getValue());
        }
        Usuario usuario = new Usuario(nombre, apellido, email, genero, tipoUsuario, semestreCursado, interesesInt);
        amigos.agregarUsuario(usuario);
        System.out.println("-----------------------Usuario Agregado correctamente!-----------------------");
        System.out.println(usuario);
        System.out.println(intereses);
        //System.out.println("AQUI TODOS LOS USUARIOS");
        //amigos.imprimirTodosUsuarios();

        return usuario;
    }

    public static void imprimirtodosUsuario(AmigoU amigos) {
        System.out.println("USUARIOS HARDCODEADOS");
        amigos.imprimirTodosUsuarios();
    }

    public static void main(String[] args) {
        AmigoU amigos = new AmigoU(new ArrayList<>());
        agregarUsuariosPorDefecto(amigos);
        Scanner scanner = new Scanner(System.in);
        int op = -1;
        do {
            System.out.println("-----------------------BIENVENIDO A AMIGOU-----------------------");
            System.out.println("1. Agregar usuario y buscar mas usuarios en común");
            System.out.println("2. Ver todos los usuarios");
            System.out.println("3. Gestionar chats");
            System.out.println("4. Ver comunidades con intereses en común");
            System.out.println("5. Salir");
            op = scanner.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.println("-----------------------MENÚ PRINCIPAL (AMIGOU)------------------------------");
                    // aquí se agregaría un usuario a la aplicación y esta listo para buscar amigos en Comun
                    //con k = 3
                    KNN knn = new KNN(amigos);
                    Usuario usuarioRegistrado = registrarUsuario(amigos);
                    List<Usuario> vecinosMasCercanos = knn.obtenerVecinosMasCercanos(usuarioRegistrado, 3);
                    System.out.println("-----------------------USUARIOS INTERESES SIMILARES (AMIGOU)------------------------------");
                    System.out.println(vecinosMasCercanos);
                    break;
                }
                case 2 -> {// aquí se imprimiria todos los usuarios
                    System.out.println("-----------------------TODOS LOS USUARIOS-----------------------");
                    imprimirtodosUsuario(amigos);
                    break;
                }
                case 3 -> {
                    System.out.println("-----------------------CHATS DE USUARIO-----------------------");
                    break;
                }
                case 4 -> {
                    System.out.println("-----------------------COMUNIDADES DE USUARIOS-----------------------");                    
                    break;
                }
                case 5 -> //salir
                    System.out.println("Fin del programa.");

                default ->
                    System.out.println("Elija una opción valida");
            }
            
        } while (op != 5);
    }
}
