def runproject(){
       
       sh "sudo -u root bash -c' cp -fR target/petclinic.war /var/lib/tomcat/webapps'"
      
       sh "service tomcat restart"
       
}
return this
