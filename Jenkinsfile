pipeline {
agent any
    stages {
        stage ('Build') {
            steps {
                echo 'Running build phase. '
                mvn compile
                mvn install
                mvn clean install
                mvn clean package
            }
        }
        stage ('Test') {
            steps {
                echo 'Running Test phase. '
                mvn test
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
                mvn exec:java -Dexec.mainClass=com.dakual.helloworld.Main
            }
        }

    }
}