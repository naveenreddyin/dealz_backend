name := "dealz_backend"

version := "1.0"

lazy val `dealz_backend` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.10.6"

libraryDependencies ++= Seq( jdbc , anorm , cache , ws,
  "com.typesafe.play" %% "play-slick" % "0.8.1",
  "com.typesafe.play" %% "play-slick-evolutions" % "0.8.1",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "mysql" % "mysql-connector-java" % "5.1.27"
  )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

fork in run := true