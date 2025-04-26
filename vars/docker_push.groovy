def call(String projectName, String imageTag, String dockerHubUser){
                withCredentials([usernamePassword('credentialsId':"dockerHubCred", 
                usernameVariable:"dockerHubUser", 
                passwordVariable:"dockerHubPass")])
                sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
                sh "docker push ${dockerHubUser}/${projectName}:${imageTag}"
  echo "docker push completed"
}
