var currentData: Int
var receivedDataFrom: Int
var receivedDataTo: Int

fun main() {
    val currentHumidity = (20..60).random()
    println("Current humidity is $currentHumidity%")
    val modes: Array<String> = arrayOf("1. Auto mode", "2. Set operating time", "3. Set humidity range")
    var selectedMode: Int? = null

    do {
        println("Select mode. Type number from 1 to 3")
        for (i in modes) {
            println(i)
        }
        selectedMode = readLine()?.toIntOrNull()

        if (selectedMode == null || selectedMode < 1 || selectedMode > 3) {
            println("Incorrect value. Please try again")
        }
    } while (selectedMode == null || selectedMode < 1 || selectedMode > 3)

    println("You selected mode \"${modes[selectedMode-1]}\"")

    if (selectedMode == 1)
        firstMode()
    else if (selectedMode == 2)
        secondMode()
    else if (selectedMode == 3)
        thirdMode()
 }

fun firstMode() {
    val rooms: Array<String> =
        arrayOf("1. Children's room", "2. Bedroom", "3. Study room", "4. Other non-specific room")

    var selectedRoom: Int? = null

    do {
        println("Select room. Type number from 1 to 4")
        for (i in rooms) {
            println(i)
        }
        selectedRoom = readLine()?.toIntOrNull()

        if (selectedRoom == null || selectedRoom < 1 || selectedRoom > 4) {
            println("Incorrect value. Please try again")
        }
    } while (selectedRoom == null || selectedRoom < 1 || selectedRoom > 4)

    println("You selected room \"${rooms[selectedRoom - 1]}\"")



}

fun secondMode() {
    println("Here the second mode will be executed")
}

fun thirdMode() {
    println("Here the third mode will be executed")
}

fun matching() {

}

fun deviceOperation() {

}