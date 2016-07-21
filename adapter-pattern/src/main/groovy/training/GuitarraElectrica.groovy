package training
/**
 * Created by lgonzalez on 20/07/16.
 */
class GuitarraElectrica {

    private boolean encendida = false

    void encenderGuitarra() {
        encendida = true
        println("Guitarra electrica encendida!!")
    }

    void sonar() {
        if(encendida) {
            println("Guitarra electrica sonando!!")
        }
    }

    void apagarGuitarra() {
        encendida = false
        println("Guitarra electrica apagada!!")
    }

    void dejarDeSonar() {
        if(!encendida) {
            println("Guitarra electrica deja de sonar!!")
        }
    }

    @Override
    String toString() {
        return "\nGuitarra Electrica"
    }
}
