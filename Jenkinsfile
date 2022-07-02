pipeline {
agent any
    stages {
        stage ('Build') {
            steps {
                echo 'Running build phase. '
                sh 'mvn compile'
                sh 'mvn clean package'
            }
        }
        stage ('Test') {
            steps {
                echo 'Running Test phase. '
                sh 'mvn test'
            }
        }
        stage ('QA') {
            steps {
                echo 'Running QA phase. '
            }
        }
        stage ('Deploy') {
            steps {
                echo 'Running Deploy phase. '
            }
        }
        stage ('Monitor') {
            steps {
                echo 'Running Monitor phase. '
                //sh 'mvn exec:java -Dexec.mainClass=com.dakual.helloworld.Main'
            }
        }

    }
}