import microsites._
import design.hamu.Dependencies

lazy val commonSettings = Seq(
  scalaVersion := "2.13.2",
  organization := "design.hamu",
  version := "0.0.1",
  scalacOptions := Seq("-Xlint", "-Ywarn-unused", "-deprecation", "-Ymacro-annotations"),
  dependencyUpdatesFailBuild := true
)

lazy val root = project
  .in(file("."))

lazy val core = project
  .in(file("core"))
  .settings(
    commonSettings
  )

lazy val docs = project
  .in(file("docs"))
  .settings(
    micrositeName := "Disco",
    micrositeCompilingDocsTool := WithTut,
    micrositeBaseUrl := "disco",
    micrositeHomepage := "https://hamudesign.github.io/disco/",
    micrositeHighlightTheme := "atom-one-light",
    git.remoteRepo := "https://github.com/hamudesign/disco.git"
  )
  .enablePlugins(MicrositesPlugin)
