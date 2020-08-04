def runproject(){

       sh "cp -fR target/spring-petclinic-1.5.1.war /var/lib/tomcat/webapps"
       sh "service tomcat restart"
       
}
return this
