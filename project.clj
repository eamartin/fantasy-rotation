(defproject fantasy-rotation "0.1.0-SNAPSHOT"
  :description "Fantasy rotation"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring "1.3.0"]
                 [compojure "1.1.8"]
                 [korma "0.3.2"]
                 [hiccup "1.0.5"]]
  :main ^:skip-aot fantasy-rotation.core
  :target-path "target/%s"
  :profiles {
             :uberjar {:aot :all}
             :dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                                  [ring-mock "0.1.5"]]}}
  :plugins [[lein-ring "0.8.11"]]
  :ring {:handler fantasy-rotation.handler/app})
