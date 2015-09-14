image-name = ake1/ocelot:httpd
container-name = ocelot-httpd

build:
	docker build -t $(image-name) .

run:
	docker run \
	-d \
	--restart=always \
	--name $(container-name) \
	$(image-name)
