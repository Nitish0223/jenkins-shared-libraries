def call(){
  echo "Deploying"
  sh "docker compose down && docker compose up -d"
}
