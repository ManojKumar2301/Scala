ThisBuild / scalaVersion := "3.3.5"

lazy val root = (project in file("."))
  .settings(
    name := "MyScalaProject",
    version := "0.1.0",
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.16"
  )