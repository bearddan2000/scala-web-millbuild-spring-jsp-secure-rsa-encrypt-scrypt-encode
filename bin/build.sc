import mill._, scalalib._

// `HelloWorld` must match the subdirectory name
object Spring extends ScalaModule {
    def scalaVersion = "2.12.9"

    def ivyDeps = Agg(
      ivy"org.bouncycastle:bcpkix-jdk15on:1.65",
      ivy"org.springframework.boot:spring-boot-starter-web:2.4.2",
      ivy"org.springframework.boot:spring-boot-starter-tomcat:2.4.2",
      ivy"org.apache.tomcat.embed:tomcat-embed-jasper:2.4.2",
      ivy"javax.servlet:jstl:2.4.2",
      ivy"org.springframework.boot:spring-boot-starter-websocket:2.4.2",
      ivy"org.springframework.boot:spring-boot-starter-security:2.4.2",
      ivy"org.springframework.security:spring-security-crypto:5.3.2.RELEASE",
      ivy"org.springframework.security:spring-security-web:5.0.0.RELEASE",
      ivy"org.springframework.security:spring-security-core:5.0.0.RELEASE",
      ivy"org.springframework.security:spring-security-config:5.0.0.RELEASE",
      ivy"commons-codec:commons-codec:1.15",
      ivy"javax.xml.bind:jaxb-api:2.3.1",
      ivy"org.webjars:webjars-locator-core:0.46",
      ivy"org.webjars:bootstrap:3.3.7",
      ivy"org.webjars:jquery:3.1.1-1",
      ivy"org.webjars:sockjs-client:1.0.2",
      ivy"org.webjars:stomp-websocket:2.3.3"
    )
}
