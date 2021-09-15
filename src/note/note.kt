package note

class note {
}

fun main() {
    // A). Null safety¶
    //Kotlin cung cấp cả 2 kiểu là non-null và nullable(như trong Java).
    //Mặc định, kiểu của biến là non-null. Để khai báo một biến kiểu nullable, ta sử dụng ?
    var e: String? = null
    //Với một biến non-null, việc gán null sẽ là không thể
//  var e: String = null //compiler báo lỗi

    // B). Safe call : Sử dụng dấu ? để safe call
    e?.length
    //Trong trường hợp này, nếu biến e null, kết quả trả về sẽ là null. Ngược lại, kết quả là độ dài của xâu e.


    // C). Toán tử elvis ?:
    //Bình thường, để gán giá trị cho một biến, ta làm như thế này
    var b : String? = "hello"
    var l : Int = if (b != null) b.length else -1
    //Với toán tử elvis, ta có thể làm như thế này
    val l1 : Int = b?.length ?: -1
    //Nếu b khác null, l = b.length, nếu b null, l = -1

    // D). Toán tử !!
    val h  = b!!.length
    // Với !!, nếu b không null, l = b.length. Nếu b null, NPE sẽ được throw
    // -> Với Kotlin, NPE xuất hiện nếu nó được yêu cầu một cách tường minh chứ không thể xuất hiện nếu bạn không mong muốn


    // E). Toán tử so sánh
    /*
    Trong Kotlin, có 2 loại đẳng thức:
  +  Referential equality: 2 references trỏ tớ cùng một object
  +   Structural equality: function equals
     */

    //+Referential equality : Toán tử === và khác là !==. a === b khi và chỉ khi a và b cùng trỏ đến cùng một object
    //+Structural equality : Toán tử == và khác !=. Theo quy ước, khi gọi a == b, compiler sẽ tự động translate thành
  //  a?equals(b) ?: (b===null)
    //Note: Lưu ý: khi sử dụng a==null, mặc định compiler sẽ tự động chuyển thành a===null





}