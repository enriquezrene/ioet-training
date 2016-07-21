package training
/**
 * Created by lgonzalez on 20/07/16.
 */
class Prueba {
    static void main(String[] args) {

        println("------------Ejemplo sin adapter------------")
        GuitarraElectrica electrica = new GuitarraElectrica()
        println(electrica)
        electrica.encenderGuitarra()
        electrica.sonar()
        electrica.apagarGuitarra()
        electrica.dejarDeSonar()

        GuitarraAcustica acustica = new GuitarraAcustica()
        println(acustica)
        acustica.tocar()
        acustica.dejarDeTocar()

        println("------------Ejemplo con Adapter------------")

        Guitarra[] guitarras = [
            new GuitarraAcustica(),
            new GuitarraElectricaAdapter()
        ]

        guitarras.each { g ->
            println(g)
            g.tocar()
            g.dejarDeTocar()
        }

        Guitarrista guitarrista = new Guitarrista()
        println(guitarrista)
        guitarrista.tocarCancion(new GuitarraAcustica())
        guitarrista.tocarCancion(new GuitarraElectricaAdapter())
    }
}