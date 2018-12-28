import org.ojalgo.matrix.PrimitiveMatrix
import org.ojalgo.okalgo.populate
import org.ojalgo.okalgo.primitivematrix
import org.ojalgo.okalgo.times
import org.ojalgo.okalgo.vectorOf

/**
 * Maximize P = 40x + 30y
 * x + y + s1 <= 240
 * 2x + y + s2 <= 320
 *
 * x >= 0, y >= 0
 */
fun main(args: Array<String>) {

    val a = primitivematrix(2,2) {
        populate(
                1.0, 1.0,
                2.0, 1.0
        )
    }


    val b = primitivematrix(2,1) {
        populate(
                240,
                320
        )
    }


    println(a.invert() * b)
}