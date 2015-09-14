(defproject ocelot "0.1.0-SNAPSHOT"
  :description "it's an ocelot"
  :url "http://asdf.gg/"
  :license {:name "GNU General Public License"
            :url "https://gnu.org/licenses/gpl-3.0.txt"}
  :dependencies [
		[org.clojure/clojure "1.7.0"]
		[ring "1.4.0"]
		[hiccup "1.0.5"]
	]
  :main ^:skip-aot ocelot.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
