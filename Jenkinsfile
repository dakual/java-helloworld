pipeline {
agent any
    stages {
        stage ('Compile') {
              steps {
                bat label: '', script: 'mvn compile'
                echo "compile successful";

            }
        }
        stage ('Build') {
              steps {
                bat label: '', script: 'mvn clean'
                bat label: '', script: 'mvn package'
                echo "build successful";

            }
        }
        stage ('Test') {
              steps {
                bat label: '', script: 'mvn test'
                echo "test successful";
            }
        }
    }
}
/*
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
*/