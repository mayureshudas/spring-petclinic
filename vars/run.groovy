def runproject(){
       sh "service tomcat stop"
       sh "cd /target"
       sh "cp -fR petclinic.war /var/lib/tomcat/webapps"
       sh "service tomcat start"
}
return this
