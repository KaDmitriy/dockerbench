# Build
docker build -t dockerbench/service1:0.1 .

# RUN
docker run --name dockerbench-service1 -d -it -p 9080:8080 dockerbench/service1:v0.1

# DEL
docker rm dockerbench-service1
docker rmi dockerbench/service1:v0.1
