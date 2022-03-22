docker image build -t docker-file-demo:1.0 .
docker run --name docker-file-demo -d -p 9090:9090 docker-file-demo:1.0