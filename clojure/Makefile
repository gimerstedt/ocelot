image-name = ake1/ocelot:clojure
container-name = ocelot-clojure

build:
	docker build -t $(image-name) .

run:
	docker run \
	-d \
	--restart=always \
	--name $(container-name) \
	$(image-name)
