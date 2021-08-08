package com.cateim.cursos.android.conversormoneda

import java.math.BigDecimal

fun main() {

    println("** Numeros en Kotlin **")
    val pi = 3.14159264 // val es usado para definir constantes o valores que no cambian
    val numDiasSemana: Byte = 7 // definición del número de días

    var interesPrestamo: Float = 3.5f // var es usado para definir variables (cambian su valor)
    interesPrestamo = 3.1f


    val salarioMinimo = 2000.0f
    val calculo = salarioMinimo * numDiasSemana
    println("En la semana existen : " + numDiasSemana + " dias")

    println("** Caracteres en Kotlin **")
    val letra: Char
    letra = 'A'

    // Se va imprimir en la consola
    println(letra)

    val tab: Char = '\t'
    val saltoLinea = '\n'
    val borrar = '\b'

    println("hola" + tab + tab + "mundo" + saltoLinea + "esta es una nueva linea")

    println("esto es un texto" + borrar)

    println("** Booleanos en Kotlin **")
    val esJueves = false

    println("hoy es jueves? " + esJueves)
    println("hoy no es jueves? " + !esJueves)

    println("** Strings en Kotlin **")
    val tweet = "Hoy es viernes 25 de Junio"
    println(tweet)

    val postFacebook = "El día de mañana sábado\ndormiré hasta las 11:00\t\tgenial!!\n\n \"el que rie al ultimo rie mejor\""

    println(postFacebook)
    println("coma en Joe\'s")

    println("** Arrays en Kotlin **")
    val autos = arrayOf("Audi", "KIA", "Land Rover", "TOYOTA", "BMW")
    println(autos.size)
    println(autos[1]) // acceder a elem de un array por medio de su indice

    println(autos[autos.size - 1])
    println(autos.last())

    println("Iteramos el array")
    for (coche in autos) {
        println(coche)
    }

    val infectados = arrayOf(100, 100, 41, 60, 254, 456, 84, 31, 220)

    // calculamos el promedio
    var total = 0
    for (x in infectados) {
        total = total + x
    }

    // CONVERSION ENTRE TIPOS DE DATOS
    val promedio = total.toFloat() / infectados.size // .toFloat() para convertir un Int a Float
    println("Promedio de Infectados = " + promedio)

    println(pi.toInt())

    println(pi.toString())

    val prom = total.div(9.3f) // total / 9.3f

    val sueldo = "453.7".toFloat()

    val ajuste = sueldo * 1.2

    println("Condiciones y if-else en kotlin")

    // Operadores de Comparacion
    // a < b
    // a > b
    // a >= b
    // a <= b
    // a == b
    // a != b

    if ( promedio > 300.0 ) {
        println("los casos se han disparado a nivel nacional")
    } else {
        println("mantengamos las medidas de bioseguridad")
    }

    println("** if-else if-else en Kotlin**")
    for (a in autos) {
        if ( a == "TOYOTA") {
            println(a + " es industria japonesa")
        } else if (a == "Land Rover") {
            println(a + " es industria inglesa")
        } else if (a == "KIA") {
            println(a + " es industria koreana")
        } else {
            println(a + " es de otro pais")
        }
    }

    if ("TOYOTA" in autos) {
        println("Toyota es una marca japonesa")
    } else {
        println("no lo encuentro")
    }


    println("** when en Kotlin**")
    for (a in autos) {
        when (a) {
            "TOYOTA" -> {
                println(a + " es industria japonesa")
            }
            "Land Rover" -> println(a + " es industria inglesa")
            "KIA" -> println(a + " es industria koreana")
            else -> println(a + " es de otro pais")
        }
    }

    println("** Loop For en Kotlin **")

    for (num in 0..100) {
        println(num)
    }

    // tabla de multiplicar del 9
    val m = 9
    for (n in 1..10) {
        println(m.toString() + " x " + n.toString() + " = " + (m*n))
    }

    for (n in 10 downTo 0) {
        println(m.toString() + " x " + n.toString() + " = " + (m*n))
    }

    // Rangos tambien estan definidos por caracteres
    for (c in 'a'..'m') {
        println(c)
    }

    println("--------------------------------------------")

    // Rangos desde String
    for (c in "Murciélago") {
        println(c)
    }



    saludar()
    println("------------")
    saludar()
    saludar()
    println("------------")
    hola("Juan")
    println("------------")
    incrementoSueldo("Juan", 5000.0)
    incrementoSueldo("Maria", 6000.50)
    println("------------")
    println("El area del circulo es = " + areaCirculo(2.5f) + " u^2")
    println("El area del triangulo es = " + areaTriangulo(52.0f, 15.0f) + " u^2")


    println("** break/continue en kotlin **")

    val resultado = 67.0 % 5.0 // el operador % (modulo) calcula el residuo de una division
    println(resultado)

    for (x in 0..100) {
        if (x == 54) {
            continue
        }

        if ( x % 2 == 0) {
            println(x)
        }

        if (x == 78) {
            break
        }
    }



    // Notacion camel case vs sneake case
    val calculoInteresCompuesto = 0.0
    val calculo_interes_compuesto = 0.0

    // Creamos objetos a partir de la definicion de una Clase
    val toyota = Carro()
    toyota.marca = "TOYOTA"
    toyota.modelo = "Land Cruiser"
    toyota.anio = 1984

    val tesla = Carro()
    tesla.marca = "TESLA"
    tesla.modelo = "X3"
    tesla.anio = 2017

    val audi = Carro()
    tesla.marca = "AUDI"
    tesla.modelo = "Brilliant"
    tesla.anio = 1990

    val stockCoches = arrayOf(toyota, tesla, audi)

    // Que coches son antes del año 2000 en tu stock?
    for (c in stockCoches) {
        if (c.anio < 2000) {
            println(c.marca + " - " + c.modelo)
        }
    }

    // Constructores en Clases
    val emp1 = Empleado("Juan Perez", 3600.0, "451236554", "Mecanico")
    val emp2 = Empleado("Maria Soliz", 6100.0, "45122211", "Secretaria")
    val emp3 = Empleado("Pedro Picasso", 4500.0, "4365188854", "Vendedor")
    val emp4 = Empleado("Juana Godines", 5850.0, "4554202021", "Mecanico")

    emp2.genero = "F"
    emp4.genero = "F"

    val nominaEmpleados = arrayOf(emp1, emp2, emp3, emp4)

    for (e in nominaEmpleados) {
        incrementoSueldo(e.nombre, e.sueldo)
    }

    println("-----------------------------------------------------")
    val fido = Perro("Fido", "San Bernardo", 15)
    val hitler = Perro("Hitler", "Dobberman", 9)

    fido.comer(300)
    fido.ladrar()
    println("Fido energia = " + fido.energia)

    hitler.comer(1500)

    hitler.atacar(fido)

    fido.morir()

    println("Fido energia = " + fido.energia)
    println("Hitler energia = " + hitler.energia)

    val garfield = Gato("Garfield", "siames")

    garfield.maullar()

    garfield.comer(300)

    garfield.morir()





    val resultadoFinal = 6.96f / 6.96f

    println(resultadoFinal)

    val monto = BigDecimal(6.96)

    val conversion = monto.div(BigDecimal(6.96))
    println(conversion.toDouble())

    val esMiercoles = true

    if (!esMiercoles) {
        println("Ok media semana")
    }

}


