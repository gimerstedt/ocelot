image-name = ake1/ocelot:nginx
container-name = ocelot-nginx

build:
	docker build -t $(image-name) .

run:
	docker run \
	-d \
	--restart=always \
	--name $(container-name) \
	$(image-name)
