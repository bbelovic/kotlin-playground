package geometry

class Rectangle(val width: Int, val height: Int) {
    val isSquare: Boolean get() {return width == height}
}