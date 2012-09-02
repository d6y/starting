name := "starting"

organization := "com.dallaway"

resolvers ++= Seq(
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Sonatype Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases"
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.0.M3" % "test",
  "org.scalacheck" %% "scalacheck" % "1.10.0" % "test",
  "com.github.scala-incubator.io" %% "scala-io-core" % "0.4.0",
  "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.0",
   "org.scalaz" %% "scalaz-core" % "6.0.4"
)

// mainClass := Some("Main")

scalaVersion := "2.9.2"

scalacOptions ++= Seq("-unchecked", "-deprecation")

EclipseKeys.withSource := true

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

