package edu.cub.jvm.seminar

import kotlin.math.*

// 1. Data Class (Automatic equals, hashCode, copy)
data class Vector2D(val x: Double, val y: Double) {

    // 2. Secondary Constructors
    constructor(scalar: Double) : this(scalar, scalar)
    constructor() : this(0.0)

    // 7. Enum for Quadrant Logic
    enum class Quadrant { I, II, III, IV, AXIS, ORIGIN }

    // 5. Computed Properties (Getters)
    val magnitude: Double
        get() = sqrt(x * x + y * y)

    // Custom getter with logic
    val quadrant: Quadrant
        get() = when {
            x == 0.0 && y == 0.0 -> Quadrant.ORIGIN
            x == 0.0 || y == 0.0 -> Quadrant.AXIS
            x > 0 && y > 0 -> Quadrant.I
            x < 0 && y > 0 -> Quadrant.II
            x < 0 && y < 0 -> Quadrant.III
            else -> Quadrant.IV
        }

    // 3. Init Block (Validation/Logging)
    init {
        // Example: Warn if values are Infinite (Just to show usage of init)
        if (x.isInfinite() || y.isInfinite()) {
            println("Warning: Creating an infinite vector!")
        }
    }

    // 4. Operator Overloading
    operator fun plus(other: Vector2D) = Vector2D(x + other.x, y + other.y)
    operator fun minus(other: Vector2D) = Vector2D(x - other.x, y - other.y)
    operator fun times(scalar: Double) = Vector2D(x * scalar, y * scalar)
    operator fun unaryMinus() = Vector2D(-x, -y)

    // Operator allows accessing v[0] and v[1] like an array
    operator fun get(index: Int): Double {
        return when(index) {
            0 -> x
            1 -> y
            else -> throw IndexOutOfBoundsException("Vector2D only has indices 0 and 1")
        }
    }

    // 6. Infix Functions
    infix fun dot(other: Vector2D): Double = (x * other.x) + (y * other.y)

    // 9. Custom ToString
    override fun toString(): String = "(%.2f, %.2f)".format(x, y)

    // 8. Companion Object (Constants & Factory)
    companion object {
        val ZERO = Vector2D(0.0, 0.0)
        val UNIT_X = Vector2D(1.0, 0.0)
        val UNIT_Y = Vector2D(0.0, 1.0)

        // Static factory method
        fun fromPolar(radius: Double, thetaDegrees: Double): Vector2D {
            val thetaRad = Math.toRadians(thetaDegrees)
            return Vector2D(
                radius * cos(thetaRad),
                radius * sin(thetaRad)
            )
        }
    }
}

// Extension function to allow "2.0 * vector" (Double * Vector)
operator fun Double.times(v: Vector2D) = v * this

fun main() {
    val v1 = Vector2D(3.0, 4.0)
    val v2 = Vector2D(1.0, 2.0)

    println("Magnitude v1: ${v1.magnitude}") // 5.0

    val sum = v1 + v2           // (4.00, 6.00)
    val scaled = v1 * 2.0       // (6.00, 8.00)
    val dotProd = v1 dot v2     // 3*1 + 4*2 = 11.0

    val v3 = Vector2D.fromPolar(10.0, 45.0)

    // Enum usage
    println(v1.quadrant) // I
    println(Vector2D(-5.0, 2.0).quadrant) // II
}