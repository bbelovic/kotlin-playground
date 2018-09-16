package geometry

import java.util.*

fun createRandomRectangle(): Rectangle {
    val rnd = Random()
    return Rectangle(rnd.nextInt(), rnd.nextInt())
}