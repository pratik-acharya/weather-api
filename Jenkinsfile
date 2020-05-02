pipeline {
    //agent { docker { image 'maven:3.3.3' } }
    agent any
    stages {
        stage('build') {
            steps {
            	sh 'echo $PATH'
                //sh 'mvn --version'
                sh 'echo "Hello World"'
                sh '''
                    echo "Multiline shell steps works too"
                    echo "Multiline shell steps completed"
                '''
            }
        }
    }
}