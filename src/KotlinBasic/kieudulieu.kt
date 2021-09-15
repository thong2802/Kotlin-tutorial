package KotlinBasic
fun main() {
    /*
    Everything trong Kotlin đều là đối tượng,
    không còn dữ liệu kiểu nguyên thủy (primitive type) nữa.
    Điều này giúp cho mọi biến đều sử dụng được generic,
    gọi được các function, property hoặc có thể gán được bằng null
     */

    // 1 number
    println("---------------------number--------------------------------")
    var a : Int = 1
    var b : Long = 5L
    var c : Float = 1.0F
    var d  = 1.0
    var e : Double = 10.0
    print(a)
    println()
    print(b)
    println()
    print(c)
    println()
    print(d)
    println()
    print(e)
    println("-----------------------character-----------------------------")
    // 2 Characters
    /*
      Lớp đại diện cho character trong Kotlin là Char. Để biểu diễn một ký tự, ta dùng dấu nháy đơn
     */
    val c1: Char = 'a'
 // val d1: Char = 4 //compiler sẽ báo lỗi

    //Note: Char không được coi là số trong Kotlin. Bởi vậy, việc gán như trên sẽ không thành công

    // 3 boolean
    println("-----------------------boolean-----------------------------")
    //Lớp đại diện cho kiểu Boolean trong Kotlin là Boolean. Boolean có 2 giá trị là true và false. Các toán tử được hỗ trợ cho Boolean là:
    /*
    || - phép tuyển
    && - phép hội
    ! - phủ định
     */

    // 4 String
    println("-----------------------String-----------------------------")
   //Đại diện cho string trong Kotlin là lớp String. String là kiểu immutable. Thành phần của string là các character, có thể truy cập bằng cách dùng []
    var s = "hello"
    s[0]
    print(s)

    // + String template
    // => Kotlin cho phép truyền biến vào string bằng cách sử dụng từ khóa ${}
    val s3 = "abc"
    val str = "$s3.length is ${s3.length}" // "abc.length is 3"


    // 5 Array
    println("-----------------------Array-----------------------------")
    //Lớp đại diện cho mảng trong Kotlin là Array. Việc truy cập vào các phần tử sử dụng get, set hoặc [], size là một thuộc tính của lớp Array.

    val a1 : Array<Int> = arrayOf(1,2,3,4,5,6,7)
    // or
    val a2 : Array<Int> = Array(9,  {
        it * 1
    })

    /*
       Các lớp Array khác¶
       Kotlin có hỗ trợ một số các lớp để chuyên lưu trữ các giá trị nguyên thủy nhằm giảm bớt chi phí boxing:
       ByteArray, ShortArray, IntArray...
       Tuy nhiên thì các lớp này k có quan hệ kế thừa gì với Array. Tuy nhiên, các lớp này vẫn có thuộc tính và function tương tự như Array
     */










}

