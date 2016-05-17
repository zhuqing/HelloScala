/**
  *  eated by zhuleqi on 16/5/17.
  */

object HelloWorldS{
  def main(args: Array[String]) {
    val str :String = "Hello world";
    println("Hello world Scala");
    newfunction(str);
  }

  def newfunction(str:String): Unit ={
     println(str);
  }
}
