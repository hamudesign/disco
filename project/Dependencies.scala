package design.hamu

import sbt._

object Dependencies {
  object FS2 {
    private val version = "2.4.0"
    val core = "co.fs2" %% "fs2-core" % version
  }

  object Cats {
    private val version = "2.0.0"
    val core = "org.typelevel" %% "cats-core" % version
    val effect = "org.typelevel" %% "cats-effect" % version
  }
}
