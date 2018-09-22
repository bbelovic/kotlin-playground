package color

import color.Color.*

fun mix(c1: Color, c2: Color) =
        when(setOf(c1, c2)) {
            setOf(BLUE, GREEN) -> "blue - green"
            setOf(RED, GREEN) -> "red - green"
            else -> throw Exception("unknown combination")
        }