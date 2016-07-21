package training
/**
 * Created by lgonzalez on 20/07/16.
 */
class GuitarraAcustica  implements Guitarra{
    @Override
    void tocar() {
        println("Guitarra acustica tocando!!")
    }

    @Override
    void dejarDeTocar() {
        println("Guitarra acustica deja de tocar!!")
    }

    @Override
    String toString() {
        return "\nGuitarra Acustica"
    }
}
