# Build
docker build -t dockerbench/service-11:0.1 .

# RUN
docker run --name dockerbench-service-11 -d -it -p 9011:9011 dockerbench/service-11:0.1

# DEL
docker rm dockerbench-service11
docker rmi dockerbench/service-11:v0.1
