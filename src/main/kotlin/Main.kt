fun main(){

    //Question1
    people(arrayOf("fauth", "fghj", "xdfghjk"))
    nums(arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62))
    println(names("fghj","dfghj","drtyui").contentToString())

    var age = 10
    ++ age
    println(age)




}
fun people(friends: Array<String>){
    println(friends.contentToString())
}

//fun city(cities: Array<String>){
//    println(cities.uppercase())
//
//}


fun nums(numbers: Array<Int>){
//    println(numbers.sum(1..4))
    println(numbers.indexOf(158))
    numbers.sort()
    println(numbers.contentToString())
}

fun names(n1: String, n2: String, n3: String): Array<String>{
    var result = arrayOf("fghj","dfghj","drtyui")
    return result



}





//fun main(){
//    var age = 19
//    ++age
//    print(age)
//}
