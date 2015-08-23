from debian:jessie
maintainer rickard@gimerstedt.se

expose 80

copy ocelot ocelot
cmd ["/ocelot"]