// Una funcion que solo realiza una accion se le conoce tambien como Método
fun saludar() {
    println("Hola humanos")
    println("Chao")
}

// Funciones/Metodos con parámetros
fun hola(nombre: String) {
    println("Que tal " + nombre)
}

// Funciones/Metodos con múltiples parámetros
fun incrementoSueldo(nombre: String, sueldo: Double) {
    val incremento = sueldo * 1.20
    println(nombre + " tu incremento salarial fue de " + incremento)
}

// Funciones que devuelven un valor
fun areaCirculo(radio: Float): Double {
    val pi = 3.141592
    val area = pi * radio * radio
    return area
}

fun areaTriangulo(base: Float, altura: Float) = (base * altura) / 2






class Carro {
    var marca: String = ""
    var modelo: String = ""
    var anio: Int = 0
}

class Empleado(var nombre: String, var sueldo: Double, var documento: String, var cargo: String) {
    var genero: String = "M"
}

class Perro(var nombre: String, var raza: String, var edad: Int): SerVivo() {
    fun ladrar() {
        println("Wof Wof!!")
    }

    fun atacar(otro: Perro) {
        if (energia > 10) {
            println("Grrrr")
            energia = energia - 10
            otro.energia = otro.energia - 20
        }
    }
}

class Gato(var nombre: String, var raza: String): SerVivo() {
    fun maullar() {
        println("Miau!!")
    }

}

open class SerVivo {
    var energia = 100

    fun comer(calorias: Int) {
        energia = energia + calorias
    }

    fun morir() {
        energia = 0
    }
}


// Se recomienda usar la notacion Camel Case