image-name = ocelot
container-name = $(image-name)

build:
	go build ocelot.go
	docker build -t $(image-name) .

run:
	docker run \
	-d \
	--restart=always \
	--name $(container-name) \
	-p 80:80 \
	$(container-name)

stoprm:
	-docker stop $(container-name)
	-docker rm $(container-name)

exec:
	docker exec -it $(container-name) /bin/bash

iter: stoprm build run
