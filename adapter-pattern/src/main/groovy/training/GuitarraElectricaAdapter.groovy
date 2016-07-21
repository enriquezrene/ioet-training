package training
/**
 * Created by lgonzalez on 20/07/16.
 */
class GuitarraElectricaAdapter implements Guitarra{

    GuitarraElectrica guitarraElectrica = new GuitarraElectrica()

    @Override
    void tocar() {
        guitarraElectrica.encenderGuitarra()
        guitarraElectrica.sonar()
    }

    @Override
    void dejarDeTocar() {
        guitarraElectrica.apagarGuitarra()
        guitarraElectrica.dejarDeSonar()
    }

    @Override
    String toString() {
        return "\nGuitarra Electrica (Adapter)"
    }
}
