

organization := "io.vamp"

name := """pulse-api"""

version := "0.7.0-RC3.dev"

scalaVersion := "2.11.5"

publishMavenStyle := true

description := """Pulse api case classes and serializers"""


pomExtra := (<url>http://vamp.io</url>
    <licenses>
      <license>
        <name>The Apache License, Version 2.0</name>
        <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
      </license>
    </licenses>
    <developers>
      <developer>
        <name>Roman Useinov</name>
        <email>roman@magnetic.io</email>
        <organization>VAMP</organization>
        <organizationUrl>http://vamp.io</organizationUrl>
      </developer>
    </developers>
    <scm>
      <connection>scm:git:git@github.com:magneticio/vamp-pulse-api.git</connection>
      <developerConnection>scm:git:git@github.com:magneticio/vamp-pulse-api.git</developerConnection>
      <url>git@github.com:magneticio/vamp-pulse-api.git</url>
    </scm>
  )

val json4sV = "3.2.11"



libraryDependencies ++= Seq(
  "org.json4s" %% "json4s-core" % json4sV,
  "org.json4s" %% "json4s-ext" % json4sV,
  "org.json4s" %% "json4s-native" % json4sV
)

bintrayPublishSettings

bintray.Keys.repository in bintray.Keys.bintray := "vamp"

licenses  += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))

bintray.Keys.bintrayOrganization in bintray.Keys.bintray := Some("magnetic-io")
