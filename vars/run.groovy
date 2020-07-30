def runproject(){
       sh "sudo service tomcat stop"
       sh "sudo cd /target"
       sh "sudo cp -fR petclinic.war /var/lib/tomcat/webapps"
       sh "sudo service tomcat start"
       
}
return this
