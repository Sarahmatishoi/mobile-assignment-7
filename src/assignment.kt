fun main() {
    oddNumbers()
    counties()
    robot(5)
    robot(13)
    robot(20)
    numbers()
}
fun oddNumbers(){
    for (num in 1..100)
        if(num%2!=0){
            println(num)
        }
}
fun counties(){
  var names= arrayOf("Nairobi","Kisumu","Embu","Kiambu","Machakos","Meru")
  for (county in names)
      if(county.length>5){
          println(county)
      }
}
fun robot(age:Int){
    if (age<6){
        println("serve a glass of milk for guest")
    }
    else if(age in 6..15){
        println("serve a bottle of fanta orange for the guest")
    }
    else{
        println("serve the s bottle of coca cola for the guest")
    }
}
fun numbers() {
    for (numbers in 1..100){

        if (numbers % 3 == 0 && numbers % 5 == 0) {
            println("FizzBUzz")
        }
        else if (numbers % 3 == 0) {
            println("Fizz")
        }
        else if (numbers % 5 == 0) {
        println("Buzz")
       }
        else {
        println(numbers)
       }
  }
}


