import ch.qos.logback.classic.AsyncAppender
import ch.qos.logback.classic.PatternLayout
import static ch.qos.logback.classic.Level.DEBUG

scan("30 seconds")
def LOG_PATH = "logs"
def LOG_ARCHIVE = "${LOG_PATH}/archive"
//appender("Console-Appender", ConsoleAppender) {
//    encoder(PatternLayoutEncoder) {
//        pattern = "%msg%n"
//    }
//}
appender("File-Appender", FileAppender) {
    file = "logfile11.log"
    encoder(PatternLayoutEncoder) {
        pattern = "%msg%n"
        outputPatternAsHeader = true
    }
}
//appender("RollingFile-Appender", RollingFileAppender) {
//    file = "${LOG_PATH}/rollingfile.log"
//    rollingPolicy(TimeBasedRollingPolicy) {
//        fileNamePattern = "${LOG_ARCHIVE}/rollingfile.log%d{yyyy-MM-dd}.log"
//        maxHistory = 30
//        totalSizeCap = "1KB"
//    }
//    encoder(PatternLayoutEncoder) {
//        pattern = "%msg%n"
//    }
//}
//appender("Async-Appender", AsyncAppender) {
//    appenderRef("RollingFile-Appender")
//}
logger("guru.springframework.blog.logbackgroovy", INFO, ["Console-Appender", "File-Appender", "Async-Appender"], true)
root(DEBUG, ["File-Appender"])