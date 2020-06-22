@Library('jenkins-library')_

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
               sh label: '', script: 'sudo yum install maven'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
