run:
	docker run --name ocelot-httpd \
	-d \
	ake1/ocelot:httpd
	docker run --name ocelot-nginx \
	-d \
	ake1/ocelot:nginx
	docker run --name ocelot-clojure \
	-d \
	ake1/ocelot:clojure
	docker run --name ocelot-golang \
	-d \
	ake1/ocelot:golang

stop:
	docker stop ocelot-httpd ocelot-nginx ocelot-clojure ocelot-golang

rm:
	docker rm ocelot-httpd ocelot-nginx ocelot-clojure ocelot-golang

proxy:
	docker run --name ocelot-haproxy \
	-d \
	ake1/ocelot:haproxy
