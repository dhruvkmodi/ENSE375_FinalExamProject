pipeline {
  environment {
    registry = "dhruvkmodi/ENSE375_FinalExamProject"
    credentials = 'dhruvkmodi'
    image = '';
  }
  agent any
  tools {
    maven 'Maven 3.6.3'
  }
  stages {
    stage('Build') {
      steps{
        sh 'mvn compile -f ENSE375_FinalExamProject/ENSE375 exam/ENSE375 exam/pom.xml'
      } 
    }

    stage('Test') {
      steps {
        sh 'mvn test -f ENSE375_FinalExamProject/ENSE375 exam/ENSE375 exam/pom.xml'
      }
    }

    stage('Docker Build') {
      steps {
        script {
          image = docker.build registry
        }
      }
    }

    stage('Deploy') {
      steps {
        script {
          docker.withRegistry('', credentials) {
            image.push()
          }
        }
      }
    }

  }
}
