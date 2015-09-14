(ns ocelot.core-test
  (:require [clojure.test :refer :all]
            [ocelot.core :refer :all]))

(deftest hello-world-test
	(testing "making sure it returns hello world"
		(is (= "Hello, you!" (ocelot.core/hello "you")))))

