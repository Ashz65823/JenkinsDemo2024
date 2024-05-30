pipeline {
    agent any
    stages {
        stage('Checkout') 
        {
            steps 
            {
                git 'https://github.com/Ashz65823/JenkinsDemo2024.git'
            }
        }
        stage('Build on maven') 
        {
            steps 
            {
            	withEnv(["PATH+MAVEN=${tool 'HOME_MAVEN'}/bin"])
            	{
            	script
            	{
                bat 'mvn clean package'
                }
               }
            }
        }
    }
}