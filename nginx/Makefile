image-name = ocelot-nginx
container-name = $(image-name)

build:
	docker build -t $(image-name) .

run:
	docker run \
	-d \
	--restart=always \
	--name $(container-name) \
	-p 84:80 \
	$(container-name)

stoprm:
	-docker stop $(container-name)
	-docker rm $(container-name)

exec:
	docker exec -it $(container-name) /bin/bash

iter: stoprm build run
