pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        withMaven(maven: 'M3') {
          bat 'mvn clean install'
        }

      }
    }

    stage('Results') {
      steps {
        junit '**/target/surefire-reports/TEST-*.xml'
      }
    }

    stage('Jar') {
      steps {
        archiveArtifacts 'target/*.jar'
      }
    }

  }
}