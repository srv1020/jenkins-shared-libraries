def call(String projectName, String imageTag){
  sh "docker build -t ${ProjectName}:${ImageTag} ."
  echo "image build successfully"
}
