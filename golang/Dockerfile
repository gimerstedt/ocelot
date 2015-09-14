from golang:1.5
maintainer rickard@gimerstedt.se

expose 80

copy . /go
run go build app.go
cmd ["/go/app"]
