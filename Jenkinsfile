pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') { 
             steps {
                sh 'mvn -B -DskipTests clean package' 
            }
       }
	stage('Deploy to tomcat') {
             steps {
		sshagent(['8aa1f57f-561d-45c9-85c1-0ef156595a09']) {
			sh 'scp target/*.war djiby@172.16.4.188:/opt/tomcat/apache-tomcat-8.5.34/webapps/'
		}         
            }
 
       }

    }

}
