import kotlin.math.pow

fun main(args: Array<String>) {
    val point: Point = Point(1.3, 6.1)
    point.Print()
    val coloredPoint: ColoredPoint = ColoredPoint(1.5, 2.3, "Green")
    coloredPoint.Print()
    val line: Line = Line(Point(4.0, 7.4), Point(5.3, 2.21))
    line.Print()
    val coloredLine: ColoredLine = ColoredLine(Point(-3.2, 2.30), Point(6.21, 8.61), "Blue")
    coloredLine.Print()
}
open class Point(_coordX: Double, _coordY: Double) {
    var x: Double
    var y: Double

    init {
        x = _coordX
        y = _coordY
    }

    open fun Print() {
        println("Координаты x: $x")
        println("Координаты y: $y")
    }
}

class ColoredPoint(_coordX: Double, _coordY: Double, _color: String) : Point(_coordX, _coordY) {
    var color: String? = null

    init {
        color = _color
    }

    override fun Print() {
        super.Print()
        println("Цвет: $color")
    }
}

open class Line(_a: Point, _b: Point) {
    var a: Point
    var b: Point
    var length: Double

    init {
        a = _a
        b = _b
        length = Math.sqrt((b.x - a.x).pow(2) + (b.y - a.y).pow(2))
    }

    open fun Print() {
        println("A:")
        println(a.Print())
        println("B:")
        println(b.Print())
        println("Длина AB: $length")
    }
}

class ColoredLine(_a: Point, _b: Point, _color: String) : Line(_a, _b) {
    var color: String

    init {
        color = _color
    }

    override fun Print() {
        super.Print()
        println("Цвет линии: $color")
    }
}

class Polygon() {
    //не поняла как делать
}
