def call(String projectName, String imageTag){
  sh "docker build tag ${ProjectName}:${ImageTag} ."
  echo "image build successfully"
}
