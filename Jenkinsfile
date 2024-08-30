pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                echo 'Application Built'
            }
        }
        stage('Test') {
            steps {
                script {
                    // Compile the Java file
                    sh 'javac HelloWorld.java'
                    sh 'java HelloWorld'
                }
                echo 'Testing...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }

    post {
        always {
            echo 'This will always run'
        }
        success {
            echo 'This will run only if successful'
        }
        failure {
            echo 'This will run only if failed'
        }
    }
}
