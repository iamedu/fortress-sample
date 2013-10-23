(ns fortress.ssl.context
  (:import [javax.net.ssl KeyManagerFactory SSLContext]))

(def ^:dynamic protocol "TLS")

(defn ssl-context [key-store passphrase]
  (let [key-manager-algo (KeyManagerFactory/getDefaultAlgorithm)
        key-manager-factory (KeyManagerFactory/getInstance key-manager-algo)
        passphrase-chars (.toCharArray passphrase)
        ssl-context (SSLContext/getInstance protocol)]
    (.init key-manager-factory key-store passphrase-chars)
    (.init ssl-context (.getKeyManagers key-manager-factory) nil nil)
    ssl-context))
