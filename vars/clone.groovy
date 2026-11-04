def call(String url, String branch){
  echo "Cloning git repo"
  git branch: "${branch}",
  url: "${url}"
  echo "git repo cloned"
}
