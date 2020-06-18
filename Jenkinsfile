@Library('jenkins-library')_

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                buildmaven()
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
