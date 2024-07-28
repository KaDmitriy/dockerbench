# Build
docker build -t dockerbench/service-10:0.1 .

# RUN
docker run --name dockerbench-service-10 -d -it -p 9010:9010 dockerbench/service-10:0.1

# DEL
docker rm dockerbench-service-10
docker rmi dockerbench/service-10:v0.1
