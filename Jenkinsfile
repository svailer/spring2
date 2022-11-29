
node("master") {
	stage('Poll') {
		checkout scm
	}    
  
	stage('Build & Unit test'){
		sh 'mvn -B -ntp -Dmaven.test.failure.ignore verify'
 	}
	stage('Static Code Analysis'){
    		sh 'mvn clean verify sonar:sonar -Dsonar.projectName=example-project -Dsonar.projectKey=example-project -Dsonar.projectVersion=$BUILD_NUMBER';
	}
	stage ('Integration Test'){
    		junit '**/target/surefire-reports/TEST-*.xml'
	}
}

