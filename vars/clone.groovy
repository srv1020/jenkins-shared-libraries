def call(String url, String branch){
  git url: "${url}", branch: "${branch}"
  echo "code cloning successful"
}
// String's 'S' should be in caps
