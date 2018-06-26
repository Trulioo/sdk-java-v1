lazy val root = (project in file(".")).
  settings(
    organization := "com.trulioo",
    name := "normalizedapi",
    version := "1.0.0",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq("-feature"),
    javacOptions in compile ++= Seq("-Xlint:deprecation"),
    publishArtifact in (Compile, packageDoc) := false,
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
      "io.swagger" % "swagger-annotations" % "1.5.15",
      "com.squareup.okhttp3" % "okhttp" % "3.9.1",
      "com.squareup.okhttp3" % "logging-interceptor" % "3.9.1",
      "com.google.code.gson" % "gson" % "2.8.1",
      "joda-time" % "joda-time" % "2.9.9" % "compile",
      "junit" % "junit" % "4.12" % "test",
      "com.novocode" % "junit-interface" % "0.10" % "test"
    )
  )
