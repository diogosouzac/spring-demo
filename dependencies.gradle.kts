dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            version("guava", "31.1-jre")
            version("kotlin", "1.7.10")
            version("springBoot", "2.7.3")
            version("taskTree", "1.5")
            version("pact", "4.0.10")
            version("openapi", "5.4.0")
            version("asciidoctor", "3.3.2")
            version("moduleDependencyGraph", "0.10")

            // We cannot upgrade to 8.0.28 until we are ready to switch to TLS v1.2 (by upgrading Aurora MySQL to 1.23.1+)
            version("mysqlConnector", "8.0.27")

            // We manage these lib versions implicitly via Spring Boot
            library("apacheHttpClient", "org.apache.httpcomponents", "httpclient").withoutVersion()
            library("commonsLang3", "org.apache.commons", "commons-lang3").withoutVersion()
            library("assertj", "org.assertj", "assertj-core").withoutVersion()
            library("awaitility", "org.awaitility", "awaitility-kotlin").withoutVersion()
            library("bytebuddy", "net.bytebuddy", "byte-buddy").withoutVersion()
            library("groovy", "org.codehaus.groovy", "groovy").withoutVersion()
            library("jacksonModuleKotlin", "com.fasterxml.jackson.module", "jackson-module-kotlin").withoutVersion()
            library("jsonPath", "com.jayway.jsonpath", "json-path").withoutVersion()
            library("junitVintage", "org.junit.vintage", "junit-vintage-engine").withoutVersion()
            library("kotlinStdlibJdk8", "org.jetbrains.kotlin", "kotlin-stdlib-jdk8").withoutVersion()
            library("mockitoInline", "org.mockito", "mockito-inline").withoutVersion()
            library("mysqlConnectorJava", "mysql", "mysql-connector-java").withoutVersion()
            library("restAssured", "io.rest-assured", "rest-assured").withoutVersion()
            library("restAssuredJsonPath", "io.rest-assured", "json-path").withoutVersion()
            library("restAssuredXmlPath", "io.rest-assured", "xml-path").withoutVersion()
            library("springBootStarterDataJpa", "org.springframework.boot", "spring-boot-starter-data-jpa").withoutVersion()
            library("springBootStarterTest", "org.springframework.boot", "spring-boot-starter-test").withoutVersion()
            library("springBootStarterValidation", "org.springframework.boot", "spring-boot-starter-validation").withoutVersion()
            library("springBootStarterWeb", "org.springframework.boot", "spring-boot-starter-web").withoutVersion()
            library("springRabbit", "org.springframework.amqp", "spring-rabbit").withoutVersion()
            library("springRestdocsAsciidoctor", "org.springframework.restdocs", "spring-restdocs-asciidoctor").withoutVersion()
            library("springRestdocsCore", "org.springframework.restdocs", "spring-restdocs-core").withoutVersion()
            library("springRestdocsRestassured", "org.springframework.restdocs", "spring-restdocs-restassured").withoutVersion()
            library("springSecurityCrypto", "org.springframework.security", "spring-security-crypto").withoutVersion()
            library("springSecurityWeb", "org.springframework.security", "spring-security-web").withoutVersion()

            // We manage these library versions explicitly via Dependabot
            library("aerogearOtp", "org.jboss.aerogear", "aerogear-otp-java").version("1.0.0")
            library("archJunit", "com.tngtech.archunit", "archunit-junit5").version("0.22.0")
            library("commonsIo", "org.apache.commons", "commons-io").version("1.3.2")
            library("commonsText", "org.apache.commons", "commons-text").version("1.9")
            library("commonsValidator", "commons-validator", "commons-validator").version("1.7")
            library("datasourceProxy", "net.ttddyy", "datasource-proxy").version("1.7")
            library("dbUnit", "org.dbunit", "dbunit").version("2.7.3")
            library("googleApiClient", "com.google.api-client", "google-api-client").version("1.32.2")
            library("guava", "com.google.guava", "guava").versionRef("guava")
            library("hsJavaDateTimeFormatter", "net.helpscout", "hs-java-datetime-formatter").version("1.0.5")
            library("hsJavaHtmlTranscript", "net.helpscout", "hs-java-html-transcript").version("1.1.4")
            library("imgscalr", "org.imgscalr", "imgscalr-lib").version("4.2")
            library("javaInject", "javax.inject", "javax.inject").version("1")
            library("javaJwt", "com.auth0", "java-jwt").version("3.18.2")
            library("jsoup", "org.jsoup", "jsoup").version("1.14.3")
            library("kotlinCoroutines", "org.jetbrains.kotlinx", "kotlinx-coroutines-core").withoutVersion()
            library("libphonenumber", "com.googlecode.libphonenumber", "libphonenumber").version("8.12.54")
            library("logstashLogbackEncoder", "net.logstash.logback", "logstash-logback-encoder").version("7.1")
            library("lombok", "org.projectlombok", "lombok").version("1.18.24")
            library("metadataExtractor", "com.drewnoakes", "metadata-extractor").version("2.16.0")
            library("mockitoKotlin", "org.mockito.kotlin", "mockito-kotlin").version("4.0.0")
            library("orika", "ma.glasnost.orika", "orika-core").version("1.5.4")
            library("pactJvmSpring", "au.com.dius", "pact-jvm-provider-spring").versionRef("pact")
            library("pactHsKotlinDsl", "net.helpscout", "hs-kotlin-pact-dsl").version("0.3.0")
            library("ravenLogback", "net.kencochrane.raven", "raven-logback").version("6.0.0")
            library("restAssuredKotlinExtensions", "io.rest-assured", "kotlin-extensions").version("4.3.3")
            library("s3", "com.amazonaws", "aws-java-sdk-s3").version("1.12.292")
            library("sentryLogback", "io.sentry", "sentry-logback").version("5.7.4")
            library("testcontainers", "org.testcontainers", "testcontainers").version("1.16.2")
            library("twilio", "com.twilio.sdk", "twilio").version("8.23.0")
            library("vavr", "io.vavr", "vavr").version("0.10.4")
            library("wiremock", "com.github.tomakehurst", "wiremock").version("2.27.2")
            library("ztZip", "org.zeroturnaround", "zt-zip").version("1.14")
            library("zxing", "com.google.zxing", "javase").version("3.4.1")

            // Plugin Libs
            library("kotlinAllOpenPlugin", "org.jetbrains.kotlin", "kotlin-allopen").versionRef("kotlin")
            library("kotlinGradlePlugin", "org.jetbrains.kotlin", "kotlin-gradle-plugin").versionRef("kotlin")
            library("kotlinNoArgPlugin", "org.jetbrains.kotlin", "kotlin-noarg").versionRef("kotlin")
            library("moduleDependencyGraph", "com.savvasdalkitsis", "module-dependency-graph").versionRef("moduleDependencyGraph")
            library("springBootGradlePlugin", "org.springframework.boot", "spring-boot-gradle-plugin").versionRef("springBoot")
            library("taskTreePlugin", "gradle.plugin.com.dorongold.plugins", "task-tree").versionRef("taskTree")
            library("pactPlugin", "gradle.plugin.au.com.dius", "pact-jvm-provider-gradle").versionRef("pact")
            library("openapiGeneratorCustomizations", "net.helpscout.openapi", "openapi-generator-customizations").version("0.0.2")

            // Plugins
            plugin("spring-boot", "org.springframework.boot").versionRef("springBoot")
            plugin("task-tree", "com.dorongold.task-tree").versionRef("taskTree")
            plugin("pact", "au.com.dius.pact").versionRef("pact")
            plugin("asciidoctor", "org.asciidoctor.jvm.convert").versionRef("asciidoctor")
            plugin("module-dependency-graph", "com.savvasdalkitsis.module-dependency-graph").versionRef("moduleDependencyGraph")
            plugin("openapi", "org.openapi.generator").versionRef("openapi")
        }
    }
}