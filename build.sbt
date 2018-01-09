lazy val scalaJsMomentJs = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

description := "Scala.js façade for Moment.js"

name := "scala-js-momentjs"

version := "0.2.4"

organization := "io.github.widok"

licenses += "Apache-2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0.html")

homepage := Some(url("https://github.com/diadys/scala-js-momentjs"))

scalaVersion := "2.12.4"

val momentjsVersion = "2.18.1"

libraryDependencies +=
  "org.webjars" % "momentjs" % momentjsVersion

jsDependencies +=
  "org.webjars.bower" % "momentjs" % momentjsVersion / ("momentjs/" + momentjsVersion + "/min/moment-with-locales.min.js")

pomExtra :=
  <scm>
    <url>git://github.com/widok/widok.git</url>
  </scm>
  <developers>
    <developer>
      <id>tindzk</id>
      <name>Tim Nieradzik</name>
      <url>http://github.com/tindzk/</url>
    </developer>
  </developers>
