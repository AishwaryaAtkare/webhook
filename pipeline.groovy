pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                echo "abcd"
            }
        }
        stage('Test') { 
            steps {
                echo "Aish"
            }
        }
        stage('Deploy') { 
            steps {
                echo "Aish"
            }
        }
        stage('proc') { 
            steps {
                echo "final product"
            }
        }
    }
}
