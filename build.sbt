
name := """play-birt-example"""
organization := "pme123"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.6"

// main versions
lazy val scalaV = "2.12.6"
lazy val bindingV = "11.0.1"
lazy val jQueryV = "2.2.4"
lazy val sloggingV = "0.6.1"
lazy val scalaTestV = "3.0.4"

libraryDependencies ++= Seq(
  ws
  , guice
  , jdbc
  , "org.apache.commons" % "commons-email" % "1.5"
  // json
  , "org.julienrf" %% "play-json-derived-codecs" % "4.0.0"
  // enumerations
  , "com.beachape" %% "enumeratum-play-json" % "1.5.14"

  // logging lib that also works with ScalaJS
  , "biz.enef" %% "slogging" % sloggingV
  , "biz.enef" %% "slogging-slf4j" % sloggingV

  // apache commons
  , "commons-io" % "commons-io" % "2.6"
  , "commons-codec" % "commons-codec" % "1.11"
  // webjars for Semantic-UI
  , "org.webjars" %% "webjars-play" % "2.6.1"
  , "org.webjars" % "jquery" % jQueryV

  // twitter for test business case
  , "org.twitter4j" % "twitter4j-core" % "3.0.5"

  // report
  , "org.eclipse.birt.runtime" % "org.eclipse.birt.runtime" % "4.6.0-20160607" excludeAll ExclusionRule("org.milyn", "flute")
  , "org.apache.poi" % "poi" % "3.17"
  // TEST
  , "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
  , "com.typesafe.akka" %% "akka-testkit" % "2.5.6" % Test
  , "org.scalamock" %% "scalamock" % "4.1.0" % Test
  , "com.h2database" % "h2" % "1.4.192"
  , "org.subethamail" % "subethasmtp" % "3.1.7" % Test

)

dependencyOverrides ++= Seq(
  "org.eclipse.scout.sdk.deps" % "org.eclipse.core.runtime" % "3.12.0.v20160606-1342"
  , "org.eclipse.scout.sdk.deps" % "org.eclipse.osgi" % "3.11.0.v20160603-1336"
  , "org.eclipse.scout.sdk.deps" % "org.eclipse.core.jobs" % "3.8.0.v20160509-0411"
  , "org.eclipse.scout.sdk.deps" % "org.eclipse.equinox.common" % "3.8.0.v20160509-1230"
  , "org.eclipse.scout.sdk.deps" % "org.eclipse.equinox.registry" % "3.6.100.v20160223-2218"
  , "org.eclipse.scout.sdk.deps" % "org.eclipse.equinox.preferences" % "3.6.0.v20160120-1756"
  , "org.eclipse.scout.sdk.deps" % "org.eclipse.core.contenttype" % "3.5.100.v20160418-1621"
  , "org.eclipse.scout.sdk.deps" % "org.eclipse.core.resources" % "3.11.0.v20160503-1608"
)
