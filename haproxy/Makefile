image-name = ocelot-haproxy
container-name = $(image-name)

build:
	docker build -t $(image-name) .

run:
	docker run \
	-d \
	--name $(container-name) \
	-p 80:80 \
	--link ocelot-golang:ocelot-golang \
	--link ocelot-clojure:ocelot-clojure \
	--link ocelot-nginx:ocelot-nginx \
	--link ocelot-httpd:ocelot-httpd \
	$(container-name)

stoprm:
	-docker stop $(container-name)
	-docker rm $(container-name)

exec:
	docker exec -it $(container-name) /bin/bash

iter: stoprm build run
