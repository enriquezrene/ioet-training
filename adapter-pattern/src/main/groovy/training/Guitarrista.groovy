package training

/**
 * Created by lgonzalez on 21/07/16.
 */
class Guitarrista {

    void tocarCancion(Guitarra guitarra) {
        guitarra.tocar()
        guitarra.dejarDeTocar()
    }

    @Override
    String toString() {
        return "\nGuitarrista"
    }
}
