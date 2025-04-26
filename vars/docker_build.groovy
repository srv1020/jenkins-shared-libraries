def call(String projectName, String imageTag){
  sh "docker build tag ${projectName}:${imageTag} ."
  echo "image build successfully"
}
