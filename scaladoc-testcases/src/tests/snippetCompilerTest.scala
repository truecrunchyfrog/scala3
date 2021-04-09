package snippetCompiler

/**
  * ```scala sc:compile
  * //{
  * import scala.collection.Seq
  * //}
  *
  * def a = 2
  * val x = 1 + List()
  * a
  *
  * try {
  *   2+3
  * }
  *
  * /*
  *   Huge comment
  * */
  * val xd: String = 42
  *
  * def a(i: Int): Boolean = i match // This is a function
  *   case 1 => true
  *
  * val b: Int = 2.3 /* Also quite a big comment */
  *
  * val d: Long = "asd"
  * ```
  *
  * ```scala sc:fail
  * def a = 2
  * val x = 1 + List()
  * a
  * ```
  *
  * ```scala sc:fail
  * def a = 2
  * ```
  *
  * ```scala sc:nocompile
  * def a = 3
  * a()
  * ```
  */
class A { }

/**
 * ```scala sc:compile
 * val c: Int = 4.5
 * ```
 */
class B { }