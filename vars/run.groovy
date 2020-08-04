def runproject(){

       sh "cp -fR target/petclinic.war /var/lib/tomcat/webapps"
       sh "service tomcat restart"
       
}
return this
