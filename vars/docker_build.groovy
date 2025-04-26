def call(String projectName, String imageTag){
  sh "docker build -t ${projectName}:${imageTag} ."
  echo "image build successfully"
}
