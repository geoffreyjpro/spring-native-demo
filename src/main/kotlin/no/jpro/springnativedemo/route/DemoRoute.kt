package no.jpro.springnativedemo.route

import org.apache.camel.builder.RouteBuilder
import org.springframework.stereotype.Component

@Component
class DemoRoute: RouteBuilder() {
    val inFolder: String = "/Users/georekie/git/spring-native-demo/src/test/resources/in"
    val backupFolder: String = "/Users/georekie/git/spring-native-demo/src/test/resources/out"
    override fun configure() {
        from("file://$inFolder?move=$backupFolder&readLock=changed&readLockMinAge=3s")
            .routeId("Demo Route")
            .log("Moving a file")
    }
}