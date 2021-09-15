package KotlinBasic

class statement {
}

fun main() {
   // a. Cấu trúc if
   /*
   + Trong Kotlin, if là một biểu thức(expression). Bởi vậy, Kotlin không còn toán tử 3 yếu tố Java
   vd : trong java : int a = result ? 1 : 0
    */
    //Kotlin

    var a: Int = if (result) 1 else 0
    // OR
    var r : Int = if (result){
        print("oke")
        1
    }else{
        print("fail")
        0
    }


    //b. Cấu trúc when
    //Cấu trúc when thay thế switch trong Java. Cấu trúc của when là
    when(x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        3 -> print("x == 3")
        else -> {
            print("nothing")
        }
    }
    //Note: else là bắt buộc , trừ khi compiler có thể chứng minh được tất cả cá trường hợp đã được cover. Có thể sử dụng when để thay thế việc sử dụng if else if

    // + Nếu việc xử lý của 1 số trường hợp giống nhau:
    when(x){
        0,1 -> print("x == 1 or x == 2")
        else -> {
            print("nothing")
        }
    }

    // Các trường hợp của when không nhất thiết phải là constant, chúng có thể là một function
    when (x) {
        parseInt(s) -> print("s encodes x")
        else -> print("s does not encode x")
    }
    //Hoặc kiểu dữ liệu
    var result1 = when (s) {
        is String -> s.startsWith("prefix")
        else -> false
    }

    //Có thể sử dụng when để gán giá trị
    var l : Int = when(s){
        "hello" -> 0
        "hi" -> 1
        else -> 2
    }

    //Điều kiện có thể sử dụng để kiểm tra trong khoảng
    val arrayNumber = arrayOf(1,2,3,4,5,6,7,8,9)
    when (x) {
        in 11..20 -> print("x is in the range")
        in arrayNumber -> print("hop le")
        !in 1..9 -> print("outside")
        else -> print("nothing")
    }

    // C. FOR
    //Nếu bạn muốn duyệt qua một array hoặc một list bằng các chỉ số, bạn có thể làm như sau:
    val array = arrayOf(1,2,3,4,5,6,7,8)
    for (i in array.indices){
        print(array[i]) // => 12345678
    }

    //Ngoài ra, bạn có thể sử dụng function withIndex trong thư viện chuẩn:
    val array1 = arrayOf(1,3,2,6,8)
    for (pair in array1.withIndex()) {
        println("element at ${pair.index} is ${pair.value}")
    }

    //result
    //element at 0 is 1
    //element at 1 is 3
    //element at 2 is 2
    //element at 3 is 6
    //element at 4 is 8



    //Một số so sánh
    // +Vòng lặp xuôi
    /*
     java
      for (int i = 1; i <= 11 ; i++) {
       //...
      }
     */
    // kotlin
    for (i in 1..11) {

    }

    //+Vòng lặp bước 2
    /*
    for (int i = 1; i <= 11 ; i+=2) {
      //...
    }
     */
    // kotlin
    for (i in 1..11 step 2){

    }
    //Vòng lặp lùi
    /*
     for (int i = 10; i>=0;i--) {
       //...
     }
     */
    //kotlin
    for (i in 11 downTo 1){

    }
    //Vòng lặp từng giá trị
    /*
     for (String s : arrayList) {
       //...
      }
     */
    //kotlin
    for (item: Int in ints){

    }





}