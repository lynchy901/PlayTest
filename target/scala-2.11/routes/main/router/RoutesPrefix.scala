
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/nathan/Documents/play-java/conf/routes
// @DATE:Tue Apr 18 12:56:21 EDT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
