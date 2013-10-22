(ns fortress-sample.core
  (:use compojure.core)
  (:require [fortress.ring.server :refer (run-fortress)]
            [compojure.route :as route]
            [clojure.tools.logging :as log])
  (:gen-class))

(defroutes app
    (GET "/"  [] "<h1>Hello World</h1>")
    (route/not-found "<h1>Page not found</h1>"))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (log/info "Hola mundo")
  (run-fortress app :port 8080))
