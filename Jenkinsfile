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
                sh 'scp target/*.war /opt/tomcat/apache-tomcat-8.5.34/webapps/' 
            }
        }

    }

}
