(defproject fortress-sample "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1896"]
                 [org.clojure/tools.logging "0.2.6"]
                 [org.clojure/tools.cli "0.2.4"]
                 ;; Clojurescript
                 [shoreleave/shoreleave-remote "0.3.0"]
                 [shoreleave/shoreleave-pubsub "0.3.0"]
                 ;; Ring libraries
                 [fortress-ring-adapter "0.1.0-SNAPSHOT"]
                 [ring/ring-devel "1.2.0"]
                 [ring/ring-core "1.2.0"]
                 [compojure "1.1.5"]
                 [lib-noir "0.7.2"]
                 [ring-anti-forgery "0.3.0"]
                 [fogus/ring-edn "0.2.0"]
                 ;; Clojure libraries
                 [korma "0.3.0-RC6"]
                 [com.novemberain/pantomime "2.0.0"]
                 ;; Java libraries
                 [ch.qos.logback/logback-core "1.0.13"]
                 [ch.qos.logback/logback-classic "1.0.13"]]
  :main ^:skip-aot fortress-sample.core
  :target-path "target/%s"
  :jvm-opts  ["-Xbootclasspath/p:lib/npn-boot-1.1.6.v20130911.jar"]
  :profiles {:uberjar {:aot :all}})
