def call(String ProjectName, String ImageTag){
  echo "this is building of image"
  sh "docker build -t ${ProjectName}:${ImageTag} ."
  echo "image build successfully"
}
