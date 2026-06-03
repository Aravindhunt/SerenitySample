stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'gradlew clean test'
            }
        }

        stage('Generate Report') {
            steps {
                bat 'gradlew aggregate'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: '**/target/site/serenity/**'
        }
    }
}

