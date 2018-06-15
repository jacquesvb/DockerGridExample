###Start using Docker Compose
docker-compose up -d
###Scale up
docker-compose scale chromenode=3
###Logs
docker logs selenium-hub
###Stop and remove images
docker-compose stop
docker-compose rm
###Stop all containers
docker stop $(docker ps -a -q)
###Remove all containers
docker rm $(docker ps -a -q)

