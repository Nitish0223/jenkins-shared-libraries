def call(){
   echo "Building docker image"
    sh "docker build -t notes-app:latest ."
}
