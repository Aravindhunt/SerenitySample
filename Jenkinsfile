pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'gradlew clean test aggregate'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'target/site/serenity/**/*', fingerprint: true
        }
    }
}