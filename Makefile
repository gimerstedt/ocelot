names = "httpd" "nginx" "clojure" "golang" "haproxy"

run:
	$(foreach name, $(names), make -C $(name) run;)

pull:
	$(foreach name, $(names), docker pull ake1/ocelot:$(name);)

stop:
	$(foreach name, $(names), docker stop ocelot-$(name);)

rm:
	$(foreach name, $(names), docker rm ocelot-$(name);)
