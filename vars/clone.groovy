def call(String branch, String url){
  echo "Cloning git repo"
  git branch: "${branch}",
  url: "${url}"
  echo "git repo cloned"
}
