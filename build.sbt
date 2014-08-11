scalaJSSettings

name := "Scalatags for Virtual Dom"

normalizedName := "scalatags-virtual-dom"

organization := "nz.kiwi.johnson"

scalaVersion := "2.11.1"

crossScalaVersions := Seq("2.10.4", "2.11.1")

version := "0.5.3"

libraryDependencies += "org.scala-lang.modules.scalajs" %%% "scalajs-dom" % "0.6"

libraryDependencies += "com.scalatags" %%% "scalatags" % "0.3.8"

ScalaJSKeys.jsDependencies += ProvidedJS / "virtual-dom.js"