package main

import (
	"fmt"
	"io"
	"log"
	"net/http"
	"os"
)

func getResource(fileName string) io.Reader {
	fileReader, err := os.Open(fileName)
	if err != nil {
		log.Panic("Failed to open " + fileName)
	}
	return fileReader
}

func handlePage(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Content-Type", "text/html")
	io.Copy(w, getResource("index.html"))
}

func handleCss(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Content-Type", "text/css")
	io.Copy(w, getResource("style.css"))
}

func handleImage(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Content-Type", "image/jpeg")
	io.Copy(w, getResource("ocelot.jpg"))
}

func main() {
	fmt.Println("running main")
	http.HandleFunc("/", handlePage)
	http.HandleFunc("/style.css", handleCss)
	http.HandleFunc("/ocelot.jpg", handleImage)
	http.ListenAndServe(":80", nil)
}
