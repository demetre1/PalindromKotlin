fun main(){
    print(Palindrom("race car"))
}

fun Palindrom(x : String): Boolean{

//    var mainString = x.replace(" ", "")
//    var reverse = mainString.reversed().replace(" ", "").toString()
//
//
//    return mainString.equals(reverse, ignoreCase = true);
    var Chars: String = "";
    var C : String = ""
    for (char in x.length -1 downTo 0){

       Chars += x[char]
        if(Chars.contains(" ")){
            C =  Chars.replace(" ", "")

        }


    }

   return C.equals(x.replace(" ",""))
}