name := "sbt-multiproject"

version := "0.0.1"

organization := "com.example.sbt"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "4.0.0" % "test",
  "junit" % "junit" % "4.11" % "test",
)
