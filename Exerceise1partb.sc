object Exerceise1partb {
 val list5 = List(1,2,3,4,5,6,7,8,9)              //> list5  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
 val oddNums5 = list5.filter( (x: Int) => x%2 != 0)
                                                  //> oddNums5  : List[Int] = List(1, 3, 5, 7, 9)
                                                  
 for (n <- oddNums5) {println(n)}                 //> 1
                                                  //| 3
                                                  //| 5
                                                  //| 7
                                                  //| 9
                                                  
                                                 
 
 def factorial(n: Int): Int = {
    if (n == 0) 1 else n * factorial(n - 1)
    }                                             //> factorial: (n: Int)Int
 val list6 = list5.map(x=> x).map(factorial)      //> list6  : List[Int] = List(1, 2, 6, 24, 120, 720, 5040, 40320, 362880)
 val list7 = oddNums5.map(x=> x).map(factorial)   //> list7  : List[Int] = List(1, 6, 120, 5040, 362880)
 for (n <- list7) {println(n)}                    //> 1
                                                  //| 6
                                                  //| 120
                                                  //| 5040
                                                  //| 362880
}