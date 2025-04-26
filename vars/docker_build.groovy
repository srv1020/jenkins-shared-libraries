def call(String ProjectName, String ImageTag){
  sh "docker build tag ${ProjectName}:${ImageTag} ."
  echo "image build successfully"
}
