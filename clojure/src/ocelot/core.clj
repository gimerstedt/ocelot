(ns ocelot.core
	(:use ring.adapter.jetty
				ring.util.response
				hiccup.page)
	(:require [clojure.java.io :as io]))

(defn css []
	(str "html{background:radial-gradient(#eee, #ccc, #888);color:#333;font-family:sans-serif;height:100%;margin:0;padding:0;}body{margin:50px;}#ocelot{position:absolute;right:50px;bottom:50px;}#boop{position:absolute;bottom:50px;}#meep{position:absolute;right:50px;top:50px;}"))

(defn render []
	(html5
		[:meta {:charset "utf-8"}]
		(include-css "/style.css")
		[:title "hej"]
		[:img {:id "ocelot" :alt "ocelot, clearly" :width 640 :height 420 :src "/ocelot.jpg"}]
		[:p "nothing to see here at the moment." [:br] "except for the ever so lovely ocelot obviously."]
		[:div {:id "meep"} "meep."]
		[:div {:id "boop"} "boop."]
		(str "\n<!-- \"Inside every cynical person, there is a disappointed idealist.\" - George Carlin -->\n")))

(defn get-image [] (io/file
	(io/resource
		"ocelot.jpg")))

(defn handler [request]
	(if (= (:uri request) "/")
		(-> (response (render))
				(content-type "text/html")
				(status 200))
		(if (= (:uri request) "/style.css")
			(-> (response (css))
					(content-type "text/css")
					(status 200))
			(if (= (:uri request) "/ocelot.jpg")
				(-> (response (get-image))
						(content-type "image/jpeg")
						(status 200))
				(-> (response (str "404 meep"))
						(content-type "text/plain")
						(status 404))))))

(run-jetty handler {:port 8888})
