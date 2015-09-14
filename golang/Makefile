image-name = ake1/ocelot:golang
container-name = ocelot-golang

build:
	docker build -t $(image-name) .

run:
	docker run \
	-d \
	--restart=always \
	--name $(container-name) \
	$(image-name)
