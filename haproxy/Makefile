image-name = ake1/ocelot:haproxy
container-name = ocelot-haproxy

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
	$(image-name)
