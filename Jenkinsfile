pipeline {
agent any
    stages {
        stage ('Compile') {
              steps {
                sh 'mvn compile'
                echo "compile successful";

            }
        }
        stage ('Build') {
              steps {
                sh 'mvn clean'
                sh 'mvn package'
                echo "build successful";

            }
        }
        stage ('Test') {
              steps {
                sh 'mvn test'
                echo "test successful";
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
