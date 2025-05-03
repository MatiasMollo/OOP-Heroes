import business.*;
import controller.*;

import java.util.Random;

public class main {
    static SuperheroeController controladorDeSuperheroes = new SuperheroeController();
    static VillanoController controladorDeVillanos = new VillanoController();
    static EquipoController controladorDeEquipos = new EquipoController();
    static ArmaController armaController = new ArmaController();
    static TrajeController trajeController = new TrajeController();

    public static void main(String[] args) {
        inicializarTrajes();
        inicializarArmas();
        inicializarSuperheroes();
        inicializarVillanos();
        inicializarEquipos();

        //simulo la pelea con equipos cargados
        simularPelea(controladorDeEquipos.getEquipoSuperHeroe(0),
                controladorDeEquipos.getEquipoVillano(0));
    }

    public static void inicializarEquipos() {
        EquipoSuperHeroe equipoSuperHeroe = new EquipoSuperHeroe("Liga de la Justicia", "La Atalaya", controladorDeSuperheroes.getHeroes(), "Salvar el mundo y proteger la paz");
        EquipoVillano equipoVillano = new EquipoVillano("Legión Oscura", "Castillo secreto", controladorDeVillanos.getVillanos(), "Bajo tierra");
        controladorDeEquipos.agregarEquipoSuperHeroe(equipoSuperHeroe);
        controladorDeEquipos.agregarEquipoVillano(equipoVillano);
    }

    public static void inicializarVillanos() {
        Alienigena alienigena1 = new Alienigena("Brainiac", "Brainiac", "Coleccionar información de todos los planetas", "Inteligencia Suprema", armaController.getArmaByName("Nave"), "OA", "Oaniano");
        Alienigena alienigena2 = new Alienigena("Galactus", "El devorador de mundos", "Alimentarse de planetas", "Absorber fuerza vital del planeta", armaController.getArmaByName("Silver Surfer"), "Plutón", "Plutoniano");
        controladorDeVillanos.agregarVillano(alienigena1);
        controladorDeVillanos.agregarVillano(alienigena2);
    }

    public static void inicializarSuperheroes() {
        Humano humano = new Humano("Iron Man", "Tony Stark", "Inteligencia", trajeController.getTrajeByName("SuperTraje"), 38, "Masculino", "Estadounidense");
        Mutante mutante = new Mutante("Superman", "Clark Kent", "Fuerza Sobrehumana", trajeController.getTrajeByName("Armadura"), "Kripton", "Mutante");
        controladorDeSuperheroes.agregarHumano(humano);
        controladorDeSuperheroes.agregarMutante(mutante);
    }

    public static void inicializarArmas() {
        Arma armaBrainiac = new Arma(50, "Nave", "Nave con forma de calavera con tentáculos", "Activada");
        Arma armaGalactus = new Arma(40, "Silver Surfer", "Secuaz que permite localizar planetas", "Cargado");
        armaController.agregarArma(armaBrainiac);
        armaController.agregarArma(armaGalactus);
    }

    public static void inicializarTrajes() {
        Traje trajeSuperman = new Traje("SuperTraje", "Traje cuerpo entero", "Azul y Rojo", "Fuego");
        Traje trajeIronMan = new Traje("Armadura", "Armadura de caballero moderna", "Plateado", "Agua");
        trajeController.agregarTraje(trajeSuperman);
        trajeController.agregarTraje(trajeIronMan);
    }

    public static void simularPelea(EquipoSuperHeroe equipoSuperheroes, EquipoVillano equipoVillanos) {
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("                INICIO DE LA SIMULACIÓN DE PELEA ENTRE HÉROES Y VILLANOS");
        System.out.println("------------------------------------------------------------------------------------------------");

        /* mostrar información de equipos */
        System.out.println("Detalles de los equipos en batalla: ");

        System.out.println("\nEQUIPO SUPERHEROES:");
        System.out.println("Equipo: " + equipoSuperheroes.getNombre());
        System.out.println("Misión: " + equipoSuperheroes.getMision());
        System.out.println("Base: " + equipoSuperheroes.getBase());
        System.out.println("Miembros:");
        for (SuperHeroe heroe : equipoSuperheroes.getHeroes()) {
            System.out.println("- Héroe: " + heroe.getNombre() +
                    " | Poder: " + heroe.getPoder() +
                    " | Identidad secreta: " + heroe.getIdentidad());
        }

        System.out.println("\nEQUIPO VILLANOS:");
        System.out.println("Equipo: " + equipoVillanos.getNombre());
        System.out.println("Ubicación: " + equipoVillanos.getUbicacion());
        System.out.println("Base: " + equipoVillanos.getBase());
        System.out.println("Miembros:");
        for (Villano villano : equipoVillanos.getVillanos()) {
            System.out.println("- Villano: " + villano.getNombre() +
                    " | Poder: " + villano.getPoder() +
                    " | Alias: " + villano.getAlias());
        }

        System.out.println("\n------------------------------------------------------------------------------------------------");

        /* Calcular el poder de los héroes y villanos en base a cantidad de miembros en equipo y un numero random añadido */
        int poderHeroes = equipoSuperheroes.getHeroes().size() * 10;
        int poderVillanos = equipoVillanos.getVillanos().size() * 10;

        Random r = new Random();
        poderHeroes += r.nextInt(20);
        poderVillanos += r.nextInt(20);

        /* Mostrar los resultados */
        System.out.println("Simulación de la pelea entre '" + equipoSuperheroes.getNombre() + "' y '" + equipoVillanos.getNombre() + "':\n");
        System.out.println("- Poder total de los héroes: " + poderHeroes);
        System.out.println("- Poder total de los villanos: " + poderVillanos);

        System.out.println("\nDeterminando el resultado de la batalla...");
        if (poderHeroes > poderVillanos) {
            System.out.println("- Resultado: ¡Ganaron los héroes!");
        } else if (poderVillanos > poderHeroes) {
            System.out.println("- Resultado: Ganaron los villanos.");
        } else {
            System.out.println("- Resultado: Empate. Ambos equipos se retiran.");
        }

    }

}
