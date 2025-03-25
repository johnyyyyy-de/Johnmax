fun main() {
    //While loop
    var number = 20
    while (number <= 25){
        println("Number:$number")
        number ++
    }
    // Do while loop
    var count = 1
    do{
        println("Count is $count")
        count ++

    }while (count <= 5)

    //for loop
    for(num in 100..105){
        println("Num is $num")
    }
    for (letter in 'a'..'d'){
        println("letter is $letter")
    }

}